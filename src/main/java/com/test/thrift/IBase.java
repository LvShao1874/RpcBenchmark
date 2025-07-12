package com.test.thrift;

import com.test.thrift.protocol.TProtocol;

public interface IBase {

    /**
     * Reads the TObject from the given input protocol.
     *
     * @param iprot Input protocol
     */
    void read(TProtocol iprot) throws TException;

    /**
     * Writes the objects out to the protocol
     *
     * @param oprot Output protocol
     */
    void write(TProtocol oprot) throws TException;

    /**
     * 序列化后的对象的大小
     *
     * @return
     */
    int size();
}
