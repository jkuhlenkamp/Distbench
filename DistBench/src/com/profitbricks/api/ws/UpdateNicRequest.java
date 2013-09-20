/**
 * UpdateNicRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class UpdateNicRequest  implements java.io.Serializable {
    private java.lang.String nicId;

    private java.lang.Integer lanId;

    private java.lang.String nicName;

    private java.lang.String ip;

    private java.lang.Boolean dhcpActive;

    public UpdateNicRequest() {
    }

    public UpdateNicRequest(
           java.lang.String nicId,
           java.lang.Integer lanId,
           java.lang.String nicName,
           java.lang.String ip,
           java.lang.Boolean dhcpActive) {
           this.nicId = nicId;
           this.lanId = lanId;
           this.nicName = nicName;
           this.ip = ip;
           this.dhcpActive = dhcpActive;
    }


    /**
     * Gets the nicId value for this UpdateNicRequest.
     * 
     * @return nicId
     */
    public java.lang.String getNicId() {
        return nicId;
    }


    /**
     * Sets the nicId value for this UpdateNicRequest.
     * 
     * @param nicId
     */
    public void setNicId(java.lang.String nicId) {
        this.nicId = nicId;
    }


    /**
     * Gets the lanId value for this UpdateNicRequest.
     * 
     * @return lanId
     */
    public java.lang.Integer getLanId() {
        return lanId;
    }


    /**
     * Sets the lanId value for this UpdateNicRequest.
     * 
     * @param lanId
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }


    /**
     * Gets the nicName value for this UpdateNicRequest.
     * 
     * @return nicName
     */
    public java.lang.String getNicName() {
        return nicName;
    }


    /**
     * Sets the nicName value for this UpdateNicRequest.
     * 
     * @param nicName
     */
    public void setNicName(java.lang.String nicName) {
        this.nicName = nicName;
    }


    /**
     * Gets the ip value for this UpdateNicRequest.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this UpdateNicRequest.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the dhcpActive value for this UpdateNicRequest.
     * 
     * @return dhcpActive
     */
    public java.lang.Boolean getDhcpActive() {
        return dhcpActive;
    }


    /**
     * Sets the dhcpActive value for this UpdateNicRequest.
     * 
     * @param dhcpActive
     */
    public void setDhcpActive(java.lang.Boolean dhcpActive) {
        this.dhcpActive = dhcpActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateNicRequest)) return false;
        UpdateNicRequest other = (UpdateNicRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nicId==null && other.getNicId()==null) || 
             (this.nicId!=null &&
              this.nicId.equals(other.getNicId()))) &&
            ((this.lanId==null && other.getLanId()==null) || 
             (this.lanId!=null &&
              this.lanId.equals(other.getLanId()))) &&
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
        if (getNicId() != null) {
            _hashCode += getNicId().hashCode();
        }
        if (getLanId() != null) {
            _hashCode += getLanId().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(UpdateNicRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateNicRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
