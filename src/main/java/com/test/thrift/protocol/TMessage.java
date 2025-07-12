package com.test.thrift.protocol;


public class TMessage {
    public TMessage() {
        this("", TType.STOP, 0);
    }

    public TMessage(String n, byte t, int s) {
        name = n;
        type = t;
        seqid = s;
    }

    public String name;
    public byte type;
    public int seqid;


    public static final byte CALL = 1;
    public static final byte REPLY = 2;
    public static final byte EXCEPTION = 3;
    public static final byte ONEWAY = 4;
}
