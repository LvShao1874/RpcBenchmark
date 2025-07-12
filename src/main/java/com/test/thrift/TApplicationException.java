package com.test.thrift;

import com.test.thrift.protocol.TField;
import com.test.thrift.protocol.TType;
import com.test.thrift.protocol.TProtocol;
import com.test.thrift.protocol.TProtocolUtil;

public class TApplicationException extends TException implements IBase {
    public static final int UNKNOWN = 0;
    public static final int UNKNOWN_METHOD = 1;
    public static final int INVALID_MESSAGE_TYPE = 2;
    public static final int WRONG_METHOD_NAME = 3;
    public static final int BAD_SEQUENCE_ID = 4;
    public static final int MISSING_RESULT = 5;
    public static final int INTERNAL_ERROR = 6;
    public static final int PROTOCOL_ERROR = 7;
    public static final int INVALID_TRANSFORM = 8;
    public static final int INVALID_PROTOCOL = 9;
    public static final int UNSUPPORTED_CLIENT_TYPE = 10;

    protected int type_ = UNKNOWN;
    private String message_ = null;

    public TApplicationException(int type, String message) {
        super(message);
        type_ = type;
        this.message_ = message;
    }

    public TApplicationException(String message) {
        super(message);
        this.message_ = message;
    }

    public TApplicationException() {
        super();
    }

    @Override
    public String getMessage() {
        if (message_ == null) {
            String msg = super.getMessage();
            if (msg == null) msg = "NULL";
            return msg;
        }
        return message_;
    }

    @Override
    public void read(TProtocol iprot) throws TException {
        iprot.readStructBegin();
        while (true) {
            TField field = iprot.readFieldBegin();
            if (field.type == TType.STOP) break;

            switch (field.id) {
                case 1:
                    if (field.type == TType.STRING) {
                        message_ = iprot.readString();
                    } else {
                        TProtocolUtil.skip(iprot, field.type);
                    }
                    break;
                case 2:
                    if (field.type == TType.I32) {
                        type_ = iprot.readI32();
                    } else {
                        TProtocolUtil.skip(iprot, field.type);
                    }
                    break;
                default:
                    TProtocolUtil.skip(iprot, field.type);
                    break;
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();
    }

    @Override
    public void write(TProtocol oprot) throws TException {
        oprot.writeStructBegin("TApplicationException");
        if (getMessage() != null) {
            oprot.writeFieldBegin("message", TType.STRING, (short) 1);
            oprot.writeString(getMessage());
            oprot.writeFieldEnd();
        }
        oprot.writeFieldBegin("type", TType.I32, (short) 2);
        oprot.writeI32(type_);
        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
    }

    @Override
    public int size() {
        return getMessage().length() * 3 + 12;
    }
}
