/**
 * RegisterLbServerResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class RegisterLbServerResponse  extends com.profitbricks.api.ws.VersionResponse  implements java.io.Serializable {
    private java.lang.String loadBalancerId;

    private int lanId;

    private com.profitbricks.api.ws.BalancedServer[] balancedServers;

    public RegisterLbServerResponse() {
    }

    public RegisterLbServerResponse(
           java.lang.String requestId,
           java.lang.String dataCenterId,
           java.lang.Integer dataCenterVersion,
           java.lang.String loadBalancerId,
           int lanId,
           com.profitbricks.api.ws.BalancedServer[] balancedServers) {
        super(
            requestId,
            dataCenterId,
            dataCenterVersion);
        this.loadBalancerId = loadBalancerId;
        this.lanId = lanId;
        this.balancedServers = balancedServers;
    }


    /**
     * Gets the loadBalancerId value for this RegisterLbServerResponse.
     * 
     * @return loadBalancerId
     */
    public java.lang.String getLoadBalancerId() {
        return loadBalancerId;
    }


    /**
     * Sets the loadBalancerId value for this RegisterLbServerResponse.
     * 
     * @param loadBalancerId
     */
    public void setLoadBalancerId(java.lang.String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }


    /**
     * Gets the lanId value for this RegisterLbServerResponse.
     * 
     * @return lanId
     */
    public int getLanId() {
        return lanId;
    }


    /**
     * Sets the lanId value for this RegisterLbServerResponse.
     * 
     * @param lanId
     */
    public void setLanId(int lanId) {
        this.lanId = lanId;
    }


    /**
     * Gets the balancedServers value for this RegisterLbServerResponse.
     * 
     * @return balancedServers
     */
    public com.profitbricks.api.ws.BalancedServer[] getBalancedServers() {
        return balancedServers;
    }


    /**
     * Sets the balancedServers value for this RegisterLbServerResponse.
     * 
     * @param balancedServers
     */
    public void setBalancedServers(com.profitbricks.api.ws.BalancedServer[] balancedServers) {
        this.balancedServers = balancedServers;
    }

    public com.profitbricks.api.ws.BalancedServer getBalancedServers(int i) {
        return this.balancedServers[i];
    }

    public void setBalancedServers(int i, com.profitbricks.api.ws.BalancedServer _value) {
        this.balancedServers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterLbServerResponse)) return false;
        RegisterLbServerResponse other = (RegisterLbServerResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.loadBalancerId==null && other.getLoadBalancerId()==null) || 
             (this.loadBalancerId!=null &&
              this.loadBalancerId.equals(other.getLoadBalancerId()))) &&
            this.lanId == other.getLanId() &&
            ((this.balancedServers==null && other.getBalancedServers()==null) || 
             (this.balancedServers!=null &&
              java.util.Arrays.equals(this.balancedServers, other.getBalancedServers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLoadBalancerId() != null) {
            _hashCode += getLoadBalancerId().hashCode();
        }
        _hashCode += getLanId();
        if (getBalancedServers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalancedServers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalancedServers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterLbServerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "registerLbServerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadBalancerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadBalancerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancedServers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balancedServers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "balancedServer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
