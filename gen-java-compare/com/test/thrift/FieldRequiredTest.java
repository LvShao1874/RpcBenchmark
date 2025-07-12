
package com.test.thrift;

public  class FieldRequiredTest implements com.test.thrift.IBase {

    
    
    
    public int i32Field; 
    
    
    public int i32FieldRequired; // required
    
    
    public int i32FieldOptional; // optional
    
    
    public java.lang.String stringField; 
    
    
    public java.lang.String stringFieldRequired; // required
    
    
    public java.lang.String stringFieldOptional; // optional
    
    
    public java.nio.ByteBuffer binaryField; 
    
    
    public java.nio.ByteBuffer binaryFieldRequired; // required
    
    
    public java.nio.ByteBuffer binaryFieldOptional; // optional
    
    
    public Action action; 
    
    
    public Action actionRequired; // required
    
    
    public Action actionOptional; // optional
    
    
    public com.test.thrift.protocol.TListI32 i32ListField;
    
    
    public com.test.thrift.protocol.TListI32 i32ListFieldRequired; // required
    
    
    public com.test.thrift.protocol.TListI32 i32ListFieldOptional; // optional

     
    private static final int __I32FIELD_ISSET_ID = 0;  
    private static final int __I32FIELDREQUIRED_ISSET_ID = 1;  
    private static final int __I32FIELDOPTIONAL_ISSET_ID = 2;                         
    private byte __isset_bitfield = 0;


    
        public java.lang.Integer getI32Field() {
            return this.i32Field;
        }

