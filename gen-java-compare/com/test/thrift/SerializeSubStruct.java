
package com.test.thrift;

public  class SerializeSubStruct implements com.test.thrift.IBase {

    
    
    
    public short i16Field; // required
    
    
    public int i32Field; // required
    
    
    public long i64Field; // required
    
    
    public double doubleRField; // required
    
    
    public byte i8Field; // required
    
    
    public Action action; // required
    
    
    public java.lang.String stringField; // required
    
    
    public java.nio.ByteBuffer binaryField; // required
    
    
    public com.test.thrift.protocol.TListI32 listI32; // required
    
    
    public com.test.thrift.protocol.TListI64 listI64; // required
    
    
    public com.test.thrift.protocol.TListDouble listDouble; // required
    
    
    public java.util.List<java.lang.Byte> listI8; // required
    
    
    public java.util.List<java.nio.ByteBuffer> listBinary; // required
    
    
    public java.util.List<java.lang.String> listString; // required
    
    
    public java.util.List<java.lang.Boolean> listBool; // required
    
    
    public java.util.List<Action> listAction; // required
    
    
    public java.util.Set<java.lang.Integer> setI32; // required
    
    
    public java.util.Set<java.lang.String> setString; // required
    
    
    public java.util.Set<java.nio.ByteBuffer> setBinary; // required
    
    
    public java.util.Map<java.lang.Integer, java.lang.String> mapI32String; // required

     
    private static final int __I16FIELD_ISSET_ID = 0;  
    private static final int __I32FIELD_ISSET_ID = 1;  
    private static final int __I64FIELD_ISSET_ID = 2;  
    private static final int __DOUBLERFIELD_ISSET_ID = 3;  
    private static final int __I8FIELD_ISSET_ID = 4;                               
    private byte __isset_bitfield = 0;


    
        public java.lang.Short getI16Field() {
            return this.i16Field;
        }

        public SerializeSubStruct setI16Field(java.lang.Short i16Field) {
            this.i16Field = i16Field;
            setI16FieldIsSet(true);
            return this;
        }

