package com.test.thrift;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HeapBytePool {
    // 预定义的缓冲区大小（按需修改）
    private static final int[] CHUNK_SIZES = {512, 2048, 8192, 32768, 131072};

    // 核心存储：按大小分组的缓冲区队列
    private final Map<Integer, Deque<ByteBuffer>> pool = new ConcurrentHashMap<>();

    public HeapBytePool() {
        // 初始化各规格的空队列
        for (int size : CHUNK_SIZES) {
            pool.put(size, new ArrayDeque<>());
        }
    }

    /**
     * 分配内存（获取满足大小的最小缓冲区）
     */
    public ByteBuffer allocate(int minSize) {
        for (int size : CHUNK_SIZES) {
            if (size >= minSize) {
                Deque<ByteBuffer> queue = pool.get(size);
                ByteBuffer buffer = queue.poll();
                if (buffer != null) {
                    buffer.clear();
                    buffer.limit(minSize);
                    return buffer;
                }
                return ByteBuffer.allocate(size);
            }
        }

        // 没有合适规格则直接分配
        return ByteBuffer.allocate(minSize);
    }

    /**
     * 释放内存（将缓冲区放回池中）
     */
    public void release(ByteBuffer buffer) {
        if (buffer == null || buffer.isDirect()) {
            return; // 忽略null和堆外内存
        }

        int capacity = buffer.capacity();

        // 检查是否是预定义规格
        for (int size : CHUNK_SIZES) {
            if (size == capacity) {
                buffer.clear(); // 重置缓冲区状态
                pool.get(size).add(buffer); // 放回对应队列
                return;
            }
        }
        // 非标准规格的buffer不做缓存
    }

    /**
     * 清空内存池（实际只是清空引用，GC会真正回收内存）
     */
    public void clear() {
        pool.values().forEach(Deque::clear);
    }
}