        public FieldRequiredTest setI32Field(java.lang.Integer i32Field) {
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
    

    
        public java.lang.Integer getI32FieldRequired() {
            return this.i32FieldRequired;
        }

        public FieldRequiredTest setI32FieldRequired(java.lang.Integer i32FieldRequired) {
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
    

    
        public java.lang.Integer getI32FieldOptional() {
            return this.i32FieldOptional;
        }

        public FieldRequiredTest setI32FieldOptional(java.lang.Integer i32FieldOptional) {
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
    

    
        public java.lang.String getStringField() {
            return this.stringField;
        }

        public FieldRequiredTest setStringField(java.lang.String stringField) {
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
    

    
        public java.lang.String getStringFieldRequired() {
            return this.stringFieldRequired;
        }

        public FieldRequiredTest setStringFieldRequired(java.lang.String stringFieldRequired) {
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
    

    
        public java.lang.String getStringFieldOptional() {
            return this.stringFieldOptional;
        }

        public FieldRequiredTest setStringFieldOptional(java.lang.String stringFieldOptional) {
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
    

    
        public byte[] getBinaryField() {
            setBinaryField(org.apache.thrift.TBaseHelper.rightSize(binaryField));
            return binaryField == null ? null : binaryField.array();
        }

        public java.nio.ByteBuffer bufferForBinaryField() {
            return com.test.thrift.Helpers.copyBinary(binaryField);
        }

        public FieldRequiredTest setBinaryField(byte[] binaryField) {
            this.binaryField = binaryField == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryField.clone());
            return this;
        }

        public FieldRequiredTest setBinaryField(java.nio.ByteBuffer binaryField) {
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
    

    
        public byte[] getBinaryFieldRequired() {
            setBinaryFieldRequired(org.apache.thrift.TBaseHelper.rightSize(binaryFieldRequired));
            return binaryFieldRequired == null ? null : binaryFieldRequired.array();
        }

        public java.nio.ByteBuffer bufferForBinaryFieldRequired() {
            return com.test.thrift.Helpers.copyBinary(binaryFieldRequired);
        }

        public FieldRequiredTest setBinaryFieldRequired(byte[] binaryFieldRequired) {
            this.binaryFieldRequired = binaryFieldRequired == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryFieldRequired.clone());
            return this;
        }

        public FieldRequiredTest setBinaryFieldRequired(java.nio.ByteBuffer binaryFieldRequired) {
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
    

    
        public byte[] getBinaryFieldOptional() {
            setBinaryFieldOptional(org.apache.thrift.TBaseHelper.rightSize(binaryFieldOptional));
            return binaryFieldOptional == null ? null : binaryFieldOptional.array();
        }

        public java.nio.ByteBuffer bufferForBinaryFieldOptional() {
            return com.test.thrift.Helpers.copyBinary(binaryFieldOptional);
        }

        public FieldRequiredTest setBinaryFieldOptional(byte[] binaryFieldOptional) {
            this.binaryFieldOptional = binaryFieldOptional == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(binaryFieldOptional.clone());
            return this;
        }

        public FieldRequiredTest setBinaryFieldOptional(java.nio.ByteBuffer binaryFieldOptional) {
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
    

    
        public Action getAction() {
            return this.action;
        }

        public FieldRequiredTest setAction(Action action) {
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
    

    
        public Action getActionRequired() {
            return this.actionRequired;
        }

        public FieldRequiredTest setActionRequired(Action actionRequired) {
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
    

    
        public Action getActionOptional() {
            return this.actionOptional;
        }

        public FieldRequiredTest setActionOptional(Action actionOptional) {
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
    

    
        public int getI32ListFieldSize() {
            return (this.i32ListField == null) ? 0 : this.i32ListField.size();
        }

        public void addToI32ListField(java.lang.Integer elem) {
            if (this.i32ListField == null) {
              this.i32ListField = new com.test.thrift.protocol.TListI32();
            }
            this.i32ListField.add(elem);
        }

        public com.test.thrift.protocol.TListI32 getI32ListField() {
            return this.i32ListField;
        }

        public FieldRequiredTest setI32ListField(com.test.thrift.protocol.TListI32 i32ListField) {
            this.i32ListField = i32ListField;
            return this;
        }

        public void unsetI32ListField() {
            this.i32ListField = null;
        }

        public boolean isSetI32ListField() {
            return this.i32ListField != null;
        }

        public void setI32ListFieldIsSet(boolean value) {
            if (!value) {
              this.i32ListField = null;
            }
        }
    

    
        public int getI32ListFieldRequiredSize() {
            return (this.i32ListFieldRequired == null) ? 0 : this.i32ListFieldRequired.size();
        }

        public void addToI32ListFieldRequired(java.lang.Integer elem) {
            if (this.i32ListFieldRequired == null) {
              this.i32ListFieldRequired = new com.test.thrift.protocol.TListI32();
            }
            this.i32ListFieldRequired.add(elem);
        }

        public com.test.thrift.protocol.TListI32 getI32ListFieldRequired() {
            return this.i32ListFieldRequired;
        }

        public FieldRequiredTest setI32ListFieldRequired(com.test.thrift.protocol.TListI32 i32ListFieldRequired) {
            this.i32ListFieldRequired = i32ListFieldRequired;
            return this;
        }

        public void unsetI32ListFieldRequired() {
            this.i32ListFieldRequired = null;
        }

        public boolean isSetI32ListFieldRequired() {
            return this.i32ListFieldRequired != null;
        }

        public void setI32ListFieldRequiredIsSet(boolean value) {
            if (!value) {
              this.i32ListFieldRequired = null;
            }
        }
    

    
        public int getI32ListFieldOptionalSize() {
            return (this.i32ListFieldOptional == null) ? 0 : this.i32ListFieldOptional.size();
        }

        public void addToI32ListFieldOptional(java.lang.Integer elem) {
            if (this.i32ListFieldOptional == null) {
              this.i32ListFieldOptional = new com.test.thrift.protocol.TListI32();
            }
            this.i32ListFieldOptional.add(elem);
        }

        public com.test.thrift.protocol.TListI32 getI32ListFieldOptional() {
            return this.i32ListFieldOptional;
        }

        public FieldRequiredTest setI32ListFieldOptional(com.test.thrift.protocol.TListI32 i32ListFieldOptional) {
            this.i32ListFieldOptional = i32ListFieldOptional;
            return this;
        }

        public void unsetI32ListFieldOptional() {
            this.i32ListFieldOptional = null;
        }

        public boolean isSetI32ListFieldOptional() {
            return this.i32ListFieldOptional != null;
        }

        public void setI32ListFieldOptionalIsSet(boolean value) {
            if (!value) {
              this.i32ListFieldOptional = null;
            }
        }
    


    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
          return false;
        if (that instanceof FieldRequiredTest)
          return this.equals((FieldRequiredTest)that);
        return false;
    }

    public boolean equals(FieldRequiredTest that) {
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
            
        
            
                boolean this_present_i32ListField = true && this.isSetI32ListField();
                boolean that_present_i32ListField = true && that.isSetI32ListField();
                if (this_present_i32ListField || that_present_i32ListField) {
                    if (!(this_present_i32ListField && that_present_i32ListField))
                        return false;
                    if (!this.i32ListField.equals(that.i32ListField)){
                        //System.out.println("i32ListField not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_i32ListFieldRequired = true && this.isSetI32ListFieldRequired();
                boolean that_present_i32ListFieldRequired = true && that.isSetI32ListFieldRequired();
                if (this_present_i32ListFieldRequired || that_present_i32ListFieldRequired) {
                    if (!(this_present_i32ListFieldRequired && that_present_i32ListFieldRequired))
                        return false;
                    if (!this.i32ListFieldRequired.equals(that.i32ListFieldRequired)){
                        //System.out.println("i32ListFieldRequired not equal");
                        return false;
                    }
                }
            
        
            
                boolean this_present_i32ListFieldOptional = true && this.isSetI32ListFieldOptional();
                boolean that_present_i32ListFieldOptional = true && that.isSetI32ListFieldOptional();
                if (this_present_i32ListFieldOptional || that_present_i32ListFieldOptional) {
                    if (!(this_present_i32ListFieldOptional && that_present_i32ListFieldOptional))
                        return false;
                    if (!this.i32ListFieldOptional.equals(that.i32ListFieldOptional)){
                        //System.out.println("i32ListFieldOptional not equal");
                        return false;
                    }
                }
            
        
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldRequiredTest(");
        
            
            
                    sb.append("i32Field:");
                    sb.append(this.i32Field);
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("i32FieldRequired:");
                    sb.append(this.i32FieldRequired);
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetI32FieldOptional()) {
            
            
                    sb.append("i32FieldOptional:");
                    sb.append(this.i32FieldOptional);
            
                    
                        sb.append(", ");
                    
            
                }
            

        
            
            
                    sb.append("stringField:");
                    if (this.stringField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.stringField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("stringFieldRequired:");
                    if (this.stringFieldRequired == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.stringFieldRequired);
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
            

        
            
            
                    sb.append("binaryField:");
                    if (this.binaryField == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.binaryField, sb);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("binaryFieldRequired:");
                    if (this.binaryFieldRequired == null) {
                        sb.append("null");
                    } else {
                        org.apache.thrift.TBaseHelper.toString(this.binaryFieldRequired, sb);
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
            

        
            
            
                    sb.append("action:");
                    if (this.action == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.action);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("actionRequired:");
                    if (this.actionRequired == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.actionRequired);
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
            

        
            
            
                    sb.append("i32ListField:");
                    if (this.i32ListField == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.i32ListField);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
            
                    sb.append("i32ListFieldRequired:");
                    if (this.i32ListFieldRequired == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.i32ListFieldRequired);
                    }
            
                    
                        sb.append(", ");
                    
            

        
            
                if (isSetI32ListFieldOptional()) {
            
            
                    sb.append("i32ListFieldOptional:");
                    if (this.i32ListFieldOptional == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.i32ListFieldOptional);
                    }
            
                    
            
                }
            

        
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        
            
                
                    hashCode = hashCode * 8191 + i32Field;
                
            
        
            
                
                    hashCode = hashCode * 8191 + i32FieldRequired;
                
            
        
            
                
                    hashCode = hashCode * 8191 + ((isSetI32FieldOptional()) ? 131071 : 524287);
                    if (isSetI32FieldOptional())
                        hashCode = hashCode * 8191 + i32FieldOptional;
                    
            
        
            
                hashCode = hashCode * 8191 + ((isSetStringField()) ? 131071 : 524287);
                if (isSetStringField())
                    hashCode = hashCode * 8191 + stringField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetStringFieldRequired()) ? 131071 : 524287);
                if (isSetStringFieldRequired())
                    hashCode = hashCode * 8191 + stringFieldRequired.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetStringFieldOptional()) ? 131071 : 524287);
                if (isSetStringFieldOptional())
                    hashCode = hashCode * 8191 + stringFieldOptional.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetBinaryField()) ? 131071 : 524287);
                if (isSetBinaryField())
                    hashCode = hashCode * 8191 + binaryField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetBinaryFieldRequired()) ? 131071 : 524287);
                if (isSetBinaryFieldRequired())
                    hashCode = hashCode * 8191 + binaryFieldRequired.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetBinaryFieldOptional()) ? 131071 : 524287);
                if (isSetBinaryFieldOptional())
                    hashCode = hashCode * 8191 + binaryFieldOptional.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetAction()) ? 131071 : 524287);
                if (isSetAction())
                    hashCode = hashCode * 8191 + action.getValue();
            
        
            
