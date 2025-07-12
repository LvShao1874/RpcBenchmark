
package com.test.thrift;

public  class SubStruct implements com.test.thrift.IBase {

    
    
    
    public int i32Field; 
    
    
    public int i32FieldOptional; // optional
    
    
    public int i32FieldRequired; // required
    
    
    public java.lang.String stringField; 
    
    
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
    
    
    public double doubleField; 
    
    
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

        public SubStruct setI32Field(java.lang.Integer i32Field) {
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

        public SubStruct setI32FieldOptional(java.lang.Integer i32FieldOptional) {
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

        public SubStruct setI32FieldRequired(java.lang.Integer i32FieldRequired) {
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

        public SubStruct setStringField(java.lang.String stringField) {
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

        public SubStruct setStringFieldOptional(java.lang.String stringFieldOptional) {
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

        public SubStruct setStringFieldRequired(java.lang.String stringFieldRequired) {
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

        public SubStruct setBinaryField(byte[] binaryField) {
            this.binaryField = binaryField == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryField.clone());
            return this;
        }

        public SubStruct setBinaryField(java.nio.ByteBuffer binaryField) {
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

        public SubStruct setBinaryFieldOptional(byte[] binaryFieldOptional) {
            this.binaryFieldOptional = binaryFieldOptional == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryFieldOptional.clone());
            return this;
        }

        public SubStruct setBinaryFieldOptional(java.nio.ByteBuffer binaryFieldOptional) {
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

        public SubStruct setBinaryFieldRequired(byte[] binaryFieldRequired) {
            this.binaryFieldRequired = binaryFieldRequired == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryFieldRequired.clone());
            return this;
        }

        public SubStruct setBinaryFieldRequired(java.nio.ByteBuffer binaryFieldRequired) {
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

        public SubStruct setBoolField(java.lang.Boolean boolField) {
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

        public SubStruct setBoolFieldOptional(java.lang.Boolean boolFieldOptional) {
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

        public SubStruct setBoolFieldRequired(java.lang.Boolean boolFieldRequired) {
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

        public SubStruct setI8field(java.lang.Byte i8field) {
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

        public SubStruct setI16Field(java.lang.Short i16Field) {
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

        public SubStruct setI64Field(java.lang.Long i64Field) {
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

        public SubStruct setDoubleField(java.lang.Double doubleField) {
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

        public SubStruct setByteField(java.lang.Byte byteField) {
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

        public SubStruct setAction(Action action) {
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

        public SubStruct setActionOptional(Action actionOptional) {
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

        public SubStruct setActionRequired(Action actionRequired) {
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

        public SubStruct setListI32Field(com.test.thrift.protocol.TListI32 listI32Field) {
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

        public SubStruct setListI32FieldOptional(com.test.thrift.protocol.TListI32 listI32FieldOptional) {
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

        public SubStruct setListI32FieldRequired(com.test.thrift.protocol.TListI32 listI32FieldRequired) {
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

        public SubStruct setListI8Field(java.util.List<java.lang.Byte> listI8Field) {
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

        public SubStruct setListI64Field(com.test.thrift.protocol.TListI64 listI64Field) {
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

        public SubStruct setListDoubleField(com.test.thrift.protocol.TListDouble listDoubleField) {
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

        public SubStruct setListStringField(java.util.List<java.lang.String> listStringField) {
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

        public SubStruct setListBoolField(java.util.List<java.lang.Boolean> listBoolField) {
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

        public SubStruct setListByteField(java.util.List<java.lang.Byte> listByteField) {
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

        public SubStruct setListBinaryField(java.util.List<java.nio.ByteBuffer> listBinaryField) {
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

        public SubStruct setListListBinaryField(java.util.List<java.util.List<java.nio.ByteBuffer>> listListBinaryField) {
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

        public SubStruct setListAction(java.util.List<Action> listAction) {
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

        public SubStruct setListListI32Field(java.util.List<java.util.List<java.lang.Integer>> listListI32Field) {
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

        public SubStruct setListListListI32Field(java.util.List<java.util.List<java.util.List<java.lang.Integer>>> listListListI32Field) {
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

        public SubStruct setListSetI32Field(java.util.List<java.util.Set<java.lang.Integer>> listSetI32Field) {
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

        public SubStruct setListSetStringField(java.util.List<java.util.Set<java.lang.String>> listSetStringField) {
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

        public SubStruct setListSetBinaryField(java.util.List<java.util.Set<java.nio.ByteBuffer>> listSetBinaryField) {
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

        public SubStruct setListMapI8StringField(java.util.List<java.util.Map<java.lang.Byte, java.lang.String>> listMapI8StringField) {
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

        public SubStruct setListMapByteBinaryField(java.util.List<java.util.Map<java.lang.Byte, java.nio.ByteBuffer>> listMapByteBinaryField) {
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

        public SubStruct setListMapBinaryField(java.util.List<java.util.Map<java.lang.String, java.nio.ByteBuffer>> listMapBinaryField) {
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

        public SubStruct setListComplexField(java.util.List<java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>>> listComplexField) {
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

        public SubStruct setSetBoolField(java.util.Set<java.lang.Boolean> setBoolField) {
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

        public SubStruct setSetStringField(java.util.Set<java.lang.String> setStringField) {
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

        public SubStruct setSetByteField(java.util.Set<java.lang.Byte> setByteField) {
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

        public SubStruct setSetBinaryField(java.util.Set<java.nio.ByteBuffer> setBinaryField) {
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

        public SubStruct setSetAction(java.util.Set<Action> setAction) {
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

        public SubStruct setSetListI64Field(java.util.Set<java.util.List<java.lang.Long>> setListI64Field) {
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

        public SubStruct setSetListBoolField(java.util.Set<java.util.List<java.lang.Boolean>> setListBoolField) {
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

        public SubStruct setSetSetI32Field(java.util.Set<java.util.Set<java.lang.Integer>> setSetI32Field) {
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

        public SubStruct setSetMapBoolI64Field(java.util.Set<java.util.Map<java.lang.Boolean, java.lang.Long>> setMapBoolI64Field) {
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

        public SubStruct setSetMapI64I32Field(java.util.Set<java.util.Map<java.lang.Long, java.lang.Integer>> setMapI64I32Field) {
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

        public SubStruct setSetComplexField(java.util.Set<java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>>> setComplexField) {
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

        public SubStruct setMapI32I32Field(java.util.Map<java.lang.Integer, java.lang.Integer> mapI32I32Field) {
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

        public SubStruct setMapStringAction(java.util.Map<java.lang.String, Action> mapStringAction) {
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

        public SubStruct setMapI64StringField(java.util.Map<java.lang.Long, java.lang.String> mapI64StringField) {
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

        public SubStruct setMapI64MapField(java.util.Map<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> mapI64MapField) {
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

        public SubStruct setMapListListField(java.util.Map<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> mapListListField) {
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

        public SubStruct setMapComplexField(java.util.Map<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> mapComplexField) {
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
    


    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
          return false;
        if (that instanceof SubStruct)
          return this.equals((SubStruct)that);
        return false;
    }

    public boolean equals(SubStruct that) {
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
            
        
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubStruct(");
        
            
            
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
                    
            

        
            
            
                    sb.append("stringField:");
                    if (this.stringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.stringField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
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
            
        
        return hashCode;
    }

    public void clear() {
        
            
                
                    setI32FieldIsSet(false);
                    
                        this.i32Field = 0;
                    
                
            
        
            
                
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
                    
                
            
        
            
                
                    setDoubleFieldIsSet(false);
                    
                        this.doubleField = 0.0;
                    
                
            
        
            
                
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
            
        
    }

    public void validate() throws com.test.thrift.TException {
        
            
        
            
        
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(stringFieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'stringFieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(binaryFieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'binaryFieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(actionRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'actionRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(listI32FieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'listI32FieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        
            
                 
            
        

        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
    }

    public int size() {
        int size = 1; // writeFieldStop() need 1 byte;
        
            // mapComplexField
            
                            
                                if (mapComplexField != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> _iter285 : mapComplexField.entrySet())
                                        { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> _iter286 : _iter285.getKey().entrySet())
                                        { size += 8;
                    
                        size += 5;
                        for (java.util.Set<java.lang.Long> _iter287  : _iter286.getValue()) { 
                                        
                                        size += 5;
                                        
                                            size += (8) * _iter287.size();
                                        
                                    
                                    
                                    
                                            }
                    
                               }
                              
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> _iter288 : _iter285.getValue().entrySet())
                                        { 
                                        
                                        size += 5;
                                        
                                            size += (8) * _iter288.getKey().size();
                                        
                                    
                                    
                                    
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.String, java.lang.Long> _iter289 : _iter288.getValue().entrySet())
                                        { size += 4 +  3 * _iter289.getKey().length();size += 8;
                               }
                              
                               }
                              
                               }
                             
                             }
                              }  
        
            // mapListListField
            
                            
                                if (mapListListField != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> _iter290 : mapListListField.entrySet())
                                        { 
                    
                        size += 5;
                        for (java.nio.ByteBuffer _iter291  : _iter290.getKey()) { size += 4 + _iter291.limit() - _iter291.position();
                                            }
                    
                    
                        size += 5;
                        for (java.lang.String _iter292  : _iter290.getValue()) { size += 4 +  3 * _iter292.length();
                                            }
                    
                               }
                             
                             }
                              }  
        
            // mapI64MapField
            
                            
                                if (mapI64MapField != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> _iter293 : mapI64MapField.entrySet())
                                        { size += 8;
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter294 : _iter293.getValue().entrySet())
                                        { size += 4 +  3 * _iter294.getKey().length();size += 4 + _iter294.getValue().limit() - _iter294.getValue().position();
                               }
                              
                               }
                             
                             }
                              }  
        
            // mapI64StringField
            
                            
                                if (mapI64StringField != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.Long, java.lang.String> _iter295 : mapI64StringField.entrySet())
                                        { size += 8;size += 4 +  3 * _iter295.getValue().length();
                               }
                             
                             }
                              }  
        
            // mapStringAction
            
                            
                                if (mapStringAction != null) {
                            { 
                                        size += 9;
                                        for (java.util.Map.Entry<java.lang.String, Action> _iter296 : mapStringAction.entrySet())
                                        { size += 4 +  3 * _iter296.getKey().length();size += 4;
                               }
                             
                             }
                              }  
        
            // setComplexField
            
                    
                    if (setComplexField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _iter297  : setComplexField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _iter298 : _iter297.entrySet())
                                        { 
                                        
                                        size += 5;
                                        
                                            size += (8) * _iter298.getKey().size();
                                        
                                    
                                    
                                    
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Byte, java.lang.String> _iter299 : _iter298.getValue().entrySet())
                                        { size += 1;size += 4 +  3 * _iter299.getValue().length();
                               }
                              
                               }
                              
                                            }
                    
                  } 
        
            // setMapI64I32Field
            
                    
                    if (setMapI64I32Field != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Long, java.lang.Integer> _iter300  : setMapI64I32Field) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Long, java.lang.Integer> _iter301 : _iter300.entrySet())
                                        { size += 8;size += 4;
                               }
                              
                                            }
                    
                  } 
        
            // setMapBoolI64Field
            
                    
                    if (setMapBoolI64Field != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Boolean, java.lang.Long> _iter302  : setMapBoolI64Field) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Boolean, java.lang.Long> _iter303 : _iter302.entrySet())
                                        { size += 1;size += 8;
                               }
                              
                                            }
                    
                  } 
        
            // setSetI32Field
            
                    
                    if (setSetI32Field != null) {
                    
                        size += 8;
                        for (java.util.Set<java.lang.Integer> _iter304  : setSetI32Field) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter304.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // setListBoolField
            
                    
                    if (setListBoolField != null) {
                    
                        size += 8;
                        for (java.util.List<java.lang.Boolean> _iter305  : setListBoolField) { 
                                        
                                        size += 5;
                                        
                                            size += _iter305.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // setListI64Field
            
                    
                    if (setListI64Field != null) {
                    
                        size += 8;
                        for (java.util.List<java.lang.Long> _iter306  : setListI64Field) { 
                                        
                                        size += 5;
                                        
                                            size += (8) * _iter306.size();
                                        
                                    
                                    
                                    
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
                        for (java.nio.ByteBuffer _iter307  : setBinaryField) { size += 4 + _iter307.limit() - _iter307.position();
                                            }
                    
                  } 
        
            // listComplexField
            
                    
                    if (listComplexField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _iter308  : listComplexField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _iter309 : _iter308.entrySet())
                                        { size += 4;
                    
                        size += 5;
                        for (java.util.Set<java.lang.Integer> _iter310  : _iter309.getValue()) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter310.size();
                                        
                                    
                                    
                                    
                                            }
                    
                               }
                              
                                            }
                    
                  } 
        
            // listMapBinaryField
            
                    
                    if (listMapBinaryField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.String, java.nio.ByteBuffer> _iter311  : listMapBinaryField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter312 : _iter311.entrySet())
                                        { size += 4 +  3 * _iter312.getKey().length();size += 4 + _iter312.getValue().limit() - _iter312.getValue().position();
                               }
                              
                                            }
                    
                  } 
        
            // listMapByteBinaryField
            
                    
                    if (listMapByteBinaryField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Byte, java.nio.ByteBuffer> _iter313  : listMapByteBinaryField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Byte, java.nio.ByteBuffer> _iter314 : _iter313.entrySet())
                                        { size += 1;size += 4 + _iter314.getValue().limit() - _iter314.getValue().position();
                               }
                              
                                            }
                    
                  } 
        
            // listMapI8StringField
            
                    
                    if (listMapI8StringField != null) {
                    
                        size += 8;
                        for (java.util.Map<java.lang.Byte, java.lang.String> _iter315  : listMapI8StringField) { 
                            
                                        size += 6;
                                        for (java.util.Map.Entry<java.lang.Byte, java.lang.String> _iter316 : _iter315.entrySet())
                                        { size += 1;size += 4 +  3 * _iter316.getValue().length();
                               }
                              
                                            }
                    
                  } 
        
            // listSetBinaryField
            
                    
                    if (listSetBinaryField != null) {
                    
                        size += 8;
                        for (java.util.Set<java.nio.ByteBuffer> _iter317  : listSetBinaryField) { 
                    
                        size += 5;
                        for (java.nio.ByteBuffer _iter318  : _iter317) { size += 4 + _iter318.limit() - _iter318.position();
                                            }
                    
                                            }
                    
                  } 
        
            // listSetStringField
            
                    
                    if (listSetStringField != null) {
                    
                        size += 8;
                        for (java.util.Set<java.lang.String> _iter319  : listSetStringField) { 
                    
                        size += 5;
                        for (java.lang.String _iter320  : _iter319) { size += 4 +  3 * _iter320.length();
                                            }
                    
                                            }
                    
                  } 
        
            // listSetI32Field
            
                    
                    if (listSetI32Field != null) {
                    
                        size += 8;
                        for (java.util.Set<java.lang.Integer> _iter321  : listSetI32Field) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter321.size();
                                        
                                    
                                    
                                    
                                            }
                    
                  } 
        
            // listListListI32Field
            
                    
                    if (listListListI32Field != null) {
                    
                        size += 8;
                        for (java.util.List<java.util.List<java.lang.Integer>> _iter322  : listListListI32Field) { 
                    
                        size += 5;
                        for (java.util.List<java.lang.Integer> _iter323  : _iter322) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter323.size();
                                        
                                    
                                    
                                    
                                            }
                    
                                            }
                    
                  } 
        
            // listListI32Field
            
                    
                    if (listListI32Field != null) {
                    
                        size += 8;
                        for (java.util.List<java.lang.Integer> _iter324  : listListI32Field) { 
                                        
                                        size += 5;
                                        
                                            size += (4) * _iter324.size();
                                        
                                    
                                    
                                    
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
                        for (java.util.List<java.nio.ByteBuffer> _iter325  : listListBinaryField) { 
                    
                        size += 5;
                        for (java.nio.ByteBuffer _iter326  : _iter325) { size += 4 + _iter326.limit() - _iter326.position();
                                            }
                    
                                            }
                    
                  } 
        
            // listBinaryField
            
                    
                    if (listBinaryField != null) {
                    
                        size += 8;
                        for (java.nio.ByteBuffer _iter327  : listBinaryField) { size += 4 + _iter327.limit() - _iter327.position();
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
                        for (java.lang.String _iter328  : listStringField) { size += 4 +  3 * _iter328.length();
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
                        for (java.lang.String _iter329  : setStringField) { size += 4 +  3 * _iter329.length();
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
                                        for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> _iter330 : mapI32I32Field.entrySet())
                                        { size += 4;size += 4;
                               }
                             
                             }
                              }  
        
        return size;
    }

    public SubStruct() {
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
}


    public SubStruct(
    
        int i32Field,
        int i32FieldRequired,
        java.lang.String stringField,
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
        java.util.Map<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> mapComplexField
    ) {
        this();
        
            this.i32Field = i32Field;
            
                setI32FieldIsSet(true);
            
        
            this.i32FieldRequired = i32FieldRequired;
            
                setI32FieldRequiredIsSet(true);
            
        
            this.stringField = stringField;
            
        
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
            
        
    }


/**
* Performs a deep copy on <i>other</i>.
*/
public SubStruct(SubStruct other) {
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
    
                
    
}

public SubStruct deepCopy() {
    return new SubStruct(this);
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
                        com.test.thrift.protocol.TList _collection0 = iprot.readListBegin();
                        listI32Field = new com.test.thrift.protocol.TListI32(_collection0.size);
                        int _elem1;
                        for(int _i2=0;_i2 < _collection0.size; ++ _i2 ) { 
                            _elem1 = iprot.readI32();
                            listI32Field.add(_elem1);
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
                        com.test.thrift.protocol.TList _collection3 = iprot.readListBegin();
                        listI32FieldOptional = new com.test.thrift.protocol.TListI32(_collection3.size);
                        int _elem4;
                        for(int _i5=0;_i5 < _collection3.size; ++ _i5 ) { 
                            _elem4 = iprot.readI32();
                            listI32FieldOptional.add(_elem4);
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
                        com.test.thrift.protocol.TList _collection6 = iprot.readListBegin();
                        listI32FieldRequired = new com.test.thrift.protocol.TListI32(_collection6.size);
                        int _elem7;
                        for(int _i8=0;_i8 < _collection6.size; ++ _i8 ) { 
                            _elem7 = iprot.readI32();
                            listI32FieldRequired.add(_elem7);
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
                        com.test.thrift.protocol.TList _collection9 = iprot.readListBegin();
                        listI8Field = new java.util.ArrayList<>(_collection9.size);
                        byte _elem10;
                        for(int _i11=0;_i11 < _collection9.size; ++ _i11 ) { 
                            _elem10 = iprot.readByte();
                            listI8Field.add(_elem10);
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
                        com.test.thrift.protocol.TList _collection12 = iprot.readListBegin();
                        listI64Field = new com.test.thrift.protocol.TListI64(_collection12.size);
                        long _elem13;
                        for(int _i14=0;_i14 < _collection12.size; ++ _i14 ) { 
                            _elem13 = iprot.readI64();
                            listI64Field.add(_elem13);
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
                        com.test.thrift.protocol.TList _collection15 = iprot.readListBegin();
                        listDoubleField = new com.test.thrift.protocol.TListDouble(_collection15.size);
                        double _elem16;
                        for(int _i17=0;_i17 < _collection15.size; ++ _i17 ) { 
                            _elem16 = iprot.readDouble();
                            listDoubleField.add(_elem16);
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
                        com.test.thrift.protocol.TList _collection18 = iprot.readListBegin();
                        listStringField = new java.util.ArrayList<>(_collection18.size);
                        java.lang.String _elem19;
                        for(int _i20=0;_i20 < _collection18.size; ++ _i20 ) { 
                            _elem19 = iprot.readString();
                            listStringField.add(_elem19);
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
                        com.test.thrift.protocol.TList _collection21 = iprot.readListBegin();
                        listBoolField = new java.util.ArrayList<>(_collection21.size);
                        boolean _elem22;
                        for(int _i23=0;_i23 < _collection21.size; ++ _i23 ) { 
                            _elem22 = iprot.readBool();
                            listBoolField.add(_elem22);
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
                        com.test.thrift.protocol.TList _collection24 = iprot.readListBegin();
                        listByteField = new java.util.ArrayList<>(_collection24.size);
                        byte _elem25;
                        for(int _i26=0;_i26 < _collection24.size; ++ _i26 ) { 
                            _elem25 = iprot.readByte();
                            listByteField.add(_elem25);
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
                        com.test.thrift.protocol.TList _collection27 = iprot.readListBegin();
                        listBinaryField = new java.util.ArrayList<>(_collection27.size);
                        java.nio.ByteBuffer _elem28;
                        for(int _i29=0;_i29 < _collection27.size; ++ _i29 ) { 
                            _elem28 = iprot.readBinary();
                            listBinaryField.add(_elem28);
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
                        com.test.thrift.protocol.TList _collection30 = iprot.readListBegin();
                        listListBinaryField = new java.util.ArrayList<>(_collection30.size);
                        java.util.List<java.nio.ByteBuffer> _elem31;
                        for(int _i32=0;_i32 < _collection30.size; ++ _i32 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection33 = iprot.readListBegin();
                        _elem31 = new java.util.ArrayList<>(_collection33.size);
                        java.nio.ByteBuffer _elem34;
                        for(int _i35=0;_i35 < _collection33.size; ++ _i35 ) { 
                            _elem34 = iprot.readBinary();
                            _elem31.add(_elem34);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            listListBinaryField.add(_elem31);
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
                        com.test.thrift.protocol.TList _collection36 = iprot.readListBegin();
                        listAction = new java.util.ArrayList<>(_collection36.size);
                        Action _elem37;
                        for(int _i38=0;_i38 < _collection36.size; ++ _i38 ) { 
                _elem37 = com.test.thrift.Action.findByValue(iprot.readI32());
                if(_elem37 == null){
                   continue;
                }
                            listAction.add(_elem37);
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
                        com.test.thrift.protocol.TList _collection39 = iprot.readListBegin();
                        listListI32Field = new java.util.ArrayList<>(_collection39.size);
                        java.util.List<java.lang.Integer> _elem40;
                        for(int _i41=0;_i41 < _collection39.size; ++ _i41 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection42 = iprot.readListBegin();
                        _elem40 = new java.util.ArrayList<>(_collection42.size);
                        int _elem43;
                        for(int _i44=0;_i44 < _collection42.size; ++ _i44 ) { 
                            _elem43 = iprot.readI32();
                            _elem40.add(_elem43);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            listListI32Field.add(_elem40);
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
                        com.test.thrift.protocol.TList _collection45 = iprot.readListBegin();
                        listListListI32Field = new java.util.ArrayList<>(_collection45.size);
                        java.util.List<java.util.List<java.lang.Integer>> _elem46;
                        for(int _i47=0;_i47 < _collection45.size; ++ _i47 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection48 = iprot.readListBegin();
                        _elem46 = new java.util.ArrayList<>(_collection48.size);
                        java.util.List<java.lang.Integer> _elem49;
                        for(int _i50=0;_i50 < _collection48.size; ++ _i50 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection51 = iprot.readListBegin();
                        _elem49 = new java.util.ArrayList<>(_collection51.size);
                        int _elem52;
                        for(int _i53=0;_i53 < _collection51.size; ++ _i53 ) { 
                            _elem52 = iprot.readI32();
                            _elem49.add(_elem52);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            _elem46.add(_elem49);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                            listListListI32Field.add(_elem46);
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
                        com.test.thrift.protocol.TList _collection54 = iprot.readListBegin();
                        listSetI32Field = new java.util.ArrayList<>(_collection54.size);
                        java.util.Set<java.lang.Integer> _elem55;
                        for(int _i56=0;_i56 < _collection54.size; ++ _i56 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection57 = iprot.readSetBegin();
                                    _elem55 = new java.util.HashSet<>(_collection57.size);
                                    int _elem58;
                                    for(int _i59=0;_i59 < _collection57.size; ++_i59 ) { 
                            _elem58 = iprot.readI32();
                                        _elem55.add(_elem58);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                            listSetI32Field.add(_elem55);
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
                        com.test.thrift.protocol.TList _collection60 = iprot.readListBegin();
                        listSetStringField = new java.util.ArrayList<>(_collection60.size);
                        java.util.Set<java.lang.String> _elem61;
                        for(int _i62=0;_i62 < _collection60.size; ++ _i62 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection63 = iprot.readSetBegin();
                                    _elem61 = new java.util.HashSet<>(_collection63.size);
                                    java.lang.String _elem64;
                                    for(int _i65=0;_i65 < _collection63.size; ++_i65 ) { 
                            _elem64 = iprot.readString();
                                        _elem61.add(_elem64);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                            listSetStringField.add(_elem61);
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
                        com.test.thrift.protocol.TList _collection66 = iprot.readListBegin();
                        listSetBinaryField = new java.util.ArrayList<>(_collection66.size);
                        java.util.Set<java.nio.ByteBuffer> _elem67;
                        for(int _i68=0;_i68 < _collection66.size; ++ _i68 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection69 = iprot.readSetBegin();
                                    _elem67 = new java.util.HashSet<>(_collection69.size);
                                    java.nio.ByteBuffer _elem70;
                                    for(int _i71=0;_i71 < _collection69.size; ++_i71 ) { 
                            _elem70 = iprot.readBinary();
                                        _elem67.add(_elem70);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                            listSetBinaryField.add(_elem67);
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
                        com.test.thrift.protocol.TList _collection72 = iprot.readListBegin();
                        listMapI8StringField = new java.util.ArrayList<>(_collection72.size);
                        java.util.Map<java.lang.Byte, java.lang.String> _elem73;
                        for(int _i74=0;_i74 < _collection72.size; ++ _i74 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection75 = iprot.readMapBegin();
                                                _elem73 = new java.util.HashMap<>(_collection75.size);
                                                byte _key_elem76;
                                                java.lang.String _value_elem77;
                                                for(int _i78=0;_i78 < _collection75.size; ++ _i78 ) { 
                            _key_elem76 = iprot.readByte();
                            _value_elem77 = iprot.readString();
                                                    _elem73.put(_key_elem76,_value_elem77);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                            listMapI8StringField.add(_elem73);
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
                        com.test.thrift.protocol.TList _collection79 = iprot.readListBegin();
                        listMapByteBinaryField = new java.util.ArrayList<>(_collection79.size);
                        java.util.Map<java.lang.Byte, java.nio.ByteBuffer> _elem80;
                        for(int _i81=0;_i81 < _collection79.size; ++ _i81 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection82 = iprot.readMapBegin();
                                                _elem80 = new java.util.HashMap<>(_collection82.size);
                                                byte _key_elem83;
                                                java.nio.ByteBuffer _value_elem84;
                                                for(int _i85=0;_i85 < _collection82.size; ++ _i85 ) { 
                            _key_elem83 = iprot.readByte();
                            _value_elem84 = iprot.readBinary();
                                                    _elem80.put(_key_elem83,_value_elem84);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                            listMapByteBinaryField.add(_elem80);
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
                        com.test.thrift.protocol.TList _collection86 = iprot.readListBegin();
                        listMapBinaryField = new java.util.ArrayList<>(_collection86.size);
                        java.util.Map<java.lang.String, java.nio.ByteBuffer> _elem87;
                        for(int _i88=0;_i88 < _collection86.size; ++ _i88 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection89 = iprot.readMapBegin();
                                                _elem87 = new java.util.HashMap<>(_collection89.size);
                                                java.lang.String _key_elem90;
                                                java.nio.ByteBuffer _value_elem91;
                                                for(int _i92=0;_i92 < _collection89.size; ++ _i92 ) { 
                            _key_elem90 = iprot.readString();
                            _value_elem91 = iprot.readBinary();
                                                    _elem87.put(_key_elem90,_value_elem91);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                            listMapBinaryField.add(_elem87);
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
                        com.test.thrift.protocol.TList _collection93 = iprot.readListBegin();
                        listComplexField = new java.util.ArrayList<>(_collection93.size);
                        java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _elem94;
                        for(int _i95=0;_i95 < _collection93.size; ++ _i95 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection96 = iprot.readMapBegin();
                                                _elem94 = new java.util.HashMap<>(_collection96.size);
                                                int _key_elem97;
                                                java.util.List<java.util.Set<java.lang.Integer>> _value_elem98;
                                                for(int _i99=0;_i99 < _collection96.size; ++ _i99 ) { 
                            _key_elem97 = iprot.readI32();
                
                    {
                        com.test.thrift.protocol.TList _collection100 = iprot.readListBegin();
                        _value_elem98 = new java.util.ArrayList<>(_collection100.size);
                        java.util.Set<java.lang.Integer> _elem101;
                        for(int _i102=0;_i102 < _collection100.size; ++ _i102 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection103 = iprot.readSetBegin();
                                    _elem101 = new java.util.HashSet<>(_collection103.size);
                                    int _elem104;
                                    for(int _i105=0;_i105 < _collection103.size; ++_i105 ) { 
                            _elem104 = iprot.readI32();
                                        _elem101.add(_elem104);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                            _value_elem98.add(_elem101);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                                    _elem94.put(_key_elem97,_value_elem98);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                            listComplexField.add(_elem94);
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
                                    com.test.thrift.protocol.TSet _collection106 = iprot.readSetBegin();
                                    setBoolField = new java.util.HashSet<>(_collection106.size);
                                    boolean _elem107;
                                    for(int _i108=0;_i108 < _collection106.size; ++_i108 ) { 
                            _elem107 = iprot.readBool();
                                        setBoolField.add(_elem107);
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
                                    com.test.thrift.protocol.TSet _collection109 = iprot.readSetBegin();
                                    setStringField = new java.util.HashSet<>(_collection109.size);
                                    java.lang.String _elem110;
                                    for(int _i111=0;_i111 < _collection109.size; ++_i111 ) { 
                            _elem110 = iprot.readString();
                                        setStringField.add(_elem110);
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
                                    com.test.thrift.protocol.TSet _collection112 = iprot.readSetBegin();
                                    setByteField = new java.util.HashSet<>(_collection112.size);
                                    byte _elem113;
                                    for(int _i114=0;_i114 < _collection112.size; ++_i114 ) { 
                            _elem113 = iprot.readByte();
                                        setByteField.add(_elem113);
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
                                    com.test.thrift.protocol.TSet _collection115 = iprot.readSetBegin();
                                    setBinaryField = new java.util.HashSet<>(_collection115.size);
                                    java.nio.ByteBuffer _elem116;
                                    for(int _i117=0;_i117 < _collection115.size; ++_i117 ) { 
                            _elem116 = iprot.readBinary();
                                        setBinaryField.add(_elem116);
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
                                    com.test.thrift.protocol.TSet _collection118 = iprot.readSetBegin();
                                    setAction = new java.util.HashSet<>(_collection118.size);
                                    Action _elem119;
                                    for(int _i120=0;_i120 < _collection118.size; ++_i120 ) { 
                _elem119 = com.test.thrift.Action.findByValue(iprot.readI32());
                if(_elem119 == null){
                   continue;
                }
                                        setAction.add(_elem119);
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
                                    com.test.thrift.protocol.TSet _collection121 = iprot.readSetBegin();
                                    setListI64Field = new java.util.HashSet<>(_collection121.size);
                                    java.util.List<java.lang.Long> _elem122;
                                    for(int _i123=0;_i123 < _collection121.size; ++_i123 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection124 = iprot.readListBegin();
                        _elem122 = new java.util.ArrayList<>(_collection124.size);
                        long _elem125;
                        for(int _i126=0;_i126 < _collection124.size; ++ _i126 ) { 
                            _elem125 = iprot.readI64();
                            _elem122.add(_elem125);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                        setListI64Field.add(_elem122);
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
                                    com.test.thrift.protocol.TSet _collection127 = iprot.readSetBegin();
                                    setListBoolField = new java.util.HashSet<>(_collection127.size);
                                    java.util.List<java.lang.Boolean> _elem128;
                                    for(int _i129=0;_i129 < _collection127.size; ++_i129 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection130 = iprot.readListBegin();
                        _elem128 = new java.util.ArrayList<>(_collection130.size);
                        boolean _elem131;
                        for(int _i132=0;_i132 < _collection130.size; ++ _i132 ) { 
                            _elem131 = iprot.readBool();
                            _elem128.add(_elem131);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                        setListBoolField.add(_elem128);
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
                                    com.test.thrift.protocol.TSet _collection133 = iprot.readSetBegin();
                                    setSetI32Field = new java.util.HashSet<>(_collection133.size);
                                    java.util.Set<java.lang.Integer> _elem134;
                                    for(int _i135=0;_i135 < _collection133.size; ++_i135 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection136 = iprot.readSetBegin();
                                    _elem134 = new java.util.HashSet<>(_collection136.size);
                                    int _elem137;
                                    for(int _i138=0;_i138 < _collection136.size; ++_i138 ) { 
                            _elem137 = iprot.readI32();
                                        _elem134.add(_elem137);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                                        setSetI32Field.add(_elem134);
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
                                    com.test.thrift.protocol.TSet _collection139 = iprot.readSetBegin();
                                    setMapBoolI64Field = new java.util.HashSet<>(_collection139.size);
                                    java.util.Map<java.lang.Boolean, java.lang.Long> _elem140;
                                    for(int _i141=0;_i141 < _collection139.size; ++_i141 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection142 = iprot.readMapBegin();
                                                _elem140 = new java.util.HashMap<>(_collection142.size);
                                                boolean _key_elem143;
                                                long _value_elem144;
                                                for(int _i145=0;_i145 < _collection142.size; ++ _i145 ) { 
                            _key_elem143 = iprot.readBool();
                            _value_elem144 = iprot.readI64();
                                                    _elem140.put(_key_elem143,_value_elem144);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                        setMapBoolI64Field.add(_elem140);
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
                                    com.test.thrift.protocol.TSet _collection146 = iprot.readSetBegin();
                                    setMapI64I32Field = new java.util.HashSet<>(_collection146.size);
                                    java.util.Map<java.lang.Long, java.lang.Integer> _elem147;
                                    for(int _i148=0;_i148 < _collection146.size; ++_i148 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection149 = iprot.readMapBegin();
                                                _elem147 = new java.util.HashMap<>(_collection149.size);
                                                long _key_elem150;
                                                int _value_elem151;
                                                for(int _i152=0;_i152 < _collection149.size; ++ _i152 ) { 
                            _key_elem150 = iprot.readI64();
                            _value_elem151 = iprot.readI32();
                                                    _elem147.put(_key_elem150,_value_elem151);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                        setMapI64I32Field.add(_elem147);
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
                                    com.test.thrift.protocol.TSet _collection153 = iprot.readSetBegin();
                                    setComplexField = new java.util.HashSet<>(_collection153.size);
                                    java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _elem154;
                                    for(int _i155=0;_i155 < _collection153.size; ++_i155 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection156 = iprot.readMapBegin();
                                                _elem154 = new java.util.HashMap<>(_collection156.size);
                                                java.util.List<java.lang.Long> _key_elem157;
                                                java.util.Map<java.lang.Byte, java.lang.String> _value_elem158;
                                                for(int _i159=0;_i159 < _collection156.size; ++ _i159 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection160 = iprot.readListBegin();
                        _key_elem157 = new java.util.ArrayList<>(_collection160.size);
                        long _elem161;
                        for(int _i162=0;_i162 < _collection160.size; ++ _i162 ) { 
                            _elem161 = iprot.readI64();
                            _key_elem157.add(_elem161);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection163 = iprot.readMapBegin();
                                                _value_elem158 = new java.util.HashMap<>(_collection163.size);
                                                byte _key_elem164;
                                                java.lang.String _value_elem165;
                                                for(int _i166=0;_i166 < _collection163.size; ++ _i166 ) { 
                            _key_elem164 = iprot.readByte();
                            _value_elem165 = iprot.readString();
                                                    _value_elem158.put(_key_elem164,_value_elem165);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                                    _elem154.put(_key_elem157,_value_elem158);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                        setComplexField.add(_elem154);
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
                                                com.test.thrift.protocol.TMap _collection167 = iprot.readMapBegin();
                                                mapI32I32Field = new java.util.HashMap<>(_collection167.size);
                                                int _key_elem168;
                                                int _value_elem169;
                                                for(int _i170=0;_i170 < _collection167.size; ++ _i170 ) { 
                            _key_elem168 = iprot.readI32();
                            _value_elem169 = iprot.readI32();
                                                    mapI32I32Field.put(_key_elem168,_value_elem169);
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
                                                com.test.thrift.protocol.TMap _collection171 = iprot.readMapBegin();
                                                mapStringAction = new java.util.HashMap<>(_collection171.size);
                                                java.lang.String _key_elem172;
                                                Action _value_elem173;
                                                for(int _i174=0;_i174 < _collection171.size; ++ _i174 ) { 
                            _key_elem172 = iprot.readString();
                _value_elem173 = com.test.thrift.Action.findByValue(iprot.readI32());
                if(_value_elem173 == null){
                   continue;
                }
                                                    mapStringAction.put(_key_elem172,_value_elem173);
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
                                                com.test.thrift.protocol.TMap _collection175 = iprot.readMapBegin();
                                                mapI64StringField = new java.util.HashMap<>(_collection175.size);
                                                long _key_elem176;
                                                java.lang.String _value_elem177;
                                                for(int _i178=0;_i178 < _collection175.size; ++ _i178 ) { 
                            _key_elem176 = iprot.readI64();
                            _value_elem177 = iprot.readString();
                                                    mapI64StringField.put(_key_elem176,_value_elem177);
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
                                                com.test.thrift.protocol.TMap _collection179 = iprot.readMapBegin();
                                                mapI64MapField = new java.util.HashMap<>(_collection179.size);
                                                long _key_elem180;
                                                java.util.Map<java.lang.String, java.nio.ByteBuffer> _value_elem181;
                                                for(int _i182=0;_i182 < _collection179.size; ++ _i182 ) { 
                            _key_elem180 = iprot.readI64();
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection183 = iprot.readMapBegin();
                                                _value_elem181 = new java.util.HashMap<>(_collection183.size);
                                                java.lang.String _key_elem184;
                                                java.nio.ByteBuffer _value_elem185;
                                                for(int _i186=0;_i186 < _collection183.size; ++ _i186 ) { 
                            _key_elem184 = iprot.readString();
                            _value_elem185 = iprot.readBinary();
                                                    _value_elem181.put(_key_elem184,_value_elem185);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                                    mapI64MapField.put(_key_elem180,_value_elem181);
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
                                                com.test.thrift.protocol.TMap _collection187 = iprot.readMapBegin();
                                                mapListListField = new java.util.HashMap<>(_collection187.size);
                                                java.util.List<java.nio.ByteBuffer> _key_elem188;
                                                java.util.List<java.lang.String> _value_elem189;
                                                for(int _i190=0;_i190 < _collection187.size; ++ _i190 ) { 
                
                    {
                        com.test.thrift.protocol.TList _collection191 = iprot.readListBegin();
                        _key_elem188 = new java.util.ArrayList<>(_collection191.size);
                        java.nio.ByteBuffer _elem192;
                        for(int _i193=0;_i193 < _collection191.size; ++ _i193 ) { 
                            _elem192 = iprot.readBinary();
                            _key_elem188.add(_elem192);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                
                    {
                        com.test.thrift.protocol.TList _collection194 = iprot.readListBegin();
                        _value_elem189 = new java.util.ArrayList<>(_collection194.size);
                        java.lang.String _elem195;
                        for(int _i196=0;_i196 < _collection194.size; ++ _i196 ) { 
                            _elem195 = iprot.readString();
                            _value_elem189.add(_elem195);
                        }
                        iprot.readListEnd();
                    }
                        
                    
                                                    mapListListField.put(_key_elem188,_value_elem189);
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
                                                com.test.thrift.protocol.TMap _collection197 = iprot.readMapBegin();
                                                mapComplexField = new java.util.HashMap<>(_collection197.size);
                                                java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> _key_elem198;
                                                java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> _value_elem199;
                                                for(int _i200=0;_i200 < _collection197.size; ++ _i200 ) { 
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection201 = iprot.readMapBegin();
                                                _key_elem198 = new java.util.HashMap<>(_collection201.size);
                                                long _key_elem202;
                                                java.util.Set<java.util.Set<java.lang.Long>> _value_elem203;
                                                for(int _i204=0;_i204 < _collection201.size; ++ _i204 ) { 
                            _key_elem202 = iprot.readI64();
                            
                                {
                                    com.test.thrift.protocol.TSet _collection205 = iprot.readSetBegin();
                                    _value_elem203 = new java.util.HashSet<>(_collection205.size);
                                    java.util.Set<java.lang.Long> _elem206;
                                    for(int _i207=0;_i207 < _collection205.size; ++_i207 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection208 = iprot.readSetBegin();
                                    _elem206 = new java.util.HashSet<>(_collection208.size);
                                    long _elem209;
                                    for(int _i210=0;_i210 < _collection208.size; ++_i210 ) { 
                            _elem209 = iprot.readI64();
                                        _elem206.add(_elem209);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                                        _value_elem203.add(_elem206);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                                                    _key_elem198.put(_key_elem202,_value_elem203);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection211 = iprot.readMapBegin();
                                                _value_elem199 = new java.util.HashMap<>(_collection211.size);
                                                java.util.Set<java.lang.Long> _key_elem212;
                                                java.util.Map<java.lang.String, java.lang.Long> _value_elem213;
                                                for(int _i214=0;_i214 < _collection211.size; ++ _i214 ) { 
                            
                                {
                                    com.test.thrift.protocol.TSet _collection215 = iprot.readSetBegin();
                                    _key_elem212 = new java.util.HashSet<>(_collection215.size);
                                    long _elem216;
                                    for(int _i217=0;_i217 < _collection215.size; ++_i217 ) { 
                            _elem216 = iprot.readI64();
                                        _key_elem212.add(_elem216);
                                    }
                                    iprot.readSetEnd();
                                }
                                    
                                
                                        
                                            {
                                                com.test.thrift.protocol.TMap _collection218 = iprot.readMapBegin();
                                                _value_elem213 = new java.util.HashMap<>(_collection218.size);
                                                java.lang.String _key_elem219;
                                                long _value_elem220;
                                                for(int _i221=0;_i221 < _collection218.size; ++ _i221 ) { 
                            _key_elem219 = iprot.readString();
                            _value_elem220 = iprot.readI64();
                                                    _value_elem213.put(_key_elem219,_value_elem220);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                                    _value_elem199.put(_key_elem212,_value_elem213);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                            
                                                    mapComplexField.put(_key_elem198,_value_elem199);
                                                }
                                                iprot.readMapEnd();
                                            }
                                                
                                                    this.setMapComplexFieldIsSet(true); }
                                                
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
        
            
                
                    if (mapComplexField != null) {
                        oprot.writeFieldBegin("mapComplexField",org.apache.thrift.protocol.TType.MAP,(short)-45);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.MAP,org.apache.thrift.protocol.TType.MAP, mapComplexField.size());
                            for (java.util.Map.Entry<java.util.Map<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>>, java.util.Map<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>>> _iter222 : mapComplexField.entrySet())
                            { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I64,org.apache.thrift.protocol.TType.SET, _iter222.getKey().size());
                            for (java.util.Map.Entry<java.lang.Long, java.util.Set<java.util.Set<java.lang.Long>>> _iter223 : _iter222.getKey().entrySet())
                            { 
                                        oprot.writeI64(_iter223.getKey());
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.SET, _iter223.getValue().size());
                        for (java.util.Set<java.lang.Long> _iter224  : _iter223.getValue()) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I64, _iter224.size());
                        for (long _iter225  : _iter224) { 
                            oprot.writeI64(_iter225);
                    }
                   }
                  
                    }
                   }
                  
                    }
                   }
                  
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.SET,org.apache.thrift.protocol.TType.MAP, _iter222.getValue().size());
                            for (java.util.Map.Entry<java.util.Set<java.lang.Long>, java.util.Map<java.lang.String, java.lang.Long>> _iter226 : _iter222.getValue().entrySet())
                            { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I64, _iter226.getKey().size());
                        for (long _iter227  : _iter226.getKey()) { 
                            oprot.writeI64(_iter227);
                    }
                   }
                  
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRING,org.apache.thrift.protocol.TType.I64, _iter226.getValue().size());
                            for (java.util.Map.Entry<java.lang.String, java.lang.Long> _iter228 : _iter226.getValue().entrySet())
                            { 
                                        oprot.writeString(_iter228.getKey());
                                        oprot.writeI64(_iter228.getValue());
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
                            for (java.util.Map.Entry<java.util.List<java.nio.ByteBuffer>, java.util.List<java.lang.String>> _iter229 : mapListListField.entrySet())
                            { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, _iter229.getKey().size());
                        for (java.nio.ByteBuffer _iter230  : _iter229.getKey()) { 
                            oprot.writeBinary(_iter230);
                   }
                  
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, _iter229.getValue().size());
                        for (java.lang.String _iter231  : _iter229.getValue()) { 
                            oprot.writeString(_iter231);
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
                            for (java.util.Map.Entry<java.lang.Long, java.util.Map<java.lang.String, java.nio.ByteBuffer>> _iter232 : mapI64MapField.entrySet())
                            { 
                                        oprot.writeI64(_iter232.getKey());
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRING,org.apache.thrift.protocol.TType.STRING, _iter232.getValue().size());
                            for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter233 : _iter232.getValue().entrySet())
                            { 
                                        oprot.writeString(_iter233.getKey());
                                        oprot.writeBinary(_iter233.getValue());
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
                            for (java.util.Map.Entry<java.lang.Long, java.lang.String> _iter234 : mapI64StringField.entrySet())
                            { 
                                        oprot.writeI64(_iter234.getKey());
                                        oprot.writeString(_iter234.getValue());
                    }
                   }
                 
                 }
                  }  
        
            
                
                    if (mapStringAction != null) {
                        oprot.writeFieldBegin("mapStringAction",org.apache.thrift.protocol.TType.MAP,(short)-41);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRING,org.apache.thrift.protocol.TType.I32, mapStringAction.size());
                            for (java.util.Map.Entry<java.lang.String, Action> _iter235 : mapStringAction.entrySet())
                            { 
                                        oprot.writeString(_iter235.getKey());oprot.writeI32(_iter235.getValue().getValue());
                    }
                   }
                 
                 }
                  }  
        
            
                
                if (setComplexField != null) {
                    oprot.writeFieldBegin("setComplexField",org.apache.thrift.protocol.TType.SET,(short)-40);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.MAP, setComplexField.size());
                        for (java.util.Map<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _iter236  : setComplexField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.LIST,org.apache.thrift.protocol.TType.MAP, _iter236.size());
                            for (java.util.Map.Entry<java.util.List<java.lang.Long>, java.util.Map<java.lang.Byte, java.lang.String>> _iter237 : _iter236.entrySet())
                            { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I64, _iter237.getKey().size());
                        for (long _iter238  : _iter237.getKey()) { 
                            oprot.writeI64(_iter238);
                   }
                  
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.BYTE,org.apache.thrift.protocol.TType.STRING, _iter237.getValue().size());
                            for (java.util.Map.Entry<java.lang.Byte, java.lang.String> _iter239 : _iter237.getValue().entrySet())
                            { 
                                        oprot.writeByte(_iter239.getKey());
                                        oprot.writeString(_iter239.getValue());
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
                        for (java.util.Map<java.lang.Long, java.lang.Integer> _iter240  : setMapI64I32Field) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I64,org.apache.thrift.protocol.TType.I32, _iter240.size());
                            for (java.util.Map.Entry<java.lang.Long, java.lang.Integer> _iter241 : _iter240.entrySet())
                            { 
                                        oprot.writeI64(_iter241.getKey());
                                        oprot.writeI32(_iter241.getValue());
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
                        for (java.util.Map<java.lang.Boolean, java.lang.Long> _iter242  : setMapBoolI64Field) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.BOOL,org.apache.thrift.protocol.TType.I64, _iter242.size());
                            for (java.util.Map.Entry<java.lang.Boolean, java.lang.Long> _iter243 : _iter242.entrySet())
                            { 
                                        oprot.writeBool(_iter243.getKey());
                                        oprot.writeI64(_iter243.getValue());
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
                        for (java.util.Set<java.lang.Integer> _iter244  : setSetI32Field) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I32, _iter244.size());
                        for (int _iter245  : _iter244) { 
                            oprot.writeI32(_iter245);
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
                        for (java.util.List<java.lang.Boolean> _iter246  : setListBoolField) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BOOL, _iter246.size());
                        for (boolean _iter247  : _iter246) { 
                            oprot.writeBool(_iter247);
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
                        for (java.util.List<java.lang.Long> _iter248  : setListI64Field) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I64, _iter248.size());
                        for (long _iter249  : _iter248) { 
                            oprot.writeI64(_iter249);
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
                        for (Action _iter250  : setAction) { oprot.writeI32(_iter250.getValue());
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setBinaryField != null) {
                    oprot.writeFieldBegin("setBinaryField",org.apache.thrift.protocol.TType.SET,(short)-33);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, setBinaryField.size());
                        for (java.nio.ByteBuffer _iter251  : setBinaryField) { 
                            oprot.writeBinary(_iter251);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (listComplexField != null) {
                    oprot.writeFieldBegin("listComplexField", org.apache.thrift.protocol.TType.LIST, (short)-32);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.MAP, listComplexField.size());
                        for (java.util.Map<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _iter252  : listComplexField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I32,org.apache.thrift.protocol.TType.LIST, _iter252.size());
                            for (java.util.Map.Entry<java.lang.Integer, java.util.List<java.util.Set<java.lang.Integer>>> _iter253 : _iter252.entrySet())
                            { 
                                        oprot.writeI32(_iter253.getKey());
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.SET, _iter253.getValue().size());
                        for (java.util.Set<java.lang.Integer> _iter254  : _iter253.getValue()) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I32, _iter254.size());
                        for (int _iter255  : _iter254) { 
                            oprot.writeI32(_iter255);
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
                        for (java.util.Map<java.lang.String, java.nio.ByteBuffer> _iter256  : listMapBinaryField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.STRING,org.apache.thrift.protocol.TType.STRING, _iter256.size());
                            for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter257 : _iter256.entrySet())
                            { 
                                        oprot.writeString(_iter257.getKey());
                                        oprot.writeBinary(_iter257.getValue());
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listMapByteBinaryField != null) {
                    oprot.writeFieldBegin("listMapByteBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-30);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.MAP, listMapByteBinaryField.size());
                        for (java.util.Map<java.lang.Byte, java.nio.ByteBuffer> _iter258  : listMapByteBinaryField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.BYTE,org.apache.thrift.protocol.TType.STRING, _iter258.size());
                            for (java.util.Map.Entry<java.lang.Byte, java.nio.ByteBuffer> _iter259 : _iter258.entrySet())
                            { 
                                        oprot.writeByte(_iter259.getKey());
                                        oprot.writeBinary(_iter259.getValue());
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listMapI8StringField != null) {
                    oprot.writeFieldBegin("listMapI8StringField", org.apache.thrift.protocol.TType.LIST, (short)-29);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.MAP, listMapI8StringField.size());
                        for (java.util.Map<java.lang.Byte, java.lang.String> _iter260  : listMapI8StringField) { 
                
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.BYTE,org.apache.thrift.protocol.TType.STRING, _iter260.size());
                            for (java.util.Map.Entry<java.lang.Byte, java.lang.String> _iter261 : _iter260.entrySet())
                            { 
                                        oprot.writeByte(_iter261.getKey());
                                        oprot.writeString(_iter261.getValue());
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listSetBinaryField != null) {
                    oprot.writeFieldBegin("listSetBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-28);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.SET, listSetBinaryField.size());
                        for (java.util.Set<java.nio.ByteBuffer> _iter262  : listSetBinaryField) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, _iter262.size());
                        for (java.nio.ByteBuffer _iter263  : _iter262) { 
                            oprot.writeBinary(_iter263);
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listSetStringField != null) {
                    oprot.writeFieldBegin("listSetStringField", org.apache.thrift.protocol.TType.LIST, (short)-27);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.SET, listSetStringField.size());
                        for (java.util.Set<java.lang.String> _iter264  : listSetStringField) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, _iter264.size());
                        for (java.lang.String _iter265  : _iter264) { 
                            oprot.writeString(_iter265);
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listSetI32Field != null) {
                    oprot.writeFieldBegin("listSetI32Field", org.apache.thrift.protocol.TType.LIST, (short)-26);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.SET, listSetI32Field.size());
                        for (java.util.Set<java.lang.Integer> _iter266  : listSetI32Field) { 
                
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.I32, _iter266.size());
                        for (int _iter267  : _iter266) { 
                            oprot.writeI32(_iter267);
                    }
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listListListI32Field != null) {
                    oprot.writeFieldBegin("listListListI32Field", org.apache.thrift.protocol.TType.LIST, (short)-25);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, listListListI32Field.size());
                        for (java.util.List<java.util.List<java.lang.Integer>> _iter268  : listListListI32Field) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, _iter268.size());
                        for (java.util.List<java.lang.Integer> _iter269  : _iter268) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, _iter269.size());
                        for (int _iter270  : _iter269) { 
                            oprot.writeI32(_iter270);
                   }
                  
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listListI32Field != null) {
                    oprot.writeFieldBegin("listListI32Field", org.apache.thrift.protocol.TType.LIST, (short)-24);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, listListI32Field.size());
                        for (java.util.List<java.lang.Integer> _iter271  : listListI32Field) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, _iter271.size());
                        for (int _iter272  : _iter271) { 
                            oprot.writeI32(_iter272);
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listAction != null) {
                    oprot.writeFieldBegin("listAction", org.apache.thrift.protocol.TType.LIST, (short)-23);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, listAction.size());
                        for (Action _iter273  : listAction) { oprot.writeI32(_iter273.getValue());
                   }
                 
                 }
                  }  
        
            
                
                if (listListBinaryField != null) {
                    oprot.writeFieldBegin("listListBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-22);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.LIST, listListBinaryField.size());
                        for (java.util.List<java.nio.ByteBuffer> _iter274  : listListBinaryField) { 
                
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, _iter274.size());
                        for (java.nio.ByteBuffer _iter275  : _iter274) { 
                            oprot.writeBinary(_iter275);
                   }
                  
                   }
                 
                 }
                  }  
        
            
                
                if (listBinaryField != null) {
                    oprot.writeFieldBegin("listBinaryField", org.apache.thrift.protocol.TType.LIST, (short)-21);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, listBinaryField.size());
                        for (java.nio.ByteBuffer _iter276  : listBinaryField) { 
                            oprot.writeBinary(_iter276);
                   }
                 
                 }
                  }  
        
            
                
                if (listByteField != null) {
                    oprot.writeFieldBegin("listByteField", org.apache.thrift.protocol.TType.LIST, (short)-20);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BYTE, listByteField.size());
                        for (byte _iter277  : listByteField) { 
                            oprot.writeByte(_iter277);
                   }
                 
                 }
                  }  
        
            
                
                if (listBoolField != null) {
                    oprot.writeFieldBegin("listBoolField", org.apache.thrift.protocol.TType.LIST, (short)-19);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.BOOL, listBoolField.size());
                        for (boolean _iter278  : listBoolField) { 
                            oprot.writeBool(_iter278);
                   }
                 
                 }
                  }  
        
            
                
                if (listStringField != null) {
                    oprot.writeFieldBegin("listStringField", org.apache.thrift.protocol.TType.LIST, (short)-18);
                    { 
                        oprot.writeListBegin(org.apache.thrift.protocol.TType.STRING, listStringField.size());
                        for (java.lang.String _iter279  : listStringField) { 
                            oprot.writeString(_iter279);
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
                        for (byte _iter280  : listI8Field) { 
                            oprot.writeByte(_iter280);
                   }
                 
                 }
                  }  
        
            
                
                if (setBoolField != null) {
                    oprot.writeFieldBegin("setBoolField",org.apache.thrift.protocol.TType.SET,(short)20);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.BOOL, setBoolField.size());
                        for (boolean _iter281  : setBoolField) { 
                            oprot.writeBool(_iter281);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setStringField != null) {
                    oprot.writeFieldBegin("setStringField",org.apache.thrift.protocol.TType.SET,(short)21);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.STRING, setStringField.size());
                        for (java.lang.String _iter282  : setStringField) { 
                            oprot.writeString(_iter282);
                    }
                   }
                  
                 }
                  }  
        
            
                
                if (setByteField != null) {
                    oprot.writeFieldBegin("setByteField",org.apache.thrift.protocol.TType.SET,(short)22);
                    { 
                    {
                        oprot.writeSetBegin(org.apache.thrift.protocol.TType.BYTE, setByteField.size());
                        for (byte _iter283  : setByteField) { 
                            oprot.writeByte(_iter283);
                    }
                   }
                  
                 }
                  }  
        
            
                
                    if (mapI32I32Field != null) {
                        oprot.writeFieldBegin("mapI32I32Field",org.apache.thrift.protocol.TType.MAP,(short)31);
                        { 
                        
                        {
                            oprot.writeMapBegin(org.apache.thrift.protocol.TType.I32,org.apache.thrift.protocol.TType.I32, mapI32I32Field.size());
                            for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> _iter284 : mapI32I32Field.entrySet())
                            { 
                                        oprot.writeI32(_iter284.getKey());
                                        oprot.writeI32(_iter284.getValue());
                    }
                   }
                 
                 }
                  }  
        

        oprot.writeFieldStop();
    }



}