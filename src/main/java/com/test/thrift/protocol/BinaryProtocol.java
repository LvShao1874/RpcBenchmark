package com.test.thrift.protocol;

import com.test.thrift.Helpers;
import com.test.thrift.TException;
import com.test.thrift.HeapBytePool;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class BinaryProtocol extends TProtocol {
    private ByteBuffer buffer;
    private HeapBytePool pool;

    protected static final int VERSION_MASK = 0xffff0000;
    protected static final int VERSION_1 = 0x80010000;

    public void setBuffer(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    public void setPool(HeapBytePool pool) {
        this.pool = pool;
    }

    private static void checkLength(int length) throws TProtocolException {
        if (length < 0) {
            throw new TProtocolException(TProtocolException.NEGATIVE_SIZE,
                    "Negative length: " + length);
        } else if (length > 1024 * 1024 * 16) {
            throw new TProtocolException(TProtocolException.SIZE_LIMIT,
                    "Length exceeded max allowed: " + length);
        }
    }

    @Override
    public void writeMessageBegin(String name, byte type, int seqId) {
        int version = VERSION_1 | type;
        writeI32(version);
        writeString(name);
        writeI32(seqId);
    }

    @Override
    public void writeMessageEnd() {

    }

    @Override
    public void writeStructBegin(String n) {

    }

    @Override
    public void writeStructEnd() {

    }

    @Override
    public void writeFieldBegin(String name, byte type, short id) {
        writeByte(type);
        writeI16(id);
    }

    @Override
    public void writeFieldEnd() {

    }

    @Override
    public void writeFieldStop() {
        writeByte(TType.STOP);
    }

    @Override
    public void writeMapBegin(byte keyType, byte valueType, int size) {
        writeByte(keyType);
        writeByte(valueType);
        writeI32(size);
    }

    @Override
    public void writeMapEnd() {

    }

    @Override
    public void writeListBegin(byte elemType, int size) {
        writeByte(elemType);
        writeI32(size);
    }

    @Override
    public void writeListEnd() {

    }

    @Override
    public void writeSetBegin(byte elemType, int size) {
        writeByte(elemType);
        writeI32(size);
    }

    @Override
    public void writeSetEnd() {

    }

    @Override
    public void writeBool(boolean b) {
        writeByte(b ? (byte) 1 : (byte) 0);
    }

    @Override
    public void writeByte(byte b) {
        buffer.put(b);
    }

    @Override
    public void writeI16(short i16) {
        buffer.putShort(i16);
    }

    @Override
    public void writeI32(int i32) {
        buffer.putInt(i32);
    }

    @Override
    public void writeI64(long i64) {
        buffer.putLong(i64);
    }

    @Override
    public void writeDouble(double dub) {
        writeI64(Double.doubleToLongBits(dub));
    }

    @Override
    public void writeString(String str) {
        int p = buffer.position();
        buffer.position(p + 4);
        Helpers.writeUTF8(buffer, str);
        buffer.putInt(p, buffer.position() - p - 4);
    }

    @Override
    public void writeBinary(ByteBuffer bin) {
        int length = bin.limit() - bin.position();
        writeI32(length);
        buffer.put(bin.array(), bin.position() + bin.arrayOffset(), length);
    }

    @Override
    public TMessage readMessageBegin() throws TException {
        int size = readI32();
        if (size < 0) {
            int version = size & VERSION_MASK;
            if (version != VERSION_1) {
                throw new TProtocolException(TProtocolException.BAD_VERSION, "Bad version in readMessageBegin");
            }
        }
        tMessage.name = readString();
        tMessage.type = (byte) (size & 0x000000ff);
        tMessage.seqid = readI32();
        return tMessage;
    }

    @Override
    public void readMessageEnd() {

    }

    @Override
    public TStruct readStructBegin() {
        return tStruct;
    }

    @Override
    public void readStructEnd() {

    }

    @Override
    public TField readFieldBegin() {
        byte type = readByte();
        short id = type == TType.STOP ? 0 : readI16();
        tField.type = type;
        tField.id = id;
        return tField;
    }

    @Override
    public void readFieldEnd() {

    }

    @Override
    public TMap readMapBegin() {
        tMap.keyType = readByte();
        tMap.valueType = readByte();
        tMap.size = readI32();
        return tMap;
    }

    @Override
    public void readMapEnd() {

    }

    @Override
    public TList readListBegin() {
        tList.elemType = readByte();
        tList.size = readI32();
        return tList;
    }

    @Override
    public void readListEnd() {

    }

    @Override
    public TSet readSetBegin() {
        tSet.elemType = readByte();
        tSet.size = readI32();
        return tSet;
    }

    @Override
    public void readSetEnd() {

    }

    @Override
    public boolean readBool() {
        return buffer.get() == 1;
    }

    @Override
    public byte readByte() {
        return buffer.get();
    }

    @Override
    public short readI16() {
        return buffer.getShort();
    }

    @Override
    public int readI32() {
        return buffer.getInt();
    }

    @Override
    public long readI64() {
        return buffer.getLong();
    }

    @Override
    public double readDouble() {
        return Double.longBitsToDouble(buffer.getLong());
    }

    @Override
    public String readString() throws TException {
        int size = buffer.getInt();
        checkLength(size);
        if (buffer.hasArray()) {
            String s = new String(buffer.array(), buffer.position() + buffer.arrayOffset(), size, StandardCharsets.UTF_8);
            buffer.position(buffer.position() + size);
            return s;
        } else {
            byte[] t = size < tmp.length ? tmp : new byte[size];
            buffer.get(t, 0, size);
            return new String(t, 0, size, StandardCharsets.UTF_8);
        }
    }

    @Override
    public ByteBuffer readBinary() throws TException {
        int size = buffer.getInt();
        checkLength(size);
        if (buffer.hasArray()) {
            ByteBuffer bb = ByteBuffer.wrap(buffer.array(), buffer.position() + buffer.arrayOffset(), size);
            buffer.position(buffer.position() + size);
            return bb;
        } else if (pool != null) {
            ByteBuffer b = pool.allocate(size);
            int limit = buffer.limit();
            buffer.limit(buffer.position() + size);
            b.put(buffer);
            b.flip();
            buffer.limit(limit);
            return b;
        } else {
            byte[] t = new byte[size];
            buffer.get(t, 0, size);
            return ByteBuffer.wrap(t);
        }
    }
}
