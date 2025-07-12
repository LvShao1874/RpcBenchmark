
package com.test.thrift;

public  class ProtocolSample implements com.test.thrift.IBase {

    
    
    
    public int int32; // optional
    
    
    public long int64; // optional
    
    
    public double float64; // optional
    
    
    public boolean bool8; // optional
    
    
    public java.lang.String str; // optional
    
    
    public java.nio.ByteBuffer bin; // optional
    
    
    public byte byte8; // optional
    
    
    public com.test.thrift.protocol.TListI32 list32; // optional
    
    
    public com.test.thrift.protocol.TListDouble listDouble; // optional
    
    
    public int ok; // required
    
    
    public java.util.List<java.lang.String> strs; // optional
    
    
    public java.util.List<java.util.List<java.lang.Integer>> ll32; // optional
    
    
    public boolean throwException; // optional

     
    private static final int __INT32_ISSET_ID = 0;  
    private static final int __INT64_ISSET_ID = 1;  
    private static final int __FLOAT64_ISSET_ID = 2;  
    private static final int __BOOL8_ISSET_ID = 3;      
    private static final int __BYTE8_ISSET_ID = 4;      
    private static final int __OK_ISSET_ID = 5;      
    private static final int __THROWEXCEPTION_ISSET_ID = 6; 
    private byte __isset_bitfield = 0;


    
        public java.lang.Integer getInt32() {
            return this.int32;
        }

        public ProtocolSample setInt32(java.lang.Integer int32) {
            this.int32 = int32;
            setInt32IsSet(true);
            return this;
        }

