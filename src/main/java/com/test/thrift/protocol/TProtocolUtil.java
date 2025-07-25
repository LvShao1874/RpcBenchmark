package com.test.thrift.protocol;


import com.test.thrift.TException;

/**
 * Utility class with static methods for interacting with protocol data
 * streams.
 */
public class TProtocolUtil {

    /**
     * The maximum recursive depth the skip() function will traverse before
     * throwing a TException.
     */
    private static int maxSkipDepth = Integer.MAX_VALUE;

    /**
     * Specifies the maximum recursive depth that the skip function will
     * traverse before throwing a TException.  This is a global setting, so
     * any call to skip in this JVM will enforce this value.
     *
     * @param depth the maximum recursive depth.  A value of 2 would allow
     *              the skip function to skip a structure or collection with basic children,
     *              but it would not permit skipping a struct that had a field containing
     *              a child struct.  A value of 1 would only allow skipping of simple
     *              types and empty structs/collections.
     */
    public static void setMaxSkipDepth(int depth) {
        maxSkipDepth = depth;
    }

    /**
     * Skips over the next data element from the provided input TProtocol object.
     *
     * @param prot the protocol object to read from
     * @param type the next value will be interpreted as this TType value.
     */
    public static void skip(TProtocol prot, byte type)
            throws TException {
        skip(prot, type, maxSkipDepth);
    }

    /**
     * Skips over the next data element from the provided input TProtocol object.
     *
     * @param prot     the protocol object to read from
     * @param type     the next value will be interpreted as this TType value.
     * @param maxDepth this function will only skip complex objects to this
     *                 recursive depth, to prevent Java stack overflow.
     */
    public static void skip(TProtocol prot, byte type, int maxDepth)
            throws TException {
        if (maxDepth <= 0) {
            throw new TException("Maximum skip depth exceeded");
        }
        switch (type) {
            case TType.BOOL:
                prot.readBool();
                break;

            case TType.BYTE:
                prot.readByte();
                break;

            case TType.I16:
                prot.readI16();
                break;

            case TType.I32:
                prot.readI32();
                break;

            case TType.I64:
                prot.readI64();
                break;

            case TType.DOUBLE:
                prot.readDouble();
                break;

            case TType.STRING:
                prot.readBinary();
                break;

            case TType.STRUCT:
                prot.readStructBegin();
                while (true) {
                    TField field = prot.readFieldBegin();
                    if (field.type == TType.STOP) {
                        break;
                    }
                    skip(prot, field.type, maxDepth - 1);
                    prot.readFieldEnd();
                }
                prot.readStructEnd();
                break;

            case TType.MAP:
                TMap map = prot.readMapBegin();
                for (int i = 0; i < map.size; i++) {
                    skip(prot, map.keyType, maxDepth - 1);
                    skip(prot, map.valueType, maxDepth - 1);
                }
                prot.readMapEnd();
                break;

            case TType.SET:
                TSet set = prot.readSetBegin();
                for (int i = 0; i < set.size; i++) {
                    skip(prot, set.elemType, maxDepth - 1);
                }
                prot.readSetEnd();
                break;

            case TType.LIST:
                TList list = prot.readListBegin();
                for (int i = 0; i < list.size; i++) {
                    skip(prot, list.elemType, maxDepth - 1);
                }
                prot.readListEnd();
                break;

            default:
                throw new TProtocolException(TProtocolException.INVALID_DATA,
                        "Unrecognized type " + type);
        }
    }
}
