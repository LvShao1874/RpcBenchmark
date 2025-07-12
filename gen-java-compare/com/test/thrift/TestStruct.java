
package com.test.thrift;

public  class TestStruct implements com.test.thrift.IBase {

    
    
    
    public int i32Field; // required
    
    
    public int i32FieldOptional; // optional
    
    
    public int i32FieldRequired; // required
    
    
    public java.lang.String stringField; // optional
    
    
    public java.lang.String stringFieldOptional; // optional
    
    
    public java.lang.String stringFieldRequired; // required
    
    
    public java.nio.ByteBuffer binaryField; 
    
    
    public java.nio.ByteBuffer binaryFieldOptional; // optional
    
    
    public java.nio.ByteBuffer binaryFieldRequired; // required
    
    
    public boolean boolField; 
    
    
    public boolean boolFieldOptional; // optional
    
    
    public boolean boolFieldRequired; // required
    
    
    public byte i8field; 
    
    
    public short i16Field; 
    
    
    public long i64Field; 
    
    
    public double doubleField; // required
    
    
    public byte byteField; 
    
    
    public Action action; 
    
    
    public Action actionOptional; // optional
    
    
    public Action actionRequired; // required
    
    
    public com.test.thrift.protocol.TListI32 listI32Field;
    
    
    public com.test.thrift.protocol.TListI32 listI32FieldOptional; // optional
    
    
    public com.test.thrift.protocol.TListI32 listI32FieldRequired; // required
    
    
    public java.util.List<java.lang.Byte> listI8Field; 
    
    
    public com.test.thrift.protocol.TListI64 listI64Field;
    
    
    public com.test.thrift.protocol.TListDouble listDoubleField;
    
    
    public java.util.List<java.lang.String> listStringField; 
    
    
    public java.util.List<java.lang.Boolean> listBoolField; 
    
    
    public java.util.List<java.lang.Byte> listByteField; 
    
    
    public java.util.List<java.nio.ByteBuffer> listBinaryField; 
    
    
    public java.util.List<java.util.List<java.nio.ByteBuffer>> listListBinaryField; 
    
    
    public java.util.List<Action> listAction; 
    
    
    public java.util.List<java.util.List<java.lang.Integer>> listListI32Field; 
    
    
    public java.util.List<java.util.List<java.util.List<java.lang.Integer>>> listListListI32Field; 
    
    
    public java.util.List<java.util.Set<java.lang.Integer>> listSetI32Field; 
    
    
    public java.util.List<java.util.Set<java.lang.String>> listSetStringField; 
    
    
    public java.util.List<java.util.Set<java.nio.ByteBuffer>> listSetBinaryField; 
    
    
    public java.util.List<java.util.Map<java.lang.Byte, java.lang.String>> listMapI8StringField; 
    
    
    public java.util.List<java.util.Map<java.lang.Byte, java.nio.ByteBuffer>> listMapByteBinaryField; 
    
    
    public java.util.List<java.util.Map<java.lang.String, java.nio.ByteBuffer>> listMapBinaryField; 
    
    
    public java.util.List<java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>>> listComplexField; 
    
    
    public java.util.Set<java.lang.Boolean> setBoolField; 
    
    
    public java.util.Set<java.lang.String> setStringField; 
    
    
    public java.util.Set<java.lang.Byte> setByteField; 
    
    
    public java.util.Set<java.nio.ByteBuffer> setBinaryField; 
    
    
    public java.util.Set<Action> setAction; 
    
    
    public java.util.Set<java.util.List<java.lang.Long>> setListI64Field; 
    
    
    public java.util.Set<java.util.List<java.lang.Boolean>> setListBoolField; 
    
    
    public java.util.Set<java.util.Set<java.lang.Integer>> setSetI32Field; 
    
    
    public java.util.Set<java.util.Map<java.lang.Boolean, java.lang.Long>> setMapBoolI64Field; 
    
    
    public java.util.Set<java.util.Map<java.lang.Long, java.lang.Integer>> setMapI64I32Field; 
    
    
    public java.util.Set<java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>>> setComplexField; 
    
    
    public java.util.Map<java.lang.Integer, java.lang.Integer> mapI32I32Field; 
    
    
    public java.util.Map<java.lang.String, Action> mapStringAction; 
    
    
    public java.util.Map<java.lang.Long, java.lang.String> mapI64StringField; 
    
    
    public java.util.Map<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> mapI64MapField; 
    
    
    public java.util.Map<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> mapListListField; 
    
    
    public java.util.Map<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> mapComplexField; 
    
    
    public SubStruct sub; 
    
    
    public SubStruct subOptional; // optional
    
    
    public SubStruct subRequired; // required
    
    
    public java.util.List<SubStruct> listSubStruct; 
    
    
    public java.util.Set<SubStruct> setSubStruct; 
    
    
    public java.util.Map<SubStruct, SubStruct> mapSubStructSubStruct; 
    
    
    public java.util.Map<java.lang.Integer, SubStruct> mapI32SubStruct; 
    
    
    public java.util.Map<SubStruct, java.lang.Long> mapSubStructI64; 

     
    private static final int __I32FIELD_ISSET_ID = 0;  
    private static final int __I32FIELDOPTIONAL_ISSET_ID = 1;  
    private static final int __I32FIELDREQUIRED_ISSET_ID = 2;              
    private static final int __BOOLFIELD_ISSET_ID = 3;  
    private static final int __BOOLFIELDOPTIONAL_ISSET_ID = 4;  
    private static final int __BOOLFIELDREQUIRED_ISSET_ID = 5;  
    private static final int __I8FIELD_ISSET_ID = 6;  
    private static final int __I16FIELD_ISSET_ID = 7;  
    private static final int __I64FIELD_ISSET_ID = 8;  
    private static final int __DOUBLEFIELD_ISSET_ID = 9;  
    private static final int __BYTEFIELD_ISSET_ID = 10;                                                                                                   
    private byte __isset_bitfield = 0;


    
        public java.lang.Integer getI32Field() {
            return this.i32Field;
        }

