package com.test.thrift.protocol;


public class TSet {
    public TSet() {
        this(TType.STOP, 0);
    }

    public TSet(byte t, int s) {
        elemType = t;
        size = s;
    }

    public byte elemType;
    public int size;
}
