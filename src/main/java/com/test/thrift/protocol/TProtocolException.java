package com.test.thrift.protocol;

import com.test.thrift.TException;

public class TProtocolException extends TException {
    public static final int UNKNOWN = 0;
    public static final int INVALID_DATA = 1;
    public static final int NEGATIVE_SIZE = 2;
    public static final int SIZE_LIMIT = 3;
    public static final int BAD_VERSION = 4;
    public static final int NOT_IMPLEMENTED = 5;
    public static final int DEPTH_LIMIT = 6;

    protected int type_ = UNKNOWN;

    public TProtocolException(int type, String message) {
        super(message);
        type_ = type;
    }

    public TProtocolException(String msg) {
        super(msg);
    }
}
