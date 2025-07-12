package com.test.thrift;

public class TException extends Exception {
    public TException(String msg) {
        super(msg);
    }

    public TException() {
        super();
    }
}
