/**
 * VirtualItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class VirtualItemType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualItemType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TYPE_OTHER = "TYPE_OTHER";
    public static final java.lang.String _TYPE_SERVER = "TYPE_SERVER";
    public static final java.lang.String _TYPE_STORAGE = "TYPE_STORAGE";
    public static final java.lang.String _TYPE_IMAGE = "TYPE_IMAGE";
    public static final java.lang.String _TYPE_LOADBALANCER = "TYPE_LOADBALANCER";
    public static final java.lang.String _TYPE_NIC = "TYPE_NIC";
    public static final java.lang.String _TYPE_FIREWALL = "TYPE_FIREWALL";
    public static final VirtualItemType TYPE_OTHER = new VirtualItemType(_TYPE_OTHER);
    public static final VirtualItemType TYPE_SERVER = new VirtualItemType(_TYPE_SERVER);
    public static final VirtualItemType TYPE_STORAGE = new VirtualItemType(_TYPE_STORAGE);
    public static final VirtualItemType TYPE_IMAGE = new VirtualItemType(_TYPE_IMAGE);
    public static final VirtualItemType TYPE_LOADBALANCER = new VirtualItemType(_TYPE_LOADBALANCER);
    public static final VirtualItemType TYPE_NIC = new VirtualItemType(_TYPE_NIC);
    public static final VirtualItemType TYPE_FIREWALL = new VirtualItemType(_TYPE_FIREWALL);
    public java.lang.String getValue() { return _value_;}
    public static VirtualItemType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualItemType enumeration = (VirtualItemType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualItemType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualItemType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "virtualItemType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