        public void unsetInt32() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INT32_ISSET_ID);
        }

        public boolean isSetInt32() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INT32_ISSET_ID);
        }

        public void setInt32IsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INT32_ISSET_ID, value);
        }
    

    
        public java.lang.Long getInt64() {
            return this.int64;
        }

        public ProtocolSample setInt64(java.lang.Long int64) {
            this.int64 = int64;
            setInt64IsSet(true);
            return this;
        }

        public void unsetInt64() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INT64_ISSET_ID);
        }

        public boolean isSetInt64() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INT64_ISSET_ID);
        }

        public void setInt64IsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INT64_ISSET_ID, value);
        }
    

    
        public java.lang.Double getFloat64() {
            return this.float64;
        }

        public ProtocolSample setFloat64(java.lang.Double float64) {
            this.float64 = float64;
            setFloat64IsSet(true);
            return this;
        }

        public void unsetFloat64() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FLOAT64_ISSET_ID);
        }

        public boolean isSetFloat64() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FLOAT64_ISSET_ID);
        }

        public void setFloat64IsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FLOAT64_ISSET_ID, value);
        }
    

    
        public java.lang.Boolean getBool8() {
            return this.bool8;
        }

        public ProtocolSample setBool8(java.lang.Boolean bool8) {
            this.bool8 = bool8;
            setBool8IsSet(true);
            return this;
        }

        public void unsetBool8() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BOOL8_ISSET_ID);
        }

        public boolean isSetBool8() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BOOL8_ISSET_ID);
        }

        public void setBool8IsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BOOL8_ISSET_ID, value);
        }
    

    
        public java.lang.String getStr() {
            return this.str;
        }

        public ProtocolSample setStr(java.lang.String str) {
            this.str = str;
            return this;
        }

        public void unsetStr() {
            this.str = null;
        }

        public boolean isSetStr() {
            return this.str != null;
        }

        public void setStrIsSet(boolean value) {
            if (!value) {
              this.str = null;
            }
        }
    

    
        public byte[] getBin() {
            setBin(org.apache.thrift.TBaseHelper.rightSize(bin));
            return bin == null ? null : bin.array();
        }

        public java.nio.ByteBuffer bufferForBin() {
            return com.test.thrift.Helpers.copyBinary(bin);
        }

        public ProtocolSample setBin(byte[] bin) {
            this.bin = bin == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(bin.clone());
            return this;
        }

        public ProtocolSample setBin(java.nio.ByteBuffer bin) {
            this.bin = com.test.thrift.Helpers.copyBinary(bin);
            return this;
        }

        public void unsetBin() {
            this.bin = null;
        }

        public boolean isSetBin() {
            return this.bin != null;
        }

        public void setBinIsSet(boolean value) {
            if (!value) {
              this.bin = null;
            }
        }
    

    
        public java.lang.Byte getByte8() {
            return this.byte8;
        }

        public ProtocolSample setByte8(java.lang.Byte byte8) {
            this.byte8 = byte8;
            setByte8IsSet(true);
            return this;
        }

        public void unsetByte8() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BYTE8_ISSET_ID);
        }

        public boolean isSetByte8() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BYTE8_ISSET_ID);
        }

        public void setByte8IsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BYTE8_ISSET_ID, value);
        }
    

    
        public int getList32Size() {
            return (this.list32 == null) ? 0 : this.list32.size();
        }

        public void addToList32(java.lang.Integer elem) {
            if (this.list32 == null) {
              this.list32 = new com.test.thrift.protocol.TListI32();
            }
            this.list32.add(elem);
        }

        public com.test.thrift.protocol.TListI32 getList32() {
            return this.list32;
        }

        public ProtocolSample setList32(com.test.thrift.protocol.TListI32 list32) {
            this.list32 = list32;
            return this;
        }

        public void unsetList32() {
            this.list32 = null;
        }

        public boolean isSetList32() {
            return this.list32 != null;
        }

        public void setList32IsSet(boolean value) {
            if (!value) {
              this.list32 = null;
            }
        }
    

    
        public int getListDoubleSize() {
            return (this.listDouble == null) ? 0 : this.listDouble.size();
        }

        public void addToListDouble(java.lang.Double elem) {
            if (this.listDouble == null) {
              this.listDouble = new com.test.thrift.protocol.TListDouble();
            }
            this.listDouble.add(elem);
        }

        public com.test.thrift.protocol.TListDouble getListDouble() {
            return this.listDouble;
        }

        public ProtocolSample setListDouble(com.test.thrift.protocol.TListDouble listDouble) {
            this.listDouble = listDouble;
            return this;
        }

        public void unsetListDouble() {
            this.listDouble = null;
        }

        public boolean isSetListDouble() {
            return this.listDouble != null;
        }

        public void setListDoubleIsSet(boolean value) {
            if (!value) {
              this.listDouble = null;
            }
        }
    

    
        public java.lang.Integer getOk() {
            return this.ok;
        }

        public ProtocolSample setOk(java.lang.Integer ok) {
            this.ok = ok;
            setOkIsSet(true);
            return this;
        }

        public void unsetOk() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OK_ISSET_ID);
        }

        public boolean isSetOk() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OK_ISSET_ID);
        }

        public void setOkIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OK_ISSET_ID, value);
        }
    

    
        public int getStrsSize() {
            return (this.strs == null) ? 0 : this.strs.size();
        }

        
        public java.util.Iterator<java.lang.String> getStrsIterator() {
            return (this.strs == null) ? null : this.strs.iterator();
        }

        
        public void addToStrs(java.lang.String elem) {
            if (this.strs == null) {
              this.strs =  new java.util.ArrayList<>(); 
            }
            this.strs.add(elem);
        }
        

        public java.util.List<java.lang.String> getStrs() {
            return this.strs;
        }

        public ProtocolSample setStrs(java.util.List<java.lang.String> strs) {
            this.strs = strs;
            return this;
        }

        public void unsetStrs() {
            this.strs = null;
        }

        public boolean isSetStrs() {
            return this.strs != null;
        }

        public void setStrsIsSet(boolean value) {
            if (!value) {
              this.strs = null;
            }
        }
    

    
        public int getLl32Size() {
            return (this.ll32 == null) ? 0 : this.ll32.size();
        }

        
        public java.util.Iterator<java.util.List<java.lang.Integer>> getLl32Iterator() {
            return (this.ll32 == null) ? null : this.ll32.iterator();
        }

        
        public void addToLl32(java.util.List<java.lang.Integer> elem) {
            if (this.ll32 == null) {
              this.ll32 =  new java.util.ArrayList<>(); 
            }
            this.ll32.add(elem);
        }
        

        public java.util.List<java.util.List<java.lang.Integer>> getLl32() {
            return this.ll32;
        }

        public ProtocolSample setLl32(java.util.List<java.util.List<java.lang.Integer>> ll32) {
            this.ll32 = ll32;
            return this;
        }

        public void unsetLl32() {
            this.ll32 = null;
        }

        public boolean isSetLl32() {
            return this.ll32 != null;
        }

        public void setLl32IsSet(boolean value) {
            if (!value) {
              this.ll32 = null;
            }
        }
    

    
        public java.lang.Boolean getThrowException() {
            return this.throwException;
        }

        public ProtocolSample setThrowException(java.lang.Boolean throwException) {
            this.throwException = throwException;
            setThrowExceptionIsSet(true);
            return this;
        }

        public void unsetThrowException() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __THROWEXCEPTION_ISSET_ID);
        }

        public boolean isSetThrowException() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __THROWEXCEPTION_ISSET_ID);
        }

        public void setThrowExceptionIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __THROWEXCEPTION_ISSET_ID, value);
        }
    


    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
          return false;
        if (that instanceof ProtocolSample)
          return this.equals((ProtocolSample)that);
        return false;
    }

    public boolean equals(ProtocolSample that) {
        if (that == null)
            return false;
        if (this == that)
            return true;
        
            
                
                    boolean this_present_int32 = true && this.isSetInt32();
                    boolean that_present_int32 = true && that.isSetInt32();
                
                if (this_present_int32 || that_present_int32) {
                    if (!(this_present_int32 && that_present_int32))
                        return false;
                    if (this.int32 != that.int32) {
                        //System.out.println("int32 not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_int64 = true && this.isSetInt64();
                    boolean that_present_int64 = true && that.isSetInt64();
                
                if (this_present_int64 || that_present_int64) {
                    if (!(this_present_int64 && that_present_int64))
                        return false;
                    if (this.int64 != that.int64) {
                        //System.out.println("int64 not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_float64 = true && this.isSetFloat64();
                    boolean that_present_float64 = true && that.isSetFloat64();
                
                if (this_present_float64 || that_present_float64) {
                    if (!(this_present_float64 && that_present_float64))
                        return false;
                    if (this.float64 != that.float64) {
                        //System.out.println("float64 not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_bool8 = true && this.isSetBool8();
                    boolean that_present_bool8 = true && that.isSetBool8();
                
                if (this_present_bool8 || that_present_bool8) {
                    if (!(this_present_bool8 && that_present_bool8))
                        return false;
                    if (this.bool8 != that.bool8) {
                        //System.out.println("bool8 not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_str = true && this.isSetStr();
                boolean that_present_str = true && that.isSetStr();
                if (this_present_str || that_present_str) {
                    if (!(this_present_str && that_present_str))
                        return false;
                    if (!this.str.equals(that.str)){
                        //System.out.println("str not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_bin = true && this.isSetBin();
                boolean that_present_bin = true && that.isSetBin();
                if (this_present_bin || that_present_bin) {
                    if (!(this_present_bin && that_present_bin))
                        return false;
                    if (!this.bin.equals(that.bin)){
                        //System.out.println("bin not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_byte8 = true && this.isSetByte8();
                    boolean that_present_byte8 = true && that.isSetByte8();
                
                if (this_present_byte8 || that_present_byte8) {
                    if (!(this_present_byte8 && that_present_byte8))
                        return false;
                    if (this.byte8 != that.byte8) {
                        //System.out.println("byte8 not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_list32 = true && this.isSetList32();
                boolean that_present_list32 = true && that.isSetList32();
                if (this_present_list32 || that_present_list32) {
                    if (!(this_present_list32 && that_present_list32))
                        return false;
                    if (!this.list32.equals(that.list32)){
                        //System.out.println("list32 not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listDouble = true && this.isSetListDouble();
                boolean that_present_listDouble = true && that.isSetListDouble();
                if (this_present_listDouble || that_present_listDouble) {
                    if (!(this_present_listDouble && that_present_listDouble))
                        return false;
                    if (!this.listDouble.equals(that.listDouble)){
                        //System.out.println("listDouble not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_ok = true;
                    boolean that_present_ok = true;
                
                if (this_present_ok || that_present_ok) {
                    if (!(this_present_ok && that_present_ok))
                        return false;
                    if (this.ok != that.ok) {
                        //System.out.println("ok not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_strs = true && this.isSetStrs();
                boolean that_present_strs = true && that.isSetStrs();
                if (this_present_strs || that_present_strs) {
                    if (!(this_present_strs && that_present_strs))
                        return false;
                    if (!this.strs.equals(that.strs)){
                        //System.out.println("strs not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_ll32 = true && this.isSetLl32();
                boolean that_present_ll32 = true && that.isSetLl32();
                if (this_present_ll32 || that_present_ll32) {
                    if (!(this_present_ll32 && that_present_ll32))
                        return false;
                    if (!this.ll32.equals(that.ll32)){
                        //System.out.println("ll32 not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_throwException = true && this.isSetThrowException();
                    boolean that_present_throwException = true && that.isSetThrowException();
                
                if (this_present_throwException || that_present_throwException) {
                    if (!(this_present_throwException && that_present_throwException))
                        return false;
                    if (this.throwException != that.throwException) {
                        //System.out.println("throwException not equal");
                        return false;
                    }
                }
            
        
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProtocolSample(");
        
            
                if (isSetInt32()) {
            
            
                    sb.append("int32:");
                    sb.append(this.int32);
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetInt64()) {
            
            
                    sb.append("int64:");
                    sb.append(this.int64);
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetFloat64()) {
            
            
                    sb.append("float64:");
                    sb.append(this.float64);
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetBool8()) {
            
            
                    sb.append("bool8:");
                    sb.append(this.bool8);
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetStr()) {
            
            
                    sb.append("str:");
                    if (this.str == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.str);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetBin()) {
            
            
                    sb.append("bin:");
                    if (this.bin == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.bin, sb);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetByte8()) {
            
            
                    sb.append("byte8:");
                    sb.append(this.byte8);
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetList32()) {
            
            
                    sb.append("list32:");
                    if (this.list32 == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.list32);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetListDouble()) {
            
            
                    sb.append("listDouble:");
                    if (this.listDouble == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listDouble);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("ok:");
                    sb.append(this.ok);
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetStrs()) {
            
            
                    sb.append("strs:");
                    if (this.strs == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.strs);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetLl32()) {
            
            
                    sb.append("ll32:");
                    if (this.ll32 == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.ll32);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetThrowException()) {
            
            
                    sb.append("throwException:");
                    sb.append(this.throwException);
            
                    
            
                }
            

        
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        
            
                
                    hashCode = hashCode * 8191 + ((isSetInt32()) ? 131071 : 524287);
                    if (isSetInt32())
                        hashCode = hashCode * 8191 + int32;
                    
            
        
            
                
                    hashCode = hashCode * 8191 + ((isSetInt64()) ? 131071 : 524287);
                    if (isSetInt64())
                        hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(int64);
                
            
        
            
                
                    hashCode = hashCode * 8191 + ((isSetFloat64()) ? 131071 : 524287);
                    if (isSetFloat64())
                        hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(float64);
                
            
        
            
                
                    hashCode = hashCode * 8191 + ((isSetBool8()) ? 131071 : 524287);
                    if (isSetBool8())
                        hashCode = hashCode * 8191 + ((bool8) ? 131071 : 524287);
                
            
        
            
                hashCode = hashCode * 8191 + ((isSetStr()) ? 131071 : 524287);
                if (isSetStr())
                    hashCode = hashCode * 8191 + str.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetBin()) ? 131071 : 524287);
                if (isSetBin())
                    hashCode = hashCode * 8191 + bin.hashCode();
            
        
            
                
                    hashCode = hashCode * 8191 + ((isSetByte8()) ? 131071 : 524287);
                    if (isSetByte8())
                        hashCode = hashCode * 8191 + (int)byte8;
                    
            
        
            
                hashCode = hashCode * 8191 + ((isSetList32()) ? 131071 : 524287);
                if (isSetList32())
                    hashCode = hashCode * 8191 + list32.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListDouble()) ? 131071 : 524287);
                if (isSetListDouble())
                    hashCode = hashCode * 8191 + listDouble.hashCode();
            
        
            
                
                    hashCode = hashCode * 8191 + ok;
                
            
        
            
                hashCode = hashCode * 8191 + ((isSetStrs()) ? 131071 : 524287);
                if (isSetStrs())
                    hashCode = hashCode * 8191 + strs.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetLl32()) ? 131071 : 524287);
                if (isSetLl32())
                    hashCode = hashCode * 8191 + ll32.hashCode();
            
        
            
                
                    hashCode = hashCode * 8191 + ((isSetThrowException()) ? 131071 : 524287);
                    if (isSetThrowException())
                        hashCode = hashCode * 8191 + ((throwException) ? 131071 : 524287);
                
            
        
        return hashCode;
    }

    public void clear() {
        
            
                
                    setInt32IsSet(false);
                    
                        this.int32 = 0;
                    
                
            
        
            
                
                    setInt64IsSet(false);
                    
                        this.int64 = 0;
                    
                
            
        
            
                
                    setFloat64IsSet(false);
                    
                        this.float64 = 0.0;
                    
                
            
        
            
                
                    setBool8IsSet(false);
                    
                        this.bool8 = false;
                    
                
            
        
            
                this.str = null;
            
        
            
                this.bin = null;
            
        
            
                
                    setByte8IsSet(false);
                    
                        this.byte8 = 0;
                    
                
            
        
            
                this.list32 = null;
            
        
            
                this.listDouble = null;
            
        
            
                
                    setOkIsSet(false);
                    
                        this.ok = 0;
                    
                
            
        
            
                this.strs = null;
            
        
            
                this.ll32 = null;
            
        
            
                
                    setThrowExceptionIsSet(false);
                    
                        this.throwException = false;
                    
                
            
        
    }

    public void validate() throws com.test.thrift.TException {
        
            
        
            
        
            
        
            
        
            
                 
            
        
            
                 
            
        
            
        
            
                 
            
        
            
                 
            
        
            
        
            
                 
            
        
            
                 
            
        
            
        

        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
    }

    public int size() {
        int size = 1; // writeFieldStop() need 1 byte;
        
            // int32
            
                
                 if(isSetInt32()){ 
                    size += 3;
                    size += 4;
                 } 
                
            
        
            // int64
            
                
                 if(isSetInt64()){ 
                    size += 3;
                    size += 8;
                 } 
                
            
        
            // float64
            
                
                 if(isSetFloat64()){ 
                    size += 3;
                    size += 8;
                 } 
                
            
        
            // bool8
            
                
                 if(isSetBool8()){ 
                    size += 3;
                    size += 1;
                 } 
                
            
        
            // str
            
                 if(str != null ){ 
                
                    size += 3;
                    size += 4 +  3 * str.length();
                
                 } 
            
        
            // bin
            
                 if(bin != null ){ 
                
                    size += 3;
                    size += 4 + bin.limit() - bin.position();
                
                 } 
            
        
            // byte8
            
                
                 if(isSetByte8()){ 
                    size += 3;
                    size += 1;
                 } 
                
            
        
            // list32
            
                if (list32 != null) {
                    size += 8;
                    
                        size += (4) * list32.size();
                    
                }
        
            // listDouble
            
                if (listDouble != null) {
                    size += 8;
                    
                        size += (8) * listDouble.size();
                    
                }
        
            // ok
            
                
                
                    size += 3;
                    size += 4;
                
                
            
        
            // strs
            
                    
                    if (strs != null) {
                    
                        size += 8;
                        for (java.lang.String _iter844  : strs) { size += 4 +  3 * _iter844.length();
                                            }
                    
                  } 
        
            // ll32
            
                    
                    if (ll32 != null) {
                    
                        size += 8;
                        for (java.util.List<java.lang.Integer> _iter845  : ll32) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter845.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // throwException
            
                
                 if(isSetThrowException()){ 
                    size += 3;
                    size += 1;
                 } 
                
            
        
        return size;
    }

    public ProtocolSample() {
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
}


    public ProtocolSample(
    
        int ok
    ) {
        this();
        
            this.ok = ok;
            
                setOkIsSet(true);
            
        
    }


/**
* Performs a deep copy on <i>other</i>.
*/
public ProtocolSample(ProtocolSample other) {
    __isset_bitfield = other.__isset_bitfield;
    
        this.int32 = other.int32;
    
        this.int64 = other.int64;
    
        this.float64 = other.float64;
    
        this.bool8 = other.bool8;
    
        
    if (other.isSetStr()){
                this.str = other.str;
                }
    
        
    if (other.isSetBin()){
        this.bin = com.test.thrift.Helpers.copyBinary(other.bin);
        }
    
        this.byte8 = other.byte8;
    
        this.list32 = other.list32;
    
        this.listDouble = other.listDouble;
    
        this.ok = other.ok;
    
        
    
        if(other.isSetStrs()){ 
    
        
            java.util.List<java.lang.String> __this__strs = new java.util.ArrayList<>(other.strs); //list1a
        
                    
        
    
            this.strs = __this__strs; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetLl32()){ 
    
        
            java.util.List<java.util.List<java.lang.Integer>> __this__ll32 = new java.util.ArrayList<>(other.ll32.size()); //list1b1
            for (java.util.List<java.lang.Integer> other_element : other.ll32) { //list1b2
        
                    
    
        
            java.util.List<java.lang.Integer> __this__ll32_copy = new java.util.ArrayList<>(other_element); //list1a
        
                    
        
    
                
        
            __this__ll32.add(__this__ll32_copy); //list2a1
            } //list2a2
        
    
            this.ll32 = __this__ll32; // list3a1
            } //list3a2
    
                
    
        this.throwException = other.throwException;
    
}

public ProtocolSample deepCopy() {
    return new ProtocolSample(this);
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
    
                case 1:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.int32 = iprot.readI32();
                  this.setInt32IsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 2:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                  this.int64 = iprot.readI64();
                  this.setInt64IsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 3:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
                  this.float64 = iprot.readDouble();
                  this.setFloat64IsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 4:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                  this.bool8 = iprot.readBool();
                  this.setBool8IsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 5:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.str = iprot.readString();
                  this.setStrIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 6:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.bin = iprot.readBinary();
                  this.setBinIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 7:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
                  this.byte8 = iprot.readByte();
                  this.setByte8IsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 8:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection826 = iprot.readListBegin();
                        list32 = new com.test.thrift.protocol.TListI32(_collection826.size);
                        int _elem827;
                        for(int _i828=0;_i828 < _collection826.size; ++ _i828 ) { 
                            _elem827 = iprot.readI32();
                            list32.add(_elem827);
                        }
                        iprot.readListEnd();
                    }
                    this.setList32IsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 9:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection829 = iprot.readListBegin();
                        listDouble = new com.test.thrift.protocol.TListDouble(_collection829.size);
                        double _elem830;
                        for(int _i831=0;_i831 < _collection829.size; ++ _i831 ) { 
                            _elem830 = iprot.readDouble();
                            listDouble.add(_elem830);
                        }
                        iprot.readListEnd();
                    }
                    this.setListDoubleIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 10:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.ok = iprot.readI32();
                  this.setOkIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 11:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection832 = iprot.readListBegin();
                        strs = new java.util.ArrayList<>(_collection832.size);
                        java.lang.String _elem833;
                        for(int _i834=0;_i834 < _collection832.size; ++ _i834 ) { 
                            _elem833 = iprot.readString();
                            strs.add(_elem833);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setStrsIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 12:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection835 = iprot.readListBegin();
                        ll32 = new java.util.ArrayList<>(_collection835.size);
                        java.util.List<java.lang.Integer> _elem836;
                        for(int _i837=0;_i837 < _collection835.size; ++ _i837 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection838 = iprot.readListBegin();
                        _elem836 = new java.util.ArrayList<>(_collection838.size);
                        int _elem839;
                        for(int _i840=0;_i840 < _collection838.size; ++ _i840 ) { 
                            _elem839 = iprot.readI32();
                            _elem836.add(_elem839);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            ll32.add(_elem836);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setLl32IsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 13:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                  this.throwException = iprot.readBool();
                  this.setThrowExceptionIsSet(true);
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
        
            
    
     if(isSetInt32()){ 
                          oprot.writeFieldBegin("int32", org.apache.thrift.protocol.TType.I32, (short)1);
                           oprot.writeI32(int32); 
                        } 
    
        
            
    
     if(isSetInt64()){ 
                          oprot.writeFieldBegin("int64", org.apache.thrift.protocol.TType.I64, (short)2);
                           oprot.writeI64(int64); 
                        } 
    
        
            
    
     if(isSetFloat64()){ 
                          oprot.writeFieldBegin("float64", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
                           oprot.writeDouble(float64); 
                        } 
    
        
            
    
     if(isSetBool8()){ 
                          oprot.writeFieldBegin("bool8", org.apache.thrift.protocol.TType.BOOL, (short)4);
                           oprot.writeBool(bool8); 
                        } 
    
        
            
     if (str != null) { 
    
                          oprot.writeFieldBegin("str", org.apache.thrift.protocol.TType.STRING, (short)5);
                           oprot.writeString(str); 
                      
     } 
        
            
     if (bin != null) { 
    
                          oprot.writeFieldBegin("bin", org.apache.thrift.protocol.TType.STRING, (short)6);
                           oprot.writeBinary(bin); 
                      
     } 
        
            
    
     if(isSetByte8()){ 
                          oprot.writeFieldBegin("byte8", org.apache.thrift.protocol.TType.BYTE, (short)7);
                           oprot.writeByte(byte8); 
                        } 
    
        
            
                if (list32 != null) {
                    oprot.writeFieldBegin("list32", org.apache.thrift.protocol.TType.LIST, (short)8);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, list32.size());
                    for (int i = 0; i <  list32.size(); i++) { 
                        oprot.writeI32(list32.get(i));
                    }
                 }
                
        
            
                if (listDouble != null) {
                    oprot.writeFieldBegin("listDouble", org.apache.thrift.protocol.TType.LIST, (short)9);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.DOUBLE, listDouble.size());
                    for (int i = 0; i <  listDouble.size(); i++) { 
                        oprot.writeDouble(listDouble.get(i));
                    }
                 }
                
        
            
    
    
                          oprot.writeFieldBegin("ok", org.apache.thrift.protocol.TType.I32, (short)10);
                           oprot.writeI32(ok); 
                      
    
        
            
                
                if (strs != null) {
                    oprot.writeFieldBegin("strs", org.apache.thrift.protocol.TType.LIST, (short)11);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, strs.size());
                        for (java.lang.String _iter841  : strs) { 
                            oprot.writeString(_iter841);
                   }
                 
                 }
                  }  
        
            
                
                if (ll32 != null) {
                    oprot.writeFieldBegin("ll32", org.apache.thrift.protocol.TType.LIST, (short)12);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, ll32.size());
                        for (java.util.List<java.lang.Integer> _iter842  : ll32) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, _iter842.size());
                        for (int _iter843  : _iter842) { 
                            oprot.writeI32(_iter843);
                   }
                  
                   }
                 
                 }
                  }  
        
            
    
     if(isSetThrowException()){ 
                          oprot.writeFieldBegin("throwException", org.apache.thrift.protocol.TType.BOOL, (short)13);
                           oprot.writeBool(throwException); 
                        } 
    
        

        oprot.writeFieldStop();
    }



}