                hashCode = hashCode * 8191 + ((isSetActionRequired()) ? 131071 : 524287);
                if (isSetActionRequired())
                    hashCode = hashCode * 8191 + actionRequired.getValue();
            
        
            
                hashCode = hashCode * 8191 + ((isSetActionOptional()) ? 131071 : 524287);
                if (isSetActionOptional())
                    hashCode = hashCode * 8191 + actionOptional.getValue();
            
        
            
                hashCode = hashCode * 8191 + ((isSetI32ListField()) ? 131071 : 524287);
                if (isSetI32ListField())
                    hashCode = hashCode * 8191 + i32ListField.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetI32ListFieldRequired()) ? 131071 : 524287);
                if (isSetI32ListFieldRequired())
                    hashCode = hashCode * 8191 + i32ListFieldRequired.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetI32ListFieldOptional()) ? 131071 : 524287);
                if (isSetI32ListFieldOptional())
                    hashCode = hashCode * 8191 + i32ListFieldOptional.hashCode();
            
        
        return hashCode;
    }

    public void clear() {
        
            
                
                    setI32FieldIsSet(false);
                    
                        this.i32Field = 0;
                    
                
            
        
            
                
                    setI32FieldRequiredIsSet(false);
                    
                        this.i32FieldRequired = 0;
                    
                
            
        
            
                
                    setI32FieldOptionalIsSet(false);
                    
                        this.i32FieldOptional = 0;
                    
                
            
        
            
                this.stringField = null;
            
        
            
                this.stringFieldRequired = null;
            
        
            
                this.stringFieldOptional = null;
            
        
            
                this.binaryField = null;
            
        
            
                this.binaryFieldRequired = null;
            
        
            
                this.binaryFieldOptional = null;
            
        
            
                this.action = null;
            
        
            
                this.actionRequired = null;
            
        
            
                this.actionOptional = null;
            
        
            
                this.i32ListField = null;
            
        
            
                this.i32ListFieldRequired = null;
            
        
            
                this.i32ListFieldOptional = null;
            
        
    }

    public void validate() throws com.test.thrift.TException {
        
            
        
            
        
            
        
            
                 
            
        
            
                 
                    if(stringFieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'stringFieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(binaryFieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'binaryFieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(actionRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'actionRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        
            
                 
            
        
            
                 
                    if(i32ListFieldRequired == null) { throw new com.test.thrift.protocol.TProtocolException("Required field 'i32ListFieldRequired' was not present! Struct: " + toString()); }
                
            
        
            
                 
            
        

        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
    }

    public int size() {
        int size = 1; // writeFieldStop() need 1 byte;
        
            // i32ListFieldOptional
            
                if (i32ListFieldOptional != null) {
                    size += 8;
                    
                        size += (4) * i32ListFieldOptional.size();
                    
                }
        
            // i32ListFieldRequired
            
                if (i32ListFieldRequired != null) {
                    size += 8;
                    
                        size += (4) * i32ListFieldRequired.size();
                    
                }
        
            // i32ListField
            
                if (i32ListField != null) {
                    size += 8;
                    
                        size += (4) * i32ListField.size();
                    
                }
        
            // actionOptional
            
                 if(actionOptional != null ){ 
                
                    size += 3;
                    size += 4;
                
                 } 
            
        
            // actionRequired
            
                 if(actionRequired != null ){ 
                
                    size += 3;
                    size += 4;
                
                 } 
            
        
            // action
            
                 if(action != null ){ 
                
                    size += 3;
                    size += 4;
                
                 } 
            
        
            // binaryFieldOptional
            
                 if(binaryFieldOptional != null ){ 
                
                    size += 3;
                    size += 4 + binaryFieldOptional.limit() - binaryFieldOptional.position();
                
                 } 
            
        
            // binaryFieldRequired
            
                 if(binaryFieldRequired != null ){ 
                
                    size += 3;
                    size += 4 + binaryFieldRequired.limit() - binaryFieldRequired.position();
                
                 } 
            
        
            // binaryField
            
                 if(binaryField != null ){ 
                
                    size += 3;
                    size += 4 + binaryField.limit() - binaryField.position();
                
                 } 
            
        
            // stringFieldOptional
            
                 if(stringFieldOptional != null ){ 
                
                    size += 3;
                    size += 4 +  3 * stringFieldOptional.length();
                
                 } 
            
        
            // stringFieldRequired
            
                 if(stringFieldRequired != null ){ 
                
                    size += 3;
                    size += 4 +  3 * stringFieldRequired.length();
                
                 } 
            
        
            // stringField
            
                 if(stringField != null ){ 
                
                    size += 3;
                    size += 4 +  3 * stringField.length();
                
                 } 
            
        
            // i32FieldOptional
            
                
                 if(isSetI32FieldOptional()){ 
                    size += 3;
                    size += 4;
                 } 
                
            
        
            // i32FieldRequired
            
                
                
                    size += 3;
                    size += 4;
                
                
            
        
            // i32Field
            
                
                
                    size += 3;
                    size += 4;
                
                
            
        
        return size;
    }

    public FieldRequiredTest() {
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
}


    public FieldRequiredTest(
    
        int i32Field,
        int i32FieldRequired,
        java.lang.String stringField,
        java.lang.String stringFieldRequired,
        java.nio.ByteBuffer binaryField,
        java.nio.ByteBuffer binaryFieldRequired,
        Action action,
        Action actionRequired,
        com.test.thrift.protocol.TListI32 i32ListField,
        com.test.thrift.protocol.TListI32 i32ListFieldRequired
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
            
        
            this.action = action;
            
        
            this.actionRequired = actionRequired;
            
        
            this.i32ListField = i32ListField;
            
        
            this.i32ListFieldRequired = i32ListFieldRequired;
            
        
    }


/**
* Performs a deep copy on <i>other</i>.
*/
public FieldRequiredTest(FieldRequiredTest other) {
    __isset_bitfield = other.__isset_bitfield;
    
        this.i32Field = other.i32Field;
    
        this.i32FieldRequired = other.i32FieldRequired;
    
        this.i32FieldOptional = other.i32FieldOptional;
    
        
    if (other.isSetStringField()){
                this.stringField = other.stringField;
                }
    
        
    if (other.isSetStringFieldRequired()){
                this.stringFieldRequired = other.stringFieldRequired;
                }
    
        
    if (other.isSetStringFieldOptional()){
                this.stringFieldOptional = other.stringFieldOptional;
                }
    
        
    if (other.isSetBinaryField()){
        this.binaryField = com.test.thrift.Helpers.copyBinary(other.binaryField);
        }
    
        
    if (other.isSetBinaryFieldRequired()){
        this.binaryFieldRequired = com.test.thrift.Helpers.copyBinary(other.binaryFieldRequired);
        }
    
        
    if (other.isSetBinaryFieldOptional()){
        this.binaryFieldOptional = com.test.thrift.Helpers.copyBinary(other.binaryFieldOptional);
        }
    
        
    if (other.isSetAction()){
                this.action = other.action;
                }
    
        
    if (other.isSetActionRequired()){
                this.actionRequired = other.actionRequired;
                }
    
        
    if (other.isSetActionOptional()){
                this.actionOptional = other.actionOptional;
                }
    
        this.i32ListField = other.i32ListField;
    
        this.i32ListFieldRequired = other.i32ListFieldRequired;
    
        this.i32ListFieldOptional = other.i32ListFieldOptional;
    
}

public FieldRequiredTest deepCopy() {
    return new FieldRequiredTest(this);
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
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.i32Field = iprot.readI32();
                  this.setI32FieldIsSet(true);
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
    
                case -3:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.i32FieldOptional = iprot.readI32();
                  this.setI32FieldOptionalIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -4:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.stringField = iprot.readString();
                  this.setStringFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -5:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.stringFieldRequired = iprot.readString();
                  this.setStringFieldRequiredIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -6:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.stringFieldOptional = iprot.readString();
                  this.setStringFieldOptionalIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -7:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.binaryField = iprot.readBinary();
                  this.setBinaryFieldIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -8:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.binaryFieldRequired = iprot.readBinary();
                  this.setBinaryFieldRequiredIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -9:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                  this.binaryFieldOptional = iprot.readBinary();
                  this.setBinaryFieldOptionalIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -10:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.action = com.test.thrift.Action.findByValue(iprot.readI32());
                  this.setActionIsSet(true);
                } else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -11:{
                    if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                  this.actionRequired = com.test.thrift.Action.findByValue(iprot.readI32());
                  this.setActionRequiredIsSet(true);
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
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection817 = iprot.readListBegin();
                        i32ListField = new com.test.thrift.protocol.TListI32(_collection817.size);
                        int _elem818;
                        for(int _i819=0;_i819 < _collection817.size; ++ _i819 ) { 
                            _elem818 = iprot.readI32();
                            i32ListField.add(_elem818);
                        }
                        iprot.readListEnd();
                    }
                    this.setI32ListFieldIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -14:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection820 = iprot.readListBegin();
                        i32ListFieldRequired = new com.test.thrift.protocol.TListI32(_collection820.size);
                        int _elem821;
                        for(int _i822=0;_i822 < _collection820.size; ++ _i822 ) { 
                            _elem821 = iprot.readI32();
                            i32ListFieldRequired.add(_elem821);
                        }
                        iprot.readListEnd();
                    }
                    this.setI32ListFieldRequiredIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -15:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection823 = iprot.readListBegin();
                        i32ListFieldOptional = new com.test.thrift.protocol.TListI32(_collection823.size);
                        int _elem824;
                        for(int _i825=0;_i825 < _collection823.size; ++ _i825 ) { 
                            _elem824 = iprot.readI32();
                            i32ListFieldOptional.add(_elem824);
                        }
                        iprot.readListEnd();
                    }
                    this.setI32ListFieldOptionalIsSet(true); }
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
        
            
                if (i32ListFieldOptional != null) {
                    oprot.writeFieldBegin("i32ListFieldOptional", org.apache.thrift.protocol.TType.LIST, (short)-15);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, i32ListFieldOptional.size());
                    for (int i = 0; i <  i32ListFieldOptional.size(); i++) { 
                        oprot.writeI32(i32ListFieldOptional.get(i));
                    }
                 }
                
        
            
                if (i32ListFieldRequired != null) {
                    oprot.writeFieldBegin("i32ListFieldRequired", org.apache.thrift.protocol.TType.LIST, (short)-14);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, i32ListFieldRequired.size());
                    for (int i = 0; i <  i32ListFieldRequired.size(); i++) { 
                        oprot.writeI32(i32ListFieldRequired.get(i));
                    }
                 }
                
        
            
                if (i32ListField != null) {
                    oprot.writeFieldBegin("i32ListField", org.apache.thrift.protocol.TType.LIST, (short)-13);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, i32ListField.size());
                    for (int i = 0; i <  i32ListField.size(); i++) { 
                        oprot.writeI32(i32ListField.get(i));
                    }
                 }
                
        
            
     if (actionOptional != null) { 
    
                          oprot.writeFieldBegin("actionOptional", org.apache.thrift.protocol.TType.I32, (short)-12);
                           oprot.writeI32(actionOptional.getValue()); 
                      
     } 
        
            
     if (actionRequired != null) { 
    
                          oprot.writeFieldBegin("actionRequired", org.apache.thrift.protocol.TType.I32, (short)-11);
                           oprot.writeI32(actionRequired.getValue()); 
                      
     } 
        
            
     if (action != null) { 
    
                          oprot.writeFieldBegin("action", org.apache.thrift.protocol.TType.I32, (short)-10);
                           oprot.writeI32(action.getValue()); 
                      
     } 
        
            
     if (binaryFieldOptional != null) { 
    
                          oprot.writeFieldBegin("binaryFieldOptional", org.apache.thrift.protocol.TType.STRING, (short)-9);
                           oprot.writeBinary(binaryFieldOptional); 
                      
     } 
        
            
     if (binaryFieldRequired != null) { 
    
                          oprot.writeFieldBegin("binaryFieldRequired", org.apache.thrift.protocol.TType.STRING, (short)-8);
                           oprot.writeBinary(binaryFieldRequired); 
                      
     } 
        
            
     if (binaryField != null) { 
    
                          oprot.writeFieldBegin("binaryField", org.apache.thrift.protocol.TType.STRING, (short)-7);
                           oprot.writeBinary(binaryField); 
                      
     } 
        
            
     if (stringFieldOptional != null) { 
    
                          oprot.writeFieldBegin("stringFieldOptional", org.apache.thrift.protocol.TType.STRING, (short)-6);
                           oprot.writeString(stringFieldOptional); 
                      
     } 
        
            
     if (stringFieldRequired != null) { 
    
                          oprot.writeFieldBegin("stringFieldRequired", org.apache.thrift.protocol.TType.STRING, (short)-5);
                           oprot.writeString(stringFieldRequired); 
                      
     } 
        
            
     if (stringField != null) { 
    
                          oprot.writeFieldBegin("stringField", org.apache.thrift.protocol.TType.STRING, (short)-4);
                           oprot.writeString(stringField); 
                      
     } 
        
            
    
     if(isSetI32FieldOptional()){ 
                          oprot.writeFieldBegin("i32FieldOptional", org.apache.thrift.protocol.TType.I32, (short)-3);
                           oprot.writeI32(i32FieldOptional); 
                        } 
    
        
            
    
    
                          oprot.writeFieldBegin("i32FieldRequired", org.apache.thrift.protocol.TType.I32, (short)-2);
                           oprot.writeI32(i32FieldRequired); 
                      
    
        
            
    
    
                          oprot.writeFieldBegin("i32Field", org.apache.thrift.protocol.TType.I32, (short)-1);
                           oprot.writeI32(i32Field); 
                      
    
        

        oprot.writeFieldStop();
    }



}