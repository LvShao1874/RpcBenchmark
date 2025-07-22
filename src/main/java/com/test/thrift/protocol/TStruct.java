package com.test.thrift.protocol;

public class TStruct {
    public TStruct() {
        this("");
    }

    public TStruct(String n) {
        name = n;
    }

    public String name;
}