        public void unsetI16Field() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __I16FIELD_ISSET_ID);
        }

        public boolean isSetI16Field() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __I16FIELD_ISSET_ID);
        }

        public void setI16FieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __I16FIELD_ISSET_ID, value);
        }
    

    
        public java.lang.Integer getI32Field() {
            return this.i32Field;
        }

        public SerializeSubStruct setI32Field(java.lang.Integer i32Field) {
            this.i32Field = i32Field;
            setI32FieldIsSet(true);
            return this;
        }

        public void unsetI32Field() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __I32FIELD_ISSET_ID);
        }

        public boolean isSetI32Field() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __I32FIELD_ISSET_ID);
        }

        public void setI32FieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __I32FIELD_ISSET_ID, value);
        }
    

    
        public java.lang.Long getI64Field() {
            return this.i64Field;
        }

        public SerializeSubStruct setI64Field(java.lang.Long i64Field) {
            this.i64Field = i64Field;
            setI64FieldIsSet(true);
            return this;
        }

        public void unsetI64Field() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __I64FIELD_ISSET_ID);
        }

        public boolean isSetI64Field() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __I64FIELD_ISSET_ID);
        }

        public void setI64FieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __I64FIELD_ISSET_ID, value);
        }
    

    
        public java.lang.Double getDoubleRField() {
            return this.doubleRField;
        }

        public SerializeSubStruct setDoubleRField(java.lang.Double doubleRField) {
            this.doubleRField = doubleRField;
            setDoubleRFieldIsSet(true);
            return this;
        }

        public void unsetDoubleRField() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DOUBLERFIELD_ISSET_ID);
        }

        public boolean isSetDoubleRField() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DOUBLERFIELD_ISSET_ID);
        }

        public void setDoubleRFieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DOUBLERFIELD_ISSET_ID, value);
        }
    

    
        public java.lang.Byte getI8Field() {
            return this.i8Field;
        }

        public SerializeSubStruct setI8Field(java.lang.Byte i8Field) {
            this.i8Field = i8Field;
            setI8FieldIsSet(true);
            return this;
        }

        public void unsetI8Field() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __I8FIELD_ISSET_ID);
        }

        public boolean isSetI8Field() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __I8FIELD_ISSET_ID);
        }

        public void setI8FieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __I8FIELD_ISSET_ID, value);
        }
    

    
        public Action getAction() {
            return this.action;
        }

        public SerializeSubStruct setAction(Action action) {
            this.action = action;
            return this;
        }

        public void unsetAction() {
            this.action = null;
        }

        public boolean isSetAction() {
            return this.action != null;
        }

        public void setActionIsSet(boolean value) {
            if (!value) {
              this.action = null;
            }
        }
    

    
        public java.lang.String getStringField() {
            return this.stringField;
        }

        public SerializeSubStruct setStringField(java.lang.String stringField) {
            this.stringField = stringField;
            return this;
        }

        public void unsetStringField() {
            this.stringField = null;
        }

        public boolean isSetStringField() {
            return this.stringField != null;
        }

        public void setStringFieldIsSet(boolean value) {
            if (!value) {
              this.stringField = null;
            }
        }
    

    
        public byte[] getBinaryField() {
            setBinaryField(org.apache.thrift.TBaseHelper.rightSize(binaryField));
            return binaryField == null ? null : binaryField.array();
        }

        public java.nio.ByteBuffer bufferForBinaryField() {
            return com.test.thrift.Helpers.copyBinary(binaryField);
        }

        public SerializeSubStruct setBinaryField(byte[] binaryField) {
            this.binaryField = binaryField == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryField.clone());
            return this;
        }

        public SerializeSubStruct setBinaryField(java.nio.ByteBuffer binaryField) {
            this.binaryField = com.test.thrift.Helpers.copyBinary(binaryField);
            return this;
        }

        public void unsetBinaryField() {
            this.binaryField = null;
        }

        public boolean isSetBinaryField() {
            return this.binaryField != null;
        }

        public void setBinaryFieldIsSet(boolean value) {
            if (!value) {
              this.binaryField = null;
            }
        }
    

    
        public int getListI32Size() {
            return (this.listI32 == null) ? 0 : this.listI32.size();
        }

        public void addToListI32(java.lang.Integer elem) {
            if (this.listI32 == null) {
              this.listI32 = new com.test.thrift.protocol.TListI32();
            }
            this.listI32.add(elem);
        }

        public com.test.thrift.protocol.TListI32 getListI32() {
            return this.listI32;
        }

        public SerializeSubStruct setListI32(com.test.thrift.protocol.TListI32 listI32) {
            this.listI32 = listI32;
            return this;
        }

        public void unsetListI32() {
            this.listI32 = null;
        }

        public boolean isSetListI32() {
            return this.listI32 != null;
        }

        public void setListI32IsSet(boolean value) {
            if (!value) {
              this.listI32 = null;
            }
        }
    

    
        public int getListI64Size() {
            return (this.listI64 == null) ? 0 : this.listI64.size();
        }

        public void addToListI64(java.lang.Long elem) {
            if (this.listI64 == null) {
              this.listI64 = new com.test.thrift.protocol.TListI64();
            }
            this.listI64.add(elem);
        }

        public com.test.thrift.protocol.TListI64 getListI64() {
            return this.listI64;
        }

        public SerializeSubStruct setListI64(com.test.thrift.protocol.TListI64 listI64) {
            this.listI64 = listI64;
            return this;
        }

        public void unsetListI64() {
            this.listI64 = null;
        }

        public boolean isSetListI64() {
            return this.listI64 != null;
        }

        public void setListI64IsSet(boolean value) {
            if (!value) {
              this.listI64 = null;
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

        public SerializeSubStruct setListDouble(com.test.thrift.protocol.TListDouble listDouble) {
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
    

    
        public int getListI8Size() {
            return (this.listI8 == null) ? 0 : this.listI8.size();
        }

        
        public java.util.Iterator<java.lang.Byte> getListI8Iterator() {
            return (this.listI8 == null) ? null : this.listI8.iterator();
        }

        
        public void addToListI8(java.lang.Byte elem) {
            if (this.listI8 == null) {
              this.listI8 =  new java.util.ArrayList<>(); 
            }
            this.listI8.add(elem);
        }
        

        public java.util.List<java.lang.Byte> getListI8() {
            return this.listI8;
        }

        public SerializeSubStruct setListI8(java.util.List<java.lang.Byte> listI8) {
            this.listI8 = listI8;
            return this;
        }

        public void unsetListI8() {
            this.listI8 = null;
        }

        public boolean isSetListI8() {
            return this.listI8 != null;
        }

        public void setListI8IsSet(boolean value) {
            if (!value) {
              this.listI8 = null;
            }
        }
    

    
        public int getListBinarySize() {
            return (this.listBinary == null) ? 0 : this.listBinary.size();
        }

        
        public java.util.Iterator<java.nio.ByteBuffer> getListBinaryIterator() {
            return (this.listBinary == null) ? null : this.listBinary.iterator();
        }

        
        public void addToListBinary(java.nio.ByteBuffer elem) {
            if (this.listBinary == null) {
              this.listBinary =  new java.util.ArrayList<>(); 
            }
            this.listBinary.add(elem);
        }
        

        public java.util.List<java.nio.ByteBuffer> getListBinary() {
            return this.listBinary;
        }

        public SerializeSubStruct setListBinary(java.util.List<java.nio.ByteBuffer> listBinary) {
            this.listBinary = listBinary;
            return this;
        }

        public void unsetListBinary() {
            this.listBinary = null;
        }

        public boolean isSetListBinary() {
            return this.listBinary != null;
        }

        public void setListBinaryIsSet(boolean value) {
            if (!value) {
              this.listBinary = null;
            }
        }
    

    
        public int getListStringSize() {
            return (this.listString == null) ? 0 : this.listString.size();
        }

        
        public java.util.Iterator<java.lang.String> getListStringIterator() {
            return (this.listString == null) ? null : this.listString.iterator();
        }

        
        public void addToListString(java.lang.String elem) {
            if (this.listString == null) {
              this.listString =  new java.util.ArrayList<>(); 
            }
            this.listString.add(elem);
        }
        

        public java.util.List<java.lang.String> getListString() {
            return this.listString;
        }

        public SerializeSubStruct setListString(java.util.List<java.lang.String> listString) {
            this.listString = listString;
            return this;
        }

        public void unsetListString() {
            this.listString = null;
        }

        public boolean isSetListString() {
            return this.listString != null;
        }

        public void setListStringIsSet(boolean value) {
            if (!value) {
              this.listString = null;
            }
        }
    

    
        public int getListBoolSize() {
            return (this.listBool == null) ? 0 : this.listBool.size();
        }

        
        public java.util.Iterator<java.lang.Boolean> getListBoolIterator() {
            return (this.listBool == null) ? null : this.listBool.iterator();
        }

        
        public void addToListBool(java.lang.Boolean elem) {
            if (this.listBool == null) {
              this.listBool =  new java.util.ArrayList<>(); 
            }
            this.listBool.add(elem);
        }
        

        public java.util.List<java.lang.Boolean> getListBool() {
            return this.listBool;
        }

        public SerializeSubStruct setListBool(java.util.List<java.lang.Boolean> listBool) {
            this.listBool = listBool;
            return this;
        }

        public void unsetListBool() {
            this.listBool = null;
        }

        public boolean isSetListBool() {
            return this.listBool != null;
        }

        public void setListBoolIsSet(boolean value) {
            if (!value) {
              this.listBool = null;
            }
        }
    

    
        public int getListActionSize() {
            return (this.listAction == null) ? 0 : this.listAction.size();
        }

        
        public java.util.Iterator<Action> getListActionIterator() {
            return (this.listAction == null) ? null : this.listAction.iterator();
        }

        
        public void addToListAction(Action elem) {
            if (this.listAction == null) {
              this.listAction =  new java.util.ArrayList<>(); 
            }
            this.listAction.add(elem);
        }
        

        public java.util.List<Action> getListAction() {
            return this.listAction;
        }

        public SerializeSubStruct setListAction(java.util.List<Action> listAction) {
            this.listAction = listAction;
            return this;
        }

        public void unsetListAction() {
            this.listAction = null;
        }

        public boolean isSetListAction() {
            return this.listAction != null;
        }

        public void setListActionIsSet(boolean value) {
            if (!value) {
              this.listAction = null;
            }
        }
    

    
        public int getSetI32Size() {
            return (this.setI32 == null) ? 0 : this.setI32.size();
        }

        
        public java.util.Iterator<java.lang.Integer> getSetI32Iterator() {
            return (this.setI32 == null) ? null : this.setI32.iterator();
        }

        
        public void addToSetI32(java.lang.Integer elem) {
            if (this.setI32 == null) {
              this.setI32 =   new java.util.HashSet<>(); 
            }
            this.setI32.add(elem);
        }
        

        public java.util.Set<java.lang.Integer> getSetI32() {
            return this.setI32;
        }

        public SerializeSubStruct setSetI32(java.util.Set<java.lang.Integer> setI32) {
            this.setI32 = setI32;
            return this;
        }

        public void unsetSetI32() {
            this.setI32 = null;
        }

        public boolean isSetSetI32() {
            return this.setI32 != null;
        }

        public void setSetI32IsSet(boolean value) {
            if (!value) {
              this.setI32 = null;
            }
        }
    

    
        public int getSetStringSize() {
            return (this.setString == null) ? 0 : this.setString.size();
        }

        
        public java.util.Iterator<java.lang.String> getSetStringIterator() {
            return (this.setString == null) ? null : this.setString.iterator();
        }

        
        public void addToSetString(java.lang.String elem) {
            if (this.setString == null) {
              this.setString =   new java.util.HashSet<>(); 
            }
            this.setString.add(elem);
        }
        

        public java.util.Set<java.lang.String> getSetString() {
            return this.setString;
        }

        public SerializeSubStruct setSetString(java.util.Set<java.lang.String> setString) {
            this.setString = setString;
            return this;
        }

        public void unsetSetString() {
            this.setString = null;
        }

        public boolean isSetSetString() {
            return this.setString != null;
        }

        public void setSetStringIsSet(boolean value) {
            if (!value) {
              this.setString = null;
            }
        }
    

    
        public int getSetBinarySize() {
            return (this.setBinary == null) ? 0 : this.setBinary.size();
        }

        
        public java.util.Iterator<java.nio.ByteBuffer> getSetBinaryIterator() {
            return (this.setBinary == null) ? null : this.setBinary.iterator();
        }

        
        public void addToSetBinary(java.nio.ByteBuffer elem) {
            if (this.setBinary == null) {
              this.setBinary =   new java.util.HashSet<>(); 
            }
            this.setBinary.add(elem);
        }
        

        public java.util.Set<java.nio.ByteBuffer> getSetBinary() {
            return this.setBinary;
        }

        public SerializeSubStruct setSetBinary(java.util.Set<java.nio.ByteBuffer> setBinary) {
            this.setBinary = setBinary;
            return this;
        }

        public void unsetSetBinary() {
            this.setBinary = null;
        }

        public boolean isSetSetBinary() {
            return this.setBinary != null;
        }

        public void setSetBinaryIsSet(boolean value) {
            if (!value) {
              this.setBinary = null;
            }
        }
    

    
        public int getMapI32StringSize() {
            return (this.mapI32String == null) ? 0 : this.mapI32String.size();
        }

        

        
        public void putToMapI32String(java.lang.Integer key, java.lang.String val) {
            if (this.mapI32String == null) {
              this.mapI32String = new java.util.HashMap<>();
            }
            this.mapI32String.put(key, val);
        }

        public java.util.Map<java.lang.Integer, java.lang.String> getMapI32String() {
            return this.mapI32String;
        }

        public SerializeSubStruct setMapI32String(java.util.Map<java.lang.Integer, java.lang.String> mapI32String) {
            this.mapI32String = mapI32String;
            return this;
        }

        public void unsetMapI32String() {
            this.mapI32String = null;
        }

        public boolean isSetMapI32String() {
            return this.mapI32String != null;
        }

        public void setMapI32StringIsSet(boolean value) {
            if (!value) {
              this.mapI32String = null;
            }
        }
    


    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
          return false;
        if (that instanceof SerializeSubStruct)
          return this.equals((SerializeSubStruct)that);
        return false;
    }

    public boolean equals(SerializeSubStruct that) {
        if (that == null)
            return false;
        if (this == that)
            return true;
        
            
                
                    boolean this_present_i16Field = true;
                    boolean that_present_i16Field = true;
                
                if (this_present_i16Field || that_present_i16Field) {
                    if (!(this_present_i16Field && that_present_i16Field))
                        return false;
                    if (this.i16Field != that.i16Field) {
                        //System.out.println("i16Field not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_i32Field = true;
                    boolean that_present_i32Field = true;
                
                if (this_present_i32Field || that_present_i32Field) {
                    if (!(this_present_i32Field && that_present_i32Field))
                        return false;
                    if (this.i32Field != that.i32Field) {
                        //System.out.println("i32Field not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_i64Field = true;
                    boolean that_present_i64Field = true;
                
                if (this_present_i64Field || that_present_i64Field) {
                    if (!(this_present_i64Field && that_present_i64Field))
                        return false;
                    if (this.i64Field != that.i64Field) {
                        //System.out.println("i64Field not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_doubleRField = true;
                    boolean that_present_doubleRField = true;
                
                if (this_present_doubleRField || that_present_doubleRField) {
                    if (!(this_present_doubleRField && that_present_doubleRField))
                        return false;
                    if (this.doubleRField != that.doubleRField) {
                        //System.out.println("doubleRField not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_i8Field = true;
                    boolean that_present_i8Field = true;
                
                if (this_present_i8Field || that_present_i8Field) {
                    if (!(this_present_i8Field && that_present_i8Field))
                        return false;
                    if (this.i8Field != that.i8Field) {
                        //System.out.println("i8Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_action = true && this.isSetAction();
                boolean that_present_action = true && that.isSetAction();
                if (this_present_action || that_present_action) {
                    if (!(this_present_action && that_present_action))
                        return false;
                    if (!this.action.equals(that.action)){
                        //System.out.println("action not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_stringField = true && this.isSetStringField();
                boolean that_present_stringField = true && that.isSetStringField();
                if (this_present_stringField || that_present_stringField) {
                    if (!(this_present_stringField && that_present_stringField))
                        return false;
                    if (!this.stringField.equals(that.stringField)){
                        //System.out.println("stringField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_binaryField = true && this.isSetBinaryField();
                boolean that_present_binaryField = true && that.isSetBinaryField();
                if (this_present_binaryField || that_present_binaryField) {
                    if (!(this_present_binaryField && that_present_binaryField))
                        return false;
                    if (!this.binaryField.equals(that.binaryField)){
                        //System.out.println("binaryField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listI32 = true && this.isSetListI32();
                boolean that_present_listI32 = true && that.isSetListI32();
                if (this_present_listI32 || that_present_listI32) {
                    if (!(this_present_listI32 && that_present_listI32))
                        return false;
                    if (!this.listI32.equals(that.listI32)){
                        //System.out.println("listI32 not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listI64 = true && this.isSetListI64();
                boolean that_present_listI64 = true && that.isSetListI64();
                if (this_present_listI64 || that_present_listI64) {
                    if (!(this_present_listI64 && that_present_listI64))
                        return false;
                    if (!this.listI64.equals(that.listI64)){
                        //System.out.println("listI64 not equal");
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
            
        
            
                boolean this_present_listI8 = true && this.isSetListI8();
                boolean that_present_listI8 = true && that.isSetListI8();
                if (this_present_listI8 || that_present_listI8) {
                    if (!(this_present_listI8 && that_present_listI8))
                        return false;
                    if (!this.listI8.equals(that.listI8)){
                        //System.out.println("listI8 not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listBinary = true && this.isSetListBinary();
                boolean that_present_listBinary = true && that.isSetListBinary();
                if (this_present_listBinary || that_present_listBinary) {
                    if (!(this_present_listBinary && that_present_listBinary))
                        return false;
                    if (!this.listBinary.equals(that.listBinary)){
                        //System.out.println("listBinary not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listString = true && this.isSetListString();
                boolean that_present_listString = true && that.isSetListString();
                if (this_present_listString || that_present_listString) {
                    if (!(this_present_listString && that_present_listString))
                        return false;
                    if (!this.listString.equals(that.listString)){
                        //System.out.println("listString not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listBool = true && this.isSetListBool();
                boolean that_present_listBool = true && that.isSetListBool();
                if (this_present_listBool || that_present_listBool) {
                    if (!(this_present_listBool && that_present_listBool))
                        return false;
                    if (!this.listBool.equals(that.listBool)){
                        //System.out.println("listBool not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listAction = true && this.isSetListAction();
                boolean that_present_listAction = true && that.isSetListAction();
                if (this_present_listAction || that_present_listAction) {
                    if (!(this_present_listAction && that_present_listAction))
                        return false;
                    if (!this.listAction.equals(that.listAction)){
                        //System.out.println("listAction not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setI32 = true && this.isSetSetI32();
                boolean that_present_setI32 = true && that.isSetSetI32();
                if (this_present_setI32 || that_present_setI32) {
                    if (!(this_present_setI32 && that_present_setI32))
                        return false;
                    if (!this.setI32.equals(that.setI32)){
                        //System.out.println("setI32 not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setString = true && this.isSetSetString();
                boolean that_present_setString = true && that.isSetSetString();
                if (this_present_setString || that_present_setString) {
                    if (!(this_present_setString && that_present_setString))
                        return false;
                    if (!this.setString.equals(that.setString)){
                        //System.out.println("setString not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setBinary = true && this.isSetSetBinary();
                boolean that_present_setBinary = true && that.isSetSetBinary();
                if (this_present_setBinary || that_present_setBinary) {
                    if (!(this_present_setBinary && that_present_setBinary))
                        return false;
                    if (!this.setBinary.equals(that.setBinary)){
                        //System.out.println("setBinary not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapI32String = true && this.isSetMapI32String();
                boolean that_present_mapI32String = true && that.isSetMapI32String();
                if (this_present_mapI32String || that_present_mapI32String) {
                    if (!(this_present_mapI32String && that_present_mapI32String))
                        return false;
                    if (!this.mapI32String.equals(that.mapI32String)){
                        //System.out.println("mapI32String not equal");
                        return false;
                    }
                }
            
        
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SerializeSubStruct(");
        
            
            
                    sb.append("i16Field:");
                    sb.append(this.i16Field);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("i32Field:");
                    sb.append(this.i32Field);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("i64Field:");
                    sb.append(this.i64Field);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("doubleRField:");
                    sb.append(this.doubleRField);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("i8Field:");
                    sb.append(this.i8Field);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("action:");
                    if (this.action == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.action);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("stringField:");
                    if (this.stringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.stringField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("binaryField:");
                    if (this.binaryField == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.binaryField, sb);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listI32:");
                    if (this.listI32 == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI32);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listI64:");
                    if (this.listI64 == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI64);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listDouble:");
                    if (this.listDouble == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listDouble);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listI8:");
                    if (this.listI8 == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI8);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listBinary:");
                    if (this.listBinary == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.listBinary, sb);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listString:");
                    if (this.listString == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listString);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listBool:");
                    if (this.listBool == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listBool);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listAction:");
                    if (this.listAction == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listAction);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setI32:");
                    if (this.setI32 == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setI32);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setString:");
                    if (this.setString == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setString);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setBinary:");
                    if (this.setBinary == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.setBinary, sb);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapI32String:");
                    if (this.mapI32String == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapI32String);
                    }
            
                    
            

        
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        
            
                
                    hashCode = hashCode * 8191 + i16Field;
                
            
        
            
                
                    hashCode = hashCode * 8191 + i32Field;
                
            
        
            
                
                    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(i64Field);
                
            
        
            
                
                    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(doubleRField);
                
            
        
            
                
                    hashCode = hashCode * 8191 + (int)i8Field;
                
            
        
            
                hashCode = hashCode * 8191 + ((isSetAction()) ? 131071 : 524287);
                if (isSetAction())
                    hashCode = hashCode * 8191 + action.getValue();
            
        
            
                hashCode = hashCode * 8191 + ((isSetStringField()) ? 131071 : 524287);
                if (isSetStringField())
                    hashCode = hashCode * 8191 + stringField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetBinaryField()) ? 131071 : 524287);
                if (isSetBinaryField())
                    hashCode = hashCode * 8191 + binaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI32()) ? 131071 : 524287);
                if (isSetListI32())
                    hashCode = hashCode * 8191 + listI32.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI64()) ? 131071 : 524287);
                if (isSetListI64())
                    hashCode = hashCode * 8191 + listI64.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListDouble()) ? 131071 : 524287);
                if (isSetListDouble())
                    hashCode = hashCode * 8191 + listDouble.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI8()) ? 131071 : 524287);
                if (isSetListI8())
                    hashCode = hashCode * 8191 + listI8.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListBinary()) ? 131071 : 524287);
                if (isSetListBinary())
                    hashCode = hashCode * 8191 + listBinary.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListString()) ? 131071 : 524287);
                if (isSetListString())
                    hashCode = hashCode * 8191 + listString.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListBool()) ? 131071 : 524287);
                if (isSetListBool())
                    hashCode = hashCode * 8191 + listBool.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListAction()) ? 131071 : 524287);
                if (isSetListAction())
                    hashCode = hashCode * 8191 + listAction.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetI32()) ? 131071 : 524287);
                if (isSetSetI32())
                    hashCode = hashCode * 8191 + setI32.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetString()) ? 131071 : 524287);
                if (isSetSetString())
                    hashCode = hashCode * 8191 + setString.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetBinary()) ? 131071 : 524287);
                if (isSetSetBinary())
                    hashCode = hashCode * 8191 + setBinary.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapI32String()) ? 131071 : 524287);
                if (isSetMapI32String())
                    hashCode = hashCode * 8191 + mapI32String.hashCode();
            
        
        return hashCode;
    }

    public void clear() {
        
            
                
                    setI16FieldIsSet(false);
                    
                        this.i16Field = 0;
                    
                
            
        
            
                
                    setI32FieldIsSet(false);
                    
                        this.i32Field = 0;
                    
                
            
        
            
                
                    setI64FieldIsSet(false);
                    
                        this.i64Field = 0;
                    
                
            
        
            
                
                    setDoubleRFieldIsSet(false);
                    
                        this.doubleRField = 0.0;
                    
                
            
        
            
                
                    setI8FieldIsSet(false);
                    
                        this.i8Field = 0;
                    
                
            
        
            
                this.action = null;
            
        
            
                this.stringField = null;
            
        
            
                this.binaryField = null;
            
        
            
                this.listI32 = null;
            
        
            
                this.listI64 = null;
            
        
            
                this.listDouble = null;
            
        
            
                this.listI8 = null;
            
        
            
                this.listBinary = null;
            
        
            
                this.listString = null;
            
        
            
                this.listBool = null;
            
        
            
                this.listAction = null;
            
        
            
                this.setI32 = null;
            
        
            
                this.setString = null;
            
        
            
                this.setBinary = null;
            
        
            
                this.mapI32String = null;
            
        
    }

    public void validate() throws com.test.thrift.TException {
        
            
        
            
        
            
        
            
        
            
        
            
                 
                    if(action == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'action' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(stringField == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'stringField' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(binaryField == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'binaryField' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(listI32 == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listI32' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(listI64 == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listI64' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(listDouble == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listDouble' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(listI8 == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listI8' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(listBinary == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listBinary' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(listString == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listString' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(listBool == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listBool' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(listAction == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listAction' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(setI32 == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'setI32' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(setString == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'setString' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(setBinary == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'setBinary' was not present! Struct: " + toString()); }
                
            
        
            
                 
                    if(mapI32String == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'mapI32String' was not present! Struct: " + toString()); }
                
            
        

        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
    }

    public int size() {
        int size = 1; // writeFieldStop() need 1 byte;
        
            // mapI32String
            
                            
                                if (mapI32String != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter736 : mapI32String.entrySet())
                                        { size += 4;size += 4 +  3 * _iter736.getValue().length();
                               }
                             
                             }
                              }  
        
            // setBinary
            
                    
                    if (setBinary != null) {
                    
                        size += 8;
                        for (java.nio.ByteBuffer _iter737  : setBinary) { size += 4 + _iter737.limit() - _iter737.position();
                                            }
                    
                  } 
        
            // setString
            
                    
                    if (setString != null) {
                    
                        size += 8;
                        for (java.lang.String _iter738  : setString) { size += 4 +  3 * _iter738.length();
                                            }
                    
                  } 
        
            // setI32
            
                                        
                                    if (setI32 != null) {
                                     
                                        size += 8;
                                        
                                            size += (4) * setI32.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // listAction
            
                                        
                                    if (listAction != null) {
                                     
                                        size += 8;
                                        
                                            size += (4) * listAction.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // listBool
            
                                        
                                    if (listBool != null) {
                                     
                                        size += 8;
                                        
                                            size += listBool.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // listString
            
                    
                    if (listString != null) {
                    
                        size += 8;
                        for (java.lang.String _iter739  : listString) { size += 4 +  3 * _iter739.length();
                                            }
                    
                  } 
        
            // listBinary
            
                    
                    if (listBinary != null) {
                    
                        size += 8;
                        for (java.nio.ByteBuffer _iter740  : listBinary) { size += 4 + _iter740.limit() - _iter740.position();
                                            }
                    
                  } 
        
            // listI8
            
                                        
                                    if (listI8 != null) {
                                     
                                        size += 8;
                                        
                                            size += listI8.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // listDouble
            
                if (listDouble != null) {
                    size += 8;
                    
                        size += (8) * listDouble.size();
                    
                }
        
            // listI64
            
                if (listI64 != null) {
                    size += 8;
                    
                        size += (8) * listI64.size();
                    
                }
        
            // listI32
            
                if (listI32 != null) {
                    size += 8;
                    
                        size += (4) * listI32.size();
                    
                }
        
            // binaryField
            
                 if(binaryField != null ){ 
                
                    size += 3;
                    size += 4 + binaryField.limit() - binaryField.position();
                
                 } 
            
        
            // stringField
            
                 if(stringField != null ){ 
                
                    size += 3;
                    size += 4 +  3 * stringField.length();
                
                 } 
            
        
            // action
            
                 if(action != null ){ 
                
                    size += 3;
                    size += 4;
                
                 } 
            
        
            // i8Field
            
                
                
                    size += 3;
                    size += 1;
                
                
            
        
            // doubleRField
            
                
                
                    size += 3;
                    size += 8;
                
                
            
        
            // i64Field
            
                
                
                    size += 3;
                    size += 8;
                
                
            
        
            // i32Field
            
                
                
                    size += 3;
                    size += 4;
                
                
            
        
            // i16Field
            
                
                
                    size += 3;
                    size += 2;
                
                
            
        
        return size;
    }

    public SerializeSubStruct() {
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
}


    public SerializeSubStruct(
    
        short i16Field,
        int i32Field,
        long i64Field,
        double doubleRField,
        byte i8Field,
        Action action,
        java.lang.String stringField,
        java.nio.ByteBuffer binaryField,
        com.test.thrift.protocol.TListI32 listI32,
        com.test.thrift.protocol.TListI64 listI64,
        com.test.thrift.protocol.TListDouble listDouble,
        java.util.List<java.lang.Byte> listI8,
        java.util.List<java.nio.ByteBuffer> listBinary,
        java.util.List<java.lang.String> listString,
        java.util.List<java.lang.Boolean> listBool,
        java.util.List<Action> listAction,
        java.util.Set<java.lang.Integer> setI32,
        java.util.Set<java.lang.String> setString,
        java.util.Set<java.nio.ByteBuffer> setBinary,
        java.util.Map<java.lang.Integer, java.lang.String> mapI32String
    ) {
        this();
        
            this.i16Field = i16Field;
            
                setI16FieldIsSet(true);
            
        
            this.i32Field = i32Field;
            
                setI32FieldIsSet(true);
            
        
            this.i64Field = i64Field;
            
                setI64FieldIsSet(true);
            
        
            this.doubleRField = doubleRField;
            
                setDoubleRFieldIsSet(true);
            
        
            this.i8Field = i8Field;
            
                setI8FieldIsSet(true);
            
        
            this.action = action;
            
        
            this.stringField = stringField;
            
        
            this.binaryField = binaryField;
            
        
            this.listI32 = listI32;
            
        
            this.listI64 = listI64;
            
        
            this.listDouble = listDouble;
            
        
            this.listI8 = listI8;
            
        
            this.listBinary = listBinary;
            
        
            this.listString = listString;
            
        
            this.listBool = listBool;
            
        
            this.listAction = listAction;
            
        
            this.setI32 = setI32;
            
        
            this.setString = setString;
            
        
            this.setBinary = setBinary;
            
        
            this.mapI32String = mapI32String;
            
        
    }


/**
* Performs a deep copy on <i>other</i>.
*/
public SerializeSubStruct(SerializeSubStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    
        this.i16Field = other.i16Field;
    
        this.i32Field = other.i32Field;
    
        this.i64Field = other.i64Field;
    
        this.doubleRField = other.doubleRField;
    
        this.i8Field = other.i8Field;
    
        
    if (other.isSetAction()){
                this.action = other.action;
                }
    
        
    if (other.isSetStringField()){
                this.stringField = other.stringField;
                }
    
        
    if (other.isSetBinaryField()){
        this.binaryField = com.test.thrift.Helpers.copyBinary(other.binaryField);
        }
    
        this.listI32 = other.listI32;
    
        this.listI64 = other.listI64;
    
        this.listDouble = other.listDouble;
    
        
    
        if(other.isSetListI8()){ 
    
        
            java.util.List<java.lang.Byte> __this__listI8 = new java.util.ArrayList<>(other.listI8); //list1a
        
                    
        
    
            this.listI8 = __this__listI8; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListBinary()){ 
    
        
            java.util.List<java.nio.ByteBuffer> __this__listBinary = new java.util.ArrayList<>(other.listBinary); //list1a
        
                    
        
    
            this.listBinary = __this__listBinary; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListString()){ 
    
        
            java.util.List<java.lang.String> __this__listString = new java.util.ArrayList<>(other.listString); //list1a
        
                    
        
    
            this.listString = __this__listString; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListBool()){ 
    
        
            java.util.List<java.lang.Boolean> __this__listBool = new java.util.ArrayList<>(other.listBool); //list1a
        
                    
        
    
            this.listBool = __this__listBool; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListAction()){ 
    
        
            java.util.List<Action> __this__listAction = new java.util.ArrayList<>(other.listAction); //list1a
        
                    
        
    
            this.listAction = __this__listAction; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetI32()){ 
    
        
            java.util.Set<java.lang.Integer> __this__setI32 = new java.util.HashSet<>(other.setI32); //list1a
        
                    
        
    
            this.setI32 = __this__setI32; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetString()){ 
    
        
            java.util.Set<java.lang.String> __this__setString = new java.util.HashSet<>(other.setString); //list1a
        
                    
        
    
            this.setString = __this__setString; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetBinary()){ 
    
        
            java.util.Set<java.nio.ByteBuffer> __this__setBinary = new java.util.HashSet<>(other.setBinary); //list1a
        
                    
        
    
            this.setBinary = __this__setBinary; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetMapI32String()){
    
        
            java.util.Map<java.lang.Integer, java.lang.String> __this__mapI32String = new java.util.HashMap<>(other.mapI32String); //map1a
        
                    
        
    
            this.mapI32String = __this__mapI32String; // map4a1
            } //map4a2
    
                
    
}

public SerializeSubStruct deepCopy() {
    return new SerializeSubStruct(this);
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
    
                case -1:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
                  this.i16Field = iprot.readI16();
                  this.setI16FieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -2:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.i32Field = iprot.readI32();
                  this.setI32FieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -3:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                  this.i64Field = iprot.readI64();
                  this.setI64FieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -4:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
                  this.doubleRField = iprot.readDouble();
                  this.setDoubleRFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -5:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
                  this.i8Field = iprot.readByte();
                  this.setI8FieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -6:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.action = com.test.thrift.Action.findByValue(iprot.readI32());
                  this.setActionIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -7:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.stringField = iprot.readString();
                  this.setStringFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -8:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.binaryField = iprot.readBinary();
                  this.setBinaryFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -9:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection690 = iprot.readListBegin();
                        listI32 = new com.test.thrift.protocol.TListI32(_collection690.size);
                        int _elem691;
                        for(int _i692=0;_i692 < _collection690.size; ++ _i692 ) { 
                            _elem691 = iprot.readI32();
                            listI32.add(_elem691);
                        }
                        iprot.readListEnd();
                    }
                    this.setListI32IsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -10:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection693 = iprot.readListBegin();
                        listI64 = new com.test.thrift.protocol.TListI64(_collection693.size);
                        long _elem694;
                        for(int _i695=0;_i695 < _collection693.size; ++ _i695 ) { 
                            _elem694 = iprot.readI64();
                            listI64.add(_elem694);
                        }
                        iprot.readListEnd();
                    }
                    this.setListI64IsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -11:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection696 = iprot.readListBegin();
                        listDouble = new com.test.thrift.protocol.TListDouble(_collection696.size);
                        double _elem697;
                        for(int _i698=0;_i698 < _collection696.size; ++ _i698 ) { 
                            _elem697 = iprot.readDouble();
                            listDouble.add(_elem697);
                        }
                        iprot.readListEnd();
                    }
                    this.setListDoubleIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -12:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection699 = iprot.readListBegin();
                        listI8 = new java.util.ArrayList<>(_collection699.size);
                        byte _elem700;
                        for(int _i701=0;_i701 < _collection699.size; ++ _i701 ) { 
                            _elem700 = iprot.readByte();
                            listI8.add(_elem700);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListI8IsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -13:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection702 = iprot.readListBegin();
                        listBinary = new java.util.ArrayList<>(_collection702.size);
                        java.nio.ByteBuffer _elem703;
                        for(int _i704=0;_i704 < _collection702.size; ++ _i704 ) { 
                            _elem703 = iprot.readBinary();
                            listBinary.add(_elem703);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListBinaryIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -14:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection705 = iprot.readListBegin();
                        listString = new java.util.ArrayList<>(_collection705.size);
                        java.lang.String _elem706;
                        for(int _i707=0;_i707 < _collection705.size; ++ _i707 ) { 
                            _elem706 = iprot.readString();
                            listString.add(_elem706);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListStringIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -15:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection708 = iprot.readListBegin();
                        listBool = new java.util.ArrayList<>(_collection708.size);
                        boolean _elem709;
                        for(int _i710=0;_i710 < _collection708.size; ++ _i710 ) { 
                            _elem709 = iprot.readBool();
                            listBool.add(_elem709);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListBoolIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -16:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection711 = iprot.readListBegin();
                        listAction = new java.util.ArrayList<>(_collection711.size);
                        Action _elem712;
                        for(int _i713=0;_i713 < _collection711.size; ++ _i713 ) { 
                _elem712 = com.test.thrift.Action.findByValue(iprot.readI32());
                if(_elem712 == null){
                   continue;
                }
                            listAction.add(_elem712);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListActionIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -17:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection714 = iprot.readSetBegin();
                                    setI32 = new java.util.HashSet<>(_collection714.size);
                                    int _elem715;
                                    for(int _i716=0;_i716 < _collection714.size; ++_i716 ) { 
                            _elem715 = iprot.readI32();
                                        setI32.add(_elem715);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetI32IsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -18:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection717 = iprot.readSetBegin();
                                    setString = new java.util.HashSet<>(_collection717.size);
                                    java.lang.String _elem718;
                                    for(int _i719=0;_i719 < _collection717.size; ++_i719 ) { 
                            _elem718 = iprot.readString();
                                        setString.add(_elem718);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetStringIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -19:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection720 = iprot.readSetBegin();
                                    setBinary = new java.util.HashSet<>(_collection720.size);
                                    java.nio.ByteBuffer _elem721;
                                    for(int _i722=0;_i722 < _collection720.size; ++_i722 ) { 
                            _elem721 = iprot.readBinary();
                                        setBinary.add(_elem721);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetBinaryIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -20:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection723 = iprot.readMapBegin();
                                                mapI32String = new java.util.HashMap<>(_collection723.size);
                                                int _key_elem724;
                                                java.lang.String _value_elem725;
                                                for(int _i726=0;_i726 < _collection723.size; ++ _i726 ) { 
                            _key_elem724 = iprot.readI32();
                            _value_elem725 = iprot.readString();
                                                    mapI32String.put(_key_elem724,_value_elem725);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapI32StringIsSet(true); }
                                                
                                             else {
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
        
            
                
                    if (mapI32String != null) {
                        oprot.writeFieldBegin("mapI32String",org.apache.thrift.protocol.TType.MAP,(short)-20);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I32,org.apache.thrift.protocol.TType.STRING, mapI32String.size());
                            for (java.util.Map.Entry<java.lang.Integer, java.lang.String> _iter727 : mapI32String.entrySet())
                            { 
                                        oprot.writeI32(_iter727.getKey());
                                        oprot.writeString(_iter727.getValue());
                    }
                   }
                 
                 }
                  }  
        
            
                
                if (setBinary != null) {
                    oprot.writeFieldBegin("setBinary",org.apache.thrift.protocol.TType.SET,(short)-19);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, setBinary.size());
                        for (java.nio.ByteBuffer _iter728  : setBinary) { 
                            oprot.writeBinary(_iter728);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setString != null) {
                    oprot.writeFieldBegin("setString",org.apache.thrift.protocol.TType.SET,(short)-18);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, setString.size());
                        for (java.lang.String _iter729  : setString) { 
                            oprot.writeString(_iter729);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setI32 != null) {
                    oprot.writeFieldBegin("setI32",org.apache.thrift.protocol.TType.SET,(short)-17);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I32, setI32.size());
                        for (int _iter730  : setI32) { 
                            oprot.writeI32(_iter730);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (listAction != null) {
                    oprot.writeFieldBegin("listAction", org.apache.thrift.protocol.TType.LIST, (short)-16);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, listAction.size());
                        for (Action _iter731  : listAction) { oprot.writeI32(_iter731.getValue());
                   }
                 
                 }
                  }  
        
            
                
                if (listBool != null) {
                    oprot.writeFieldBegin("listBool", org.apache.thrift.protocol.TType.LIST, (short)-15);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BOOL, listBool.size());
                        for (boolean _iter732  : listBool) { 
                            oprot.writeBool(_iter732);
                   }
                 
                 }
                  }  
        
            
                
                if (listString != null) {
                    oprot.writeFieldBegin("listString", org.apache.thrift.protocol.TType.LIST, (short)-14);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, listString.size());
                        for (java.lang.String _iter733  : listString) { 
                            oprot.writeString(_iter733);
                   }
                 
                 }
                  }  
        
            
                
                if (listBinary != null) {
                    oprot.writeFieldBegin("listBinary", org.apache.thrift.protocol.TType.LIST, (short)-13);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, listBinary.size());
                        for (java.nio.ByteBuffer _iter734  : listBinary) { 
                            oprot.writeBinary(_iter734);
                   }
                 
                 }
                  }  
        
            
                
                if (listI8 != null) {
                    oprot.writeFieldBegin("listI8", org.apache.thrift.protocol.TType.LIST, (short)-12);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BYTE, listI8.size());
                        for (byte _iter735  : listI8) { 
                            oprot.writeByte(_iter735);
                   }
                 
                 }
                  }  
        
            
                if (listDouble != null) {
                    oprot.writeFieldBegin("listDouble", org.apache.thrift.protocol.TType.LIST, (short)-11);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.DOUBLE, listDouble.size());
                    for (int i = 0; i <  listDouble.size(); i++) { 
                        oprot.writeDouble(listDouble.get(i));
                    }
                 }
                
        
            
                if (listI64 != null) {
                    oprot.writeFieldBegin("listI64", org.apache.thrift.protocol.TType.LIST, (short)-10);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I64, listI64.size());
                    for (int i = 0; i <  listI64.size(); i++) { 
                        oprot.writeI64(listI64.get(i));
                    }
                 }
                
        
            
                if (listI32 != null) {
                    oprot.writeFieldBegin("listI32", org.apache.thrift.protocol.TType.LIST, (short)-9);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, listI32.size());
                    for (int i = 0; i <  listI32.size(); i++) { 
                        oprot.writeI32(listI32.get(i));
                    }
                 }
                
        
            
     if (binaryField != null) { 
    
                          oprot.writeFieldBegin("binaryField", org.apache.thrift.protocol.TType.STRING, (short)-8);
                           oprot.writeBinary(binaryField); 
                      
     } 
        
            
     if (stringField != null) { 
    
                          oprot.writeFieldBegin("stringField", org.apache.thrift.protocol.TType.STRING, (short)-7);
                           oprot.writeString(stringField); 
                      
     } 
        
            
     if (action != null) { 
    
                          oprot.writeFieldBegin("action", org.apache.thrift.protocol.TType.I32, (short)-6);
                           oprot.writeI32(action.getValue()); 
                      
     } 
        
            
    
    
                          oprot.writeFieldBegin("i8Field", org.apache.thrift.protocol.TType.BYTE, (short)-5);
                           oprot.writeByte(i8Field); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("doubleRField", org.apache.thrift.protocol.TType.DOUBLE, (short)-4);
                           oprot.writeDouble(doubleRField); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("i64Field", org.apache.thrift.protocol.TType.I64, (short)-3);
                           oprot.writeI64(i64Field); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("i32Field", org.apache.thrift.protocol.TType.I32, (short)-2);
                           oprot.writeI32(i32Field); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("i16Field", org.apache.thrift.protocol.TType.I16, (short)-1);
                           oprot.writeI16(i16Field); 
                      
    
        

        oprot.writeFieldStop();
    }



}