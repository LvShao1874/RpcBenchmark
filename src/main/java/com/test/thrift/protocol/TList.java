package com.test.thrift.protocol;


public class TList {
    public TList() {
        this(TType.STOP, 0);
    }

    public TList(byte t, int s) {
        elemType = t;
        size = s;
    }

    public byte elemType;
    public int size;
}
