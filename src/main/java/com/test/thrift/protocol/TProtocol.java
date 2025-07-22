package com.test.thrift.protocol;


import com.test.thrift.TException;

import java.nio.ByteBuffer;

public abstract class TProtocol {
    protected final TMessage tMessage = new TMessage();
    protected final TStruct tStruct = new TStruct();
    protected final TField tField = new TField();
    protected final TMap tMap = new TMap();
    protected final TList tList = new TList();
    protected final TSet tSet = new TSet();
    protected final byte[] tmp = new byte[64]; // used by readString

    // void writeMessageBegin(TMessage message) ;
    public abstract void writeMessageBegin(String name, byte type, int seqId);

    public abstract void writeMessageEnd();

    public abstract void writeStructBegin(String n);
    //void writeStructBegin(TStruct struct) ;

    public abstract void writeStructEnd();

    public abstract void writeFieldBegin(String name, byte type, short id);
    //void writeFieldBegin(TField field) ;

    public abstract void writeFieldEnd();

    public abstract void writeFieldStop();

    public abstract void writeMapBegin(byte keyType, byte valType, int size);
    //void writeMapBegin(TMap map) ;

    public abstract void writeMapEnd();

    public abstract void writeListBegin(byte elemType, int size);
    //void writeListBegin(TList list) ;

    public abstract void writeListEnd();

    public abstract void writeSetBegin(byte elemType, int size);
    //void writeSetBegin(TSet set) ;

    public abstract void writeSetEnd();

    public abstract void writeBool(boolean b);

    public abstract void writeByte(byte b);

    public abstract void writeI16(short i16);

    public abstract void writeI32(int i32);

    public abstract void writeI64(long i64);

    public abstract void writeDouble(double dub);

    public abstract void writeString(String str);

    public abstract void writeBinary(ByteBuffer buf);

    public abstract TMessage readMessageBegin() throws TException;

    public abstract void readMessageEnd();

    public abstract TStruct readStructBegin();

    public abstract void readStructEnd();

    public abstract TField readFieldBegin();

    public abstract void readFieldEnd();

    public abstract TMap readMapBegin();

    public abstract void readMapEnd();

    public abstract TList readListBegin();

    public abstract void readListEnd();

    public abstract TSet readSetBegin();

    public abstract void readSetEnd();

    public abstract boolean readBool();

    public abstract byte readByte();

    public abstract short readI16();

    public abstract int readI32();

    public abstract long readI64();

    public abstract double readDouble();

    public abstract String readString() throws TException;

    public abstract ByteBuffer readBinary() throws TException;
}
