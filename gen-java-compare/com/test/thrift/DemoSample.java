
package com.test.thrift;

public class DemoSample implements com.test.thrift.IBase {


    public int userId;


    public long ms;


    public java.lang.String sessionId;


    public java.lang.String label;


    public java.util.Map<java.lang.Integer, java.lang.String> features;


    public com.test.thrift.protocol.TListI32 codes;


    private static final int __USERID_ISSET_ID = 0;
    private static final int __MS_ISSET_ID = 1;
    private byte __isset_bitfield = 0;


    public java.lang.Integer getUserId() {
        return this.userId;
    }

    public DemoSample setUserId(java.lang.Integer userId) {
        this.userId = userId;
        setUserIdIsSet(true);
        return this;
    }

    public void unsetUserId() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
    }

    public boolean isSetUserId() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
    }

    public void setUserIdIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
    }


    public java.lang.Long getMs() {
        return this.ms;
    }

    public DemoSample setMs(java.lang.Long ms) {
        this.ms = ms;
        setMsIsSet(true);
        return this;
    }

    public void unsetMs() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MS_ISSET_ID);
    }

    public boolean isSetMs() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MS_ISSET_ID);
    }

    public void setMsIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MS_ISSET_ID, value);
    }


    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    public DemoSample setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public void unsetSessionId() {
        this.sessionId = null;
    }

    public boolean isSetSessionId() {
        return this.sessionId != null;
    }

    public void setSessionIdIsSet(boolean value) {
        if (!value) {
            this.sessionId = null;
        }
    }


    public java.lang.String getLabel() {
        return this.label;
    }

    public DemoSample setLabel(java.lang.String label) {
        this.label = label;
        return this;
    }

    public void unsetLabel() {
        this.label = null;
    }

    public boolean isSetLabel() {
        return this.label != null;
    }

    public void setLabelIsSet(boolean value) {
        if (!value) {
            this.label = null;
        }
    }


    public int getFeaturesSize() {
        return (this.features == null) ? 0 : this.features.size();
    }


    public void putToFeatures(java.lang.Integer key, java.lang.String val) {
        if (this.features == null) {
            this.features = new java.util.HashMap<>();
        }
        this.features.put(key, val);
    }

    public java.util.Map<java.lang.Integer, java.lang.String> getFeatures() {
        return this.features;
    }

    public DemoSample setFeatures(java.util.Map<java.lang.Integer, java.lang.String> features) {
        this.features = features;
        return this;
    }

    public void unsetFeatures() {
        this.features = null;
    }

    public boolean isSetFeatures() {
        return this.features != null;
    }

    public void setFeaturesIsSet(boolean value) {
        if (!value) {
            this.features = null;
        }
    }


    public int getCodesSize() {
        return (this.codes == null) ? 0 : this.codes.size();
    }

    public void addToCodes(java.lang.Integer elem) {
        if (this.codes == null) {
            this.codes = new com.test.thrift.protocol.TListI32();
        }
        this.codes.add(elem);
    }

    public com.test.thrift.protocol.TListI32 getCodes() {
        return this.codes;
    }

    public DemoSample setCodes(com.test.thrift.protocol.TListI32 codes) {
        this.codes = codes;
        return this;
    }

    public void unsetCodes() {
        this.codes = null;
    }

    public boolean isSetCodes() {
        return this.codes != null;
    }

    public void setCodesIsSet(boolean value) {
        if (!value) {
            this.codes = null;
        }
    }


    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof DemoSample)
            return this.equals((DemoSample) that);
        return false;
    }

    public boolean equals(DemoSample that) {
        if (that == null)
            return false;
        if (this == that)
            return true;


        boolean this_present_userId = true;
        boolean that_present_userId = true;

        if (this_present_userId || that_present_userId) {
            if (!(this_present_userId && that_present_userId))
                return false;
            if (this.userId != that.userId) {
                //System.out.println("userId not equal");
                return false;
            }
        }


        boolean this_present_ms = true;
        boolean that_present_ms = true;

        if (this_present_ms || that_present_ms) {
            if (!(this_present_ms && that_present_ms))
                return false;
            if (this.ms != that.ms) {
                //System.out.println("ms not equal");
                return false;
            }
        }


        boolean this_present_sessionId = true && this.isSetSessionId();
        boolean that_present_sessionId = true && that.isSetSessionId();
        if (this_present_sessionId || that_present_sessionId) {
            if (!(this_present_sessionId && that_present_sessionId))
                return false;
            if (!this.sessionId.equals(that.sessionId)) {
                //System.out.println("sessionId not equal");
                return false;
            }
        }


        boolean this_present_label = true && this.isSetLabel();
        boolean that_present_label = true && that.isSetLabel();
        if (this_present_label || that_present_label) {
            if (!(this_present_label && that_present_label))
                return false;
            if (!this.label.equals(that.label)) {
                //System.out.println("label not equal");
                return false;
            }
        }


        boolean this_present_features = true && this.isSetFeatures();
        boolean that_present_features = true && that.isSetFeatures();
        if (this_present_features || that_present_features) {
            if (!(this_present_features && that_present_features))
                return false;
            if (!this.features.equals(that.features)) {
                //System.out.println("features not equal");
                return false;
            }
        }


        boolean this_present_codes = true && this.isSetCodes();
        boolean that_present_codes = true && that.isSetCodes();
        if (this_present_codes || that_present_codes) {
            if (!(this_present_codes && that_present_codes))
                return false;
            if (!this.codes.equals(that.codes)) {
                //System.out.println("codes not equal");
                return false;
            }
        }


        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DemoSample(");


        sb.append("userId:");
        sb.append(this.userId);


        sb.append(", ");


        sb.append("ms:");
        sb.append(this.ms);


        sb.append(", ");


        sb.append("sessionId:");
        if (this.sessionId == null) {
            sb.append("null");
        } else {
            sb.append(this.sessionId);
        }


        sb.append(", ");


        sb.append("label:");
        if (this.label == null) {
            sb.append("null");
        } else {
            sb.append(this.label);
        }


        sb.append(", ");


        sb.append("features:");
        if (this.features == null) {
            sb.append("null");
        } else {
            sb.append(this.features);
        }


        sb.append(", ");


        sb.append("codes:");
        if (this.codes == null) {
            sb.append("null");
        } else {
            sb.append(this.codes);
        }


        sb.append(")");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;


        hashCode = hashCode * 8191 + userId;


        hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(ms);


        hashCode = hashCode * 8191 + ((isSetSessionId()) ? 131071 : 524287);
        if (isSetSessionId())
            hashCode = hashCode * 8191 + sessionId.hashCode();


        hashCode = hashCode * 8191 + ((isSetLabel()) ? 131071 : 524287);
        if (isSetLabel())
            hashCode = hashCode * 8191 + label.hashCode();


        hashCode = hashCode * 8191 + ((isSetFeatures()) ? 131071 : 524287);
        if (isSetFeatures())
            hashCode = hashCode * 8191 + features.hashCode();


        hashCode = hashCode * 8191 + ((isSetCodes()) ? 131071 : 524287);
        if (isSetCodes())
            hashCode = hashCode * 8191 + codes.hashCode();


        return hashCode;
    }

    public void clear() {


        setUserIdIsSet(false);

        this.userId = 0;


        setMsIsSet(false);

        this.ms = 0;


        this.sessionId = null;


        this.label = null;


        this.features = null;


        this.codes = null;


    }

    public void validate() throws com.test.thrift.TException {


    }

    public int size() {
        int size = 1; // writeFieldStop() need 1 byte;

        // userId


        size += 3;
        size += 4;


        // ms


        size += 3;
        size += 8;


        // sessionId

        if (sessionId != null) {

            size += 3;
            size += 4 + 3 * sessionId.length();

        }


        // label

        if (label != null) {

            size += 3;
            size += 4 + 3 * label.length();

        }


        // features


        if (features != null) {
            {
                size += 9;
                for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter8 : features.entrySet()) {
                    size += 4;
                    size += 4 + 3 * _iter8.getValue().length();
                }

            }
        }

        // codes

        if (codes != null) {
            size += 8;

            size += (4) * codes.size();

        }

        return size;
    }

    public DemoSample() {


    }


    public DemoSample(

            int userId,
            long ms,
            java.lang.String sessionId,
            java.lang.String label,
            java.util.Map<java.lang.Integer, java.lang.String> features,
            com.test.thrift.protocol.TListI32 codes
    ) {
        this();

        this.userId = userId;

        setUserIdIsSet(true);


        this.ms = ms;

        setMsIsSet(true);


        this.sessionId = sessionId;


        this.label = label;


        this.features = features;


        this.codes = codes;


    }


    /**
     * Performs a deep copy on <i>other</i>.
     */
    public DemoSample(DemoSample other) {
        __isset_bitfield = other.__isset_bitfield;

        this.userId = other.userId;

        this.ms = other.ms;


        if (other.isSetSessionId()) {
            this.sessionId = other.sessionId;
        }


        if (other.isSetLabel()) {
            this.label = other.label;
        }


        if (other.isSetFeatures()) {
            java.util.Map<java.lang.Integer, java.lang.String> __this__features = new java.util.HashMap<>(other.features); //map1a
            this.features = __this__features; // map4a1
        } //map4a2


        this.codes = other.codes;

    }

    public DemoSample deepCopy() {
        return new DemoSample(this);
    }


    public void read(com.test.thrift.protocol.TProtocol iprot) throws com.test.thrift.TException {
        com.test.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true) {
            schemeField = iprot.readFieldBegin();
            if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                break;
            }

            switch (schemeField.id) {
                case 1: {
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                        this.userId = iprot.readI32();
                        this.setUserIdIsSet(true);
                    } else {
                        com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    break;
                }

                case 2: {
                    if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                        this.ms = iprot.readI64();
                        this.setMsIsSet(true);
                    } else {
                        com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    break;
                }

                case 3: {
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                        this.sessionId = iprot.readString();
                        this.setSessionIdIsSet(true);
                    } else {
                        com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    break;
                }

                case 4: {
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                        this.label = iprot.readString();
                        this.setLabelIsSet(true);
                    } else {
                        com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    break;
                }

                case 5: {
                    if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
                        {
                            com.test.thrift.protocol.TMap _collection0 = iprot.readMapBegin();
                            features = new java.util.HashMap<>(_collection0.size);
                            int _key_elem1;
                            java.lang.String _value_elem2;
                            for (int _i3 = 0; _i3 < _collection0.size; ++_i3) {
                                _key_elem1 = iprot.readI32();
                                _value_elem2 = iprot.readString();
                                features.put(_key_elem1, _value_elem2);
                            }
                            iprot.readMapEnd();
                        }

                        this.setFeaturesIsSet(true);
                    } else {
                        com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    break;
                }

                case 6: {

                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                        {
                            com.test.thrift.protocol.TList _collection4 = iprot.readListBegin();
                            codes = new com.test.thrift.protocol.TListI32(_collection4.size);
                            int _elem5;
                            for (int _i6 = 0; _i6 < _collection4.size; ++_i6) {
                                _elem5 = iprot.readI32();
                                codes.add(_elem5);
                            }
                            iprot.readListEnd();
                        }
                        this.setCodesIsSet(true);
                    } else {
                        com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    break;
                }

                default:
                    com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
        }
        this.validate();
    }

    public void write(com.test.thrift.protocol.TProtocol oprot) throws com.test.thrift.TException {
        this.validate();

        oprot.writeFieldBegin("userId", org.apache.thrift.protocol.TType.I32, (short) 1);
        oprot.writeI32(userId);


        oprot.writeFieldBegin("ms", org.apache.thrift.protocol.TType.I64, (short) 2);
        oprot.writeI64(ms);


        if (sessionId != null) {
            oprot.writeFieldBegin("sessionId", org.apache.thrift.protocol.TType.STRING, (short) 3);
            oprot.writeString(sessionId);
        }


        if (label != null) {
            oprot.writeFieldBegin("label", org.apache.thrift.protocol.TType.STRING, (short) 4);
            oprot.writeString(label);
        }


        if (features != null) {
            oprot.writeFieldBegin("features", org.apache.thrift.protocol.TType.MAP, (short) 5);
            {
                {
                    oprot.writeMapBegin(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, features.size());
                    for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter7 : features.entrySet()) {
                        oprot.writeI32(_iter7.getKey());
                        oprot.writeString(_iter7.getValue());
                    }
                }

            }
        }


        if (codes != null) {
            oprot.writeFieldBegin("codes", org.apache.thrift.protocol.TType.LIST, (short) 6);
            oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, codes.size());
            for (int i = 0; i < codes.size(); i++) {
                oprot.writeI32(codes.get(i));
            }
        }

        oprot.writeFieldStop();
    }


}