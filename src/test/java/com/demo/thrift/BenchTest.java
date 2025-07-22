package com.demo.thrift;

import com.test.thrift.DemoSample;
import com.test.thrift.HeapBytePool;
import com.test.thrift.protocol.BinaryProtocol;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 序列化+复用缓冲池 性能对比测试
 */
public class BenchTest {

    boolean testSmallObj = false;
    int testTurn = 100;


    /**
     * 序列化测试
     *
     * @throws TException
     * @throws com.test.thrift.TException
     */
    @Test
    public void serializerTest() throws TException, com.test.thrift.TException {
        TSerializer serializer = new TSerializer(new TBinaryProtocol.Factory());
        com.test.origin_thrift.DemoSample thrift = null;
        int nums = 0;
        if (testSmallObj) {
            nums = 10000;
            thrift = Helpers.getSmallObj();
        } else {
            nums = 500;
            thrift = Helpers.getLargetObj();
        }

        byte[] originThriftByte = serializer.serialize(thrift);
        DemoSample zp_thrift = new DemoSample();
        BinaryProtocol protocol = new BinaryProtocol();

        // zp_thrift 读取thrift数据,保持对象数据一致 --start
        ByteBuffer originThriftByteBuf = ByteBuffer.wrap(originThriftByte);
        originThriftByteBuf.mark();
        protocol.setBuffer(originThriftByteBuf);
        zp_thrift.read(protocol);

        ByteBuffer writeBuf = ByteBuffer.allocate(zp_thrift.size()); // 申请一次内存
        writeBuf.mark();
        protocol.setBuffer(writeBuf);
        // zp_thrift 读取thrift数据,保持对象数据一致 --end

        for (int t = 0; t < testTurn; t++) {
            long t1 = System.currentTimeMillis();
            for (int i = 0; i < nums; i++) {
                originThriftByte = serializer.serialize(thrift);
            }
            long t2 = System.currentTimeMillis();

            long t3 = System.currentTimeMillis();
            for (int i = 0; i < nums; i++) {
                // 重置指针位置 从头写入
                writeBuf.reset();
                zp_thrift.write(protocol);
            }
            long t4 = System.currentTimeMillis();
            System.out.println("第" + (t + 1) + "轮 序列化测试 thrift obj bytes:" + originThriftByte.length);
            System.out.println("userId=" + thrift.userId + " thrift cost:" + (t2 - t1));
            System.out.println("userId=" + zp_thrift.userId + " zp_thrift cost:" + (t4 - t3));
        }
    }


    /**
     * 反序列化测试
     *
     * @throws TException
     * @throws com.test.thrift.TException
     */
    @Test
    public void deserializerTest() throws TException, com.test.thrift.TException {
        TSerializer serializer = new TSerializer(new TBinaryProtocol.Factory());
        TDeserializer deserializer = new TDeserializer(new TBinaryProtocol.Factory());
        com.test.origin_thrift.DemoSample thrift = null;
        int nums = 0;
        if (testSmallObj) {
            nums = 10000;
            thrift = Helpers.getSmallObj();
        } else {
            nums = 500;
            thrift = Helpers.getLargetObj();
        }

        byte[] originThriftByte = serializer.serialize(thrift);
        BinaryProtocol protocol = new BinaryProtocol();

        // zp_thrift 读取thrift数据,保持对象数据一致 --start
        ByteBuffer originThriftByteBuf = ByteBuffer.wrap(originThriftByte);
        originThriftByteBuf.mark();
        protocol.setBuffer(originThriftByteBuf);
        // zp_thrift 读取thrift数据,保持对象数据一致 --end

        for (int t = 0; t < testTurn; t++) {
            long t1 = System.currentTimeMillis();
            for (int i = 0; i < nums; i++) {
                deserializer.deserialize(thrift, originThriftByte);
            }
            long t2 = System.currentTimeMillis();

            DemoSample zp_thrift = new DemoSample();
            long t3 = System.currentTimeMillis();
            for (int i = 0; i < nums; i++) {
                // 重置指针位置从头读取
                originThriftByteBuf.reset();
                zp_thrift.read(protocol);
            }
            long t4 = System.currentTimeMillis();

            System.out.println("第" + (t + 1) + "轮 反序列化测试 thrift obj bytes:" + originThriftByte.length);
            System.out.println("userId=" + thrift.userId + " thrift cost:" + (t2 - t1));
            System.out.println("userId=" + zp_thrift.userId + " zp_thrift cost:" + (t4 - t3));
        }
    }


}