        public TestStruct setI32Field(java.lang.Integer i32Field) {
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
    

    
        public java.lang.Integer getI32FieldOptional() {
            return this.i32FieldOptional;
        }

        public TestStruct setI32FieldOptional(java.lang.Integer i32FieldOptional) {
            this.i32FieldOptional = i32FieldOptional;
            setI32FieldOptionalIsSet(true);
            return this;
        }

        public void unsetI32FieldOptional() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __I32FIELDOPTIONAL_ISSET_ID);
        }

        public boolean isSetI32FieldOptional() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __I32FIELDOPTIONAL_ISSET_ID);
        }

        public void setI32FieldOptionalIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __I32FIELDOPTIONAL_ISSET_ID, value);
        }
    

    
        public java.lang.Integer getI32FieldRequired() {
            return this.i32FieldRequired;
        }

        public TestStruct setI32FieldRequired(java.lang.Integer i32FieldRequired) {
            this.i32FieldRequired = i32FieldRequired;
            setI32FieldRequiredIsSet(true);
            return this;
        }

        public void unsetI32FieldRequired() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __I32FIELDREQUIRED_ISSET_ID);
        }

        public boolean isSetI32FieldRequired() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __I32FIELDREQUIRED_ISSET_ID);
        }

        public void setI32FieldRequiredIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __I32FIELDREQUIRED_ISSET_ID, value);
        }
    

    
        public java.lang.String getStringField() {
            return this.stringField;
        }

        public TestStruct setStringField(java.lang.String stringField) {
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
    

    
        public java.lang.String getStringFieldOptional() {
            return this.stringFieldOptional;
        }

        public TestStruct setStringFieldOptional(java.lang.String stringFieldOptional) {
            this.stringFieldOptional = stringFieldOptional;
            return this;
        }

        public void unsetStringFieldOptional() {
            this.stringFieldOptional = null;
        }

        public boolean isSetStringFieldOptional() {
            return this.stringFieldOptional != null;
        }

        public void setStringFieldOptionalIsSet(boolean value) {
            if (!value) {
              this.stringFieldOptional = null;
            }
        }
    

    
        public java.lang.String getStringFieldRequired() {
            return this.stringFieldRequired;
        }

        public TestStruct setStringFieldRequired(java.lang.String stringFieldRequired) {
            this.stringFieldRequired = stringFieldRequired;
            return this;
        }

        public void unsetStringFieldRequired() {
            this.stringFieldRequired = null;
        }

        public boolean isSetStringFieldRequired() {
            return this.stringFieldRequired != null;
        }

        public void setStringFieldRequiredIsSet(boolean value) {
            if (!value) {
              this.stringFieldRequired = null;
            }
        }
    

    
        public byte[] getBinaryField() {
            setBinaryField(org.apache.thrift.TBaseHelper.rightSize(binaryField));
            return binaryField == null ? null : binaryField.array();
        }

        public java.nio.ByteBuffer bufferForBinaryField() {
            return com.test.thrift.Helpers.copyBinary(binaryField);
        }

        public TestStruct setBinaryField(byte[] binaryField) {
            this.binaryField = binaryField == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryField.clone());
            return this;
        }

        public TestStruct setBinaryField(java.nio.ByteBuffer binaryField) {
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
    

    
        public byte[] getBinaryFieldOptional() {
            setBinaryFieldOptional(org.apache.thrift.TBaseHelper.rightSize(binaryFieldOptional));
            return binaryFieldOptional == null ? null : binaryFieldOptional.array();
        }

        public java.nio.ByteBuffer bufferForBinaryFieldOptional() {
            return com.test.thrift.Helpers.copyBinary(binaryFieldOptional);
        }

        public TestStruct setBinaryFieldOptional(byte[] binaryFieldOptional) {
            this.binaryFieldOptional = binaryFieldOptional == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryFieldOptional.clone());
            return this;
        }

        public TestStruct setBinaryFieldOptional(java.nio.ByteBuffer binaryFieldOptional) {
            this.binaryFieldOptional = com.test.thrift.Helpers.copyBinary(binaryFieldOptional);
            return this;
        }

        public void unsetBinaryFieldOptional() {
            this.binaryFieldOptional = null;
        }

        public boolean isSetBinaryFieldOptional() {
            return this.binaryFieldOptional != null;
        }

        public void setBinaryFieldOptionalIsSet(boolean value) {
            if (!value) {
              this.binaryFieldOptional = null;
            }
        }
    

    
        public byte[] getBinaryFieldRequired() {
            setBinaryFieldRequired(org.apache.thrift.TBaseHelper.rightSize(binaryFieldRequired));
            return binaryFieldRequired == null ? null : binaryFieldRequired.array();
        }

        public java.nio.ByteBuffer bufferForBinaryFieldRequired() {
            return com.test.thrift.Helpers.copyBinary(binaryFieldRequired);
        }

        public TestStruct setBinaryFieldRequired(byte[] binaryFieldRequired) {
            this.binaryFieldRequired = binaryFieldRequired == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryFieldRequired.clone());
            return this;
        }

        public TestStruct setBinaryFieldRequired(java.nio.ByteBuffer binaryFieldRequired) {
            this.binaryFieldRequired = com.test.thrift.Helpers.copyBinary(binaryFieldRequired);
            return this;
        }

        public void unsetBinaryFieldRequired() {
            this.binaryFieldRequired = null;
        }

        public boolean isSetBinaryFieldRequired() {
            return this.binaryFieldRequired != null;
        }

        public void setBinaryFieldRequiredIsSet(boolean value) {
            if (!value) {
              this.binaryFieldRequired = null;
            }
        }
    

    
        public java.lang.Boolean getBoolField() {
            return this.boolField;
        }

        public TestStruct setBoolField(java.lang.Boolean boolField) {
            this.boolField = boolField;
            setBoolFieldIsSet(true);
            return this;
        }

        public void unsetBoolField() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BOOLFIELD_ISSET_ID);
        }

        public boolean isSetBoolField() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BOOLFIELD_ISSET_ID);
        }

        public void setBoolFieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BOOLFIELD_ISSET_ID, value);
        }
    

    
        public java.lang.Boolean getBoolFieldOptional() {
            return this.boolFieldOptional;
        }

        public TestStruct setBoolFieldOptional(java.lang.Boolean boolFieldOptional) {
            this.boolFieldOptional = boolFieldOptional;
            setBoolFieldOptionalIsSet(true);
            return this;
        }

        public void unsetBoolFieldOptional() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BOOLFIELDOPTIONAL_ISSET_ID);
        }

        public boolean isSetBoolFieldOptional() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BOOLFIELDOPTIONAL_ISSET_ID);
        }

        public void setBoolFieldOptionalIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BOOLFIELDOPTIONAL_ISSET_ID, value);
        }
    

    
        public java.lang.Boolean getBoolFieldRequired() {
            return this.boolFieldRequired;
        }

        public TestStruct setBoolFieldRequired(java.lang.Boolean boolFieldRequired) {
            this.boolFieldRequired = boolFieldRequired;
            setBoolFieldRequiredIsSet(true);
            return this;
        }

        public void unsetBoolFieldRequired() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BOOLFIELDREQUIRED_ISSET_ID);
        }

        public boolean isSetBoolFieldRequired() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BOOLFIELDREQUIRED_ISSET_ID);
        }

        public void setBoolFieldRequiredIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BOOLFIELDREQUIRED_ISSET_ID, value);
        }
    

    
        public java.lang.Byte getI8field() {
            return this.i8field;
        }

        public TestStruct setI8field(java.lang.Byte i8field) {
            this.i8field = i8field;
            setI8fieldIsSet(true);
            return this;
        }

        public void unsetI8field() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __I8FIELD_ISSET_ID);
        }

        public boolean isSetI8field() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __I8FIELD_ISSET_ID);
        }

        public void setI8fieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __I8FIELD_ISSET_ID, value);
        }
    

    
        public java.lang.Short getI16Field() {
            return this.i16Field;
        }

        public TestStruct setI16Field(java.lang.Short i16Field) {
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
    

    
        public java.lang.Long getI64Field() {
            return this.i64Field;
        }

        public TestStruct setI64Field(java.lang.Long i64Field) {
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
    

    
        public java.lang.Double getDoubleField() {
            return this.doubleField;
        }

        public TestStruct setDoubleField(java.lang.Double doubleField) {
            this.doubleField = doubleField;
            setDoubleFieldIsSet(true);
            return this;
        }

        public void unsetDoubleField() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DOUBLEFIELD_ISSET_ID);
        }

        public boolean isSetDoubleField() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DOUBLEFIELD_ISSET_ID);
        }

        public void setDoubleFieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DOUBLEFIELD_ISSET_ID, value);
        }
    

    
        public java.lang.Byte getByteField() {
            return this.byteField;
        }

        public TestStruct setByteField(java.lang.Byte byteField) {
            this.byteField = byteField;
            setByteFieldIsSet(true);
            return this;
        }

        public void unsetByteField() {
            __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BYTEFIELD_ISSET_ID);
        }

        public boolean isSetByteField() {
            return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BYTEFIELD_ISSET_ID);
        }

        public void setByteFieldIsSet(boolean value) {
            __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BYTEFIELD_ISSET_ID, value);
        }
    

    
        public Action getAction() {
            return this.action;
        }

        public TestStruct setAction(Action action) {
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
    

    
        public Action getActionOptional() {
            return this.actionOptional;
        }

        public TestStruct setActionOptional(Action actionOptional) {
            this.actionOptional = actionOptional;
            return this;
        }

        public void unsetActionOptional() {
            this.actionOptional = null;
        }

        public boolean isSetActionOptional() {
            return this.actionOptional != null;
        }

        public void setActionOptionalIsSet(boolean value) {
            if (!value) {
              this.actionOptional = null;
            }
        }
    

    
        public Action getActionRequired() {
            return this.actionRequired;
        }

        public TestStruct setActionRequired(Action actionRequired) {
            this.actionRequired = actionRequired;
            return this;
        }

        public void unsetActionRequired() {
            this.actionRequired = null;
        }

        public boolean isSetActionRequired() {
            return this.actionRequired != null;
        }

        public void setActionRequiredIsSet(boolean value) {
            if (!value) {
              this.actionRequired = null;
            }
        }
    

    
        public int getListI32FieldSize() {
            return (this.listI32Field == null) ? 0 : this.listI32Field.size();
        }

        public void addToListI32Field(java.lang.Integer elem) {
            if (this.listI32Field == null) {
              this.listI32Field = new com.test.thrift.protocol.TListI32();
            }
            this.listI32Field.add(elem);
        }

        public com.test.thrift.protocol.TListI32 getListI32Field() {
            return this.listI32Field;
        }

        public TestStruct setListI32Field(com.test.thrift.protocol.TListI32 listI32Field) {
            this.listI32Field = listI32Field;
            return this;
        }

        public void unsetListI32Field() {
            this.listI32Field = null;
        }

        public boolean isSetListI32Field() {
            return this.listI32Field != null;
        }

        public void setListI32FieldIsSet(boolean value) {
            if (!value) {
              this.listI32Field = null;
            }
        }
    

    
        public int getListI32FieldOptionalSize() {
            return (this.listI32FieldOptional == null) ? 0 : this.listI32FieldOptional.size();
        }

        public void addToListI32FieldOptional(java.lang.Integer elem) {
            if (this.listI32FieldOptional == null) {
              this.listI32FieldOptional = new com.test.thrift.protocol.TListI32();
            }
            this.listI32FieldOptional.add(elem);
        }

        public com.test.thrift.protocol.TListI32 getListI32FieldOptional() {
            return this.listI32FieldOptional;
        }

        public TestStruct setListI32FieldOptional(com.test.thrift.protocol.TListI32 listI32FieldOptional) {
            this.listI32FieldOptional = listI32FieldOptional;
            return this;
        }

        public void unsetListI32FieldOptional() {
            this.listI32FieldOptional = null;
        }

        public boolean isSetListI32FieldOptional() {
            return this.listI32FieldOptional != null;
        }

        public void setListI32FieldOptionalIsSet(boolean value) {
            if (!value) {
              this.listI32FieldOptional = null;
            }
        }
    

    
        public int getListI32FieldRequiredSize() {
            return (this.listI32FieldRequired == null) ? 0 : this.listI32FieldRequired.size();
        }

        public void addToListI32FieldRequired(java.lang.Integer elem) {
            if (this.listI32FieldRequired == null) {
              this.listI32FieldRequired = new com.test.thrift.protocol.TListI32();
            }
            this.listI32FieldRequired.add(elem);
        }

        public com.test.thrift.protocol.TListI32 getListI32FieldRequired() {
            return this.listI32FieldRequired;
        }

        public TestStruct setListI32FieldRequired(com.test.thrift.protocol.TListI32 listI32FieldRequired) {
            this.listI32FieldRequired = listI32FieldRequired;
            return this;
        }

        public void unsetListI32FieldRequired() {
            this.listI32FieldRequired = null;
        }

        public boolean isSetListI32FieldRequired() {
            return this.listI32FieldRequired != null;
        }

        public void setListI32FieldRequiredIsSet(boolean value) {
            if (!value) {
              this.listI32FieldRequired = null;
            }
        }
    

    
        public int getListI8FieldSize() {
            return (this.listI8Field == null) ? 0 : this.listI8Field.size();
        }

        
        public java.util.Iterator<java.lang.Byte> getListI8FieldIterator() {
            return (this.listI8Field == null) ? null : this.listI8Field.iterator();
        }

        
        public void addToListI8Field(java.lang.Byte elem) {
            if (this.listI8Field == null) {
              this.listI8Field =  new java.util.ArrayList<>(); 
            }
            this.listI8Field.add(elem);
        }
        

        public java.util.List<java.lang.Byte> getListI8Field() {
            return this.listI8Field;
        }

        public TestStruct setListI8Field(java.util.List<java.lang.Byte> listI8Field) {
            this.listI8Field = listI8Field;
            return this;
        }

        public void unsetListI8Field() {
            this.listI8Field = null;
        }

        public boolean isSetListI8Field() {
            return this.listI8Field != null;
        }

        public void setListI8FieldIsSet(boolean value) {
            if (!value) {
              this.listI8Field = null;
            }
        }
    

    
        public int getListI64FieldSize() {
            return (this.listI64Field == null) ? 0 : this.listI64Field.size();
        }

        public void addToListI64Field(java.lang.Long elem) {
            if (this.listI64Field == null) {
              this.listI64Field = new com.test.thrift.protocol.TListI64();
            }
            this.listI64Field.add(elem);
        }

        public com.test.thrift.protocol.TListI64 getListI64Field() {
            return this.listI64Field;
        }

        public TestStruct setListI64Field(com.test.thrift.protocol.TListI64 listI64Field) {
            this.listI64Field = listI64Field;
            return this;
        }

        public void unsetListI64Field() {
            this.listI64Field = null;
        }

        public boolean isSetListI64Field() {
            return this.listI64Field != null;
        }

        public void setListI64FieldIsSet(boolean value) {
            if (!value) {
              this.listI64Field = null;
            }
        }
    

    
        public int getListDoubleFieldSize() {
            return (this.listDoubleField == null) ? 0 : this.listDoubleField.size();
        }

        public void addToListDoubleField(java.lang.Double elem) {
            if (this.listDoubleField == null) {
              this.listDoubleField = new com.test.thrift.protocol.TListDouble();
            }
            this.listDoubleField.add(elem);
        }

        public com.test.thrift.protocol.TListDouble getListDoubleField() {
            return this.listDoubleField;
        }

        public TestStruct setListDoubleField(com.test.thrift.protocol.TListDouble listDoubleField) {
            this.listDoubleField = listDoubleField;
            return this;
        }

        public void unsetListDoubleField() {
            this.listDoubleField = null;
        }

        public boolean isSetListDoubleField() {
            return this.listDoubleField != null;
        }

        public void setListDoubleFieldIsSet(boolean value) {
            if (!value) {
              this.listDoubleField = null;
            }
        }
    

    
        public int getListStringFieldSize() {
            return (this.listStringField == null) ? 0 : this.listStringField.size();
        }

        
        public java.util.Iterator<java.lang.String> getListStringFieldIterator() {
            return (this.listStringField == null) ? null : this.listStringField.iterator();
        }

        
        public void addToListStringField(java.lang.String elem) {
            if (this.listStringField == null) {
              this.listStringField =  new java.util.ArrayList<>(); 
            }
            this.listStringField.add(elem);
        }
        

        public java.util.List<java.lang.String> getListStringField() {
            return this.listStringField;
        }

        public TestStruct setListStringField(java.util.List<java.lang.String> listStringField) {
            this.listStringField = listStringField;
            return this;
        }

        public void unsetListStringField() {
            this.listStringField = null;
        }

        public boolean isSetListStringField() {
            return this.listStringField != null;
        }

        public void setListStringFieldIsSet(boolean value) {
            if (!value) {
              this.listStringField = null;
            }
        }
    

    
        public int getListBoolFieldSize() {
            return (this.listBoolField == null) ? 0 : this.listBoolField.size();
        }

        
        public java.util.Iterator<java.lang.Boolean> getListBoolFieldIterator() {
            return (this.listBoolField == null) ? null : this.listBoolField.iterator();
        }

        
        public void addToListBoolField(java.lang.Boolean elem) {
            if (this.listBoolField == null) {
              this.listBoolField =  new java.util.ArrayList<>(); 
            }
            this.listBoolField.add(elem);
        }
        

        public java.util.List<java.lang.Boolean> getListBoolField() {
            return this.listBoolField;
        }

        public TestStruct setListBoolField(java.util.List<java.lang.Boolean> listBoolField) {
            this.listBoolField = listBoolField;
            return this;
        }

        public void unsetListBoolField() {
            this.listBoolField = null;
        }

        public boolean isSetListBoolField() {
            return this.listBoolField != null;
        }

        public void setListBoolFieldIsSet(boolean value) {
            if (!value) {
              this.listBoolField = null;
            }
        }
    

    
        public int getListByteFieldSize() {
            return (this.listByteField == null) ? 0 : this.listByteField.size();
        }

        
        public java.util.Iterator<java.lang.Byte> getListByteFieldIterator() {
            return (this.listByteField == null) ? null : this.listByteField.iterator();
        }

        
        public void addToListByteField(java.lang.Byte elem) {
            if (this.listByteField == null) {
              this.listByteField =  new java.util.ArrayList<>(); 
            }
            this.listByteField.add(elem);
        }
        

        public java.util.List<java.lang.Byte> getListByteField() {
            return this.listByteField;
        }

        public TestStruct setListByteField(java.util.List<java.lang.Byte> listByteField) {
            this.listByteField = listByteField;
            return this;
        }

        public void unsetListByteField() {
            this.listByteField = null;
        }

        public boolean isSetListByteField() {
            return this.listByteField != null;
        }

        public void setListByteFieldIsSet(boolean value) {
            if (!value) {
              this.listByteField = null;
            }
        }
    

    
        public int getListBinaryFieldSize() {
            return (this.listBinaryField == null) ? 0 : this.listBinaryField.size();
        }

        
        public java.util.Iterator<java.nio.ByteBuffer> getListBinaryFieldIterator() {
            return (this.listBinaryField == null) ? null : this.listBinaryField.iterator();
        }

        
        public void addToListBinaryField(java.nio.ByteBuffer elem) {
            if (this.listBinaryField == null) {
              this.listBinaryField =  new java.util.ArrayList<>(); 
            }
            this.listBinaryField.add(elem);
        }
        

        public java.util.List<java.nio.ByteBuffer> getListBinaryField() {
            return this.listBinaryField;
        }

        public TestStruct setListBinaryField(java.util.List<java.nio.ByteBuffer> listBinaryField) {
            this.listBinaryField = listBinaryField;
            return this;
        }

        public void unsetListBinaryField() {
            this.listBinaryField = null;
        }

        public boolean isSetListBinaryField() {
            return this.listBinaryField != null;
        }

        public void setListBinaryFieldIsSet(boolean value) {
            if (!value) {
              this.listBinaryField = null;
            }
        }
    

    
        public int getListListBinaryFieldSize() {
            return (this.listListBinaryField == null) ? 0 : this.listListBinaryField.size();
        }

        
        public java.util.Iterator<java.util.List<java.nio.ByteBuffer>> getListListBinaryFieldIterator() {
            return (this.listListBinaryField == null) ? null : this.listListBinaryField.iterator();
        }

        
        public void addToListListBinaryField(java.util.List<java.nio.ByteBuffer> elem) {
            if (this.listListBinaryField == null) {
              this.listListBinaryField =  new java.util.ArrayList<>(); 
            }
            this.listListBinaryField.add(elem);
        }
        

        public java.util.List<java.util.List<java.nio.ByteBuffer>> getListListBinaryField() {
            return this.listListBinaryField;
        }

        public TestStruct setListListBinaryField(java.util.List<java.util.List<java.nio.ByteBuffer>> listListBinaryField) {
            this.listListBinaryField = listListBinaryField;
            return this;
        }

        public void unsetListListBinaryField() {
            this.listListBinaryField = null;
        }

        public boolean isSetListListBinaryField() {
            return this.listListBinaryField != null;
        }

        public void setListListBinaryFieldIsSet(boolean value) {
            if (!value) {
              this.listListBinaryField = null;
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

        public TestStruct setListAction(java.util.List<Action> listAction) {
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
    

    
        public int getListListI32FieldSize() {
            return (this.listListI32Field == null) ? 0 : this.listListI32Field.size();
        }

        
        public java.util.Iterator<java.util.List<java.lang.Integer>> getListListI32FieldIterator() {
            return (this.listListI32Field == null) ? null : this.listListI32Field.iterator();
        }

        
        public void addToListListI32Field(java.util.List<java.lang.Integer> elem) {
            if (this.listListI32Field == null) {
              this.listListI32Field =  new java.util.ArrayList<>(); 
            }
            this.listListI32Field.add(elem);
        }
        

        public java.util.List<java.util.List<java.lang.Integer>> getListListI32Field() {
            return this.listListI32Field;
        }

        public TestStruct setListListI32Field(java.util.List<java.util.List<java.lang.Integer>> listListI32Field) {
            this.listListI32Field = listListI32Field;
            return this;
        }

        public void unsetListListI32Field() {
            this.listListI32Field = null;
        }

        public boolean isSetListListI32Field() {
            return this.listListI32Field != null;
        }

        public void setListListI32FieldIsSet(boolean value) {
            if (!value) {
              this.listListI32Field = null;
            }
        }
    

    
        public int getListListListI32FieldSize() {
            return (this.listListListI32Field == null) ? 0 : this.listListListI32Field.size();
        }

        
        public java.util.Iterator<java.util.List<java.util.List<java.lang.Integer>>> getListListListI32FieldIterator() {
            return (this.listListListI32Field == null) ? null : this.listListListI32Field.iterator();
        }

        
        public void addToListListListI32Field(java.util.List<java.util.List<java.lang.Integer>> elem) {
            if (this.listListListI32Field == null) {
              this.listListListI32Field =  new java.util.ArrayList<>(); 
            }
            this.listListListI32Field.add(elem);
        }
        

        public java.util.List<java.util.List<java.util.List<java.lang.Integer>>> getListListListI32Field() {
            return this.listListListI32Field;
        }

        public TestStruct setListListListI32Field(java.util.List<java.util.List<java.util.List<java.lang.Integer>>> listListListI32Field) {
            this.listListListI32Field = listListListI32Field;
            return this;
        }

        public void unsetListListListI32Field() {
            this.listListListI32Field = null;
        }

        public boolean isSetListListListI32Field() {
            return this.listListListI32Field != null;
        }

        public void setListListListI32FieldIsSet(boolean value) {
            if (!value) {
              this.listListListI32Field = null;
            }
        }
    

    
        public int getListSetI32FieldSize() {
            return (this.listSetI32Field == null) ? 0 : this.listSetI32Field.size();
        }

        
        public java.util.Iterator<java.util.Set<java.lang.Integer>> getListSetI32FieldIterator() {
            return (this.listSetI32Field == null) ? null : this.listSetI32Field.iterator();
        }

        
        public void addToListSetI32Field(java.util.Set<java.lang.Integer> elem) {
            if (this.listSetI32Field == null) {
              this.listSetI32Field =  new java.util.ArrayList<>(); 
            }
            this.listSetI32Field.add(elem);
        }
        

        public java.util.List<java.util.Set<java.lang.Integer>> getListSetI32Field() {
            return this.listSetI32Field;
        }

        public TestStruct setListSetI32Field(java.util.List<java.util.Set<java.lang.Integer>> listSetI32Field) {
            this.listSetI32Field = listSetI32Field;
            return this;
        }

        public void unsetListSetI32Field() {
            this.listSetI32Field = null;
        }

        public boolean isSetListSetI32Field() {
            return this.listSetI32Field != null;
        }

        public void setListSetI32FieldIsSet(boolean value) {
            if (!value) {
              this.listSetI32Field = null;
            }
        }
    

    
        public int getListSetStringFieldSize() {
            return (this.listSetStringField == null) ? 0 : this.listSetStringField.size();
        }

        
        public java.util.Iterator<java.util.Set<java.lang.String>> getListSetStringFieldIterator() {
            return (this.listSetStringField == null) ? null : this.listSetStringField.iterator();
        }

        
        public void addToListSetStringField(java.util.Set<java.lang.String> elem) {
            if (this.listSetStringField == null) {
              this.listSetStringField =  new java.util.ArrayList<>(); 
            }
            this.listSetStringField.add(elem);
        }
        

        public java.util.List<java.util.Set<java.lang.String>> getListSetStringField() {
            return this.listSetStringField;
        }

        public TestStruct setListSetStringField(java.util.List<java.util.Set<java.lang.String>> listSetStringField) {
            this.listSetStringField = listSetStringField;
            return this;
        }

        public void unsetListSetStringField() {
            this.listSetStringField = null;
        }

        public boolean isSetListSetStringField() {
            return this.listSetStringField != null;
        }

        public void setListSetStringFieldIsSet(boolean value) {
            if (!value) {
              this.listSetStringField = null;
            }
        }
    

    
        public int getListSetBinaryFieldSize() {
            return (this.listSetBinaryField == null) ? 0 : this.listSetBinaryField.size();
        }

        
        public java.util.Iterator<java.util.Set<java.nio.ByteBuffer>> getListSetBinaryFieldIterator() {
            return (this.listSetBinaryField == null) ? null : this.listSetBinaryField.iterator();
        }

        
        public void addToListSetBinaryField(java.util.Set<java.nio.ByteBuffer> elem) {
            if (this.listSetBinaryField == null) {
              this.listSetBinaryField =  new java.util.ArrayList<>(); 
            }
            this.listSetBinaryField.add(elem);
        }
        

        public java.util.List<java.util.Set<java.nio.ByteBuffer>> getListSetBinaryField() {
            return this.listSetBinaryField;
        }

        public TestStruct setListSetBinaryField(java.util.List<java.util.Set<java.nio.ByteBuffer>> listSetBinaryField) {
            this.listSetBinaryField = listSetBinaryField;
            return this;
        }

        public void unsetListSetBinaryField() {
            this.listSetBinaryField = null;
        }

        public boolean isSetListSetBinaryField() {
            return this.listSetBinaryField != null;
        }

        public void setListSetBinaryFieldIsSet(boolean value) {
            if (!value) {
              this.listSetBinaryField = null;
            }
        }
    

    
        public int getListMapI8StringFieldSize() {
            return (this.listMapI8StringField == null) ? 0 : this.listMapI8StringField.size();
        }

        
        public java.util.Iterator<java.util.Map<java.lang.Byte, java.lang.String>> getListMapI8StringFieldIterator() {
            return (this.listMapI8StringField == null) ? null : this.listMapI8StringField.iterator();
        }

        
        public void addToListMapI8StringField(java.util.Map<java.lang.Byte, java.lang.String> elem) {
            if (this.listMapI8StringField == null) {
              this.listMapI8StringField =  new java.util.ArrayList<>(); 
            }
            this.listMapI8StringField.add(elem);
        }
        

        public java.util.List<java.util.Map<java.lang.Byte, java.lang.String>> getListMapI8StringField() {
            return this.listMapI8StringField;
        }

        public TestStruct setListMapI8StringField(java.util.List<java.util.Map<java.lang.Byte, java.lang.String>> listMapI8StringField) {
            this.listMapI8StringField = listMapI8StringField;
            return this;
        }

        public void unsetListMapI8StringField() {
            this.listMapI8StringField = null;
        }

        public boolean isSetListMapI8StringField() {
            return this.listMapI8StringField != null;
        }

        public void setListMapI8StringFieldIsSet(boolean value) {
            if (!value) {
              this.listMapI8StringField = null;
            }
        }
    

    
        public int getListMapByteBinaryFieldSize() {
            return (this.listMapByteBinaryField == null) ? 0 : this.listMapByteBinaryField.size();
        }

        
        public java.util.Iterator<java.util.Map<java.lang.Byte, java.nio.ByteBuffer>> getListMapByteBinaryFieldIterator() {
            return (this.listMapByteBinaryField == null) ? null : this.listMapByteBinaryField.iterator();
        }

        
        public void addToListMapByteBinaryField(java.util.Map<java.lang.Byte, java.nio.ByteBuffer> elem) {
            if (this.listMapByteBinaryField == null) {
              this.listMapByteBinaryField =  new java.util.ArrayList<>(); 
            }
            this.listMapByteBinaryField.add(elem);
        }
        

        public java.util.List<java.util.Map<java.lang.Byte, java.nio.ByteBuffer>> getListMapByteBinaryField() {
            return this.listMapByteBinaryField;
        }

        public TestStruct setListMapByteBinaryField(java.util.List<java.util.Map<java.lang.Byte, java.nio.ByteBuffer>> listMapByteBinaryField) {
            this.listMapByteBinaryField = listMapByteBinaryField;
            return this;
        }

        public void unsetListMapByteBinaryField() {
            this.listMapByteBinaryField = null;
        }

        public boolean isSetListMapByteBinaryField() {
            return this.listMapByteBinaryField != null;
        }

        public void setListMapByteBinaryFieldIsSet(boolean value) {
            if (!value) {
              this.listMapByteBinaryField = null;
            }
        }
    

    
        public int getListMapBinaryFieldSize() {
            return (this.listMapBinaryField == null) ? 0 : this.listMapBinaryField.size();
        }

        
        public java.util.Iterator<java.util.Map<java.lang.String, java.nio.ByteBuffer>> getListMapBinaryFieldIterator() {
            return (this.listMapBinaryField == null) ? null : this.listMapBinaryField.iterator();
        }

        
        public void addToListMapBinaryField(java.util.Map<java.lang.String, java.nio.ByteBuffer> elem) {
            if (this.listMapBinaryField == null) {
              this.listMapBinaryField =  new java.util.ArrayList<>(); 
            }
            this.listMapBinaryField.add(elem);
        }
        

        public java.util.List<java.util.Map<java.lang.String, java.nio.ByteBuffer>> getListMapBinaryField() {
            return this.listMapBinaryField;
        }

        public TestStruct setListMapBinaryField(java.util.List<java.util.Map<java.lang.String, java.nio.ByteBuffer>> listMapBinaryField) {
            this.listMapBinaryField = listMapBinaryField;
            return this;
        }

        public void unsetListMapBinaryField() {
            this.listMapBinaryField = null;
        }

        public boolean isSetListMapBinaryField() {
            return this.listMapBinaryField != null;
        }

        public void setListMapBinaryFieldIsSet(boolean value) {
            if (!value) {
              this.listMapBinaryField = null;
            }
        }
    

    
        public int getListComplexFieldSize() {
            return (this.listComplexField == null) ? 0 : this.listComplexField.size();
        }

        
        public java.util.Iterator<java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>>> getListComplexFieldIterator() {
            return (this.listComplexField == null) ? null : this.listComplexField.iterator();
        }

        
        public void addToListComplexField(java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> elem) {
            if (this.listComplexField == null) {
              this.listComplexField =  new java.util.ArrayList<>(); 
            }
            this.listComplexField.add(elem);
        }
        

        public java.util.List<java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>>> getListComplexField() {
            return this.listComplexField;
        }

        public TestStruct setListComplexField(java.util.List<java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>>> listComplexField) {
            this.listComplexField = listComplexField;
            return this;
        }

        public void unsetListComplexField() {
            this.listComplexField = null;
        }

        public boolean isSetListComplexField() {
            return this.listComplexField != null;
        }

        public void setListComplexFieldIsSet(boolean value) {
            if (!value) {
              this.listComplexField = null;
            }
        }
    

    
        public int getSetBoolFieldSize() {
            return (this.setBoolField == null) ? 0 : this.setBoolField.size();
        }

        
        public java.util.Iterator<java.lang.Boolean> getSetBoolFieldIterator() {
            return (this.setBoolField == null) ? null : this.setBoolField.iterator();
        }

        
        public void addToSetBoolField(java.lang.Boolean elem) {
            if (this.setBoolField == null) {
              this.setBoolField =   new java.util.HashSet<>(); 
            }
            this.setBoolField.add(elem);
        }
        

        public java.util.Set<java.lang.Boolean> getSetBoolField() {
            return this.setBoolField;
        }

        public TestStruct setSetBoolField(java.util.Set<java.lang.Boolean> setBoolField) {
            this.setBoolField = setBoolField;
            return this;
        }

        public void unsetSetBoolField() {
            this.setBoolField = null;
        }

        public boolean isSetSetBoolField() {
            return this.setBoolField != null;
        }

        public void setSetBoolFieldIsSet(boolean value) {
            if (!value) {
              this.setBoolField = null;
            }
        }
    

    
        public int getSetStringFieldSize() {
            return (this.setStringField == null) ? 0 : this.setStringField.size();
        }

        
        public java.util.Iterator<java.lang.String> getSetStringFieldIterator() {
            return (this.setStringField == null) ? null : this.setStringField.iterator();
        }

        
        public void addToSetStringField(java.lang.String elem) {
            if (this.setStringField == null) {
              this.setStringField =   new java.util.HashSet<>(); 
            }
            this.setStringField.add(elem);
        }
        

        public java.util.Set<java.lang.String> getSetStringField() {
            return this.setStringField;
        }

        public TestStruct setSetStringField(java.util.Set<java.lang.String> setStringField) {
            this.setStringField = setStringField;
            return this;
        }

        public void unsetSetStringField() {
            this.setStringField = null;
        }

        public boolean isSetSetStringField() {
            return this.setStringField != null;
        }

        public void setSetStringFieldIsSet(boolean value) {
            if (!value) {
              this.setStringField = null;
            }
        }
    

    
        public int getSetByteFieldSize() {
            return (this.setByteField == null) ? 0 : this.setByteField.size();
        }

        
        public java.util.Iterator<java.lang.Byte> getSetByteFieldIterator() {
            return (this.setByteField == null) ? null : this.setByteField.iterator();
        }

        
        public void addToSetByteField(java.lang.Byte elem) {
            if (this.setByteField == null) {
              this.setByteField =   new java.util.HashSet<>(); 
            }
            this.setByteField.add(elem);
        }
        

        public java.util.Set<java.lang.Byte> getSetByteField() {
            return this.setByteField;
        }

        public TestStruct setSetByteField(java.util.Set<java.lang.Byte> setByteField) {
            this.setByteField = setByteField;
            return this;
        }

        public void unsetSetByteField() {
            this.setByteField = null;
        }

        public boolean isSetSetByteField() {
            return this.setByteField != null;
        }

        public void setSetByteFieldIsSet(boolean value) {
            if (!value) {
              this.setByteField = null;
            }
        }
    

    
        public int getSetBinaryFieldSize() {
            return (this.setBinaryField == null) ? 0 : this.setBinaryField.size();
        }

        
        public java.util.Iterator<java.nio.ByteBuffer> getSetBinaryFieldIterator() {
            return (this.setBinaryField == null) ? null : this.setBinaryField.iterator();
        }

        
        public void addToSetBinaryField(java.nio.ByteBuffer elem) {
            if (this.setBinaryField == null) {
              this.setBinaryField =   new java.util.HashSet<>(); 
            }
            this.setBinaryField.add(elem);
        }
        

        public java.util.Set<java.nio.ByteBuffer> getSetBinaryField() {
            return this.setBinaryField;
        }

        public TestStruct setSetBinaryField(java.util.Set<java.nio.ByteBuffer> setBinaryField) {
            this.setBinaryField = setBinaryField;
            return this;
        }

        public void unsetSetBinaryField() {
            this.setBinaryField = null;
        }

        public boolean isSetSetBinaryField() {
            return this.setBinaryField != null;
        }

        public void setSetBinaryFieldIsSet(boolean value) {
            if (!value) {
              this.setBinaryField = null;
            }
        }
    

    
        public int getSetActionSize() {
            return (this.setAction == null) ? 0 : this.setAction.size();
        }

        
        public java.util.Iterator<Action> getSetActionIterator() {
            return (this.setAction == null) ? null : this.setAction.iterator();
        }

        
        public void addToSetAction(Action elem) {
            if (this.setAction == null) {
              this.setAction =   new java.util.HashSet<>(); 
            }
            this.setAction.add(elem);
        }
        

        public java.util.Set<Action> getSetAction() {
            return this.setAction;
        }

        public TestStruct setSetAction(java.util.Set<Action> setAction) {
            this.setAction = setAction;
            return this;
        }

        public void unsetSetAction() {
            this.setAction = null;
        }

        public boolean isSetSetAction() {
            return this.setAction != null;
        }

        public void setSetActionIsSet(boolean value) {
            if (!value) {
              this.setAction = null;
            }
        }
    

    
        public int getSetListI64FieldSize() {
            return (this.setListI64Field == null) ? 0 : this.setListI64Field.size();
        }

        
        public java.util.Iterator<java.util.List<java.lang.Long>> getSetListI64FieldIterator() {
            return (this.setListI64Field == null) ? null : this.setListI64Field.iterator();
        }

        
        public void addToSetListI64Field(java.util.List<java.lang.Long> elem) {
            if (this.setListI64Field == null) {
              this.setListI64Field =   new java.util.HashSet<>(); 
            }
            this.setListI64Field.add(elem);
        }
        

        public java.util.Set<java.util.List<java.lang.Long>> getSetListI64Field() {
            return this.setListI64Field;
        }

        public TestStruct setSetListI64Field(java.util.Set<java.util.List<java.lang.Long>> setListI64Field) {
            this.setListI64Field = setListI64Field;
            return this;
        }

        public void unsetSetListI64Field() {
            this.setListI64Field = null;
        }

        public boolean isSetSetListI64Field() {
            return this.setListI64Field != null;
        }

        public void setSetListI64FieldIsSet(boolean value) {
            if (!value) {
              this.setListI64Field = null;
            }
        }
    

    
        public int getSetListBoolFieldSize() {
            return (this.setListBoolField == null) ? 0 : this.setListBoolField.size();
        }

        
        public java.util.Iterator<java.util.List<java.lang.Boolean>> getSetListBoolFieldIterator() {
            return (this.setListBoolField == null) ? null : this.setListBoolField.iterator();
        }

        
        public void addToSetListBoolField(java.util.List<java.lang.Boolean> elem) {
            if (this.setListBoolField == null) {
              this.setListBoolField =   new java.util.HashSet<>(); 
            }
            this.setListBoolField.add(elem);
        }
        

        public java.util.Set<java.util.List<java.lang.Boolean>> getSetListBoolField() {
            return this.setListBoolField;
        }

        public TestStruct setSetListBoolField(java.util.Set<java.util.List<java.lang.Boolean>> setListBoolField) {
            this.setListBoolField = setListBoolField;
            return this;
        }

        public void unsetSetListBoolField() {
            this.setListBoolField = null;
        }

        public boolean isSetSetListBoolField() {
            return this.setListBoolField != null;
        }

        public void setSetListBoolFieldIsSet(boolean value) {
            if (!value) {
              this.setListBoolField = null;
            }
        }
    

    
        public int getSetSetI32FieldSize() {
            return (this.setSetI32Field == null) ? 0 : this.setSetI32Field.size();
        }

        
        public java.util.Iterator<java.util.Set<java.lang.Integer>> getSetSetI32FieldIterator() {
            return (this.setSetI32Field == null) ? null : this.setSetI32Field.iterator();
        }

        
        public void addToSetSetI32Field(java.util.Set<java.lang.Integer> elem) {
            if (this.setSetI32Field == null) {
              this.setSetI32Field =   new java.util.HashSet<>(); 
            }
            this.setSetI32Field.add(elem);
        }
        

        public java.util.Set<java.util.Set<java.lang.Integer>> getSetSetI32Field() {
            return this.setSetI32Field;
        }

        public TestStruct setSetSetI32Field(java.util.Set<java.util.Set<java.lang.Integer>> setSetI32Field) {
            this.setSetI32Field = setSetI32Field;
            return this;
        }

        public void unsetSetSetI32Field() {
            this.setSetI32Field = null;
        }

        public boolean isSetSetSetI32Field() {
            return this.setSetI32Field != null;
        }

        public void setSetSetI32FieldIsSet(boolean value) {
            if (!value) {
              this.setSetI32Field = null;
            }
        }
    

    
        public int getSetMapBoolI64FieldSize() {
            return (this.setMapBoolI64Field == null) ? 0 : this.setMapBoolI64Field.size();
        }

        
        public java.util.Iterator<java.util.Map<java.lang.Boolean, java.lang.Long>> getSetMapBoolI64FieldIterator() {
            return (this.setMapBoolI64Field == null) ? null : this.setMapBoolI64Field.iterator();
        }

        
        public void addToSetMapBoolI64Field(java.util.Map<java.lang.Boolean, java.lang.Long> elem) {
            if (this.setMapBoolI64Field == null) {
              this.setMapBoolI64Field =   new java.util.HashSet<>(); 
            }
            this.setMapBoolI64Field.add(elem);
        }
        

        public java.util.Set<java.util.Map<java.lang.Boolean, java.lang.Long>> getSetMapBoolI64Field() {
            return this.setMapBoolI64Field;
        }

        public TestStruct setSetMapBoolI64Field(java.util.Set<java.util.Map<java.lang.Boolean, java.lang.Long>> setMapBoolI64Field) {
            this.setMapBoolI64Field = setMapBoolI64Field;
            return this;
        }

        public void unsetSetMapBoolI64Field() {
            this.setMapBoolI64Field = null;
        }

        public boolean isSetSetMapBoolI64Field() {
            return this.setMapBoolI64Field != null;
        }

        public void setSetMapBoolI64FieldIsSet(boolean value) {
            if (!value) {
              this.setMapBoolI64Field = null;
            }
        }
    

    
        public int getSetMapI64I32FieldSize() {
            return (this.setMapI64I32Field == null) ? 0 : this.setMapI64I32Field.size();
        }

        
        public java.util.Iterator<java.util.Map<java.lang.Long, java.lang.Integer>> getSetMapI64I32FieldIterator() {
            return (this.setMapI64I32Field == null) ? null : this.setMapI64I32Field.iterator();
        }

        
        public void addToSetMapI64I32Field(java.util.Map<java.lang.Long, java.lang.Integer> elem) {
            if (this.setMapI64I32Field == null) {
              this.setMapI64I32Field =   new java.util.HashSet<>(); 
            }
            this.setMapI64I32Field.add(elem);
        }
        

        public java.util.Set<java.util.Map<java.lang.Long, java.lang.Integer>> getSetMapI64I32Field() {
            return this.setMapI64I32Field;
        }

        public TestStruct setSetMapI64I32Field(java.util.Set<java.util.Map<java.lang.Long, java.lang.Integer>> setMapI64I32Field) {
            this.setMapI64I32Field = setMapI64I32Field;
            return this;
        }

        public void unsetSetMapI64I32Field() {
            this.setMapI64I32Field = null;
        }

        public boolean isSetSetMapI64I32Field() {
            return this.setMapI64I32Field != null;
        }

        public void setSetMapI64I32FieldIsSet(boolean value) {
            if (!value) {
              this.setMapI64I32Field = null;
            }
        }
    

    
        public int getSetComplexFieldSize() {
            return (this.setComplexField == null) ? 0 : this.setComplexField.size();
        }

        
        public java.util.Iterator<java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>>> getSetComplexFieldIterator() {
            return (this.setComplexField == null) ? null : this.setComplexField.iterator();
        }

        
        public void addToSetComplexField(java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> elem) {
            if (this.setComplexField == null) {
              this.setComplexField =   new java.util.HashSet<>(); 
            }
            this.setComplexField.add(elem);
        }
        

        public java.util.Set<java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>>> getSetComplexField() {
            return this.setComplexField;
        }

        public TestStruct setSetComplexField(java.util.Set<java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>>> setComplexField) {
            this.setComplexField = setComplexField;
            return this;
        }

        public void unsetSetComplexField() {
            this.setComplexField = null;
        }

        public boolean isSetSetComplexField() {
            return this.setComplexField != null;
        }

        public void setSetComplexFieldIsSet(boolean value) {
            if (!value) {
              this.setComplexField = null;
            }
        }
    

    
        public int getMapI32I32FieldSize() {
            return (this.mapI32I32Field == null) ? 0 : this.mapI32I32Field.size();
        }

        

        
        public void putToMapI32I32Field(java.lang.Integer key, java.lang.Integer val) {
            if (this.mapI32I32Field == null) {
              this.mapI32I32Field = new java.util.HashMap<>();
            }
            this.mapI32I32Field.put(key, val);
        }

        public java.util.Map<java.lang.Integer, java.lang.Integer> getMapI32I32Field() {
            return this.mapI32I32Field;
        }

        public TestStruct setMapI32I32Field(java.util.Map<java.lang.Integer, java.lang.Integer> mapI32I32Field) {
            this.mapI32I32Field = mapI32I32Field;
            return this;
        }

        public void unsetMapI32I32Field() {
            this.mapI32I32Field = null;
        }

        public boolean isSetMapI32I32Field() {
            return this.mapI32I32Field != null;
        }

        public void setMapI32I32FieldIsSet(boolean value) {
            if (!value) {
              this.mapI32I32Field = null;
            }
        }
    

    
        public int getMapStringActionSize() {
            return (this.mapStringAction == null) ? 0 : this.mapStringAction.size();
        }

        

        
        public void putToMapStringAction(java.lang.String key, Action val) {
            if (this.mapStringAction == null) {
              this.mapStringAction = new java.util.HashMap<>();
            }
            this.mapStringAction.put(key, val);
        }

        public java.util.Map<java.lang.String, Action> getMapStringAction() {
            return this.mapStringAction;
        }

        public TestStruct setMapStringAction(java.util.Map<java.lang.String, Action> mapStringAction) {
            this.mapStringAction = mapStringAction;
            return this;
        }

        public void unsetMapStringAction() {
            this.mapStringAction = null;
        }

        public boolean isSetMapStringAction() {
            return this.mapStringAction != null;
        }

        public void setMapStringActionIsSet(boolean value) {
            if (!value) {
              this.mapStringAction = null;
            }
        }
    

    
        public int getMapI64StringFieldSize() {
            return (this.mapI64StringField == null) ? 0 : this.mapI64StringField.size();
        }

        

        
        public void putToMapI64StringField(java.lang.Long key, java.lang.String val) {
            if (this.mapI64StringField == null) {
              this.mapI64StringField = new java.util.HashMap<>();
            }
            this.mapI64StringField.put(key, val);
        }

        public java.util.Map<java.lang.Long, java.lang.String> getMapI64StringField() {
            return this.mapI64StringField;
        }

        public TestStruct setMapI64StringField(java.util.Map<java.lang.Long, java.lang.String> mapI64StringField) {
            this.mapI64StringField = mapI64StringField;
            return this;
        }

        public void unsetMapI64StringField() {
            this.mapI64StringField = null;
        }

        public boolean isSetMapI64StringField() {
            return this.mapI64StringField != null;
        }

        public void setMapI64StringFieldIsSet(boolean value) {
            if (!value) {
              this.mapI64StringField = null;
            }
        }
    

    
        public int getMapI64MapFieldSize() {
            return (this.mapI64MapField == null) ? 0 : this.mapI64MapField.size();
        }

        

        
        public void putToMapI64MapField(java.lang.Long key, java.util.Map<java.lang.String, java.nio.ByteBuffer> val) {
            if (this.mapI64MapField == null) {
              this.mapI64MapField = new java.util.HashMap<>();
            }
            this.mapI64MapField.put(key, val);
        }

        public java.util.Map<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> getMapI64MapField() {
            return this.mapI64MapField;
        }

        public TestStruct setMapI64MapField(java.util.Map<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> mapI64MapField) {
            this.mapI64MapField = mapI64MapField;
            return this;
        }

        public void unsetMapI64MapField() {
            this.mapI64MapField = null;
        }

        public boolean isSetMapI64MapField() {
            return this.mapI64MapField != null;
        }

        public void setMapI64MapFieldIsSet(boolean value) {
            if (!value) {
              this.mapI64MapField = null;
            }
        }
    

    
        public int getMapListListFieldSize() {
            return (this.mapListListField == null) ? 0 : this.mapListListField.size();
        }

        

        
        public void putToMapListListField(java.util.List<java.nio.ByteBuffer> key, java.util.List<java.lang.String> val) {
            if (this.mapListListField == null) {
              this.mapListListField = new java.util.HashMap<>();
            }
            this.mapListListField.put(key, val);
        }

        public java.util.Map<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> getMapListListField() {
            return this.mapListListField;
        }

        public TestStruct setMapListListField(java.util.Map<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> mapListListField) {
            this.mapListListField = mapListListField;
            return this;
        }

        public void unsetMapListListField() {
            this.mapListListField = null;
        }

        public boolean isSetMapListListField() {
            return this.mapListListField != null;
        }

        public void setMapListListFieldIsSet(boolean value) {
            if (!value) {
              this.mapListListField = null;
            }
        }
    

    
        public int getMapComplexFieldSize() {
            return (this.mapComplexField == null) ? 0 : this.mapComplexField.size();
        }

        

        
        public void putToMapComplexField(java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> key, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> val) {
            if (this.mapComplexField == null) {
              this.mapComplexField = new java.util.HashMap<>();
            }
            this.mapComplexField.put(key, val);
        }

        public java.util.Map<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> getMapComplexField() {
            return this.mapComplexField;
        }

        public TestStruct setMapComplexField(java.util.Map<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> mapComplexField) {
            this.mapComplexField = mapComplexField;
            return this;
        }

        public void unsetMapComplexField() {
            this.mapComplexField = null;
        }

        public boolean isSetMapComplexField() {
            return this.mapComplexField != null;
        }

        public void setMapComplexFieldIsSet(boolean value) {
            if (!value) {
              this.mapComplexField = null;
            }
        }
    

    
        public SubStruct getSub() {
            return this.sub;
        }

        public TestStruct setSub(SubStruct sub) {
            this.sub = sub;
            return this;
        }

        public void unsetSub() {
            this.sub = null;
        }

        public boolean isSetSub() {
            return this.sub != null;
        }

        public void setSubIsSet(boolean value) {
            if (!value) {
              this.sub = null;
            }
        }
    

    
        public SubStruct getSubOptional() {
            return this.subOptional;
        }

        public TestStruct setSubOptional(SubStruct subOptional) {
            this.subOptional = subOptional;
            return this;
        }

        public void unsetSubOptional() {
            this.subOptional = null;
        }

        public boolean isSetSubOptional() {
            return this.subOptional != null;
        }

        public void setSubOptionalIsSet(boolean value) {
            if (!value) {
              this.subOptional = null;
            }
        }
    

    
        public SubStruct getSubRequired() {
            return this.subRequired;
        }

        public TestStruct setSubRequired(SubStruct subRequired) {
            this.subRequired = subRequired;
            return this;
        }

        public void unsetSubRequired() {
            this.subRequired = null;
        }

        public boolean isSetSubRequired() {
            return this.subRequired != null;
        }

        public void setSubRequiredIsSet(boolean value) {
            if (!value) {
              this.subRequired = null;
            }
        }
    

    
        public int getListSubStructSize() {
            return (this.listSubStruct == null) ? 0 : this.listSubStruct.size();
        }

        
        public java.util.Iterator<SubStruct> getListSubStructIterator() {
            return (this.listSubStruct == null) ? null : this.listSubStruct.iterator();
        }

        
        public void addToListSubStruct(SubStruct elem) {
            if (this.listSubStruct == null) {
              this.listSubStruct =  new java.util.ArrayList<>(); 
            }
            this.listSubStruct.add(elem);
        }
        

        public java.util.List<SubStruct> getListSubStruct() {
            return this.listSubStruct;
        }

        public TestStruct setListSubStruct(java.util.List<SubStruct> listSubStruct) {
            this.listSubStruct = listSubStruct;
            return this;
        }

        public void unsetListSubStruct() {
            this.listSubStruct = null;
        }

        public boolean isSetListSubStruct() {
            return this.listSubStruct != null;
        }

        public void setListSubStructIsSet(boolean value) {
            if (!value) {
              this.listSubStruct = null;
            }
        }
    

    
        public int getSetSubStructSize() {
            return (this.setSubStruct == null) ? 0 : this.setSubStruct.size();
        }

        
        public java.util.Iterator<SubStruct> getSetSubStructIterator() {
            return (this.setSubStruct == null) ? null : this.setSubStruct.iterator();
        }

        
        public void addToSetSubStruct(SubStruct elem) {
            if (this.setSubStruct == null) {
              this.setSubStruct =   new java.util.HashSet<>(); 
            }
            this.setSubStruct.add(elem);
        }
        

        public java.util.Set<SubStruct> getSetSubStruct() {
            return this.setSubStruct;
        }

        public TestStruct setSetSubStruct(java.util.Set<SubStruct> setSubStruct) {
            this.setSubStruct = setSubStruct;
            return this;
        }

        public void unsetSetSubStruct() {
            this.setSubStruct = null;
        }

        public boolean isSetSetSubStruct() {
            return this.setSubStruct != null;
        }

        public void setSetSubStructIsSet(boolean value) {
            if (!value) {
              this.setSubStruct = null;
            }
        }
    

    
        public int getMapSubStructSubStructSize() {
            return (this.mapSubStructSubStruct == null) ? 0 : this.mapSubStructSubStruct.size();
        }

        

        
        public void putToMapSubStructSubStruct(SubStruct key, SubStruct val) {
            if (this.mapSubStructSubStruct == null) {
              this.mapSubStructSubStruct = new java.util.HashMap<>();
            }
            this.mapSubStructSubStruct.put(key, val);
        }

        public java.util.Map<SubStruct, SubStruct> getMapSubStructSubStruct() {
            return this.mapSubStructSubStruct;
        }

        public TestStruct setMapSubStructSubStruct(java.util.Map<SubStruct, SubStruct> mapSubStructSubStruct) {
            this.mapSubStructSubStruct = mapSubStructSubStruct;
            return this;
        }

        public void unsetMapSubStructSubStruct() {
            this.mapSubStructSubStruct = null;
        }

        public boolean isSetMapSubStructSubStruct() {
            return this.mapSubStructSubStruct != null;
        }

        public void setMapSubStructSubStructIsSet(boolean value) {
            if (!value) {
              this.mapSubStructSubStruct = null;
            }
        }
    

    
        public int getMapI32SubStructSize() {
            return (this.mapI32SubStruct == null) ? 0 : this.mapI32SubStruct.size();
        }

        

        
        public void putToMapI32SubStruct(java.lang.Integer key, SubStruct val) {
            if (this.mapI32SubStruct == null) {
              this.mapI32SubStruct = new java.util.HashMap<>();
            }
            this.mapI32SubStruct.put(key, val);
        }

        public java.util.Map<java.lang.Integer, SubStruct> getMapI32SubStruct() {
            return this.mapI32SubStruct;
        }

        public TestStruct setMapI32SubStruct(java.util.Map<java.lang.Integer, SubStruct> mapI32SubStruct) {
            this.mapI32SubStruct = mapI32SubStruct;
            return this;
        }

        public void unsetMapI32SubStruct() {
            this.mapI32SubStruct = null;
        }

        public boolean isSetMapI32SubStruct() {
            return this.mapI32SubStruct != null;
        }

        public void setMapI32SubStructIsSet(boolean value) {
            if (!value) {
              this.mapI32SubStruct = null;
            }
        }
    

    
        public int getMapSubStructI64Size() {
            return (this.mapSubStructI64 == null) ? 0 : this.mapSubStructI64.size();
        }

        

        
        public void putToMapSubStructI64(SubStruct key, java.lang.Long val) {
            if (this.mapSubStructI64 == null) {
              this.mapSubStructI64 = new java.util.HashMap<>();
            }
            this.mapSubStructI64.put(key, val);
        }

        public java.util.Map<SubStruct, java.lang.Long> getMapSubStructI64() {
            return this.mapSubStructI64;
        }

        public TestStruct setMapSubStructI64(java.util.Map<SubStruct, java.lang.Long> mapSubStructI64) {
            this.mapSubStructI64 = mapSubStructI64;
            return this;
        }

        public void unsetMapSubStructI64() {
            this.mapSubStructI64 = null;
        }

        public boolean isSetMapSubStructI64() {
            return this.mapSubStructI64 != null;
        }

        public void setMapSubStructI64IsSet(boolean value) {
            if (!value) {
              this.mapSubStructI64 = null;
            }
        }
    


    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
          return false;
        if (that instanceof TestStruct)
          return this.equals((TestStruct)that);
        return false;
    }

    public boolean equals(TestStruct that) {
        if (that == null)
            return false;
        if (this == that)
            return true;
        
            
                
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
            
        
            
                
                    boolean this_present_i32FieldOptional = true && this.isSetI32FieldOptional();
                    boolean that_present_i32FieldOptional = true && that.isSetI32FieldOptional();
                
                if (this_present_i32FieldOptional || that_present_i32FieldOptional) {
                    if (!(this_present_i32FieldOptional && that_present_i32FieldOptional))
                        return false;
                    if (this.i32FieldOptional != that.i32FieldOptional) {
                        //System.out.println("i32FieldOptional not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_i32FieldRequired = true;
                    boolean that_present_i32FieldRequired = true;
                
                if (this_present_i32FieldRequired || that_present_i32FieldRequired) {
                    if (!(this_present_i32FieldRequired && that_present_i32FieldRequired))
                        return false;
                    if (this.i32FieldRequired != that.i32FieldRequired) {
                        //System.out.println("i32FieldRequired not equal");
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
            
        
            
                boolean this_present_stringFieldOptional = true && this.isSetStringFieldOptional();
                boolean that_present_stringFieldOptional = true && that.isSetStringFieldOptional();
                if (this_present_stringFieldOptional || that_present_stringFieldOptional) {
                    if (!(this_present_stringFieldOptional && that_present_stringFieldOptional))
                        return false;
                    if (!this.stringFieldOptional.equals(that.stringFieldOptional)){
                        //System.out.println("stringFieldOptional not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_stringFieldRequired = true && this.isSetStringFieldRequired();
                boolean that_present_stringFieldRequired = true && that.isSetStringFieldRequired();
                if (this_present_stringFieldRequired || that_present_stringFieldRequired) {
                    if (!(this_present_stringFieldRequired && that_present_stringFieldRequired))
                        return false;
                    if (!this.stringFieldRequired.equals(that.stringFieldRequired)){
                        //System.out.println("stringFieldRequired not equal");
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
            
        
            
                boolean this_present_binaryFieldOptional = true && this.isSetBinaryFieldOptional();
                boolean that_present_binaryFieldOptional = true && that.isSetBinaryFieldOptional();
                if (this_present_binaryFieldOptional || that_present_binaryFieldOptional) {
                    if (!(this_present_binaryFieldOptional && that_present_binaryFieldOptional))
                        return false;
                    if (!this.binaryFieldOptional.equals(that.binaryFieldOptional)){
                        //System.out.println("binaryFieldOptional not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_binaryFieldRequired = true && this.isSetBinaryFieldRequired();
                boolean that_present_binaryFieldRequired = true && that.isSetBinaryFieldRequired();
                if (this_present_binaryFieldRequired || that_present_binaryFieldRequired) {
                    if (!(this_present_binaryFieldRequired && that_present_binaryFieldRequired))
                        return false;
                    if (!this.binaryFieldRequired.equals(that.binaryFieldRequired)){
                        //System.out.println("binaryFieldRequired not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_boolField = true;
                    boolean that_present_boolField = true;
                
                if (this_present_boolField || that_present_boolField) {
                    if (!(this_present_boolField && that_present_boolField))
                        return false;
                    if (this.boolField != that.boolField) {
                        //System.out.println("boolField not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_boolFieldOptional = true && this.isSetBoolFieldOptional();
                    boolean that_present_boolFieldOptional = true && that.isSetBoolFieldOptional();
                
                if (this_present_boolFieldOptional || that_present_boolFieldOptional) {
                    if (!(this_present_boolFieldOptional && that_present_boolFieldOptional))
                        return false;
                    if (this.boolFieldOptional != that.boolFieldOptional) {
                        //System.out.println("boolFieldOptional not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_boolFieldRequired = true;
                    boolean that_present_boolFieldRequired = true;
                
                if (this_present_boolFieldRequired || that_present_boolFieldRequired) {
                    if (!(this_present_boolFieldRequired && that_present_boolFieldRequired))
                        return false;
                    if (this.boolFieldRequired != that.boolFieldRequired) {
                        //System.out.println("boolFieldRequired not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_i8field = true;
                    boolean that_present_i8field = true;
                
                if (this_present_i8field || that_present_i8field) {
                    if (!(this_present_i8field && that_present_i8field))
                        return false;
                    if (this.i8field != that.i8field) {
                        //System.out.println("i8field not equal");
                        return false;
                    }
                }
            
        
            
                
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
            
        
            
                
                    boolean this_present_doubleField = true;
                    boolean that_present_doubleField = true;
                
                if (this_present_doubleField || that_present_doubleField) {
                    if (!(this_present_doubleField && that_present_doubleField))
                        return false;
                    if (this.doubleField != that.doubleField) {
                        //System.out.println("doubleField not equal");
                        return false;
                    }
                }
            
        
            
                
                    boolean this_present_byteField = true;
                    boolean that_present_byteField = true;
                
                if (this_present_byteField || that_present_byteField) {
                    if (!(this_present_byteField && that_present_byteField))
                        return false;
                    if (this.byteField != that.byteField) {
                        //System.out.println("byteField not equal");
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
            
        
            
                boolean this_present_actionOptional = true && this.isSetActionOptional();
                boolean that_present_actionOptional = true && that.isSetActionOptional();
                if (this_present_actionOptional || that_present_actionOptional) {
                    if (!(this_present_actionOptional && that_present_actionOptional))
                        return false;
                    if (!this.actionOptional.equals(that.actionOptional)){
                        //System.out.println("actionOptional not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_actionRequired = true && this.isSetActionRequired();
                boolean that_present_actionRequired = true && that.isSetActionRequired();
                if (this_present_actionRequired || that_present_actionRequired) {
                    if (!(this_present_actionRequired && that_present_actionRequired))
                        return false;
                    if (!this.actionRequired.equals(that.actionRequired)){
                        //System.out.println("actionRequired not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listI32Field = true && this.isSetListI32Field();
                boolean that_present_listI32Field = true && that.isSetListI32Field();
                if (this_present_listI32Field || that_present_listI32Field) {
                    if (!(this_present_listI32Field && that_present_listI32Field))
                        return false;
                    if (!this.listI32Field.equals(that.listI32Field)){
                        //System.out.println("listI32Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listI32FieldOptional = true && this.isSetListI32FieldOptional();
                boolean that_present_listI32FieldOptional = true && that.isSetListI32FieldOptional();
                if (this_present_listI32FieldOptional || that_present_listI32FieldOptional) {
                    if (!(this_present_listI32FieldOptional && that_present_listI32FieldOptional))
                        return false;
                    if (!this.listI32FieldOptional.equals(that.listI32FieldOptional)){
                        //System.out.println("listI32FieldOptional not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listI32FieldRequired = true && this.isSetListI32FieldRequired();
                boolean that_present_listI32FieldRequired = true && that.isSetListI32FieldRequired();
                if (this_present_listI32FieldRequired || that_present_listI32FieldRequired) {
                    if (!(this_present_listI32FieldRequired && that_present_listI32FieldRequired))
                        return false;
                    if (!this.listI32FieldRequired.equals(that.listI32FieldRequired)){
                        //System.out.println("listI32FieldRequired not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listI8Field = true && this.isSetListI8Field();
                boolean that_present_listI8Field = true && that.isSetListI8Field();
                if (this_present_listI8Field || that_present_listI8Field) {
                    if (!(this_present_listI8Field && that_present_listI8Field))
                        return false;
                    if (!this.listI8Field.equals(that.listI8Field)){
                        //System.out.println("listI8Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listI64Field = true && this.isSetListI64Field();
                boolean that_present_listI64Field = true && that.isSetListI64Field();
                if (this_present_listI64Field || that_present_listI64Field) {
                    if (!(this_present_listI64Field && that_present_listI64Field))
                        return false;
                    if (!this.listI64Field.equals(that.listI64Field)){
                        //System.out.println("listI64Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listDoubleField = true && this.isSetListDoubleField();
                boolean that_present_listDoubleField = true && that.isSetListDoubleField();
                if (this_present_listDoubleField || that_present_listDoubleField) {
                    if (!(this_present_listDoubleField && that_present_listDoubleField))
                        return false;
                    if (!this.listDoubleField.equals(that.listDoubleField)){
                        //System.out.println("listDoubleField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listStringField = true && this.isSetListStringField();
                boolean that_present_listStringField = true && that.isSetListStringField();
                if (this_present_listStringField || that_present_listStringField) {
                    if (!(this_present_listStringField && that_present_listStringField))
                        return false;
                    if (!this.listStringField.equals(that.listStringField)){
                        //System.out.println("listStringField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listBoolField = true && this.isSetListBoolField();
                boolean that_present_listBoolField = true && that.isSetListBoolField();
                if (this_present_listBoolField || that_present_listBoolField) {
                    if (!(this_present_listBoolField && that_present_listBoolField))
                        return false;
                    if (!this.listBoolField.equals(that.listBoolField)){
                        //System.out.println("listBoolField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listByteField = true && this.isSetListByteField();
                boolean that_present_listByteField = true && that.isSetListByteField();
                if (this_present_listByteField || that_present_listByteField) {
                    if (!(this_present_listByteField && that_present_listByteField))
                        return false;
                    if (!this.listByteField.equals(that.listByteField)){
                        //System.out.println("listByteField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listBinaryField = true && this.isSetListBinaryField();
                boolean that_present_listBinaryField = true && that.isSetListBinaryField();
                if (this_present_listBinaryField || that_present_listBinaryField) {
                    if (!(this_present_listBinaryField && that_present_listBinaryField))
                        return false;
                    if (!this.listBinaryField.equals(that.listBinaryField)){
                        //System.out.println("listBinaryField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listListBinaryField = true && this.isSetListListBinaryField();
                boolean that_present_listListBinaryField = true && that.isSetListListBinaryField();
                if (this_present_listListBinaryField || that_present_listListBinaryField) {
                    if (!(this_present_listListBinaryField && that_present_listListBinaryField))
                        return false;
                    if (!this.listListBinaryField.equals(that.listListBinaryField)){
                        //System.out.println("listListBinaryField not equal");
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
            
        
            
                boolean this_present_listListI32Field = true && this.isSetListListI32Field();
                boolean that_present_listListI32Field = true && that.isSetListListI32Field();
                if (this_present_listListI32Field || that_present_listListI32Field) {
                    if (!(this_present_listListI32Field && that_present_listListI32Field))
                        return false;
                    if (!this.listListI32Field.equals(that.listListI32Field)){
                        //System.out.println("listListI32Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listListListI32Field = true && this.isSetListListListI32Field();
                boolean that_present_listListListI32Field = true && that.isSetListListListI32Field();
                if (this_present_listListListI32Field || that_present_listListListI32Field) {
                    if (!(this_present_listListListI32Field && that_present_listListListI32Field))
                        return false;
                    if (!this.listListListI32Field.equals(that.listListListI32Field)){
                        //System.out.println("listListListI32Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listSetI32Field = true && this.isSetListSetI32Field();
                boolean that_present_listSetI32Field = true && that.isSetListSetI32Field();
                if (this_present_listSetI32Field || that_present_listSetI32Field) {
                    if (!(this_present_listSetI32Field && that_present_listSetI32Field))
                        return false;
                    if (!this.listSetI32Field.equals(that.listSetI32Field)){
                        //System.out.println("listSetI32Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listSetStringField = true && this.isSetListSetStringField();
                boolean that_present_listSetStringField = true && that.isSetListSetStringField();
                if (this_present_listSetStringField || that_present_listSetStringField) {
                    if (!(this_present_listSetStringField && that_present_listSetStringField))
                        return false;
                    if (!this.listSetStringField.equals(that.listSetStringField)){
                        //System.out.println("listSetStringField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listSetBinaryField = true && this.isSetListSetBinaryField();
                boolean that_present_listSetBinaryField = true && that.isSetListSetBinaryField();
                if (this_present_listSetBinaryField || that_present_listSetBinaryField) {
                    if (!(this_present_listSetBinaryField && that_present_listSetBinaryField))
                        return false;
                    if (!this.listSetBinaryField.equals(that.listSetBinaryField)){
                        //System.out.println("listSetBinaryField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listMapI8StringField = true && this.isSetListMapI8StringField();
                boolean that_present_listMapI8StringField = true && that.isSetListMapI8StringField();
                if (this_present_listMapI8StringField || that_present_listMapI8StringField) {
                    if (!(this_present_listMapI8StringField && that_present_listMapI8StringField))
                        return false;
                    if (!this.listMapI8StringField.equals(that.listMapI8StringField)){
                        //System.out.println("listMapI8StringField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listMapByteBinaryField = true && this.isSetListMapByteBinaryField();
                boolean that_present_listMapByteBinaryField = true && that.isSetListMapByteBinaryField();
                if (this_present_listMapByteBinaryField || that_present_listMapByteBinaryField) {
                    if (!(this_present_listMapByteBinaryField && that_present_listMapByteBinaryField))
                        return false;
                    if (!this.listMapByteBinaryField.equals(that.listMapByteBinaryField)){
                        //System.out.println("listMapByteBinaryField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listMapBinaryField = true && this.isSetListMapBinaryField();
                boolean that_present_listMapBinaryField = true && that.isSetListMapBinaryField();
                if (this_present_listMapBinaryField || that_present_listMapBinaryField) {
                    if (!(this_present_listMapBinaryField && that_present_listMapBinaryField))
                        return false;
                    if (!this.listMapBinaryField.equals(that.listMapBinaryField)){
                        //System.out.println("listMapBinaryField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listComplexField = true && this.isSetListComplexField();
                boolean that_present_listComplexField = true && that.isSetListComplexField();
                if (this_present_listComplexField || that_present_listComplexField) {
                    if (!(this_present_listComplexField && that_present_listComplexField))
                        return false;
                    if (!this.listComplexField.equals(that.listComplexField)){
                        //System.out.println("listComplexField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setBoolField = true && this.isSetSetBoolField();
                boolean that_present_setBoolField = true && that.isSetSetBoolField();
                if (this_present_setBoolField || that_present_setBoolField) {
                    if (!(this_present_setBoolField && that_present_setBoolField))
                        return false;
                    if (!this.setBoolField.equals(that.setBoolField)){
                        //System.out.println("setBoolField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setStringField = true && this.isSetSetStringField();
                boolean that_present_setStringField = true && that.isSetSetStringField();
                if (this_present_setStringField || that_present_setStringField) {
                    if (!(this_present_setStringField && that_present_setStringField))
                        return false;
                    if (!this.setStringField.equals(that.setStringField)){
                        //System.out.println("setStringField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setByteField = true && this.isSetSetByteField();
                boolean that_present_setByteField = true && that.isSetSetByteField();
                if (this_present_setByteField || that_present_setByteField) {
                    if (!(this_present_setByteField && that_present_setByteField))
                        return false;
                    if (!this.setByteField.equals(that.setByteField)){
                        //System.out.println("setByteField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setBinaryField = true && this.isSetSetBinaryField();
                boolean that_present_setBinaryField = true && that.isSetSetBinaryField();
                if (this_present_setBinaryField || that_present_setBinaryField) {
                    if (!(this_present_setBinaryField && that_present_setBinaryField))
                        return false;
                    if (!this.setBinaryField.equals(that.setBinaryField)){
                        //System.out.println("setBinaryField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setAction = true && this.isSetSetAction();
                boolean that_present_setAction = true && that.isSetSetAction();
                if (this_present_setAction || that_present_setAction) {
                    if (!(this_present_setAction && that_present_setAction))
                        return false;
                    if (!this.setAction.equals(that.setAction)){
                        //System.out.println("setAction not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setListI64Field = true && this.isSetSetListI64Field();
                boolean that_present_setListI64Field = true && that.isSetSetListI64Field();
                if (this_present_setListI64Field || that_present_setListI64Field) {
                    if (!(this_present_setListI64Field && that_present_setListI64Field))
                        return false;
                    if (!this.setListI64Field.equals(that.setListI64Field)){
                        //System.out.println("setListI64Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setListBoolField = true && this.isSetSetListBoolField();
                boolean that_present_setListBoolField = true && that.isSetSetListBoolField();
                if (this_present_setListBoolField || that_present_setListBoolField) {
                    if (!(this_present_setListBoolField && that_present_setListBoolField))
                        return false;
                    if (!this.setListBoolField.equals(that.setListBoolField)){
                        //System.out.println("setListBoolField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setSetI32Field = true && this.isSetSetSetI32Field();
                boolean that_present_setSetI32Field = true && that.isSetSetSetI32Field();
                if (this_present_setSetI32Field || that_present_setSetI32Field) {
                    if (!(this_present_setSetI32Field && that_present_setSetI32Field))
                        return false;
                    if (!this.setSetI32Field.equals(that.setSetI32Field)){
                        //System.out.println("setSetI32Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setMapBoolI64Field = true && this.isSetSetMapBoolI64Field();
                boolean that_present_setMapBoolI64Field = true && that.isSetSetMapBoolI64Field();
                if (this_present_setMapBoolI64Field || that_present_setMapBoolI64Field) {
                    if (!(this_present_setMapBoolI64Field && that_present_setMapBoolI64Field))
                        return false;
                    if (!this.setMapBoolI64Field.equals(that.setMapBoolI64Field)){
                        //System.out.println("setMapBoolI64Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setMapI64I32Field = true && this.isSetSetMapI64I32Field();
                boolean that_present_setMapI64I32Field = true && that.isSetSetMapI64I32Field();
                if (this_present_setMapI64I32Field || that_present_setMapI64I32Field) {
                    if (!(this_present_setMapI64I32Field && that_present_setMapI64I32Field))
                        return false;
                    if (!this.setMapI64I32Field.equals(that.setMapI64I32Field)){
                        //System.out.println("setMapI64I32Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setComplexField = true && this.isSetSetComplexField();
                boolean that_present_setComplexField = true && that.isSetSetComplexField();
                if (this_present_setComplexField || that_present_setComplexField) {
                    if (!(this_present_setComplexField && that_present_setComplexField))
                        return false;
                    if (!this.setComplexField.equals(that.setComplexField)){
                        //System.out.println("setComplexField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapI32I32Field = true && this.isSetMapI32I32Field();
                boolean that_present_mapI32I32Field = true && that.isSetMapI32I32Field();
                if (this_present_mapI32I32Field || that_present_mapI32I32Field) {
                    if (!(this_present_mapI32I32Field && that_present_mapI32I32Field))
                        return false;
                    if (!this.mapI32I32Field.equals(that.mapI32I32Field)){
                        //System.out.println("mapI32I32Field not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapStringAction = true && this.isSetMapStringAction();
                boolean that_present_mapStringAction = true && that.isSetMapStringAction();
                if (this_present_mapStringAction || that_present_mapStringAction) {
                    if (!(this_present_mapStringAction && that_present_mapStringAction))
                        return false;
                    if (!this.mapStringAction.equals(that.mapStringAction)){
                        //System.out.println("mapStringAction not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapI64StringField = true && this.isSetMapI64StringField();
                boolean that_present_mapI64StringField = true && that.isSetMapI64StringField();
                if (this_present_mapI64StringField || that_present_mapI64StringField) {
                    if (!(this_present_mapI64StringField && that_present_mapI64StringField))
                        return false;
                    if (!this.mapI64StringField.equals(that.mapI64StringField)){
                        //System.out.println("mapI64StringField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapI64MapField = true && this.isSetMapI64MapField();
                boolean that_present_mapI64MapField = true && that.isSetMapI64MapField();
                if (this_present_mapI64MapField || that_present_mapI64MapField) {
                    if (!(this_present_mapI64MapField && that_present_mapI64MapField))
                        return false;
                    if (!this.mapI64MapField.equals(that.mapI64MapField)){
                        //System.out.println("mapI64MapField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapListListField = true && this.isSetMapListListField();
                boolean that_present_mapListListField = true && that.isSetMapListListField();
                if (this_present_mapListListField || that_present_mapListListField) {
                    if (!(this_present_mapListListField && that_present_mapListListField))
                        return false;
                    if (!this.mapListListField.equals(that.mapListListField)){
                        //System.out.println("mapListListField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapComplexField = true && this.isSetMapComplexField();
                boolean that_present_mapComplexField = true && that.isSetMapComplexField();
                if (this_present_mapComplexField || that_present_mapComplexField) {
                    if (!(this_present_mapComplexField && that_present_mapComplexField))
                        return false;
                    if (!this.mapComplexField.equals(that.mapComplexField)){
                        //System.out.println("mapComplexField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_sub = true && this.isSetSub();
                boolean that_present_sub = true && that.isSetSub();
                if (this_present_sub || that_present_sub) {
                    if (!(this_present_sub && that_present_sub))
                        return false;
                    if (!this.sub.equals(that.sub)){
                        //System.out.println("sub not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_subOptional = true && this.isSetSubOptional();
                boolean that_present_subOptional = true && that.isSetSubOptional();
                if (this_present_subOptional || that_present_subOptional) {
                    if (!(this_present_subOptional && that_present_subOptional))
                        return false;
                    if (!this.subOptional.equals(that.subOptional)){
                        //System.out.println("subOptional not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_subRequired = true && this.isSetSubRequired();
                boolean that_present_subRequired = true && that.isSetSubRequired();
                if (this_present_subRequired || that_present_subRequired) {
                    if (!(this_present_subRequired && that_present_subRequired))
                        return false;
                    if (!this.subRequired.equals(that.subRequired)){
                        //System.out.println("subRequired not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_listSubStruct = true && this.isSetListSubStruct();
                boolean that_present_listSubStruct = true && that.isSetListSubStruct();
                if (this_present_listSubStruct || that_present_listSubStruct) {
                    if (!(this_present_listSubStruct && that_present_listSubStruct))
                        return false;
                    if (!this.listSubStruct.equals(that.listSubStruct)){
                        //System.out.println("listSubStruct not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_setSubStruct = true && this.isSetSetSubStruct();
                boolean that_present_setSubStruct = true && that.isSetSetSubStruct();
                if (this_present_setSubStruct || that_present_setSubStruct) {
                    if (!(this_present_setSubStruct && that_present_setSubStruct))
                        return false;
                    if (!this.setSubStruct.equals(that.setSubStruct)){
                        //System.out.println("setSubStruct not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapSubStructSubStruct = true && this.isSetMapSubStructSubStruct();
                boolean that_present_mapSubStructSubStruct = true && that.isSetMapSubStructSubStruct();
                if (this_present_mapSubStructSubStruct || that_present_mapSubStructSubStruct) {
                    if (!(this_present_mapSubStructSubStruct && that_present_mapSubStructSubStruct))
                        return false;
                    if (!this.mapSubStructSubStruct.equals(that.mapSubStructSubStruct)){
                        //System.out.println("mapSubStructSubStruct not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapI32SubStruct = true && this.isSetMapI32SubStruct();
                boolean that_present_mapI32SubStruct = true && that.isSetMapI32SubStruct();
                if (this_present_mapI32SubStruct || that_present_mapI32SubStruct) {
                    if (!(this_present_mapI32SubStruct && that_present_mapI32SubStruct))
                        return false;
                    if (!this.mapI32SubStruct.equals(that.mapI32SubStruct)){
                        //System.out.println("mapI32SubStruct not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_mapSubStructI64 = true && this.isSetMapSubStructI64();
                boolean that_present_mapSubStructI64 = true && that.isSetMapSubStructI64();
                if (this_present_mapSubStructI64 || that_present_mapSubStructI64) {
                    if (!(this_present_mapSubStructI64 && that_present_mapSubStructI64))
                        return false;
                    if (!this.mapSubStructI64.equals(that.mapSubStructI64)){
                        //System.out.println("mapSubStructI64 not equal");
                        return false;
                    }
                }
            
        
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TestStruct(");
        
            
            
                    sb.append("i32Field:");
                    sb.append(this.i32Field);
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetI32FieldOptional()) {
            
            
                    sb.append("i32FieldOptional:");
                    sb.append(this.i32FieldOptional);
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("i32FieldRequired:");
                    sb.append(this.i32FieldRequired);
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetStringField()) {
            
            
                    sb.append("stringField:");
                    if (this.stringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.stringField);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
                if (isSetStringFieldOptional()) {
            
            
                    sb.append("stringFieldOptional:");
                    if (this.stringFieldOptional == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.stringFieldOptional);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("stringFieldRequired:");
                    if (this.stringFieldRequired == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.stringFieldRequired);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("binaryField:");
                    if (this.binaryField == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.binaryField, sb);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetBinaryFieldOptional()) {
            
            
                    sb.append("binaryFieldOptional:");
                    if (this.binaryFieldOptional == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.binaryFieldOptional, sb);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("binaryFieldRequired:");
                    if (this.binaryFieldRequired == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.binaryFieldRequired, sb);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("boolField:");
                    sb.append(this.boolField);
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetBoolFieldOptional()) {
            
            
                    sb.append("boolFieldOptional:");
                    sb.append(this.boolFieldOptional);
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("boolFieldRequired:");
                    sb.append(this.boolFieldRequired);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("i8field:");
                    sb.append(this.i8field);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("i16Field:");
                    sb.append(this.i16Field);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("i64Field:");
                    sb.append(this.i64Field);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("doubleField:");
                    sb.append(this.doubleField);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("byteField:");
                    sb.append(this.byteField);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("action:");
                    if (this.action == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.action);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetActionOptional()) {
            
            
                    sb.append("actionOptional:");
                    if (this.actionOptional == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.actionOptional);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("actionRequired:");
                    if (this.actionRequired == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.actionRequired);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listI32Field:");
                    if (this.listI32Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI32Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetListI32FieldOptional()) {
            
            
                    sb.append("listI32FieldOptional:");
                    if (this.listI32FieldOptional == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI32FieldOptional);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("listI32FieldRequired:");
                    if (this.listI32FieldRequired == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI32FieldRequired);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listI8Field:");
                    if (this.listI8Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI8Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listI64Field:");
                    if (this.listI64Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI64Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listDoubleField:");
                    if (this.listDoubleField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listDoubleField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listStringField:");
                    if (this.listStringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listStringField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listBoolField:");
                    if (this.listBoolField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listBoolField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listByteField:");
                    if (this.listByteField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listByteField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listBinaryField:");
                    if (this.listBinaryField == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.listBinaryField, sb);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listListBinaryField:");
                    if (this.listListBinaryField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listListBinaryField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listAction:");
                    if (this.listAction == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listAction);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listListI32Field:");
                    if (this.listListI32Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listListI32Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listListListI32Field:");
                    if (this.listListListI32Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listListListI32Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listSetI32Field:");
                    if (this.listSetI32Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listSetI32Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listSetStringField:");
                    if (this.listSetStringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listSetStringField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listSetBinaryField:");
                    if (this.listSetBinaryField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listSetBinaryField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listMapI8StringField:");
                    if (this.listMapI8StringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listMapI8StringField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listMapByteBinaryField:");
                    if (this.listMapByteBinaryField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listMapByteBinaryField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listMapBinaryField:");
                    if (this.listMapBinaryField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listMapBinaryField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listComplexField:");
                    if (this.listComplexField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listComplexField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setBoolField:");
                    if (this.setBoolField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setBoolField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setStringField:");
                    if (this.setStringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setStringField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setByteField:");
                    if (this.setByteField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setByteField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setBinaryField:");
                    if (this.setBinaryField == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.setBinaryField, sb);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setAction:");
                    if (this.setAction == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setAction);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setListI64Field:");
                    if (this.setListI64Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setListI64Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setListBoolField:");
                    if (this.setListBoolField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setListBoolField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setSetI32Field:");
                    if (this.setSetI32Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setSetI32Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setMapBoolI64Field:");
                    if (this.setMapBoolI64Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setMapBoolI64Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setMapI64I32Field:");
                    if (this.setMapI64I32Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setMapI64I32Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setComplexField:");
                    if (this.setComplexField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setComplexField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapI32I32Field:");
                    if (this.mapI32I32Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapI32I32Field);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapStringAction:");
                    if (this.mapStringAction == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapStringAction);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapI64StringField:");
                    if (this.mapI64StringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapI64StringField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapI64MapField:");
                    if (this.mapI64MapField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapI64MapField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapListListField:");
                    if (this.mapListListField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapListListField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapComplexField:");
                    if (this.mapComplexField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapComplexField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("sub:");
                    if (this.sub == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.sub);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetSubOptional()) {
            
            
                    sb.append("subOptional:");
                    if (this.subOptional == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.subOptional);
                    }
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("subRequired:");
                    if (this.subRequired == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.subRequired);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("listSubStruct:");
                    if (this.listSubStruct == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listSubStruct);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("setSubStruct:");
                    if (this.setSubStruct == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.setSubStruct);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapSubStructSubStruct:");
                    if (this.mapSubStructSubStruct == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapSubStructSubStruct);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapI32SubStruct:");
                    if (this.mapI32SubStruct == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapI32SubStruct);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("mapSubStructI64:");
                    if (this.mapSubStructI64 == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.mapSubStructI64);
                    }
            
                    
            

        
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        
            
                
                    hashCode = hashCode * 8191 + i32Field;
                
            
        
            
                
                    hashCode = hashCode * 8191 + ((isSetI32FieldOptional()) ? 131071 : 524287);
                    if (isSetI32FieldOptional())
                        hashCode = hashCode * 8191 + i32FieldOptional;
                    
            
        
            
                
                    hashCode = hashCode * 8191 + i32FieldRequired;
                
            
        
            
                hashCode = hashCode * 8191 + ((isSetStringField()) ? 131071 : 524287);
                if (isSetStringField())
                    hashCode = hashCode * 8191 + stringField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetStringFieldOptional()) ? 131071 : 524287);
                if (isSetStringFieldOptional())
                    hashCode = hashCode * 8191 + stringFieldOptional.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetStringFieldRequired()) ? 131071 : 524287);
                if (isSetStringFieldRequired())
                    hashCode = hashCode * 8191 + stringFieldRequired.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetBinaryField()) ? 131071 : 524287);
                if (isSetBinaryField())
                    hashCode = hashCode * 8191 + binaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetBinaryFieldOptional()) ? 131071 : 524287);
                if (isSetBinaryFieldOptional())
                    hashCode = hashCode * 8191 + binaryFieldOptional.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetBinaryFieldRequired()) ? 131071 : 524287);
                if (isSetBinaryFieldRequired())
                    hashCode = hashCode * 8191 + binaryFieldRequired.hashCode();
            
        
            
                
                    hashCode = hashCode * 8191 + ((boolField) ? 131071 : 524287);
                
            
        
            
                
                    hashCode = hashCode * 8191 + ((isSetBoolFieldOptional()) ? 131071 : 524287);
                    if (isSetBoolFieldOptional())
                        hashCode = hashCode * 8191 + ((boolFieldOptional) ? 131071 : 524287);
                
            
        
            
                
                    hashCode = hashCode * 8191 + ((boolFieldRequired) ? 131071 : 524287);
                
            
        
            
                
                    hashCode = hashCode * 8191 + (int)i8field;
                
            
        
            
                
                    hashCode = hashCode * 8191 + i16Field;
                
            
        
            
                
                    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(i64Field);
                
            
        
            
                
                    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(doubleField);
                
            
        
            
                
                    hashCode = hashCode * 8191 + (int)byteField;
                
            
        
            
                hashCode = hashCode * 8191 + ((isSetAction()) ? 131071 : 524287);
                if (isSetAction())
                    hashCode = hashCode * 8191 + action.getValue();
            
        
            
                hashCode = hashCode * 8191 + ((isSetActionOptional()) ? 131071 : 524287);
                if (isSetActionOptional())
                    hashCode = hashCode * 8191 + actionOptional.getValue();
            
        
            
                hashCode = hashCode * 8191 + ((isSetActionRequired()) ? 131071 : 524287);
                if (isSetActionRequired())
                    hashCode = hashCode * 8191 + actionRequired.getValue();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI32Field()) ? 131071 : 524287);
                if (isSetListI32Field())
                    hashCode = hashCode * 8191 + listI32Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI32FieldOptional()) ? 131071 : 524287);
                if (isSetListI32FieldOptional())
                    hashCode = hashCode * 8191 + listI32FieldOptional.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI32FieldRequired()) ? 131071 : 524287);
                if (isSetListI32FieldRequired())
                    hashCode = hashCode * 8191 + listI32FieldRequired.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI8Field()) ? 131071 : 524287);
                if (isSetListI8Field())
                    hashCode = hashCode * 8191 + listI8Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI64Field()) ? 131071 : 524287);
                if (isSetListI64Field())
                    hashCode = hashCode * 8191 + listI64Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListDoubleField()) ? 131071 : 524287);
                if (isSetListDoubleField())
                    hashCode = hashCode * 8191 + listDoubleField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListStringField()) ? 131071 : 524287);
                if (isSetListStringField())
                    hashCode = hashCode * 8191 + listStringField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListBoolField()) ? 131071 : 524287);
                if (isSetListBoolField())
                    hashCode = hashCode * 8191 + listBoolField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListByteField()) ? 131071 : 524287);
                if (isSetListByteField())
                    hashCode = hashCode * 8191 + listByteField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListBinaryField()) ? 131071 : 524287);
                if (isSetListBinaryField())
                    hashCode = hashCode * 8191 + listBinaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListListBinaryField()) ? 131071 : 524287);
                if (isSetListListBinaryField())
                    hashCode = hashCode * 8191 + listListBinaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListAction()) ? 131071 : 524287);
                if (isSetListAction())
                    hashCode = hashCode * 8191 + listAction.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListListI32Field()) ? 131071 : 524287);
                if (isSetListListI32Field())
                    hashCode = hashCode * 8191 + listListI32Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListListListI32Field()) ? 131071 : 524287);
                if (isSetListListListI32Field())
                    hashCode = hashCode * 8191 + listListListI32Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListSetI32Field()) ? 131071 : 524287);
                if (isSetListSetI32Field())
                    hashCode = hashCode * 8191 + listSetI32Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListSetStringField()) ? 131071 : 524287);
                if (isSetListSetStringField())
                    hashCode = hashCode * 8191 + listSetStringField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListSetBinaryField()) ? 131071 : 524287);
                if (isSetListSetBinaryField())
                    hashCode = hashCode * 8191 + listSetBinaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListMapI8StringField()) ? 131071 : 524287);
                if (isSetListMapI8StringField())
                    hashCode = hashCode * 8191 + listMapI8StringField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListMapByteBinaryField()) ? 131071 : 524287);
                if (isSetListMapByteBinaryField())
                    hashCode = hashCode * 8191 + listMapByteBinaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListMapBinaryField()) ? 131071 : 524287);
                if (isSetListMapBinaryField())
                    hashCode = hashCode * 8191 + listMapBinaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListComplexField()) ? 131071 : 524287);
                if (isSetListComplexField())
                    hashCode = hashCode * 8191 + listComplexField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetBoolField()) ? 131071 : 524287);
                if (isSetSetBoolField())
                    hashCode = hashCode * 8191 + setBoolField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetStringField()) ? 131071 : 524287);
                if (isSetSetStringField())
                    hashCode = hashCode * 8191 + setStringField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetByteField()) ? 131071 : 524287);
                if (isSetSetByteField())
                    hashCode = hashCode * 8191 + setByteField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetBinaryField()) ? 131071 : 524287);
                if (isSetSetBinaryField())
                    hashCode = hashCode * 8191 + setBinaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetAction()) ? 131071 : 524287);
                if (isSetSetAction())
                    hashCode = hashCode * 8191 + setAction.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetListI64Field()) ? 131071 : 524287);
                if (isSetSetListI64Field())
                    hashCode = hashCode * 8191 + setListI64Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetListBoolField()) ? 131071 : 524287);
                if (isSetSetListBoolField())
                    hashCode = hashCode * 8191 + setListBoolField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetSetI32Field()) ? 131071 : 524287);
                if (isSetSetSetI32Field())
                    hashCode = hashCode * 8191 + setSetI32Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetMapBoolI64Field()) ? 131071 : 524287);
                if (isSetSetMapBoolI64Field())
                    hashCode = hashCode * 8191 + setMapBoolI64Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetMapI64I32Field()) ? 131071 : 524287);
                if (isSetSetMapI64I32Field())
                    hashCode = hashCode * 8191 + setMapI64I32Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetComplexField()) ? 131071 : 524287);
                if (isSetSetComplexField())
                    hashCode = hashCode * 8191 + setComplexField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapI32I32Field()) ? 131071 : 524287);
                if (isSetMapI32I32Field())
                    hashCode = hashCode * 8191 + mapI32I32Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapStringAction()) ? 131071 : 524287);
                if (isSetMapStringAction())
                    hashCode = hashCode * 8191 + mapStringAction.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapI64StringField()) ? 131071 : 524287);
                if (isSetMapI64StringField())
                    hashCode = hashCode * 8191 + mapI64StringField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapI64MapField()) ? 131071 : 524287);
                if (isSetMapI64MapField())
                    hashCode = hashCode * 8191 + mapI64MapField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapListListField()) ? 131071 : 524287);
                if (isSetMapListListField())
                    hashCode = hashCode * 8191 + mapListListField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapComplexField()) ? 131071 : 524287);
                if (isSetMapComplexField())
                    hashCode = hashCode * 8191 + mapComplexField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSub()) ? 131071 : 524287);
                if (isSetSub())
                    hashCode = hashCode * 8191 + sub.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSubOptional()) ? 131071 : 524287);
                if (isSetSubOptional())
                    hashCode = hashCode * 8191 + subOptional.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSubRequired()) ? 131071 : 524287);
                if (isSetSubRequired())
                    hashCode = hashCode * 8191 + subRequired.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListSubStruct()) ? 131071 : 524287);
                if (isSetListSubStruct())
                    hashCode = hashCode * 8191 + listSubStruct.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetSetSubStruct()) ? 131071 : 524287);
                if (isSetSetSubStruct())
                    hashCode = hashCode * 8191 + setSubStruct.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapSubStructSubStruct()) ? 131071 : 524287);
                if (isSetMapSubStructSubStruct())
                    hashCode = hashCode * 8191 + mapSubStructSubStruct.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapI32SubStruct()) ? 131071 : 524287);
                if (isSetMapI32SubStruct())
                    hashCode = hashCode * 8191 + mapI32SubStruct.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetMapSubStructI64()) ? 131071 : 524287);
                if (isSetMapSubStructI64())
                    hashCode = hashCode * 8191 + mapSubStructI64.hashCode();
            
        
        return hashCode;
    }

    public void clear() {
        
            
                
                    this.i32Field = -999;
                
            
        
            
                
                    setI32FieldOptionalIsSet(false);
                    
                        this.i32FieldOptional = 0;
                    
                
            
        
            
                
                    setI32FieldRequiredIsSet(false);
                    
                        this.i32FieldRequired = 0;
                    
                
            
        
            
                this.stringField = null;
            
        
            
                this.stringFieldOptional = null;
            
        
            
                this.stringFieldRequired = null;
            
        
            
                this.binaryField = null;
            
        
            
                this.binaryFieldOptional = null;
            
        
            
                this.binaryFieldRequired = null;
            
        
            
                
                    setBoolFieldIsSet(false);
                    
                        this.boolField = false;
                    
                
            
        
            
                
                    setBoolFieldOptionalIsSet(false);
                    
                        this.boolFieldOptional = false;
                    
                
            
        
            
                
                    setBoolFieldRequiredIsSet(false);
                    
                        this.boolFieldRequired = false;
                    
                
            
        
            
                
                    setI8fieldIsSet(false);
                    
                        this.i8field = 0;
                    
                
            
        
            
                
                    setI16FieldIsSet(false);
                    
                        this.i16Field = 0;
                    
                
            
        
            
                
                    setI64FieldIsSet(false);
                    
                        this.i64Field = 0;
                    
                
            
        
            
                
                    this.doubleField = -999;
                
            
        
            
                
                    setByteFieldIsSet(false);
                    
                        this.byteField = 0;
                    
                
            
        
            
                this.action = null;
            
        
            
                this.actionOptional = null;
            
        
            
                this.actionRequired = null;
            
        
            
                this.listI32Field = null;
            
        
            
                this.listI32FieldOptional = null;
            
        
            
                this.listI32FieldRequired = null;
            
        
            
                this.listI8Field = null;
            
        
            
                this.listI64Field = null;
            
        
            
                this.listDoubleField = null;
            
        
            
                this.listStringField = null;
            
        
            
                this.listBoolField = null;
            
        
            
                this.listByteField = null;
            
        
            
                this.listBinaryField = null;
            
        
            
                this.listListBinaryField = null;
            
        
            
                this.listAction = null;
            
        
            
                this.listListI32Field = null;
            
        
            
                this.listListListI32Field = null;
            
        
            
                this.listSetI32Field = null;
            
        
            
                this.listSetStringField = null;
            
        
            
                this.listSetBinaryField = null;
            
        
            
                this.listMapI8StringField = null;
            
        
            
                this.listMapByteBinaryField = null;
            
        
            
                this.listMapBinaryField = null;
            
        
            
                this.listComplexField = null;
            
        
            
                this.setBoolField = null;
            
        
            
                this.setStringField = null;
            
        
            
                this.setByteField = null;
            
        
            
                this.setBinaryField = null;
            
        
            
                this.setAction = null;
            
        
            
                this.setListI64Field = null;
            
        
            
                this.setListBoolField = null;
            
        
            
                this.setSetI32Field = null;
            
        
            
                this.setMapBoolI64Field = null;
            
        
            
                this.setMapI64I32Field = null;
            
        
            
                this.setComplexField = null;
            
        
            
                this.mapI32I32Field = null;
            
        
            
                this.mapStringAction = null;
            
        
            
                this.mapI64StringField = null;
            
        
            
                this.mapI64MapField = null;
            
        
            
                this.mapListListField = null;
            
        
            
                this.mapComplexField = null;
            
        
            
                this.sub = null;
            
        
            
                this.subOptional = null;
            
        
            
                this.subRequired = null;
            
        
            
                this.listSubStruct = null;
            
        
            
                this.setSubStruct = null;
            
        
            
                this.mapSubStructSubStruct = null;
            
        
            
                this.mapI32SubStruct = null;
            
        
            
                this.mapSubStructI64 = null;
            
        
    }

    public void validate() throws com.test.thrift.TException {
        
            
        
            
        
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(stringFieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'stringFieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(binaryFieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'binaryFieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(actionRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'actionRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(listI32FieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listI32FieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(subRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'subRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        

        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
                if( sub != null ){
                    sub.validate();
                }
            
        
            
                if( subOptional != null ){
                    subOptional.validate();
                }
            
        
            
                if( subRequired != null ){
                    subRequired.validate();
                }
            
        
            
        
            
        
            
        
            
        
            
        
    }

    public int size() {
        int size = 1; // writeFieldStop() need 1 byte;
        
            // mapSubStructI64
            
                            
                                if (mapSubStructI64 != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<SubStruct, java.lang.Long> _iter639 : mapSubStructI64.entrySet())
                                        { size += _iter639.getKey().size();size += 8;
                               }
                             
                             }
                              }  
        
            // mapI32SubStruct
            
                            
                                if (mapI32SubStruct != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.Integer, SubStruct> _iter640 : mapI32SubStruct.entrySet())
                                        { size += 4;size += _iter640.getValue().size();
                               }
                             
                             }
                              }  
        
            // mapSubStructSubStruct
            
                            
                                if (mapSubStructSubStruct != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<SubStruct, SubStruct> _iter641 : mapSubStructSubStruct.entrySet())
                                        { size += _iter641.getKey().size();size += _iter641.getValue().size();
                               }
                             
                             }
                              }  
        
            // setSubStruct
            
                    
                    if (setSubStruct != null) {
                    
                        size += 8;
                        for (SubStruct _iter642  : setSubStruct) { size += _iter642.size();
                                            }
                    
                  } 
        
            // listSubStruct
            
                    
                    if (listSubStruct != null) {
                    
                        size += 8;
                        for (SubStruct _iter643  : listSubStruct) { size += _iter643.size();
                                            }
                    
                  } 
        
            // subRequired
            
                 if(subRequired != null ){ 
                
                    size += 3;
                    size += subRequired.size();
                
                 } 
            
        
            // subOptional
            
                 if(subOptional != null ){ 
                
                    size += 3;
                    size += subOptional.size();
                
                 } 
            
        
            // sub
            
                 if(sub != null ){ 
                
                    size += 3;
                    size += sub.size();
                
                 } 
            
        
            // mapComplexField
            
                            
                                if (mapComplexField != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> _iter644 : mapComplexField.entrySet())
                                        { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> _iter645 : _iter644.getKey().entrySet())
                                        { size += 8;
                    
                        size += 5;
                        for (java.util.Set<java.lang.Long> _iter646  : _iter645.getValue()) { 
                                        
                                        size += 5;
                                        
                                            size += (8) * _iter646.size();
                                        
                                    
                                    
                                    
                                            }
                    
                               }
                              
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> _iter647 : _iter644.getValue().entrySet())
                                        { 
                                        
                                        size += 5;
                                        
                                            size += (8) * _iter647.getKey().size();
                                        
                                    
                                    
                                    
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.String, java.lang.Long> _iter648 : _iter647.getValue().entrySet())
                                        { size += 4 +  3 * _iter648.getKey().length();size += 8;
                               }
                              
                               }
                              
                               }
                             
                             }
                              }  
        
            // mapListListField
            
                            
                                if (mapListListField != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> _iter649 : mapListListField.entrySet())
                                        { 
                    
                        size += 5;
                        for (java.nio.ByteBuffer _iter650  : _iter649.getKey()) { size += 4 + _iter650.limit() - _iter650.position();
                                            }
                    
                    
                        size += 5;
                        for (java.lang.String _iter651  : _iter649.getValue()) { size += 4 +  3 * _iter651.length();
                                            }
                    
                               }
                             
                             }
                              }  
        
            // mapI64MapField
            
                            
                                if (mapI64MapField != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> _iter652 : mapI64MapField.entrySet())
                                        { size += 8;
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter653 : _iter652.getValue().entrySet())
                                        { size += 4 +  3 * _iter653.getKey().length();size += 4 + _iter653.getValue().limit() - _iter653.getValue().position();
                               }
                              
                               }
                             
                             }
                              }  
        
            // mapI64StringField
            
                            
                                if (mapI64StringField != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.Long, java.lang.String> _iter654 : mapI64StringField.entrySet())
                                        { size += 8;size += 4 +  3 * _iter654.getValue().length();
                               }
                             
                             }
                              }  
        
            // mapStringAction
            
                            
                                if (mapStringAction != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.String, Action> _iter655 : mapStringAction.entrySet())
                                        { size += 4 +  3 * _iter655.getKey().length();size += 4;
                               }
                             
                             }
                              }  
        
            // setComplexField
            
                    
                    if (setComplexField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _iter656  : setComplexField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _iter657 : _iter656.entrySet())
                                        { 
                                        
                                        size += 5;
                                        
                                            size += (8) * _iter657.getKey().size();
                                        
                                    
                                    
                                    
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Byte, java.lang.String> _iter658 : _iter657.getValue().entrySet())
                                        { size += 1;size += 4 +  3 * _iter658.getValue().length();
                               }
                              
                               }
                              
                                            }
                    
                  } 
        
            // setMapI64I32Field
            
                    
                    if (setMapI64I32Field != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Long, java.lang.Integer> _iter659  : setMapI64I32Field) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Long, java.lang.Integer> _iter660 : _iter659.entrySet())
                                        { size += 8;size += 4;
                               }
                              
                                            }
                    
                  } 
        
            // setMapBoolI64Field
            
                    
                    if (setMapBoolI64Field != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Boolean, java.lang.Long> _iter661  : setMapBoolI64Field) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Boolean, java.lang.Long> _iter662 : _iter661.entrySet())
                                        { size += 1;size += 8;
                               }
                              
                                            }
                    
                  } 
        
            // setSetI32Field
            
                    
                    if (setSetI32Field != null) {
                    
                        size += 8;
                        for (java.util.Set<java.lang.Integer> _iter663  : setSetI32Field) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter663.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // setListBoolField
            
                    
                    if (setListBoolField != null) {
                    
                        size += 8;
                        for (java.util.List<java.lang.Boolean> _iter664  : setListBoolField) { 
                                        
                                        size += 5;
                                        
                                            size += _iter664.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // setListI64Field
            
                    
                    if (setListI64Field != null) {
                    
                        size += 8;
                        for (java.util.List<java.lang.Long> _iter665  : setListI64Field) { 
                                        
                                        size += 5;
                                        
                                            size += (8) * _iter665.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // setAction
            
                                        
                                    if (setAction != null) {
                                     
                                        size += 8;
                                        
                                            size += (4) * setAction.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // setBinaryField
            
                    
                    if (setBinaryField != null) {
                    
                        size += 8;
                        for (java.nio.ByteBuffer _iter666  : setBinaryField) { size += 4 + _iter666.limit() - _iter666.position();
                                            }
                    
                  } 
        
            // listComplexField
            
                    
                    if (listComplexField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _iter667  : listComplexField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _iter668 : _iter667.entrySet())
                                        { size += 4;
                    
                        size += 5;
                        for (java.util.Set<java.lang.Integer> _iter669  : _iter668.getValue()) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter669.size();
                                        
                                    
                                    
                                    
                                            }
                    
                               }
                              
                                            }
                    
                  } 
        
            // listMapBinaryField
            
                    
                    if (listMapBinaryField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.String, java.nio.ByteBuffer> _iter670  : listMapBinaryField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter671 : _iter670.entrySet())
                                        { size += 4 +  3 * _iter671.getKey().length();size += 4 + _iter671.getValue().limit() - _iter671.getValue().position();
                               }
                              
                                            }
                    
                  } 
        
            // listMapByteBinaryField
            
                    
                    if (listMapByteBinaryField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Byte, java.nio.ByteBuffer> _iter672  : listMapByteBinaryField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Byte, java.nio.ByteBuffer> _iter673 : _iter672.entrySet())
                                        { size += 1;size += 4 + _iter673.getValue().limit() - _iter673.getValue().position();
                               }
                              
                                            }
                    
                  } 
        
            // listMapI8StringField
            
                    
                    if (listMapI8StringField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Byte, java.lang.String> _iter674  : listMapI8StringField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Byte, java.lang.String> _iter675 : _iter674.entrySet())
                                        { size += 1;size += 4 +  3 * _iter675.getValue().length();
                               }
                              
                                            }
                    
                  } 
        
            // listSetBinaryField
            
                    
                    if (listSetBinaryField != null) {
                    
                        size += 8;
                        for (java.util.Set<java.nio.ByteBuffer> _iter676  : listSetBinaryField) { 
                    
                        size += 5;
                        for (java.nio.ByteBuffer _iter677  : _iter676) { size += 4 + _iter677.limit() - _iter677.position();
                                            }
                    
                                            }
                    
                  } 
        
            // listSetStringField
            
                    
                    if (listSetStringField != null) {
                    
                        size += 8;
                        for (java.util.Set<java.lang.String> _iter678  : listSetStringField) { 
                    
                        size += 5;
                        for (java.lang.String _iter679  : _iter678) { size += 4 +  3 * _iter679.length();
                                            }
                    
                                            }
                    
                  } 
        
            // listSetI32Field
            
                    
                    if (listSetI32Field != null) {
                    
                        size += 8;
                        for (java.util.Set<java.lang.Integer> _iter680  : listSetI32Field) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter680.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // listListListI32Field
            
                    
                    if (listListListI32Field != null) {
                    
                        size += 8;
                        for (java.util.List<java.util.List<java.lang.Integer>> _iter681  : listListListI32Field) { 
                    
                        size += 5;
                        for (java.util.List<java.lang.Integer> _iter682  : _iter681) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter682.size();
                                        
                                    
                                    
                                    
                                            }
                    
                                            }
                    
                  } 
        
            // listListI32Field
            
                    
                    if (listListI32Field != null) {
                    
                        size += 8;
                        for (java.util.List<java.lang.Integer> _iter683  : listListI32Field) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter683.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // listAction
            
                                        
                                    if (listAction != null) {
                                     
                                        size += 8;
                                        
                                            size += (4) * listAction.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // listListBinaryField
            
                    
                    if (listListBinaryField != null) {
                    
                        size += 8;
                        for (java.util.List<java.nio.ByteBuffer> _iter684  : listListBinaryField) { 
                    
                        size += 5;
                        for (java.nio.ByteBuffer _iter685  : _iter684) { size += 4 + _iter685.limit() - _iter685.position();
                                            }
                    
                                            }
                    
                  } 
        
            // listBinaryField
            
                    
                    if (listBinaryField != null) {
                    
                        size += 8;
                        for (java.nio.ByteBuffer _iter686  : listBinaryField) { size += 4 + _iter686.limit() - _iter686.position();
                                            }
                    
                  } 
        
            // listByteField
            
                                        
                                    if (listByteField != null) {
                                     
                                        size += 8;
                                        
                                            size += listByteField.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // listBoolField
            
                                        
                                    if (listBoolField != null) {
                                     
                                        size += 8;
                                        
                                            size += listBoolField.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // listStringField
            
                    
                    if (listStringField != null) {
                    
                        size += 8;
                        for (java.lang.String _iter687  : listStringField) { size += 4 +  3 * _iter687.length();
                                            }
                    
                  } 
        
            // listDoubleField
            
                if (listDoubleField != null) {
                    size += 8;
                    
                        size += (8) * listDoubleField.size();
                    
                }
        
            // listI64Field
            
                if (listI64Field != null) {
                    size += 8;
                    
                        size += (8) * listI64Field.size();
                    
                }
        
            // listI32FieldRequired
            
                if (listI32FieldRequired != null) {
                    size += 8;
                    
                        size += (4) * listI32FieldRequired.size();
                    
                }
        
            // listI32FieldOptional
            
                if (listI32FieldOptional != null) {
                    size += 8;
                    
                        size += (4) * listI32FieldOptional.size();
                    
                }
        
            // actionRequired
            
                 if(actionRequired != null ){ 
                
                    size += 3;
                    size += 4;
                
                 } 
            
        
            // actionOptional
            
                 if(actionOptional != null ){ 
                
                    size += 3;
                    size += 4;
                
                 } 
            
        
            // action
            
                 if(action != null ){ 
                
                    size += 3;
                    size += 4;
                
                 } 
            
        
            // byteField
            
                
                
                    size += 3;
                    size += 1;
                
                
            
        
            // boolFieldRequired
            
                
                
                    size += 3;
                    size += 1;
                
                
            
        
            // boolFieldOptional
            
                
                 if(isSetBoolFieldOptional()){ 
                    size += 3;
                    size += 1;
                 } 
                
            
        
            // binaryFieldRequired
            
                 if(binaryFieldRequired != null ){ 
                
                    size += 3;
                    size += 4 + binaryFieldRequired.limit() - binaryFieldRequired.position();
                
                 } 
            
        
            // binaryFieldOptional
            
                 if(binaryFieldOptional != null ){ 
                
                    size += 3;
                    size += 4 + binaryFieldOptional.limit() - binaryFieldOptional.position();
                
                 } 
            
        
            // binaryField
            
                 if(binaryField != null ){ 
                
                    size += 3;
                    size += 4 + binaryField.limit() - binaryField.position();
                
                 } 
            
        
            // stringFieldRequired
            
                 if(stringFieldRequired != null ){ 
                
                    size += 3;
                    size += 4 +  3 * stringFieldRequired.length();
                
                 } 
            
        
            // stringFieldOptional
            
                 if(stringFieldOptional != null ){ 
                
                    size += 3;
                    size += 4 +  3 * stringFieldOptional.length();
                
                 } 
            
        
            // i32FieldRequired
            
                
                
                    size += 3;
                    size += 4;
                
                
            
        
            // i32FieldOptional
            
                
                 if(isSetI32FieldOptional()){ 
                    size += 3;
                    size += 4;
                 } 
                
            
        
            // i32Field
            
                
                
                    size += 3;
                    size += 4;
                
                
            
        
            // boolField
            
                
                
                    size += 3;
                    size += 1;
                
                
            
        
            // stringField
            
                 if(stringField != null ){ 
                
                    size += 3;
                    size += 4 +  3 * stringField.length();
                
                 } 
            
        
            // i16Field
            
                
                
                    size += 3;
                    size += 2;
                
                
            
        
            // i8field
            
                
                
                    size += 3;
                    size += 1;
                
                
            
        
            // i64Field
            
                
                
                    size += 3;
                    size += 8;
                
                
            
        
            // doubleField
            
                
                
                    size += 3;
                    size += 8;
                
                
            
        
            // listI32Field
            
                if (listI32Field != null) {
                    size += 8;
                    
                        size += (4) * listI32Field.size();
                    
                }
        
            // listI8Field
            
                                        
                                    if (listI8Field != null) {
                                     
                                        size += 8;
                                        
                                            size += listI8Field.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // setBoolField
            
                                        
                                    if (setBoolField != null) {
                                     
                                        size += 8;
                                        
                                            size += setBoolField.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // setStringField
            
                    
                    if (setStringField != null) {
                    
                        size += 8;
                        for (java.lang.String _iter688  : setStringField) { size += 4 +  3 * _iter688.length();
                                            }
                    
                  } 
        
            // setByteField
            
                                        
                                    if (setByteField != null) {
                                     
                                        size += 8;
                                        
                                            size += setByteField.size();
                                        
                                    
                                    
                                  } 
                                    
        
            // mapI32I32Field
            
                            
                                if (mapI32I32Field != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> _iter689 : mapI32I32Field.entrySet())
                                        { size += 4;size += 4;
                               }
                             
                             }
                              }  
        
        return size;
    }

    public TestStruct() {
    
        
            i32Field = -999;
        
    
        
    
        
    
        
            stringField = "123";
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
            doubleField = -999;
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
}


    public TestStruct(
    
        int i32Field,
        int i32FieldRequired,
        java.lang.String stringFieldRequired,
        java.nio.ByteBuffer binaryField,
        java.nio.ByteBuffer binaryFieldRequired,
        boolean boolField,
        boolean boolFieldRequired,
        byte i8field,
        short i16Field,
        long i64Field,
        double doubleField,
        byte byteField,
        Action action,
        Action actionRequired,
        com.test.thrift.protocol.TListI32 listI32Field,
        com.test.thrift.protocol.TListI32 listI32FieldRequired,
        java.util.List<java.lang.Byte> listI8Field,
        com.test.thrift.protocol.TListI64 listI64Field,
        com.test.thrift.protocol.TListDouble listDoubleField,
        java.util.List<java.lang.String> listStringField,
        java.util.List<java.lang.Boolean> listBoolField,
        java.util.List<java.lang.Byte> listByteField,
        java.util.List<java.nio.ByteBuffer> listBinaryField,
        java.util.List<java.util.List<java.nio.ByteBuffer>> listListBinaryField,
        java.util.List<Action> listAction,
        java.util.List<java.util.List<java.lang.Integer>> listListI32Field,
        java.util.List<java.util.List<java.util.List<java.lang.Integer>>> listListListI32Field,
        java.util.List<java.util.Set<java.lang.Integer>> listSetI32Field,
        java.util.List<java.util.Set<java.lang.String>> listSetStringField,
        java.util.List<java.util.Set<java.nio.ByteBuffer>> listSetBinaryField,
        java.util.List<java.util.Map<java.lang.Byte, java.lang.String>> listMapI8StringField,
        java.util.List<java.util.Map<java.lang.Byte, java.nio.ByteBuffer>> listMapByteBinaryField,
        java.util.List<java.util.Map<java.lang.String, java.nio.ByteBuffer>> listMapBinaryField,
        java.util.List<java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>>> listComplexField,
        java.util.Set<java.lang.Boolean> setBoolField,
        java.util.Set<java.lang.String> setStringField,
        java.util.Set<java.lang.Byte> setByteField,
        java.util.Set<java.nio.ByteBuffer> setBinaryField,
        java.util.Set<Action> setAction,
        java.util.Set<java.util.List<java.lang.Long>> setListI64Field,
        java.util.Set<java.util.List<java.lang.Boolean>> setListBoolField,
        java.util.Set<java.util.Set<java.lang.Integer>> setSetI32Field,
        java.util.Set<java.util.Map<java.lang.Boolean, java.lang.Long>> setMapBoolI64Field,
        java.util.Set<java.util.Map<java.lang.Long, java.lang.Integer>> setMapI64I32Field,
        java.util.Set<java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>>> setComplexField,
        java.util.Map<java.lang.Integer, java.lang.Integer> mapI32I32Field,
        java.util.Map<java.lang.String, Action> mapStringAction,
        java.util.Map<java.lang.Long, java.lang.String> mapI64StringField,
        java.util.Map<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> mapI64MapField,
        java.util.Map<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> mapListListField,
        java.util.Map<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> mapComplexField,
        SubStruct sub,
        SubStruct subRequired,
        java.util.List<SubStruct> listSubStruct,
        java.util.Set<SubStruct> setSubStruct,
        java.util.Map<SubStruct, SubStruct> mapSubStructSubStruct,
        java.util.Map<java.lang.Integer, SubStruct> mapI32SubStruct,
        java.util.Map<SubStruct, java.lang.Long> mapSubStructI64
    ) {
        this();
        
            this.i32Field = i32Field;
            
                setI32FieldIsSet(true);
            
        
            this.i32FieldRequired = i32FieldRequired;
            
                setI32FieldRequiredIsSet(true);
            
        
            this.stringFieldRequired = stringFieldRequired;
            
        
            this.binaryField = binaryField;
            
        
            this.binaryFieldRequired = binaryFieldRequired;
            
        
            this.boolField = boolField;
            
                setBoolFieldIsSet(true);
            
        
            this.boolFieldRequired = boolFieldRequired;
            
                setBoolFieldRequiredIsSet(true);
            
        
            this.i8field = i8field;
            
                setI8fieldIsSet(true);
            
        
            this.i16Field = i16Field;
            
                setI16FieldIsSet(true);
            
        
            this.i64Field = i64Field;
            
                setI64FieldIsSet(true);
            
        
            this.doubleField = doubleField;
            
                setDoubleFieldIsSet(true);
            
        
            this.byteField = byteField;
            
                setByteFieldIsSet(true);
            
        
            this.action = action;
            
        
            this.actionRequired = actionRequired;
            
        
            this.listI32Field = listI32Field;
            
        
            this.listI32FieldRequired = listI32FieldRequired;
            
        
            this.listI8Field = listI8Field;
            
        
            this.listI64Field = listI64Field;
            
        
            this.listDoubleField = listDoubleField;
            
        
            this.listStringField = listStringField;
            
        
            this.listBoolField = listBoolField;
            
        
            this.listByteField = listByteField;
            
        
            this.listBinaryField = listBinaryField;
            
        
            this.listListBinaryField = listListBinaryField;
            
        
            this.listAction = listAction;
            
        
            this.listListI32Field = listListI32Field;
            
        
            this.listListListI32Field = listListListI32Field;
            
        
            this.listSetI32Field = listSetI32Field;
            
        
            this.listSetStringField = listSetStringField;
            
        
            this.listSetBinaryField = listSetBinaryField;
            
        
            this.listMapI8StringField = listMapI8StringField;
            
        
            this.listMapByteBinaryField = listMapByteBinaryField;
            
        
            this.listMapBinaryField = listMapBinaryField;
            
        
            this.listComplexField = listComplexField;
            
        
            this.setBoolField = setBoolField;
            
        
            this.setStringField = setStringField;
            
        
            this.setByteField = setByteField;
            
        
            this.setBinaryField = setBinaryField;
            
        
            this.setAction = setAction;
            
        
            this.setListI64Field = setListI64Field;
            
        
            this.setListBoolField = setListBoolField;
            
        
            this.setSetI32Field = setSetI32Field;
            
        
            this.setMapBoolI64Field = setMapBoolI64Field;
            
        
            this.setMapI64I32Field = setMapI64I32Field;
            
        
            this.setComplexField = setComplexField;
            
        
            this.mapI32I32Field = mapI32I32Field;
            
        
            this.mapStringAction = mapStringAction;
            
        
            this.mapI64StringField = mapI64StringField;
            
        
            this.mapI64MapField = mapI64MapField;
            
        
            this.mapListListField = mapListListField;
            
        
            this.mapComplexField = mapComplexField;
            
        
            this.sub = sub;
            
        
            this.subRequired = subRequired;
            
        
            this.listSubStruct = listSubStruct;
            
        
            this.setSubStruct = setSubStruct;
            
        
            this.mapSubStructSubStruct = mapSubStructSubStruct;
            
        
            this.mapI32SubStruct = mapI32SubStruct;
            
        
            this.mapSubStructI64 = mapSubStructI64;
            
        
    }


/**
* Performs a deep copy on <i>other</i>.
*/
public TestStruct(TestStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    
        this.i32Field = other.i32Field;
    
        this.i32FieldOptional = other.i32FieldOptional;
    
        this.i32FieldRequired = other.i32FieldRequired;
    
        
    if (other.isSetStringField()){
                this.stringField = other.stringField;
                }
    
        
    if (other.isSetStringFieldOptional()){
                this.stringFieldOptional = other.stringFieldOptional;
                }
    
        
    if (other.isSetStringFieldRequired()){
                this.stringFieldRequired = other.stringFieldRequired;
                }
    
        
    if (other.isSetBinaryField()){
        this.binaryField = com.test.thrift.Helpers.copyBinary(other.binaryField);
        }
    
        
    if (other.isSetBinaryFieldOptional()){
        this.binaryFieldOptional = com.test.thrift.Helpers.copyBinary(other.binaryFieldOptional);
        }
    
        
    if (other.isSetBinaryFieldRequired()){
        this.binaryFieldRequired = com.test.thrift.Helpers.copyBinary(other.binaryFieldRequired);
        }
    
        this.boolField = other.boolField;
    
        this.boolFieldOptional = other.boolFieldOptional;
    
        this.boolFieldRequired = other.boolFieldRequired;
    
        this.i8field = other.i8field;
    
        this.i16Field = other.i16Field;
    
        this.i64Field = other.i64Field;
    
        this.doubleField = other.doubleField;
    
        this.byteField = other.byteField;
    
        
    if (other.isSetAction()){
                this.action = other.action;
                }
    
        
    if (other.isSetActionOptional()){
                this.actionOptional = other.actionOptional;
                }
    
        
    if (other.isSetActionRequired()){
                this.actionRequired = other.actionRequired;
                }
    
        this.listI32Field = other.listI32Field;
    
        this.listI32FieldOptional = other.listI32FieldOptional;
    
        this.listI32FieldRequired = other.listI32FieldRequired;
    
        
    
        if(other.isSetListI8Field()){ 
    
        
            java.util.List<java.lang.Byte> __this__listI8Field = new java.util.ArrayList<>(other.listI8Field); //list1a
        
                    
        
    
            this.listI8Field = __this__listI8Field; // list3a1
            } //list3a2
    
                
    
        this.listI64Field = other.listI64Field;
    
        this.listDoubleField = other.listDoubleField;
    
        
    
        if(other.isSetListStringField()){ 
    
        
            java.util.List<java.lang.String> __this__listStringField = new java.util.ArrayList<>(other.listStringField); //list1a
        
                    
        
    
            this.listStringField = __this__listStringField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListBoolField()){ 
    
        
            java.util.List<java.lang.Boolean> __this__listBoolField = new java.util.ArrayList<>(other.listBoolField); //list1a
        
                    
        
    
            this.listBoolField = __this__listBoolField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListByteField()){ 
    
        
            java.util.List<java.lang.Byte> __this__listByteField = new java.util.ArrayList<>(other.listByteField); //list1a
        
                    
        
    
            this.listByteField = __this__listByteField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListBinaryField()){ 
    
        
            java.util.List<java.nio.ByteBuffer> __this__listBinaryField = new java.util.ArrayList<>(other.listBinaryField); //list1a
        
                    
        
    
            this.listBinaryField = __this__listBinaryField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListListBinaryField()){ 
    
        
            java.util.List<java.util.List<java.nio.ByteBuffer>> __this__listListBinaryField = new java.util.ArrayList<>(other.listListBinaryField.size()); //list1b1
            for (java.util.List<java.nio.ByteBuffer> other_element : other.listListBinaryField) { //list1b2
        
                    
    
        
            java.util.List<java.nio.ByteBuffer> __this__listListBinaryField_copy = new java.util.ArrayList<>(other_element); //list1a
        
                    
        
    
                
        
            __this__listListBinaryField.add(__this__listListBinaryField_copy); //list2a1
            } //list2a2
        
    
            this.listListBinaryField = __this__listListBinaryField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListAction()){ 
    
        
            java.util.List<Action> __this__listAction = new java.util.ArrayList<>(other.listAction); //list1a
        
                    
        
    
            this.listAction = __this__listAction; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListListI32Field()){ 
    
        
            java.util.List<java.util.List<java.lang.Integer>> __this__listListI32Field = new java.util.ArrayList<>(other.listListI32Field.size()); //list1b1
            for (java.util.List<java.lang.Integer> other_element : other.listListI32Field) { //list1b2
        
                    
    
        
            java.util.List<java.lang.Integer> __this__listListI32Field_copy = new java.util.ArrayList<>(other_element); //list1a
        
                    
        
    
                
        
            __this__listListI32Field.add(__this__listListI32Field_copy); //list2a1
            } //list2a2
        
    
            this.listListI32Field = __this__listListI32Field; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListListListI32Field()){ 
    
        
            java.util.List<java.util.List<java.util.List<java.lang.Integer>>> __this__listListListI32Field = new java.util.ArrayList<>(other.listListListI32Field.size()); //list1b1
            for (java.util.List<java.util.List<java.lang.Integer>> other_element : other.listListListI32Field) { //list1b2
        
                    
    
        
            java.util.List<java.util.List<java.lang.Integer>> __this__listListListI32Field_copy = new java.util.ArrayList<>(other_element.size()); //list1b1
            for (java.util.List<java.lang.Integer> other_element_element : other_element) { //list1b2
        
                    
    
        
            java.util.List<java.lang.Integer> __this__listListListI32Field_copy_copy = new java.util.ArrayList<>(other_element_element); //list1a
        
                    
        
    
                
        
            __this__listListListI32Field_copy.add(__this__listListListI32Field_copy_copy); //list2a1
            } //list2a2
        
    
                
        
            __this__listListListI32Field.add(__this__listListListI32Field_copy); //list2a1
            } //list2a2
        
    
            this.listListListI32Field = __this__listListListI32Field; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListSetI32Field()){ 
    
        
            java.util.List<java.util.Set<java.lang.Integer>> __this__listSetI32Field = new java.util.ArrayList<>(other.listSetI32Field.size()); //list1b1
            for (java.util.Set<java.lang.Integer> other_element : other.listSetI32Field) { //list1b2
        
                    
    
        
            java.util.Set<java.lang.Integer> __this__listSetI32Field_copy = new java.util.HashSet<>(other_element); //list1a
        
                    
        
    
                
        
            __this__listSetI32Field.add(__this__listSetI32Field_copy); //list2a1
            } //list2a2
        
    
            this.listSetI32Field = __this__listSetI32Field; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListSetStringField()){ 
    
        
            java.util.List<java.util.Set<java.lang.String>> __this__listSetStringField = new java.util.ArrayList<>(other.listSetStringField.size()); //list1b1
            for (java.util.Set<java.lang.String> other_element : other.listSetStringField) { //list1b2
        
                    
    
        
            java.util.Set<java.lang.String> __this__listSetStringField_copy = new java.util.HashSet<>(other_element); //list1a
        
                    
        
    
                
        
            __this__listSetStringField.add(__this__listSetStringField_copy); //list2a1
            } //list2a2
        
    
            this.listSetStringField = __this__listSetStringField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListSetBinaryField()){ 
    
        
            java.util.List<java.util.Set<java.nio.ByteBuffer>> __this__listSetBinaryField = new java.util.ArrayList<>(other.listSetBinaryField.size()); //list1b1
            for (java.util.Set<java.nio.ByteBuffer> other_element : other.listSetBinaryField) { //list1b2
        
                    
    
        
            java.util.Set<java.nio.ByteBuffer> __this__listSetBinaryField_copy = new java.util.HashSet<>(other_element); //list1a
        
                    
        
    
                
        
            __this__listSetBinaryField.add(__this__listSetBinaryField_copy); //list2a1
            } //list2a2
        
    
            this.listSetBinaryField = __this__listSetBinaryField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListMapI8StringField()){ 
    
        
            java.util.List<java.util.Map<java.lang.Byte, java.lang.String>> __this__listMapI8StringField = new java.util.ArrayList<>(other.listMapI8StringField.size()); //list1b1
            for (java.util.Map<java.lang.Byte, java.lang.String> other_element : other.listMapI8StringField) { //list1b2
        
                    
    
        
            java.util.Map<java.lang.Byte, java.lang.String> __this__listMapI8StringField_copy = new java.util.HashMap<>(other_element); //map1a
        
                    
        
    
                
        
            __this__listMapI8StringField.add(__this__listMapI8StringField_copy); //list2a1
            } //list2a2
        
    
            this.listMapI8StringField = __this__listMapI8StringField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListMapByteBinaryField()){ 
    
        
            java.util.List<java.util.Map<java.lang.Byte, java.nio.ByteBuffer>> __this__listMapByteBinaryField = new java.util.ArrayList<>(other.listMapByteBinaryField.size()); //list1b1
            for (java.util.Map<java.lang.Byte, java.nio.ByteBuffer> other_element : other.listMapByteBinaryField) { //list1b2
        
                    
    
        
            java.util.Map<java.lang.Byte, java.nio.ByteBuffer> __this__listMapByteBinaryField_copy = new java.util.HashMap<>(other_element); //map1a
        
                    
        
    
                
        
            __this__listMapByteBinaryField.add(__this__listMapByteBinaryField_copy); //list2a1
            } //list2a2
        
    
            this.listMapByteBinaryField = __this__listMapByteBinaryField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListMapBinaryField()){ 
    
        
            java.util.List<java.util.Map<java.lang.String, java.nio.ByteBuffer>> __this__listMapBinaryField = new java.util.ArrayList<>(other.listMapBinaryField.size()); //list1b1
            for (java.util.Map<java.lang.String, java.nio.ByteBuffer> other_element : other.listMapBinaryField) { //list1b2
        
                    
    
        
            java.util.Map<java.lang.String, java.nio.ByteBuffer> __this__listMapBinaryField_copy = new java.util.HashMap<>(other_element); //map1a
        
                    
        
    
                
        
            __this__listMapBinaryField.add(__this__listMapBinaryField_copy); //list2a1
            } //list2a2
        
    
            this.listMapBinaryField = __this__listMapBinaryField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetListComplexField()){ 
    
        
            java.util.List<java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>>> __this__listComplexField = new java.util.ArrayList<>(other.listComplexField.size()); //list1b1
            for (java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> other_element : other.listComplexField) { //list1b2
        
                    
    
        
            java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> __this__listComplexField_copy = new java.util.HashMap<>(other_element.size()); //map1b1
            for (java.util.Map.Entry<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> other_element_element : other_element.entrySet()) { //map1b2
        
                    
                
                    java.lang.Integer __this__listComplexField_copy_copy_key = other_element_element.getKey();
                
            
    
        
            java.util.List<java.util.Set<java.lang.Integer>> __this__listComplexField_copy_copy_value = new java.util.ArrayList<>(other_element_element.getValue().size()); //list1b1
            for (java.util.Set<java.lang.Integer> other_element_element_value_element : other_element_element.getValue()) { //list1b2
        
                    
    
        
            java.util.Set<java.lang.Integer> __this__listComplexField_copy_copy_value_copy = new java.util.HashSet<>(other_element_element_value_element); //list1a
        
                    
        
    
                
        
            __this__listComplexField_copy_copy_value.add(__this__listComplexField_copy_copy_value_copy); //list2a1
            } //list2a2
        
    
                
        
            __this__listComplexField_copy.put(__this__listComplexField_copy_copy_key,__this__listComplexField_copy_copy_value); // map3a1
            } // map3a2
        
    
                
        
            __this__listComplexField.add(__this__listComplexField_copy); //list2a1
            } //list2a2
        
    
            this.listComplexField = __this__listComplexField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetBoolField()){ 
    
        
            java.util.Set<java.lang.Boolean> __this__setBoolField = new java.util.HashSet<>(other.setBoolField); //list1a
        
                    
        
    
            this.setBoolField = __this__setBoolField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetStringField()){ 
    
        
            java.util.Set<java.lang.String> __this__setStringField = new java.util.HashSet<>(other.setStringField); //list1a
        
                    
        
    
            this.setStringField = __this__setStringField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetByteField()){ 
    
        
            java.util.Set<java.lang.Byte> __this__setByteField = new java.util.HashSet<>(other.setByteField); //list1a
        
                    
        
    
            this.setByteField = __this__setByteField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetBinaryField()){ 
    
        
            java.util.Set<java.nio.ByteBuffer> __this__setBinaryField = new java.util.HashSet<>(other.setBinaryField); //list1a
        
                    
        
    
            this.setBinaryField = __this__setBinaryField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetAction()){ 
    
        
            java.util.Set<Action> __this__setAction = new java.util.HashSet<>(other.setAction); //list1a
        
                    
        
    
            this.setAction = __this__setAction; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetListI64Field()){ 
    
        
            java.util.Set<java.util.List<java.lang.Long>> __this__setListI64Field = new java.util.HashSet<>(other.setListI64Field.size()); //list1b1
            for (java.util.List<java.lang.Long> other_element : other.setListI64Field) { //list1b2
        
                    
    
        
            java.util.List<java.lang.Long> __this__setListI64Field_copy = new java.util.ArrayList<>(other_element); //list1a
        
                    
        
    
                
        
            __this__setListI64Field.add(__this__setListI64Field_copy); //list2a1
            } //list2a2
        
    
            this.setListI64Field = __this__setListI64Field; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetListBoolField()){ 
    
        
            java.util.Set<java.util.List<java.lang.Boolean>> __this__setListBoolField = new java.util.HashSet<>(other.setListBoolField.size()); //list1b1
            for (java.util.List<java.lang.Boolean> other_element : other.setListBoolField) { //list1b2
        
                    
    
        
            java.util.List<java.lang.Boolean> __this__setListBoolField_copy = new java.util.ArrayList<>(other_element); //list1a
        
                    
        
    
                
        
            __this__setListBoolField.add(__this__setListBoolField_copy); //list2a1
            } //list2a2
        
    
            this.setListBoolField = __this__setListBoolField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetSetI32Field()){ 
    
        
            java.util.Set<java.util.Set<java.lang.Integer>> __this__setSetI32Field = new java.util.HashSet<>(other.setSetI32Field.size()); //list1b1
            for (java.util.Set<java.lang.Integer> other_element : other.setSetI32Field) { //list1b2
        
                    
    
        
            java.util.Set<java.lang.Integer> __this__setSetI32Field_copy = new java.util.HashSet<>(other_element); //list1a
        
                    
        
    
                
        
            __this__setSetI32Field.add(__this__setSetI32Field_copy); //list2a1
            } //list2a2
        
    
            this.setSetI32Field = __this__setSetI32Field; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetMapBoolI64Field()){ 
    
        
            java.util.Set<java.util.Map<java.lang.Boolean, java.lang.Long>> __this__setMapBoolI64Field = new java.util.HashSet<>(other.setMapBoolI64Field.size()); //list1b1
            for (java.util.Map<java.lang.Boolean, java.lang.Long> other_element : other.setMapBoolI64Field) { //list1b2
        
                    
    
        
            java.util.Map<java.lang.Boolean, java.lang.Long> __this__setMapBoolI64Field_copy = new java.util.HashMap<>(other_element); //map1a
        
                    
        
    
                
        
            __this__setMapBoolI64Field.add(__this__setMapBoolI64Field_copy); //list2a1
            } //list2a2
        
    
            this.setMapBoolI64Field = __this__setMapBoolI64Field; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetMapI64I32Field()){ 
    
        
            java.util.Set<java.util.Map<java.lang.Long, java.lang.Integer>> __this__setMapI64I32Field = new java.util.HashSet<>(other.setMapI64I32Field.size()); //list1b1
            for (java.util.Map<java.lang.Long, java.lang.Integer> other_element : other.setMapI64I32Field) { //list1b2
        
                    
    
        
            java.util.Map<java.lang.Long, java.lang.Integer> __this__setMapI64I32Field_copy = new java.util.HashMap<>(other_element); //map1a
        
                    
        
    
                
        
            __this__setMapI64I32Field.add(__this__setMapI64I32Field_copy); //list2a1
            } //list2a2
        
    
            this.setMapI64I32Field = __this__setMapI64I32Field; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetComplexField()){ 
    
        
            java.util.Set<java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>>> __this__setComplexField = new java.util.HashSet<>(other.setComplexField.size()); //list1b1
            for (java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> other_element : other.setComplexField) { //list1b2
        
                    
    
        
            java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> __this__setComplexField_copy = new java.util.HashMap<>(other_element.size()); //map1b1
            for (java.util.Map.Entry<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> other_element_element : other_element.entrySet()) { //map1b2
        
                    
    
        
            java.util.List<java.lang.Long> __this__setComplexField_copy_copy_key = new java.util.ArrayList<>(other_element_element.getKey()); //list1a
        
                    
        
    
                
    
        
            java.util.Map<java.lang.Byte, java.lang.String> __this__setComplexField_copy_copy_value = new java.util.HashMap<>(other_element_element.getValue()); //map1a
        
                    
        
    
                
        
            __this__setComplexField_copy.put(__this__setComplexField_copy_copy_key,__this__setComplexField_copy_copy_value); // map3a1
            } // map3a2
        
    
                
        
            __this__setComplexField.add(__this__setComplexField_copy); //list2a1
            } //list2a2
        
    
            this.setComplexField = __this__setComplexField; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetMapI32I32Field()){
    
        
            java.util.Map<java.lang.Integer, java.lang.Integer> __this__mapI32I32Field = new java.util.HashMap<>(other.mapI32I32Field); //map1a
        
                    
        
    
            this.mapI32I32Field = __this__mapI32I32Field; // map4a1
            } //map4a2
    
                
    
        
    
        if(other.isSetMapStringAction()){
    
        
            java.util.Map<java.lang.String, Action> __this__mapStringAction = new java.util.HashMap<>(other.mapStringAction); //map1a
        
                    
        
    
            this.mapStringAction = __this__mapStringAction; // map4a1
            } //map4a2
    
                
    
        
    
        if(other.isSetMapI64StringField()){
    
        
            java.util.Map<java.lang.Long, java.lang.String> __this__mapI64StringField = new java.util.HashMap<>(other.mapI64StringField); //map1a
        
                    
        
    
            this.mapI64StringField = __this__mapI64StringField; // map4a1
            } //map4a2
    
                
    
        
    
        if(other.isSetMapI64MapField()){
    
        
            java.util.Map<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> __this__mapI64MapField = new java.util.HashMap<>(other.mapI64MapField.size()); //map1b1
            for (java.util.Map.Entry<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> other_element : other.mapI64MapField.entrySet()) { //map1b2
        
                    
                
                    java.lang.Long __this__mapI64MapField_copy_key = other_element.getKey();
                
            
    
        
            java.util.Map<java.lang.String, java.nio.ByteBuffer> __this__mapI64MapField_copy_value = new java.util.HashMap<>(other_element.getValue()); //map1a
        
                    
        
    
                
        
            __this__mapI64MapField.put(__this__mapI64MapField_copy_key,__this__mapI64MapField_copy_value); // map3a1
            } // map3a2
        
    
            this.mapI64MapField = __this__mapI64MapField; // map4a1
            } //map4a2
    
                
    
        
    
        if(other.isSetMapListListField()){
    
        
            java.util.Map<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> __this__mapListListField = new java.util.HashMap<>(other.mapListListField.size()); //map1b1
            for (java.util.Map.Entry<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> other_element : other.mapListListField.entrySet()) { //map1b2
        
                    
    
        
            java.util.List<java.nio.ByteBuffer> __this__mapListListField_copy_key = new java.util.ArrayList<>(other_element.getKey()); //list1a
        
                    
        
    
                
    
        
            java.util.List<java.lang.String> __this__mapListListField_copy_value = new java.util.ArrayList<>(other_element.getValue()); //list1a
        
                    
        
    
                
        
            __this__mapListListField.put(__this__mapListListField_copy_key,__this__mapListListField_copy_value); // map3a1
            } // map3a2
        
    
            this.mapListListField = __this__mapListListField; // map4a1
            } //map4a2
    
                
    
        
    
        if(other.isSetMapComplexField()){
    
        
            java.util.Map<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> __this__mapComplexField = new java.util.HashMap<>(other.mapComplexField.size()); //map1b1
            for (java.util.Map.Entry<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> other_element : other.mapComplexField.entrySet()) { //map1b2
        
                    
    
        
            java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> __this__mapComplexField_copy_key = new java.util.HashMap<>(other_element.getKey().size()); //map1b1
            for (java.util.Map.Entry<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> other_element_key_element : other_element.getKey().entrySet()) { //map1b2
        
                    
                
                    java.lang.Long __this__mapComplexField_copy_key_copy_key = other_element_key_element.getKey();
                
            
    
        
            java.util.Set<java.util.Set<java.lang.Long>> __this__mapComplexField_copy_key_copy_value = new java.util.HashSet<>(other_element_key_element.getValue().size()); //list1b1
            for (java.util.Set<java.lang.Long> other_element_key_element_value_element : other_element_key_element.getValue()) { //list1b2
        
                    
    
        
            java.util.Set<java.lang.Long> __this__mapComplexField_copy_key_copy_value_copy = new java.util.HashSet<>(other_element_key_element_value_element); //list1a
        
                    
        
    
                
        
            __this__mapComplexField_copy_key_copy_value.add(__this__mapComplexField_copy_key_copy_value_copy); //list2a1
            } //list2a2
        
    
                
        
            __this__mapComplexField_copy_key.put(__this__mapComplexField_copy_key_copy_key,__this__mapComplexField_copy_key_copy_value); // map3a1
            } // map3a2
        
    
                
    
        
            java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> __this__mapComplexField_copy_value = new java.util.HashMap<>(other_element.getValue().size()); //map1b1
            for (java.util.Map.Entry<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> other_element_value_element : other_element.getValue().entrySet()) { //map1b2
        
                    
    
        
            java.util.Set<java.lang.Long> __this__mapComplexField_copy_value_copy_key = new java.util.HashSet<>(other_element_value_element.getKey()); //list1a
        
                    
        
    
                
    
        
            java.util.Map<java.lang.String, java.lang.Long> __this__mapComplexField_copy_value_copy_value = new java.util.HashMap<>(other_element_value_element.getValue()); //map1a
        
                    
        
    
                
        
            __this__mapComplexField_copy_value.put(__this__mapComplexField_copy_value_copy_key,__this__mapComplexField_copy_value_copy_value); // map3a1
            } // map3a2
        
    
                
        
            __this__mapComplexField.put(__this__mapComplexField_copy_key,__this__mapComplexField_copy_value); // map3a1
            } // map3a2
        
    
            this.mapComplexField = __this__mapComplexField; // map4a1
            } //map4a2
    
                
    
        
                if (other.isSetSub()){
                    this.sub = new SubStruct(other.sub);
                 }
                
    
        
                if (other.isSetSubOptional()){
                    this.subOptional = new SubStruct(other.subOptional);
                 }
                
    
        
                if (other.isSetSubRequired()){
                    this.subRequired = new SubStruct(other.subRequired);
                 }
                
    
        
    
        if(other.isSetListSubStruct()){ 
    
        
            java.util.List<SubStruct> __this__listSubStruct = new java.util.ArrayList<>(other.listSubStruct.size()); //list1b1
            for (SubStruct other_element : other.listSubStruct) { //list1b2
        
                    
                
                    SubStruct __this__listSubStruct_copy = new SubStruct(other_element);
                
            
        
            __this__listSubStruct.add(__this__listSubStruct_copy); //list2a1
            } //list2a2
        
    
            this.listSubStruct = __this__listSubStruct; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetSetSubStruct()){ 
    
        
            java.util.Set<SubStruct> __this__setSubStruct = new java.util.HashSet<>(other.setSubStruct.size()); //list1b1
            for (SubStruct other_element : other.setSubStruct) { //list1b2
        
                    
                
                    SubStruct __this__setSubStruct_copy = new SubStruct(other_element);
                
            
        
            __this__setSubStruct.add(__this__setSubStruct_copy); //list2a1
            } //list2a2
        
    
            this.setSubStruct = __this__setSubStruct; // list3a1
            } //list3a2
    
                
    
        
    
        if(other.isSetMapSubStructSubStruct()){
    
        
            java.util.Map<SubStruct, SubStruct> __this__mapSubStructSubStruct = new java.util.HashMap<>(other.mapSubStructSubStruct.size()); //map1b1
            for (java.util.Map.Entry<SubStruct, SubStruct> other_element : other.mapSubStructSubStruct.entrySet()) { //map1b2
        
                    
                
                    SubStruct __this__mapSubStructSubStruct_copy_key = new SubStruct(other_element.getKey());
                
            
                
                    SubStruct __this__mapSubStructSubStruct_copy_value = new SubStruct(other_element.getValue());
                
            
        
            __this__mapSubStructSubStruct.put(__this__mapSubStructSubStruct_copy_key,__this__mapSubStructSubStruct_copy_value); // map3a1
            } // map3a2
        
    
            this.mapSubStructSubStruct = __this__mapSubStructSubStruct; // map4a1
            } //map4a2
    
                
    
        
    
        if(other.isSetMapI32SubStruct()){
    
        
            java.util.Map<java.lang.Integer, SubStruct> __this__mapI32SubStruct = new java.util.HashMap<>(other.mapI32SubStruct.size()); //map1b1
            for (java.util.Map.Entry<java.lang.Integer, SubStruct> other_element : other.mapI32SubStruct.entrySet()) { //map1b2
        
                    
                
                    java.lang.Integer __this__mapI32SubStruct_copy_key = other_element.getKey();
                
            
                
                    SubStruct __this__mapI32SubStruct_copy_value = new SubStruct(other_element.getValue());
                
            
        
            __this__mapI32SubStruct.put(__this__mapI32SubStruct_copy_key,__this__mapI32SubStruct_copy_value); // map3a1
            } // map3a2
        
    
            this.mapI32SubStruct = __this__mapI32SubStruct; // map4a1
            } //map4a2
    
                
    
        
    
        if(other.isSetMapSubStructI64()){
    
        
            java.util.Map<SubStruct, java.lang.Long> __this__mapSubStructI64 = new java.util.HashMap<>(other.mapSubStructI64.size()); //map1b1
            for (java.util.Map.Entry<SubStruct, java.lang.Long> other_element : other.mapSubStructI64.entrySet()) { //map1b2
        
                    
                
                    SubStruct __this__mapSubStructI64_copy_key = new SubStruct(other_element.getKey());
                
            
                
                    java.lang.Long __this__mapSubStructI64_copy_value = other_element.getValue();
                
            
        
            __this__mapSubStructI64.put(__this__mapSubStructI64_copy_key,__this__mapSubStructI64_copy_value); // map3a1
            } // map3a2
        
    
            this.mapSubStructI64 = __this__mapSubStructI64; // map4a1
            } //map4a2
    
                
    
}

public TestStruct deepCopy() {
    return new TestStruct(this);
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
                  this.i32Field = iprot.readI32();
                  this.setI32FieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -1:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.i32FieldOptional = iprot.readI32();
                  this.setI32FieldOptionalIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -2:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.i32FieldRequired = iprot.readI32();
                  this.setI32FieldRequiredIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 3:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.stringField = iprot.readString();
                  this.setStringFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -3:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.stringFieldOptional = iprot.readString();
                  this.setStringFieldOptionalIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -4:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.stringFieldRequired = iprot.readString();
                  this.setStringFieldRequiredIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -5:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.binaryField = iprot.readBinary();
                  this.setBinaryFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -6:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.binaryFieldOptional = iprot.readBinary();
                  this.setBinaryFieldOptionalIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -7:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.binaryFieldRequired = iprot.readBinary();
                  this.setBinaryFieldRequiredIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 2:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                  this.boolField = iprot.readBool();
                  this.setBoolFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -8:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                  this.boolFieldOptional = iprot.readBool();
                  this.setBoolFieldOptionalIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -9:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                  this.boolFieldRequired = iprot.readBool();
                  this.setBoolFieldRequiredIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 5:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
                  this.i8field = iprot.readByte();
                  this.setI8fieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 4:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
                  this.i16Field = iprot.readI16();
                  this.setI16FieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 6:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                  this.i64Field = iprot.readI64();
                  this.setI64FieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 7:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
                  this.doubleField = iprot.readDouble();
                  this.setDoubleFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -10:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
                  this.byteField = iprot.readByte();
                  this.setByteFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -11:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.action = com.test.thrift.Action.findByValue(iprot.readI32());
                  this.setActionIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -12:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.actionOptional = com.test.thrift.Action.findByValue(iprot.readI32());
                  this.setActionOptionalIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -13:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.actionRequired = com.test.thrift.Action.findByValue(iprot.readI32());
                  this.setActionRequiredIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 10:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection331 = iprot.readListBegin();
                        listI32Field = new com.test.thrift.protocol.TListI32(_collection331.size);
                        int _elem332;
                        for(int _i333=0;_i333 < _collection331.size; ++ _i333 ) { 
                            _elem332 = iprot.readI32();
                            listI32Field.add(_elem332);
                        }
                        iprot.readListEnd();
                    }
                    this.setListI32FieldIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -14:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection334 = iprot.readListBegin();
                        listI32FieldOptional = new com.test.thrift.protocol.TListI32(_collection334.size);
                        int _elem335;
                        for(int _i336=0;_i336 < _collection334.size; ++ _i336 ) { 
                            _elem335 = iprot.readI32();
                            listI32FieldOptional.add(_elem335);
                        }
                        iprot.readListEnd();
                    }
                    this.setListI32FieldOptionalIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -15:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection337 = iprot.readListBegin();
                        listI32FieldRequired = new com.test.thrift.protocol.TListI32(_collection337.size);
                        int _elem338;
                        for(int _i339=0;_i339 < _collection337.size; ++ _i339 ) { 
                            _elem338 = iprot.readI32();
                            listI32FieldRequired.add(_elem338);
                        }
                        iprot.readListEnd();
                    }
                    this.setListI32FieldRequiredIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 11:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection340 = iprot.readListBegin();
                        listI8Field = new java.util.ArrayList<>(_collection340.size);
                        byte _elem341;
                        for(int _i342=0;_i342 < _collection340.size; ++ _i342 ) { 
                            _elem341 = iprot.readByte();
                            listI8Field.add(_elem341);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListI8FieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -16:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection343 = iprot.readListBegin();
                        listI64Field = new com.test.thrift.protocol.TListI64(_collection343.size);
                        long _elem344;
                        for(int _i345=0;_i345 < _collection343.size; ++ _i345 ) { 
                            _elem344 = iprot.readI64();
                            listI64Field.add(_elem344);
                        }
                        iprot.readListEnd();
                    }
                    this.setListI64FieldIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -17:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection346 = iprot.readListBegin();
                        listDoubleField = new com.test.thrift.protocol.TListDouble(_collection346.size);
                        double _elem347;
                        for(int _i348=0;_i348 < _collection346.size; ++ _i348 ) { 
                            _elem347 = iprot.readDouble();
                            listDoubleField.add(_elem347);
                        }
                        iprot.readListEnd();
                    }
                    this.setListDoubleFieldIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -18:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection349 = iprot.readListBegin();
                        listStringField = new java.util.ArrayList<>(_collection349.size);
                        java.lang.String _elem350;
                        for(int _i351=0;_i351 < _collection349.size; ++ _i351 ) { 
                            _elem350 = iprot.readString();
                            listStringField.add(_elem350);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListStringFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -19:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection352 = iprot.readListBegin();
                        listBoolField = new java.util.ArrayList<>(_collection352.size);
                        boolean _elem353;
                        for(int _i354=0;_i354 < _collection352.size; ++ _i354 ) { 
                            _elem353 = iprot.readBool();
                            listBoolField.add(_elem353);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListBoolFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -20:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection355 = iprot.readListBegin();
                        listByteField = new java.util.ArrayList<>(_collection355.size);
                        byte _elem356;
                        for(int _i357=0;_i357 < _collection355.size; ++ _i357 ) { 
                            _elem356 = iprot.readByte();
                            listByteField.add(_elem356);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListByteFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -21:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection358 = iprot.readListBegin();
                        listBinaryField = new java.util.ArrayList<>(_collection358.size);
                        java.nio.ByteBuffer _elem359;
                        for(int _i360=0;_i360 < _collection358.size; ++ _i360 ) { 
                            _elem359 = iprot.readBinary();
                            listBinaryField.add(_elem359);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListBinaryFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -22:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection361 = iprot.readListBegin();
                        listListBinaryField = new java.util.ArrayList<>(_collection361.size);
                        java.util.List<java.nio.ByteBuffer> _elem362;
                        for(int _i363=0;_i363 < _collection361.size; ++ _i363 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection364 = iprot.readListBegin();
                        _elem362 = new java.util.ArrayList<>(_collection364.size);
                        java.nio.ByteBuffer _elem365;
                        for(int _i366=0;_i366 < _collection364.size; ++ _i366 ) { 
                            _elem365 = iprot.readBinary();
                            _elem362.add(_elem365);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            listListBinaryField.add(_elem362);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListListBinaryFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -23:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection367 = iprot.readListBegin();
                        listAction = new java.util.ArrayList<>(_collection367.size);
                        Action _elem368;
                        for(int _i369=0;_i369 < _collection367.size; ++ _i369 ) { 
                _elem368 = com.test.thrift.Action.findByValue(iprot.readI32());
                if(_elem368 == null){
                   continue;
                }
                            listAction.add(_elem368);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListActionIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -24:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection370 = iprot.readListBegin();
                        listListI32Field = new java.util.ArrayList<>(_collection370.size);
                        java.util.List<java.lang.Integer> _elem371;
                        for(int _i372=0;_i372 < _collection370.size; ++ _i372 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection373 = iprot.readListBegin();
                        _elem371 = new java.util.ArrayList<>(_collection373.size);
                        int _elem374;
                        for(int _i375=0;_i375 < _collection373.size; ++ _i375 ) { 
                            _elem374 = iprot.readI32();
                            _elem371.add(_elem374);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            listListI32Field.add(_elem371);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListListI32FieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -25:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection376 = iprot.readListBegin();
                        listListListI32Field = new java.util.ArrayList<>(_collection376.size);
                        java.util.List<java.util.List<java.lang.Integer>> _elem377;
                        for(int _i378=0;_i378 < _collection376.size; ++ _i378 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection379 = iprot.readListBegin();
                        _elem377 = new java.util.ArrayList<>(_collection379.size);
                        java.util.List<java.lang.Integer> _elem380;
                        for(int _i381=0;_i381 < _collection379.size; ++ _i381 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection382 = iprot.readListBegin();
                        _elem380 = new java.util.ArrayList<>(_collection382.size);
                        int _elem383;
                        for(int _i384=0;_i384 < _collection382.size; ++ _i384 ) { 
                            _elem383 = iprot.readI32();
                            _elem380.add(_elem383);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            _elem377.add(_elem380);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            listListListI32Field.add(_elem377);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListListListI32FieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -26:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection385 = iprot.readListBegin();
                        listSetI32Field = new java.util.ArrayList<>(_collection385.size);
                        java.util.Set<java.lang.Integer> _elem386;
                        for(int _i387=0;_i387 < _collection385.size; ++ _i387 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection388 = iprot.readSetBegin();
                                    _elem386 = new java.util.HashSet<>(_collection388.size);
                                    int _elem389;
                                    for(int _i390=0;_i390 < _collection388.size; ++_i390 ) { 
                            _elem389 = iprot.readI32();
                                        _elem386.add(_elem389);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                            listSetI32Field.add(_elem386);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListSetI32FieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -27:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection391 = iprot.readListBegin();
                        listSetStringField = new java.util.ArrayList<>(_collection391.size);
                        java.util.Set<java.lang.String> _elem392;
                        for(int _i393=0;_i393 < _collection391.size; ++ _i393 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection394 = iprot.readSetBegin();
                                    _elem392 = new java.util.HashSet<>(_collection394.size);
                                    java.lang.String _elem395;
                                    for(int _i396=0;_i396 < _collection394.size; ++_i396 ) { 
                            _elem395 = iprot.readString();
                                        _elem392.add(_elem395);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                            listSetStringField.add(_elem392);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListSetStringFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -28:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection397 = iprot.readListBegin();
                        listSetBinaryField = new java.util.ArrayList<>(_collection397.size);
                        java.util.Set<java.nio.ByteBuffer> _elem398;
                        for(int _i399=0;_i399 < _collection397.size; ++ _i399 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection400 = iprot.readSetBegin();
                                    _elem398 = new java.util.HashSet<>(_collection400.size);
                                    java.nio.ByteBuffer _elem401;
                                    for(int _i402=0;_i402 < _collection400.size; ++_i402 ) { 
                            _elem401 = iprot.readBinary();
                                        _elem398.add(_elem401);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                            listSetBinaryField.add(_elem398);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListSetBinaryFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -29:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection403 = iprot.readListBegin();
                        listMapI8StringField = new java.util.ArrayList<>(_collection403.size);
                        java.util.Map<java.lang.Byte, java.lang.String> _elem404;
                        for(int _i405=0;_i405 < _collection403.size; ++ _i405 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection406 = iprot.readMapBegin();
                                                _elem404 = new java.util.HashMap<>(_collection406.size);
                                                byte _key_elem407;
                                                java.lang.String _value_elem408;
                                                for(int _i409=0;_i409 < _collection406.size; ++ _i409 ) { 
                            _key_elem407 = iprot.readByte();
                            _value_elem408 = iprot.readString();
                                                    _elem404.put(_key_elem407,_value_elem408);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                            listMapI8StringField.add(_elem404);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListMapI8StringFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -30:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection410 = iprot.readListBegin();
                        listMapByteBinaryField = new java.util.ArrayList<>(_collection410.size);
                        java.util.Map<java.lang.Byte, java.nio.ByteBuffer> _elem411;
                        for(int _i412=0;_i412 < _collection410.size; ++ _i412 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection413 = iprot.readMapBegin();
                                                _elem411 = new java.util.HashMap<>(_collection413.size);
                                                byte _key_elem414;
                                                java.nio.ByteBuffer _value_elem415;
                                                for(int _i416=0;_i416 < _collection413.size; ++ _i416 ) { 
                            _key_elem414 = iprot.readByte();
                            _value_elem415 = iprot.readBinary();
                                                    _elem411.put(_key_elem414,_value_elem415);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                            listMapByteBinaryField.add(_elem411);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListMapByteBinaryFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -31:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection417 = iprot.readListBegin();
                        listMapBinaryField = new java.util.ArrayList<>(_collection417.size);
                        java.util.Map<java.lang.String, java.nio.ByteBuffer> _elem418;
                        for(int _i419=0;_i419 < _collection417.size; ++ _i419 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection420 = iprot.readMapBegin();
                                                _elem418 = new java.util.HashMap<>(_collection420.size);
                                                java.lang.String _key_elem421;
                                                java.nio.ByteBuffer _value_elem422;
                                                for(int _i423=0;_i423 < _collection420.size; ++ _i423 ) { 
                            _key_elem421 = iprot.readString();
                            _value_elem422 = iprot.readBinary();
                                                    _elem418.put(_key_elem421,_value_elem422);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                            listMapBinaryField.add(_elem418);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListMapBinaryFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -32:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection424 = iprot.readListBegin();
                        listComplexField = new java.util.ArrayList<>(_collection424.size);
                        java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _elem425;
                        for(int _i426=0;_i426 < _collection424.size; ++ _i426 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection427 = iprot.readMapBegin();
                                                _elem425 = new java.util.HashMap<>(_collection427.size);
                                                int _key_elem428;
                                                java.util.List<java.util.Set<java.lang.Integer>> _value_elem429;
                                                for(int _i430=0;_i430 < _collection427.size; ++ _i430 ) { 
                            _key_elem428 = iprot.readI32();
                
                    {
                        com.test.thrift.protocol.TList _collection431 = iprot.readListBegin();
                        _value_elem429 = new java.util.ArrayList<>(_collection431.size);
                        java.util.Set<java.lang.Integer> _elem432;
                        for(int _i433=0;_i433 < _collection431.size; ++ _i433 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection434 = iprot.readSetBegin();
                                    _elem432 = new java.util.HashSet<>(_collection434.size);
                                    int _elem435;
                                    for(int _i436=0;_i436 < _collection434.size; ++_i436 ) { 
                            _elem435 = iprot.readI32();
                                        _elem432.add(_elem435);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                            _value_elem429.add(_elem432);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                                    _elem425.put(_key_elem428,_value_elem429);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                            listComplexField.add(_elem425);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListComplexFieldIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 20:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection437 = iprot.readSetBegin();
                                    setBoolField = new java.util.HashSet<>(_collection437.size);
                                    boolean _elem438;
                                    for(int _i439=0;_i439 < _collection437.size; ++_i439 ) { 
                            _elem438 = iprot.readBool();
                                        setBoolField.add(_elem438);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetBoolFieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 21:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection440 = iprot.readSetBegin();
                                    setStringField = new java.util.HashSet<>(_collection440.size);
                                    java.lang.String _elem441;
                                    for(int _i442=0;_i442 < _collection440.size; ++_i442 ) { 
                            _elem441 = iprot.readString();
                                        setStringField.add(_elem441);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetStringFieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 22:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection443 = iprot.readSetBegin();
                                    setByteField = new java.util.HashSet<>(_collection443.size);
                                    byte _elem444;
                                    for(int _i445=0;_i445 < _collection443.size; ++_i445 ) { 
                            _elem444 = iprot.readByte();
                                        setByteField.add(_elem444);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetByteFieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -33:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection446 = iprot.readSetBegin();
                                    setBinaryField = new java.util.HashSet<>(_collection446.size);
                                    java.nio.ByteBuffer _elem447;
                                    for(int _i448=0;_i448 < _collection446.size; ++_i448 ) { 
                            _elem447 = iprot.readBinary();
                                        setBinaryField.add(_elem447);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetBinaryFieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -34:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection449 = iprot.readSetBegin();
                                    setAction = new java.util.HashSet<>(_collection449.size);
                                    Action _elem450;
                                    for(int _i451=0;_i451 < _collection449.size; ++_i451 ) { 
                _elem450 = com.test.thrift.Action.findByValue(iprot.readI32());
                if(_elem450 == null){
                   continue;
                }
                                        setAction.add(_elem450);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetActionIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -35:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection452 = iprot.readSetBegin();
                                    setListI64Field = new java.util.HashSet<>(_collection452.size);
                                    java.util.List<java.lang.Long> _elem453;
                                    for(int _i454=0;_i454 < _collection452.size; ++_i454 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection455 = iprot.readListBegin();
                        _elem453 = new java.util.ArrayList<>(_collection455.size);
                        long _elem456;
                        for(int _i457=0;_i457 < _collection455.size; ++ _i457 ) { 
                            _elem456 = iprot.readI64();
                            _elem453.add(_elem456);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                        setListI64Field.add(_elem453);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetListI64FieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -36:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection458 = iprot.readSetBegin();
                                    setListBoolField = new java.util.HashSet<>(_collection458.size);
                                    java.util.List<java.lang.Boolean> _elem459;
                                    for(int _i460=0;_i460 < _collection458.size; ++_i460 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection461 = iprot.readListBegin();
                        _elem459 = new java.util.ArrayList<>(_collection461.size);
                        boolean _elem462;
                        for(int _i463=0;_i463 < _collection461.size; ++ _i463 ) { 
                            _elem462 = iprot.readBool();
                            _elem459.add(_elem462);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                        setListBoolField.add(_elem459);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetListBoolFieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -37:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection464 = iprot.readSetBegin();
                                    setSetI32Field = new java.util.HashSet<>(_collection464.size);
                                    java.util.Set<java.lang.Integer> _elem465;
                                    for(int _i466=0;_i466 < _collection464.size; ++_i466 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection467 = iprot.readSetBegin();
                                    _elem465 = new java.util.HashSet<>(_collection467.size);
                                    int _elem468;
                                    for(int _i469=0;_i469 < _collection467.size; ++_i469 ) { 
                            _elem468 = iprot.readI32();
                                        _elem465.add(_elem468);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                                        setSetI32Field.add(_elem465);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetSetI32FieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -38:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection470 = iprot.readSetBegin();
                                    setMapBoolI64Field = new java.util.HashSet<>(_collection470.size);
                                    java.util.Map<java.lang.Boolean, java.lang.Long> _elem471;
                                    for(int _i472=0;_i472 < _collection470.size; ++_i472 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection473 = iprot.readMapBegin();
                                                _elem471 = new java.util.HashMap<>(_collection473.size);
                                                boolean _key_elem474;
                                                long _value_elem475;
                                                for(int _i476=0;_i476 < _collection473.size; ++ _i476 ) { 
                            _key_elem474 = iprot.readBool();
                            _value_elem475 = iprot.readI64();
                                                    _elem471.put(_key_elem474,_value_elem475);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                        setMapBoolI64Field.add(_elem471);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetMapBoolI64FieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -39:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection477 = iprot.readSetBegin();
                                    setMapI64I32Field = new java.util.HashSet<>(_collection477.size);
                                    java.util.Map<java.lang.Long, java.lang.Integer> _elem478;
                                    for(int _i479=0;_i479 < _collection477.size; ++_i479 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection480 = iprot.readMapBegin();
                                                _elem478 = new java.util.HashMap<>(_collection480.size);
                                                long _key_elem481;
                                                int _value_elem482;
                                                for(int _i483=0;_i483 < _collection480.size; ++ _i483 ) { 
                            _key_elem481 = iprot.readI64();
                            _value_elem482 = iprot.readI32();
                                                    _elem478.put(_key_elem481,_value_elem482);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                        setMapI64I32Field.add(_elem478);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetMapI64I32FieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -40:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection484 = iprot.readSetBegin();
                                    setComplexField = new java.util.HashSet<>(_collection484.size);
                                    java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _elem485;
                                    for(int _i486=0;_i486 < _collection484.size; ++_i486 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection487 = iprot.readMapBegin();
                                                _elem485 = new java.util.HashMap<>(_collection487.size);
                                                java.util.List<java.lang.Long> _key_elem488;
                                                java.util.Map<java.lang.Byte, java.lang.String> _value_elem489;
                                                for(int _i490=0;_i490 < _collection487.size; ++ _i490 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection491 = iprot.readListBegin();
                        _key_elem488 = new java.util.ArrayList<>(_collection491.size);
                        long _elem492;
                        for(int _i493=0;_i493 < _collection491.size; ++ _i493 ) { 
                            _elem492 = iprot.readI64();
                            _key_elem488.add(_elem492);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection494 = iprot.readMapBegin();
                                                _value_elem489 = new java.util.HashMap<>(_collection494.size);
                                                byte _key_elem495;
                                                java.lang.String _value_elem496;
                                                for(int _i497=0;_i497 < _collection494.size; ++ _i497 ) { 
                            _key_elem495 = iprot.readByte();
                            _value_elem496 = iprot.readString();
                                                    _value_elem489.put(_key_elem495,_value_elem496);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                                    _elem485.put(_key_elem488,_value_elem489);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                        setComplexField.add(_elem485);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetComplexFieldIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case 31:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection498 = iprot.readMapBegin();
                                                mapI32I32Field = new java.util.HashMap<>(_collection498.size);
                                                int _key_elem499;
                                                int _value_elem500;
                                                for(int _i501=0;_i501 < _collection498.size; ++ _i501 ) { 
                            _key_elem499 = iprot.readI32();
                            _value_elem500 = iprot.readI32();
                                                    mapI32I32Field.put(_key_elem499,_value_elem500);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapI32I32FieldIsSet(true); }
                                                
                                             else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -41:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection502 = iprot.readMapBegin();
                                                mapStringAction = new java.util.HashMap<>(_collection502.size);
                                                java.lang.String _key_elem503;
                                                Action _value_elem504;
                                                for(int _i505=0;_i505 < _collection502.size; ++ _i505 ) { 
                            _key_elem503 = iprot.readString();
                _value_elem504 = com.test.thrift.Action.findByValue(iprot.readI32());
                if(_value_elem504 == null){
                   continue;
                }
                                                    mapStringAction.put(_key_elem503,_value_elem504);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapStringActionIsSet(true); }
                                                
                                             else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -42:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection506 = iprot.readMapBegin();
                                                mapI64StringField = new java.util.HashMap<>(_collection506.size);
                                                long _key_elem507;
                                                java.lang.String _value_elem508;
                                                for(int _i509=0;_i509 < _collection506.size; ++ _i509 ) { 
                            _key_elem507 = iprot.readI64();
                            _value_elem508 = iprot.readString();
                                                    mapI64StringField.put(_key_elem507,_value_elem508);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapI64StringFieldIsSet(true); }
                                                
                                             else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -43:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection510 = iprot.readMapBegin();
                                                mapI64MapField = new java.util.HashMap<>(_collection510.size);
                                                long _key_elem511;
                                                java.util.Map<java.lang.String, java.nio.ByteBuffer> _value_elem512;
                                                for(int _i513=0;_i513 < _collection510.size; ++ _i513 ) { 
                            _key_elem511 = iprot.readI64();
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection514 = iprot.readMapBegin();
                                                _value_elem512 = new java.util.HashMap<>(_collection514.size);
                                                java.lang.String _key_elem515;
                                                java.nio.ByteBuffer _value_elem516;
                                                for(int _i517=0;_i517 < _collection514.size; ++ _i517 ) { 
                            _key_elem515 = iprot.readString();
                            _value_elem516 = iprot.readBinary();
                                                    _value_elem512.put(_key_elem515,_value_elem516);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                                    mapI64MapField.put(_key_elem511,_value_elem512);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapI64MapFieldIsSet(true); }
                                                
                                             else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -44:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection518 = iprot.readMapBegin();
                                                mapListListField = new java.util.HashMap<>(_collection518.size);
                                                java.util.List<java.nio.ByteBuffer> _key_elem519;
                                                java.util.List<java.lang.String> _value_elem520;
                                                for(int _i521=0;_i521 < _collection518.size; ++ _i521 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection522 = iprot.readListBegin();
                        _key_elem519 = new java.util.ArrayList<>(_collection522.size);
                        java.nio.ByteBuffer _elem523;
                        for(int _i524=0;_i524 < _collection522.size; ++ _i524 ) { 
                            _elem523 = iprot.readBinary();
                            _key_elem519.add(_elem523);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                
                    {
                        com.test.thrift.protocol.TList _collection525 = iprot.readListBegin();
                        _value_elem520 = new java.util.ArrayList<>(_collection525.size);
                        java.lang.String _elem526;
                        for(int _i527=0;_i527 < _collection525.size; ++ _i527 ) { 
                            _elem526 = iprot.readString();
                            _value_elem520.add(_elem526);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                                    mapListListField.put(_key_elem519,_value_elem520);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapListListFieldIsSet(true); }
                                                
                                             else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -45:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection528 = iprot.readMapBegin();
                                                mapComplexField = new java.util.HashMap<>(_collection528.size);
                                                java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> _key_elem529;
                                                java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> _value_elem530;
                                                for(int _i531=0;_i531 < _collection528.size; ++ _i531 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection532 = iprot.readMapBegin();
                                                _key_elem529 = new java.util.HashMap<>(_collection532.size);
                                                long _key_elem533;
                                                java.util.Set<java.util.Set<java.lang.Long>> _value_elem534;
                                                for(int _i535=0;_i535 < _collection532.size; ++ _i535 ) { 
                            _key_elem533 = iprot.readI64();
                            
                                {
                                    com.test.thrift.protocol.TSet _collection536 = iprot.readSetBegin();
                                    _value_elem534 = new java.util.HashSet<>(_collection536.size);
                                    java.util.Set<java.lang.Long> _elem537;
                                    for(int _i538=0;_i538 < _collection536.size; ++_i538 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection539 = iprot.readSetBegin();
                                    _elem537 = new java.util.HashSet<>(_collection539.size);
                                    long _elem540;
                                    for(int _i541=0;_i541 < _collection539.size; ++_i541 ) { 
                            _elem540 = iprot.readI64();
                                        _elem537.add(_elem540);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                                        _value_elem534.add(_elem537);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                                                    _key_elem529.put(_key_elem533,_value_elem534);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection542 = iprot.readMapBegin();
                                                _value_elem530 = new java.util.HashMap<>(_collection542.size);
                                                java.util.Set<java.lang.Long> _key_elem543;
                                                java.util.Map<java.lang.String, java.lang.Long> _value_elem544;
                                                for(int _i545=0;_i545 < _collection542.size; ++ _i545 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection546 = iprot.readSetBegin();
                                    _key_elem543 = new java.util.HashSet<>(_collection546.size);
                                    long _elem547;
                                    for(int _i548=0;_i548 < _collection546.size; ++_i548 ) { 
                            _elem547 = iprot.readI64();
                                        _key_elem543.add(_elem547);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection549 = iprot.readMapBegin();
                                                _value_elem544 = new java.util.HashMap<>(_collection549.size);
                                                java.lang.String _key_elem550;
                                                long _value_elem551;
                                                for(int _i552=0;_i552 < _collection549.size; ++ _i552 ) { 
                            _key_elem550 = iprot.readString();
                            _value_elem551 = iprot.readI64();
                                                    _value_elem544.put(_key_elem550,_value_elem551);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                                    _value_elem530.put(_key_elem543,_value_elem544);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                                    mapComplexField.put(_key_elem529,_value_elem530);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapComplexFieldIsSet(true); }
                                                
                                             else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -46:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                      this.sub = new SubStruct();
                      this.sub.read(iprot);
                      this.setSubIsSet(true);
                    } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -47:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                      this.subOptional = new SubStruct();
                      this.subOptional.read(iprot);
                      this.setSubOptionalIsSet(true);
                    } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -48:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                      this.subRequired = new SubStruct();
                      this.subRequired.read(iprot);
                      this.setSubRequiredIsSet(true);
                    } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -49:{
                    
                
                if (schemeField.type == org.apache.thrift.protocol.TType.LIST) { 
                    {
                        com.test.thrift.protocol.TList _collection553 = iprot.readListBegin();
                        listSubStruct = new java.util.ArrayList<>(_collection553.size);
                        SubStruct _elem554;
                        for(int _i555=0;_i555 < _collection553.size; ++ _i555 ) { 
                _elem554 = new SubStruct();
                _elem554.read(iprot);
                            listSubStruct.add(_elem554);
                        }
                        iprot.readListEnd();
                    }
                        
                            this.setListSubStructIsSet(true); }
                        
                     else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -50:{
                    
                            
                            if (schemeField.type == org.apache.thrift.protocol.TType.SET) { 
                                {
                                    com.test.thrift.protocol.TSet _collection556 = iprot.readSetBegin();
                                    setSubStruct = new java.util.HashSet<>(_collection556.size);
                                    SubStruct _elem557;
                                    for(int _i558=0;_i558 < _collection556.size; ++_i558 ) { 
                _elem557 = new SubStruct();
                _elem557.read(iprot);
                                        setSubStruct.add(_elem557);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                        this.setSetSubStructIsSet(true); }
                                    
                                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -51:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection559 = iprot.readMapBegin();
                                                mapSubStructSubStruct = new java.util.HashMap<>(_collection559.size);
                                                SubStruct _key_elem560;
                                                SubStruct _value_elem561;
                                                for(int _i562=0;_i562 < _collection559.size; ++ _i562 ) { 
                _key_elem560 = new SubStruct();
                _key_elem560.read(iprot);
                _value_elem561 = new SubStruct();
                _value_elem561.read(iprot);
                                                    mapSubStructSubStruct.put(_key_elem560,_value_elem561);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapSubStructSubStructIsSet(true); }
                                                
                                             else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -52:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection563 = iprot.readMapBegin();
                                                mapI32SubStruct = new java.util.HashMap<>(_collection563.size);
                                                int _key_elem564;
                                                SubStruct _value_elem565;
                                                for(int _i566=0;_i566 < _collection563.size; ++ _i566 ) { 
                            _key_elem564 = iprot.readI32();
                _value_elem565 = new SubStruct();
                _value_elem565.read(iprot);
                                                    mapI32SubStruct.put(_key_elem564,_value_elem565);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapI32SubStructIsSet(true); }
                                                
                                             else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -53:{
                    
                                        
                                        if (schemeField.type == org.apache.thrift.protocol.TType.MAP) { 
                                            {
                                                com.test.thrift.protocol.TMap _collection567 = iprot.readMapBegin();
                                                mapSubStructI64 = new java.util.HashMap<>(_collection567.size);
                                                SubStruct _key_elem568;
                                                long _value_elem569;
                                                for(int _i570=0;_i570 < _collection567.size; ++ _i570 ) { 
                _key_elem568 = new SubStruct();
                _key_elem568.read(iprot);
                            _value_elem569 = iprot.readI64();
                                                    mapSubStructI64.put(_key_elem568,_value_elem569);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapSubStructI64IsSet(true); }
                                                
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
        
            
                
                    if (mapSubStructI64 != null) {
                        oprot.writeFieldBegin("mapSubStructI64",org.apache.thrift.protocol.TType.MAP,(short)-53);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRUCT,org.apache.thrift.protocol.TType.I64, mapSubStructI64.size());
                            for (java.util.Map.Entry<SubStruct, java.lang.Long> _iter571 : mapSubStructI64.entrySet())
                            { 
                _iter571.getKey().write(oprot);
                                        oprot.writeI64(_iter571.getValue());
                    }
                   }
                 
                 }
                  }  
        
            
                
                    if (mapI32SubStruct != null) {
                        oprot.writeFieldBegin("mapI32SubStruct",org.apache.thrift.protocol.TType.MAP,(short)-52);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I32,org.apache.thrift.protocol.TType.STRUCT, mapI32SubStruct.size());
                            for (java.util.Map.Entry<java.lang.Integer, SubStruct> _iter572 : mapI32SubStruct.entrySet())
                            { 
                                        oprot.writeI32(_iter572.getKey());
                _iter572.getValue().write(oprot);
                    }
                   }
                 
                 }
                  }  
        
            
                
                    if (mapSubStructSubStruct != null) {
                        oprot.writeFieldBegin("mapSubStructSubStruct",org.apache.thrift.protocol.TType.MAP,(short)-51);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRUCT,org.apache.thrift.protocol.TType.STRUCT, mapSubStructSubStruct.size());
                            for (java.util.Map.Entry<SubStruct, SubStruct> _iter573 : mapSubStructSubStruct.entrySet())
                            { 
                _iter573.getKey().write(oprot);
                _iter573.getValue().write(oprot);
                    }
                   }
                 
                 }
                  }  
        
            
                
                if (setSubStruct != null) {
                    oprot.writeFieldBegin("setSubStruct",org.apache.thrift.protocol.TType.SET,(short)-50);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRUCT, setSubStruct.size());
                        for (SubStruct _iter574  : setSubStruct) { 
                _iter574.write(oprot);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (listSubStruct != null) {
                    oprot.writeFieldBegin("listSubStruct", org.apache.thrift.protocol.TType.LIST, (short)-49);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRUCT, listSubStruct.size());
                        for (SubStruct _iter575  : listSubStruct) { 
                _iter575.write(oprot);
                   }
                 
                 }
                  }  
        
            
     if (subRequired != null) { 
    
                          oprot.writeFieldBegin("subRequired", org.apache.thrift.protocol.TType.STRUCT, (short)-48);
                          subRequired.write(oprot); 
                      
     } 
        
            
     if (subOptional != null) { 
    
                          oprot.writeFieldBegin("subOptional", org.apache.thrift.protocol.TType.STRUCT, (short)-47);
                          subOptional.write(oprot); 
                      
     } 
        
            
     if (sub != null) { 
    
                          oprot.writeFieldBegin("sub", org.apache.thrift.protocol.TType.STRUCT, (short)-46);
                          sub.write(oprot); 
                      
     } 
        
            
                
                    if (mapComplexField != null) {
                        oprot.writeFieldBegin("mapComplexField",org.apache.thrift.protocol.TType.MAP,(short)-45);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.MAP,org.apache.thrift.protocol.TType.MAP, mapComplexField.size());
                            for (java.util.Map.Entry<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> _iter576 : mapComplexField.entrySet())
                            { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I64,org.apache.thrift.protocol.TType.SET, _iter576.getKey().size());
                            for (java.util.Map.Entry<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> _iter577 : _iter576.getKey().entrySet())
                            { 
                                        oprot.writeI64(_iter577.getKey());
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.SET, _iter577.getValue().size());
                        for (java.util.Set<java.lang.Long> _iter578  : _iter577.getValue()) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I64, _iter578.size());
                        for (long _iter579  : _iter578) { 
                            oprot.writeI64(_iter579);
                    }
                   }
                  
                    }
                   }
                  
                    }
                   }
                  
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.SET,org.apache.thrift.protocol.TType.MAP, _iter576.getValue().size());
                            for (java.util.Map.Entry<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> _iter580 : _iter576.getValue().entrySet())
                            { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I64, _iter580.getKey().size());
                        for (long _iter581  : _iter580.getKey()) { 
                            oprot.writeI64(_iter581);
                    }
                   }
                  
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRING,org.apache.thrift.protocol.TType.I64, _iter580.getValue().size());
                            for (java.util.Map.Entry<java.lang.String, java.lang.Long> _iter582 : _iter580.getValue().entrySet())
                            { 
                                        oprot.writeString(_iter582.getKey());
                                        oprot.writeI64(_iter582.getValue());
                    }
                   }
                  
                    }
                   }
                  
                    }
                   }
                 
                 }
                  }  
        
            
                
                    if (mapListListField != null) {
                        oprot.writeFieldBegin("mapListListField",org.apache.thrift.protocol.TType.MAP,(short)-44);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.LIST,org.apache.thrift.protocol.TType.LIST, mapListListField.size());
                            for (java.util.Map.Entry<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> _iter583 : mapListListField.entrySet())
                            { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, _iter583.getKey().size());
                        for (java.nio.ByteBuffer _iter584  : _iter583.getKey()) { 
                            oprot.writeBinary(_iter584);
                   }
                  
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, _iter583.getValue().size());
                        for (java.lang.String _iter585  : _iter583.getValue()) { 
                            oprot.writeString(_iter585);
                   }
                  
                    }
                   }
                 
                 }
                  }  
        
            
                
                    if (mapI64MapField != null) {
                        oprot.writeFieldBegin("mapI64MapField",org.apache.thrift.protocol.TType.MAP,(short)-43);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I64,org.apache.thrift.protocol.TType.MAP, mapI64MapField.size());
                            for (java.util.Map.Entry<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> _iter586 : mapI64MapField.entrySet())
                            { 
                                        oprot.writeI64(_iter586.getKey());
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRING,org.apache.thrift.protocol.TType.STRING, _iter586.getValue().size());
                            for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter587 : _iter586.getValue().entrySet())
                            { 
                                        oprot.writeString(_iter587.getKey());
                                        oprot.writeBinary(_iter587.getValue());
                    }
                   }
                  
                    }
                   }
                 
                 }
                  }  
        
            
                
                    if (mapI64StringField != null) {
                        oprot.writeFieldBegin("mapI64StringField",org.apache.thrift.protocol.TType.MAP,(short)-42);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I64,org.apache.thrift.protocol.TType.STRING, mapI64StringField.size());
                            for (java.util.Map.Entry<java.lang.Long, java.lang.String> _iter588 : mapI64StringField.entrySet())
                            { 
                                        oprot.writeI64(_iter588.getKey());
                                        oprot.writeString(_iter588.getValue());
                    }
                   }
                 
                 }
                  }  
        
            
                
                    if (mapStringAction != null) {
                        oprot.writeFieldBegin("mapStringAction",org.apache.thrift.protocol.TType.MAP,(short)-41);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRING,org.apache.thrift.protocol.TType.I32, mapStringAction.size());
                            for (java.util.Map.Entry<java.lang.String, Action> _iter589 : mapStringAction.entrySet())
                            { 
                                        oprot.writeString(_iter589.getKey());oprot.writeI32(_iter589.getValue().getValue());
                    }
                   }
                 
                 }
                  }  
        
            
                
                if (setComplexField != null) {
                    oprot.writeFieldBegin("setComplexField",org.apache.thrift.protocol.TType.SET,(short)-40);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.MAP, setComplexField.size());
                        for (java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _iter590  : setComplexField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.LIST,org.apache.thrift.protocol.TType.MAP, _iter590.size());
                            for (java.util.Map.Entry<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _iter591 : _iter590.entrySet())
                            { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I64, _iter591.getKey().size());
                        for (long _iter592  : _iter591.getKey()) { 
                            oprot.writeI64(_iter592);
                   }
                  
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.BYTE,org.apache.thrift.protocol.TType.STRING, _iter591.getValue().size());
                            for (java.util.Map.Entry<java.lang.Byte, java.lang.String> _iter593 : _iter591.getValue().entrySet())
                            { 
                                        oprot.writeByte(_iter593.getKey());
                                        oprot.writeString(_iter593.getValue());
                    }
                   }
                  
                    }
                   }
                  
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setMapI64I32Field != null) {
                    oprot.writeFieldBegin("setMapI64I32Field",org.apache.thrift.protocol.TType.SET,(short)-39);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.MAP, setMapI64I32Field.size());
                        for (java.util.Map<java.lang.Long, java.lang.Integer> _iter594  : setMapI64I32Field) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I64,org.apache.thrift.protocol.TType.I32, _iter594.size());
                            for (java.util.Map.Entry<java.lang.Long, java.lang.Integer> _iter595 : _iter594.entrySet())
                            { 
                                        oprot.writeI64(_iter595.getKey());
                                        oprot.writeI32(_iter595.getValue());
                    }
                   }
                  
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setMapBoolI64Field != null) {
                    oprot.writeFieldBegin("setMapBoolI64Field",org.apache.thrift.protocol.TType.SET,(short)-38);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.MAP, setMapBoolI64Field.size());
                        for (java.util.Map<java.lang.Boolean, java.lang.Long> _iter596  : setMapBoolI64Field) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.BOOL,org.apache.thrift.protocol.TType.I64, _iter596.size());
                            for (java.util.Map.Entry<java.lang.Boolean, java.lang.Long> _iter597 : _iter596.entrySet())
                            { 
                                        oprot.writeBool(_iter597.getKey());
                                        oprot.writeI64(_iter597.getValue());
                    }
                   }
                  
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setSetI32Field != null) {
                    oprot.writeFieldBegin("setSetI32Field",org.apache.thrift.protocol.TType.SET,(short)-37);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.SET, setSetI32Field.size());
                        for (java.util.Set<java.lang.Integer> _iter598  : setSetI32Field) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I32, _iter598.size());
                        for (int _iter599  : _iter598) { 
                            oprot.writeI32(_iter599);
                    }
                   }
                  
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setListBoolField != null) {
                    oprot.writeFieldBegin("setListBoolField",org.apache.thrift.protocol.TType.SET,(short)-36);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.LIST, setListBoolField.size());
                        for (java.util.List<java.lang.Boolean> _iter600  : setListBoolField) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BOOL, _iter600.size());
                        for (boolean _iter601  : _iter600) { 
                            oprot.writeBool(_iter601);
                   }
                  
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setListI64Field != null) {
                    oprot.writeFieldBegin("setListI64Field",org.apache.thrift.protocol.TType.SET,(short)-35);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.LIST, setListI64Field.size());
                        for (java.util.List<java.lang.Long> _iter602  : setListI64Field) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I64, _iter602.size());
                        for (long _iter603  : _iter602) { 
                            oprot.writeI64(_iter603);
                   }
                  
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setAction != null) {
                    oprot.writeFieldBegin("setAction",org.apache.thrift.protocol.TType.SET,(short)-34);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I32, setAction.size());
                        for (Action _iter604  : setAction) { oprot.writeI32(_iter604.getValue());
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setBinaryField != null) {
                    oprot.writeFieldBegin("setBinaryField",org.apache.thrift.protocol.TType.SET,(short)-33);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, setBinaryField.size());
                        for (java.nio.ByteBuffer _iter605  : setBinaryField) { 
                            oprot.writeBinary(_iter605);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (listComplexField != null) {
                    oprot.writeFieldBegin("listComplexField", org.apache.thrift.protocol.TType.LIST, (short)-32);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.MAP, listComplexField.size());
                        for (java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _iter606  : listComplexField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I32,org.apache.thrift.protocol.TType.LIST, _iter606.size());
                            for (java.util.Map.Entry<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _iter607 : _iter606.entrySet())
                            { 
                                        oprot.writeI32(_iter607.getKey());
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.SET, _iter607.getValue().size());
                        for (java.util.Set<java.lang.Integer> _iter608  : _iter607.getValue()) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I32, _iter608.size());
                        for (int _iter609  : _iter608) { 
                            oprot.writeI32(_iter609);
                    }
                   }
                  
                   }
                  
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listMapBinaryField != null) {
                    oprot.writeFieldBegin("listMapBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-31);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.MAP, listMapBinaryField.size());
                        for (java.util.Map<java.lang.String, java.nio.ByteBuffer> _iter610  : listMapBinaryField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRING,org.apache.thrift.protocol.TType.STRING, _iter610.size());
                            for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter611 : _iter610.entrySet())
                            { 
                                        oprot.writeString(_iter611.getKey());
                                        oprot.writeBinary(_iter611.getValue());
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listMapByteBinaryField != null) {
                    oprot.writeFieldBegin("listMapByteBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-30);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.MAP, listMapByteBinaryField.size());
                        for (java.util.Map<java.lang.Byte, java.nio.ByteBuffer> _iter612  : listMapByteBinaryField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.BYTE,org.apache.thrift.protocol.TType.STRING, _iter612.size());
                            for (java.util.Map.Entry<java.lang.Byte, java.nio.ByteBuffer> _iter613 : _iter612.entrySet())
                            { 
                                        oprot.writeByte(_iter613.getKey());
                                        oprot.writeBinary(_iter613.getValue());
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listMapI8StringField != null) {
                    oprot.writeFieldBegin("listMapI8StringField", org.apache.thrift.protocol.TType.LIST, (short)-29);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.MAP, listMapI8StringField.size());
                        for (java.util.Map<java.lang.Byte, java.lang.String> _iter614  : listMapI8StringField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.BYTE,org.apache.thrift.protocol.TType.STRING, _iter614.size());
                            for (java.util.Map.Entry<java.lang.Byte, java.lang.String> _iter615 : _iter614.entrySet())
                            { 
                                        oprot.writeByte(_iter615.getKey());
                                        oprot.writeString(_iter615.getValue());
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listSetBinaryField != null) {
                    oprot.writeFieldBegin("listSetBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-28);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.SET, listSetBinaryField.size());
                        for (java.util.Set<java.nio.ByteBuffer> _iter616  : listSetBinaryField) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, _iter616.size());
                        for (java.nio.ByteBuffer _iter617  : _iter616) { 
                            oprot.writeBinary(_iter617);
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listSetStringField != null) {
                    oprot.writeFieldBegin("listSetStringField", org.apache.thrift.protocol.TType.LIST, (short)-27);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.SET, listSetStringField.size());
                        for (java.util.Set<java.lang.String> _iter618  : listSetStringField) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, _iter618.size());
                        for (java.lang.String _iter619  : _iter618) { 
                            oprot.writeString(_iter619);
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listSetI32Field != null) {
                    oprot.writeFieldBegin("listSetI32Field", org.apache.thrift.protocol.TType.LIST, (short)-26);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.SET, listSetI32Field.size());
                        for (java.util.Set<java.lang.Integer> _iter620  : listSetI32Field) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I32, _iter620.size());
                        for (int _iter621  : _iter620) { 
                            oprot.writeI32(_iter621);
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listListListI32Field != null) {
                    oprot.writeFieldBegin("listListListI32Field", org.apache.thrift.protocol.TType.LIST, (short)-25);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, listListListI32Field.size());
                        for (java.util.List<java.util.List<java.lang.Integer>> _iter622  : listListListI32Field) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, _iter622.size());
                        for (java.util.List<java.lang.Integer> _iter623  : _iter622) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, _iter623.size());
                        for (int _iter624  : _iter623) { 
                            oprot.writeI32(_iter624);
                   }
                  
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listListI32Field != null) {
                    oprot.writeFieldBegin("listListI32Field", org.apache.thrift.protocol.TType.LIST, (short)-24);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, listListI32Field.size());
                        for (java.util.List<java.lang.Integer> _iter625  : listListI32Field) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, _iter625.size());
                        for (int _iter626  : _iter625) { 
                            oprot.writeI32(_iter626);
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listAction != null) {
                    oprot.writeFieldBegin("listAction", org.apache.thrift.protocol.TType.LIST, (short)-23);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, listAction.size());
                        for (Action _iter627  : listAction) { oprot.writeI32(_iter627.getValue());
                   }
                 
                 }
                  }  
        
            
                
                if (listListBinaryField != null) {
                    oprot.writeFieldBegin("listListBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-22);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, listListBinaryField.size());
                        for (java.util.List<java.nio.ByteBuffer> _iter628  : listListBinaryField) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, _iter628.size());
                        for (java.nio.ByteBuffer _iter629  : _iter628) { 
                            oprot.writeBinary(_iter629);
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listBinaryField != null) {
                    oprot.writeFieldBegin("listBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-21);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, listBinaryField.size());
                        for (java.nio.ByteBuffer _iter630  : listBinaryField) { 
                            oprot.writeBinary(_iter630);
                   }
                 
                 }
                  }  
        
            
                
                if (listByteField != null) {
                    oprot.writeFieldBegin("listByteField", org.apache.thrift.protocol.TType.LIST, (short)-20);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BYTE, listByteField.size());
                        for (byte _iter631  : listByteField) { 
                            oprot.writeByte(_iter631);
                   }
                 
                 }
                  }  
        
            
                
                if (listBoolField != null) {
                    oprot.writeFieldBegin("listBoolField", org.apache.thrift.protocol.TType.LIST, (short)-19);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BOOL, listBoolField.size());
                        for (boolean _iter632  : listBoolField) { 
                            oprot.writeBool(_iter632);
                   }
                 
                 }
                  }  
        
            
                
                if (listStringField != null) {
                    oprot.writeFieldBegin("listStringField", org.apache.thrift.protocol.TType.LIST, (short)-18);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, listStringField.size());
                        for (java.lang.String _iter633  : listStringField) { 
                            oprot.writeString(_iter633);
                   }
                 
                 }
                  }  
        
            
                if (listDoubleField != null) {
                    oprot.writeFieldBegin("listDoubleField", org.apache.thrift.protocol.TType.LIST, (short)-17);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.DOUBLE, listDoubleField.size());
                    for (int i = 0; i <  listDoubleField.size(); i++) { 
                        oprot.writeDouble(listDoubleField.get(i));
                    }
                 }
                
        
            
                if (listI64Field != null) {
                    oprot.writeFieldBegin("listI64Field", org.apache.thrift.protocol.TType.LIST, (short)-16);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I64, listI64Field.size());
                    for (int i = 0; i <  listI64Field.size(); i++) { 
                        oprot.writeI64(listI64Field.get(i));
                    }
                 }
                
        
            
                if (listI32FieldRequired != null) {
                    oprot.writeFieldBegin("listI32FieldRequired", org.apache.thrift.protocol.TType.LIST, (short)-15);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, listI32FieldRequired.size());
                    for (int i = 0; i <  listI32FieldRequired.size(); i++) { 
                        oprot.writeI32(listI32FieldRequired.get(i));
                    }
                 }
                
        
            
                if (listI32FieldOptional != null) {
                    oprot.writeFieldBegin("listI32FieldOptional", org.apache.thrift.protocol.TType.LIST, (short)-14);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, listI32FieldOptional.size());
                    for (int i = 0; i <  listI32FieldOptional.size(); i++) { 
                        oprot.writeI32(listI32FieldOptional.get(i));
                    }
                 }
                
        
            
     if (actionRequired != null) { 
    
                          oprot.writeFieldBegin("actionRequired", org.apache.thrift.protocol.TType.I32, (short)-13);
                           oprot.writeI32(actionRequired.getValue()); 
                      
     } 
        
            
     if (actionOptional != null) { 
    
                          oprot.writeFieldBegin("actionOptional", org.apache.thrift.protocol.TType.I32, (short)-12);
                           oprot.writeI32(actionOptional.getValue()); 
                      
     } 
        
            
     if (action != null) { 
    
                          oprot.writeFieldBegin("action", org.apache.thrift.protocol.TType.I32, (short)-11);
                           oprot.writeI32(action.getValue()); 
                      
     } 
        
            
    
    
                          oprot.writeFieldBegin("byteField", org.apache.thrift.protocol.TType.BYTE, (short)-10);
                           oprot.writeByte(byteField); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("boolFieldRequired", org.apache.thrift.protocol.TType.BOOL, (short)-9);
                           oprot.writeBool(boolFieldRequired); 
                      
    
        
            
    
     if(isSetBoolFieldOptional()){ 
                          oprot.writeFieldBegin("boolFieldOptional", org.apache.thrift.protocol.TType.BOOL, (short)-8);
                           oprot.writeBool(boolFieldOptional); 
                        } 
    
        
            
     if (binaryFieldRequired != null) { 
    
                          oprot.writeFieldBegin("binaryFieldRequired", org.apache.thrift.protocol.TType.STRING, (short)-7);
                           oprot.writeBinary(binaryFieldRequired); 
                      
     } 
        
            
     if (binaryFieldOptional != null) { 
    
                          oprot.writeFieldBegin("binaryFieldOptional", org.apache.thrift.protocol.TType.STRING, (short)-6);
                           oprot.writeBinary(binaryFieldOptional); 
                      
     } 
        
            
     if (binaryField != null) { 
    
                          oprot.writeFieldBegin("binaryField", org.apache.thrift.protocol.TType.STRING, (short)-5);
                           oprot.writeBinary(binaryField); 
                      
     } 
        
            
     if (stringFieldRequired != null) { 
    
                          oprot.writeFieldBegin("stringFieldRequired", org.apache.thrift.protocol.TType.STRING, (short)-4);
                           oprot.writeString(stringFieldRequired); 
                      
     } 
        
            
     if (stringFieldOptional != null) { 
    
                          oprot.writeFieldBegin("stringFieldOptional", org.apache.thrift.protocol.TType.STRING, (short)-3);
                           oprot.writeString(stringFieldOptional); 
                      
     } 
        
            
    
    
                          oprot.writeFieldBegin("i32FieldRequired", org.apache.thrift.protocol.TType.I32, (short)-2);
                           oprot.writeI32(i32FieldRequired); 
                      
    
        
            
    
     if(isSetI32FieldOptional()){ 
                          oprot.writeFieldBegin("i32FieldOptional", org.apache.thrift.protocol.TType.I32, (short)-1);
                           oprot.writeI32(i32FieldOptional); 
                        } 
    
        
            
    
    
                          oprot.writeFieldBegin("i32Field", org.apache.thrift.protocol.TType.I32, (short)1);
                           oprot.writeI32(i32Field); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("boolField", org.apache.thrift.protocol.TType.BOOL, (short)2);
                           oprot.writeBool(boolField); 
                      
    
        
            
     if (stringField != null) { 
    
                          oprot.writeFieldBegin("stringField", org.apache.thrift.protocol.TType.STRING, (short)3);
                           oprot.writeString(stringField); 
                      
     } 
        
            
    
    
                          oprot.writeFieldBegin("i16Field", org.apache.thrift.protocol.TType.I16, (short)4);
                           oprot.writeI16(i16Field); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("i8field", org.apache.thrift.protocol.TType.BYTE, (short)5);
                           oprot.writeByte(i8field); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("i64Field", org.apache.thrift.protocol.TType.I64, (short)6);
                           oprot.writeI64(i64Field); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("doubleField", org.apache.thrift.protocol.TType.DOUBLE, (short)7);
                           oprot.writeDouble(doubleField); 
                      
    
        
            
                if (listI32Field != null) {
                    oprot.writeFieldBegin("listI32Field", org.apache.thrift.protocol.TType.LIST, (short)10);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, listI32Field.size());
                    for (int i = 0; i <  listI32Field.size(); i++) { 
                        oprot.writeI32(listI32Field.get(i));
                    }
                 }
                
        
            
                
                if (listI8Field != null) {
                    oprot.writeFieldBegin("listI8Field", org.apache.thrift.protocol.TType.LIST, (short)11);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BYTE, listI8Field.size());
                        for (byte _iter634  : listI8Field) { 
                            oprot.writeByte(_iter634);
                   }
                 
                 }
                  }  
        
            
                
                if (setBoolField != null) {
                    oprot.writeFieldBegin("setBoolField",org.apache.thrift.protocol.TType.SET,(short)20);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.BOOL, setBoolField.size());
                        for (boolean _iter635  : setBoolField) { 
                            oprot.writeBool(_iter635);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setStringField != null) {
                    oprot.writeFieldBegin("setStringField",org.apache.thrift.protocol.TType.SET,(short)21);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, setStringField.size());
                        for (java.lang.String _iter636  : setStringField) { 
                            oprot.writeString(_iter636);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setByteField != null) {
                    oprot.writeFieldBegin("setByteField",org.apache.thrift.protocol.TType.SET,(short)22);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.BYTE, setByteField.size());
                        for (byte _iter637  : setByteField) { 
                            oprot.writeByte(_iter637);
                    }
                   }
                  
                 }
                  }  
        
            
                
                    if (mapI32I32Field != null) {
                        oprot.writeFieldBegin("mapI32I32Field",org.apache.thrift.protocol.TType.MAP,(short)31);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I32,org.apache.thrift.protocol.TType.I32, mapI32I32Field.size());
                            for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> _iter638 : mapI32I32Field.entrySet())
                            { 
                                        oprot.writeI32(_iter638.getKey());
                                        oprot.writeI32(_iter638.getValue());
                    }
                   }
                 
                 }
                  }  
        

        oprot.writeFieldStop();
    }



}