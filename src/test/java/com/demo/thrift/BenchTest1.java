package com.demo.thrift;

import com.test.thrift.DemoSample;
import com.test.thrift.protocol.BinaryProtocol;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 不复用缓冲池测试
 */
public class BenchTest1 {

    @Test
    public void speedyTest() throws TException, com.test.thrift.TException {
        TSerializer serializer = new TSerializer(new TBinaryProtocol.Factory());
        com.test.origin_thrift.DemoSample thrift = new com.test.origin_thrift.DemoSample();
        int rate = 1000;
        Random random = new Random();
        thrift.userId = random.nextInt();
        thrift.ms = System.currentTimeMillis();
//        thrift.label = randomString(1 * rate);
//        thrift.codes = Stream.generate(() -> random.nextInt(100000)).limit(10 * rate).collect(Collectors.toList());
//        thrift.features = new HashMap<>();
//        for (int i = 0; i < 10 * rate; i++) {
//            thrift.features.put(i, randomString(10));
//        }
        byte[] thrift_byte = serializer.serialize(thrift);
        DemoSample zp_thrift = new DemoSample();
        BinaryProtocol pro = new BinaryProtocol();
        int nums = 1000000;
        for (int t = 0; t < 100; t++) {
            long t1 = System.currentTimeMillis();
            for (int i = 0; i < nums; i++) {
                thrift_byte = serializer.serialize(thrift);
            }
            long t2 = System.currentTimeMillis();
            // zp_thrift 读取thrift数据,保持对象数据一致 --start
            ByteBuffer readBuf = ByteBuffer.wrap(thrift_byte);
            readBuf.mark();
            pro.setBuffer(readBuf);
            zp_thrift.read(pro);
            // zp_thrift 读取thrift数据,保持对象数据一致 --end
            long t3 = System.currentTimeMillis();
            for (int i = 0; i < nums; i++) {
                ByteBuffer writeBuf = ByteBuffer.allocate(zp_thrift.size()); // 申请一次内存
                pro.setBuffer(writeBuf);
                zp_thrift.write(pro);
                byte[] array = writeBuf.array();
            }
            long t4 = System.currentTimeMillis();
            System.out.println("thrift obj bytes:" + thrift_byte.length);
            System.out.println(thrift.userId + " thrift cost:" + (t2 - t1));
            System.out.println(zp_thrift.userId + " zp_thrift cost:" + (t4 - t3));
        }
    }

    @Test
    public void speedyTest2() throws TException, com.test.thrift.TException {
        TSerializer serializer = new TSerializer(new TBinaryProtocol.Factory());
        TDeserializer deserializer = new TDeserializer(new TBinaryProtocol.Factory());
        com.test.origin_thrift.DemoSample thrift = new com.test.origin_thrift.DemoSample();
        int rate = 1000;
        Random random = new Random();
        thrift.userId = random.nextInt();
        thrift.ms = System.currentTimeMillis();
        thrift.label = Helpers.randomString(1 * rate);
        thrift.codes = Stream.generate(() -> random.nextInt(100000)).limit(10 * rate).collect(Collectors.toList());
        thrift.features = new HashMap<>();
        for (int i = 0; i < 10 * rate; i++) {
            thrift.features.put(i, Helpers.randomString(10));
        }
        byte[] thrift_byte = serializer.serialize(thrift);
        DemoSample zp_thrift = new DemoSample();
        BinaryProtocol pro = new BinaryProtocol();
        int nums = 10000;
        for (int t = 0; t < 10; t++) {
            long t1 = System.currentTimeMillis();
            for (int i = 0; i < nums; i++) {
                deserializer.deserialize(thrift, thrift_byte);
            }
            long t2 = System.currentTimeMillis();
            // zp_thrift 读取thrift数据,保持对象数据一致 --start
            ByteBuffer readBuf = ByteBuffer.wrap(thrift_byte);
            readBuf.mark();
            pro.setBuffer(readBuf);
            // zp_thrift 读取thrift数据,保持对象数据一致 --end
            long t3 = System.currentTimeMillis();
            for (int i = 0; i < nums; i++) {
                readBuf.reset();
                zp_thrift.read(pro);
            }
            long t4 = System.currentTimeMillis();
            System.out.println("thrift obj bytes:" + thrift_byte.length);
            System.out.println(thrift.userId + " thrift cost:" + (t2 - t1));
            System.out.println(zp_thrift.userId + " zp_thrift cost:" + (t4 - t3));
        }
    }

    @Test
    public void speedyTest3() throws TException, com.test.thrift.TException {
        TSerializer serializer = new TSerializer(new TBinaryProtocol.Factory());
        com.test.origin_thrift.DemoSample thrift = new com.test.origin_thrift.DemoSample();
        Random random = new Random();
        thrift.userId = random.nextInt();
//        thrift.ms = System.currentTimeMillis();
//        thrift.label = randomString(1 * rate);
//        thrift.codes = Stream.generate(() -> random.nextInt(100000)).limit(10 * rate).collect(Collectors.toList());
        thrift.features = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            thrift.features.put(i, Helpers.randomString(10));
        }
        byte[] thrift_byte = serializer.serialize(thrift);
        DemoSample zp_thrift = new DemoSample();
        BinaryProtocol pro = new BinaryProtocol();

        // zp_thrift 读取thrift数据,保持对象数据一致 --start
        ByteBuffer readBuf = ByteBuffer.wrap(thrift_byte);
        readBuf.mark();
        pro.setBuffer(readBuf);
        zp_thrift.read(pro);

        ByteBuffer writeBuf = ByteBuffer.allocate(zp_thrift.size()); // 申请一次内存
        pro.setBuffer(writeBuf);
        zp_thrift.write(pro);
        byte[] array = writeBuf.array();

        System.out.println(thrift_byte.length);
        System.out.println(array.length);
    }
}
