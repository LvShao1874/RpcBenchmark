package com.test.thrift;


import sun.nio.ch.DirectBuffer;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


public class DirectBytePool {
    // 内存规格定义 (单位: 字节)
    private static final int[] DEFAULT_CHUNK_SIZES = {4096, 16384, 65536, 262144};
    private final Map<Integer, MemoryArena> arenas = new ConcurrentHashMap<>();
    private final ThreadLocal<ThreadLocalCache> threadCache = ThreadLocal.withInitial(ThreadLocalCache::new);

    public DirectBytePool() {
        this(DEFAULT_CHUNK_SIZES);
    }

    public DirectBytePool(int[] chunkSizes) {
        for (int size : chunkSizes) {
            arenas.put(size, new MemoryArena(size));
        }
    }

    /**
     * 分配堆外内存 (优先从线程缓存获取)
     */
    public ByteBuffer allocate(int size) {
        int targetSize = arenas.keySet().stream()
                .filter(k -> k >= size)
                .min(Integer::compare)
                .orElse(size);

        ByteBuffer buffer = threadCache.get().getCachedBuffer(targetSize);
        if (buffer != null) {
            buffer.limit(size);
            return buffer;
        }

        buffer = arenas.get(targetSize).allocate();
        buffer.limit(size);
        return buffer;
    }

    /**
     * 释放内存 (返回线程缓存或全局池)
     */
    public void release(ByteBuffer buffer) {
        if (!buffer.isDirect()) return;

        int capacity = buffer.capacity();
        buffer.clear();

        if (!threadCache.get().cacheBuffer(buffer, capacity)) {
            MemoryArena arena = arenas.get(capacity);
            if (arena != null) {
                arena.release(buffer);
            } else {
                freeDirectBuffer(buffer);
            }
        }
    }

    private void freeDirectBuffer(ByteBuffer buffer) {
        jdk.internal.ref.Cleaner cleaner = ((DirectBuffer) buffer).cleaner();
        if (cleaner != null) {
            cleaner.clean();
        }
    }

    private static class MemoryArena {
        private final int chunkSize;
        private final ConcurrentLinkedQueue<ByteBuffer> freeBuffers = new ConcurrentLinkedQueue<>();

        MemoryArena(int chunkSize) {
            this.chunkSize = chunkSize;
        }

        ByteBuffer allocate() {
            ByteBuffer buffer = freeBuffers.poll();
            return buffer != null ? buffer : ByteBuffer.allocateDirect(chunkSize);
        }

        void release(ByteBuffer buffer) {
            freeBuffers.offer(buffer);
        }
    }

    private static class ThreadLocalCache {
        private static final int MAX_CACHED_BUFFERS = 32;
        private final Map<Integer, Deque<ByteBuffer>> cache = new HashMap<>();

        ByteBuffer getCachedBuffer(int size) {
            Deque<ByteBuffer> queue = cache.get(size);
            return (queue != null && !queue.isEmpty()) ? queue.poll() : null;
        }

        boolean cacheBuffer(ByteBuffer buffer, int size) {
            Deque<ByteBuffer> queue = cache.computeIfAbsent(size, k -> new ArrayDeque<>());
            if (queue.size() < MAX_CACHED_BUFFERS) {
                queue.offer(buffer);
                return true;
            }
            return false; // 缓存已满
        }
    }

    /**
     * 关闭时释放所有内存
     */
    public void close() {
        arenas.values().forEach(arena ->
                arena.freeBuffers.forEach(this::freeDirectBuffer)
        );
        arenas.clear();
    }
}