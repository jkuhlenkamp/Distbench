/**
 * FaultCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class FaultCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FaultCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BAD_REQUEST = "BAD_REQUEST";
    public static final java.lang.String _UNEXPECTED = "UNEXPECTED";
    public static final java.lang.String _UNAUTHORIZED = "UNAUTHORIZED";
    public static final java.lang.String _RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND";
    public static final java.lang.String _RESOURCE_DELETED = "RESOURCE_DELETED";
    public static final java.lang.String _PROVISIONING_IN_PROCESS = "PROVISIONING_IN_PROCESS";
    public static final java.lang.String _PROVISIONING_NO_CHANGES = "PROVISIONING_NO_CHANGES";
    public static final java.lang.String _OVER_LIMIT_SETTING = "OVER_LIMIT_SETTING";
    public static final java.lang.String _SERVER_EXCEED_CAPACITY = "SERVER_EXCEED_CAPACITY";
    public static final java.lang.String _SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE";
    public static final FaultCode BAD_REQUEST = new FaultCode(_BAD_REQUEST);
    public static final FaultCode UNEXPECTED = new FaultCode(_UNEXPECTED);
    public static final FaultCode UNAUTHORIZED = new FaultCode(_UNAUTHORIZED);
    public static final FaultCode RESOURCE_NOT_FOUND = new FaultCode(_RESOURCE_NOT_FOUND);
    public static final FaultCode RESOURCE_DELETED = new FaultCode(_RESOURCE_DELETED);
    public static final FaultCode PROVISIONING_IN_PROCESS = new FaultCode(_PROVISIONING_IN_PROCESS);
    public static final FaultCode PROVISIONING_NO_CHANGES = new FaultCode(_PROVISIONING_NO_CHANGES);
    public static final FaultCode OVER_LIMIT_SETTING = new FaultCode(_OVER_LIMIT_SETTING);
    public static final FaultCode SERVER_EXCEED_CAPACITY = new FaultCode(_SERVER_EXCEED_CAPACITY);
    public static final FaultCode SERVICE_UNAVAILABLE = new FaultCode(_SERVICE_UNAVAILABLE);
    public java.lang.String getValue() { return _value_;}
    public static FaultCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FaultCode enumeration = (FaultCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FaultCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FaultCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "faultCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
