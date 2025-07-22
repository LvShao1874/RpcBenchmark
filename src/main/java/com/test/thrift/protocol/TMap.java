package com.test.thrift.protocol;


public class TMap {
    public TMap() {
        this(TType.STOP, TType.STOP, 0);
    }

    public TMap(byte k, byte v, int s) {
        keyType = k;
        valueType = v;
        size = s;
    }

    public byte keyType;
    public byte valueType;
    public int size;
}
