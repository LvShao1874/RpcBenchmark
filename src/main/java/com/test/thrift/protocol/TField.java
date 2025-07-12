package com.test.thrift.protocol;


public class TField {
    public TField() {
        this("", TType.STOP, (short) 0);
    }

    public TField(String n, byte t, short i) {
        name = n;
        type = t;
        id = i;
    }

    public String name;
    public byte type;
    public short id;
}
