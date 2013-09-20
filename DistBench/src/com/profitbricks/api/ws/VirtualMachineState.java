/**
 * VirtualMachineState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class VirtualMachineState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOSTATE = "NOSTATE";
    public static final java.lang.String _RUNNING = "RUNNING";
    public static final java.lang.String _BLOCKED = "BLOCKED";
    public static final java.lang.String _PAUSED = "PAUSED";
    public static final java.lang.String _SHUTDOWN = "SHUTDOWN";
    public static final java.lang.String _SHUTOFF = "SHUTOFF";
    public static final java.lang.String _CRASHED = "CRASHED";
    public static final VirtualMachineState NOSTATE = new VirtualMachineState(_NOSTATE);
    public static final VirtualMachineState RUNNING = new VirtualMachineState(_RUNNING);
    public static final VirtualMachineState BLOCKED = new VirtualMachineState(_BLOCKED);
    public static final VirtualMachineState PAUSED = new VirtualMachineState(_PAUSED);
    public static final VirtualMachineState SHUTDOWN = new VirtualMachineState(_SHUTDOWN);
    public static final VirtualMachineState SHUTOFF = new VirtualMachineState(_SHUTOFF);
    public static final VirtualMachineState CRASHED = new VirtualMachineState(_CRASHED);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineState enumeration = (VirtualMachineState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "virtualMachineState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
