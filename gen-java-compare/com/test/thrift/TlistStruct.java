
package com.test.thrift;

public  class TlistStruct implements com.test.thrift.IBase {

    
    
    
    public com.test.thrift.protocol.TListI32 listI32Field;
    
    
    public com.test.thrift.protocol.TListI64 listI64Field;
    
    
    public com.test.thrift.protocol.TListDouble listDoubleField;

          
    private byte __isset_bitfield = 0;


    
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

        public TlistStruct setListI32Field(com.test.thrift.protocol.TListI32 listI32Field) {
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

        public TlistStruct setListI64Field(com.test.thrift.protocol.TListI64 listI64Field) {
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

        public TlistStruct setListDoubleField(com.test.thrift.protocol.TListDouble listDoubleField) {
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
    


    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
          return false;
        if (that instanceof TlistStruct)
          return this.equals((TlistStruct)that);
        return false;
    }

    public boolean equals(TlistStruct that) {
        if (that == null)
            return false;
        if (this == that)
            return true;
        
            
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
            
        
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TlistStruct(");
        
            
            
                    sb.append("listI32Field:");
                    if (this.listI32Field == null) {
                        sb.append("null");
                    } else {
                        sb.append(this.listI32Field);
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
            
                    
            

        
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        
            
                hashCode = hashCode * 8191 + ((isSetListI32Field()) ? 131071 : 524287);
                if (isSetListI32Field())
                    hashCode = hashCode * 8191 + listI32Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListI64Field()) ? 131071 : 524287);
                if (isSetListI64Field())
                    hashCode = hashCode * 8191 + listI64Field.hashCode();
            
        
            
                hashCode = hashCode * 8191 + ((isSetListDoubleField()) ? 131071 : 524287);
                if (isSetListDoubleField())
                    hashCode = hashCode * 8191 + listDoubleField.hashCode();
            
        
        return hashCode;
    }

    public void clear() {
        
            
                this.listI32Field = null;
            
        
            
                this.listI64Field = null;
            
        
            
                this.listDoubleField = null;
            
        
    }

    public void validate() throws com.test.thrift.TException {
        
            
                 
            
        
            
                 
            
        
            
                 
            
        

        
            
        
            
        
            
        
    }

    public int size() {
        int size = 1; // writeFieldStop() need 1 byte;
        
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
        
            // listI32Field
            
                if (listI32Field != null) {
                    size += 8;
                    
                        size += (4) * listI32Field.size();
                    
                }
        
        return size;
    }

    public TlistStruct() {
    
        
    
        
    
        
    
}


    public TlistStruct(
    
        com.test.thrift.protocol.TListI32 listI32Field,
        com.test.thrift.protocol.TListI64 listI64Field,
        com.test.thrift.protocol.TListDouble listDoubleField
    ) {
        this();
        
            this.listI32Field = listI32Field;
            
        
            this.listI64Field = listI64Field;
            
        
            this.listDoubleField = listDoubleField;
            
        
    }


/**
* Performs a deep copy on <i>other</i>.
*/
public TlistStruct(TlistStruct other) {
    
    
        this.listI32Field = other.listI32Field;
    
        this.listI64Field = other.listI64Field;
    
        this.listDoubleField = other.listDoubleField;
    
}

public TlistStruct deepCopy() {
    return new TlistStruct(this);
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
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection808 = iprot.readListBegin();
                        listI32Field = new com.test.thrift.protocol.TListI32(_collection808.size);
                        int _elem809;
                        for(int _i810=0;_i810 < _collection808.size; ++ _i810 ) { 
                            _elem809 = iprot.readI32();
                            listI32Field.add(_elem809);
                        }
                        iprot.readListEnd();
                    }
                    this.setListI32FieldIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -2:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection811 = iprot.readListBegin();
                        listI64Field = new com.test.thrift.protocol.TListI64(_collection811.size);
                        long _elem812;
                        for(int _i813=0;_i813 < _collection811.size; ++ _i813 ) { 
                            _elem812 = iprot.readI64();
                            listI64Field.add(_elem812);
                        }
                        iprot.readListEnd();
                    }
                    this.setListI64FieldIsSet(true); }
                 else {
                      com.test.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                    }
                break;
                }
    
                case -3:{
                    
                    if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                    {
                        com.test.thrift.protocol.TList _collection814 = iprot.readListBegin();
                        listDoubleField = new com.test.thrift.protocol.TListDouble(_collection814.size);
                        double _elem815;
                        for(int _i816=0;_i816 < _collection814.size; ++ _i816 ) { 
                            _elem815 = iprot.readDouble();
                            listDoubleField.add(_elem815);
                        }
                        iprot.readListEnd();
                    }
                    this.setListDoubleFieldIsSet(true); }
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
        
            
                if (listDoubleField != null) {
                    oprot.writeFieldBegin("listDoubleField", org.apache.thrift.protocol.TType.LIST, (short)-3);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.DOUBLE, listDoubleField.size());
                    for (int i = 0; i <  listDoubleField.size(); i++) { 
                        oprot.writeDouble(listDoubleField.get(i));
                    }
                 }
                
        
            
                if (listI64Field != null) {
                    oprot.writeFieldBegin("listI64Field", org.apache.thrift.protocol.TType.LIST, (short)-2);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I64, listI64Field.size());
                    for (int i = 0; i <  listI64Field.size(); i++) { 
                        oprot.writeI64(listI64Field.get(i));
                    }
                 }
                
        
            
                if (listI32Field != null) {
                    oprot.writeFieldBegin("listI32Field", org.apache.thrift.protocol.TType.LIST, (short)-1);
                    oprot.writeListBegin(org.apache.thrift.protocol.TType.I32, listI32Field.size());
                    for (int i = 0; i <  listI32Field.size(); i++) { 
                        oprot.writeI32(listI32Field.get(i));
                    }
                 }
                
        

        oprot.writeFieldStop();
    }



}