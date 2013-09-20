/**
 * CreateNicRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class CreateNicRequest  implements java.io.Serializable {
    private java.lang.String serverId;

    private int lanId;

    private java.lang.String nicName;

    private java.lang.String ip;

    private java.lang.Boolean dhcpActive;

    public CreateNicRequest() {
    }

    public CreateNicRequest(
           java.lang.String serverId,
           int lanId,
           java.lang.String nicName,
           java.lang.String ip,
           java.lang.Boolean dhcpActive) {
           this.serverId = serverId;
           this.lanId = lanId;
           this.nicName = nicName;
           this.ip = ip;
           this.dhcpActive = dhcpActive;
    }


    /**
     * Gets the serverId value for this CreateNicRequest.
     * 
     * @return serverId
     */
    public java.lang.String getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this CreateNicRequest.
     * 
     * @param serverId
     */
    public void setServerId(java.lang.String serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the lanId value for this CreateNicRequest.
     * 
     * @return lanId
     */
    public int getLanId() {
        return lanId;
    }


    /**
     * Sets the lanId value for this CreateNicRequest.
     * 
     * @param lanId
     */
    public void setLanId(int lanId) {
        this.lanId = lanId;
    }


    /**
     * Gets the nicName value for this CreateNicRequest.
     * 
     * @return nicName
     */
    public java.lang.String getNicName() {
        return nicName;
    }


    /**
     * Sets the nicName value for this CreateNicRequest.
     * 
     * @param nicName
     */
    public void setNicName(java.lang.String nicName) {
        this.nicName = nicName;
    }


    /**
     * Gets the ip value for this CreateNicRequest.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this CreateNicRequest.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the dhcpActive value for this CreateNicRequest.
     * 
     * @return dhcpActive
     */
    public java.lang.Boolean getDhcpActive() {
        return dhcpActive;
    }


    /**
     * Sets the dhcpActive value for this CreateNicRequest.
     * 
     * @param dhcpActive
     */
    public void setDhcpActive(java.lang.Boolean dhcpActive) {
        this.dhcpActive = dhcpActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateNicRequest)) return false;
        CreateNicRequest other = (CreateNicRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverId==null && other.getServerId()==null) || 
             (this.serverId!=null &&
              this.serverId.equals(other.getServerId()))) &&
            this.lanId == other.getLanId() &&
            ((this.nicName==null && other.getNicName()==null) || 
             (this.nicName!=null &&
              this.nicName.equals(other.getNicName()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.dhcpActive==null && other.getDhcpActive()==null) || 
             (this.dhcpActive!=null &&
              this.dhcpActive.equals(other.getDhcpActive())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
        }
        _hashCode += getLanId();
        if (getNicName() != null) {
            _hashCode += getNicName().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getDhcpActive() != null) {
            _hashCode += getDhcpActive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateNicRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createNicRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcpActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dhcpActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
