/**
 * ConnectStorageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class ConnectStorageRequest  implements java.io.Serializable {
    private java.lang.String serverId;

    private java.lang.String storageId;

    private com.profitbricks.api.ws.BusType busType;

    private java.lang.Integer deviceNumber;

    public ConnectStorageRequest() {
    }

    public ConnectStorageRequest(
           java.lang.String serverId,
           java.lang.String storageId,
           com.profitbricks.api.ws.BusType busType,
           java.lang.Integer deviceNumber) {
           this.serverId = serverId;
           this.storageId = storageId;
           this.busType = busType;
           this.deviceNumber = deviceNumber;
    }


    /**
     * Gets the serverId value for this ConnectStorageRequest.
     * 
     * @return serverId
     */
    public java.lang.String getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this ConnectStorageRequest.
     * 
     * @param serverId
     */
    public void setServerId(java.lang.String serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the storageId value for this ConnectStorageRequest.
     * 
     * @return storageId
     */
    public java.lang.String getStorageId() {
        return storageId;
    }


    /**
     * Sets the storageId value for this ConnectStorageRequest.
     * 
     * @param storageId
     */
    public void setStorageId(java.lang.String storageId) {
        this.storageId = storageId;
    }


    /**
     * Gets the busType value for this ConnectStorageRequest.
     * 
     * @return busType
     */
    public com.profitbricks.api.ws.BusType getBusType() {
        return busType;
    }


    /**
     * Sets the busType value for this ConnectStorageRequest.
     * 
     * @param busType
     */
    public void setBusType(com.profitbricks.api.ws.BusType busType) {
        this.busType = busType;
    }


    /**
     * Gets the deviceNumber value for this ConnectStorageRequest.
     * 
     * @return deviceNumber
     */
    public java.lang.Integer getDeviceNumber() {
        return deviceNumber;
    }


    /**
     * Sets the deviceNumber value for this ConnectStorageRequest.
     * 
     * @param deviceNumber
     */
    public void setDeviceNumber(java.lang.Integer deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectStorageRequest)) return false;
        ConnectStorageRequest other = (ConnectStorageRequest) obj;
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
            ((this.storageId==null && other.getStorageId()==null) || 
             (this.storageId!=null &&
              this.storageId.equals(other.getStorageId()))) &&
            ((this.busType==null && other.getBusType()==null) || 
             (this.busType!=null &&
              this.busType.equals(other.getBusType()))) &&
            ((this.deviceNumber==null && other.getDeviceNumber()==null) || 
             (this.deviceNumber!=null &&
              this.deviceNumber.equals(other.getDeviceNumber())));
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
        if (getStorageId() != null) {
            _hashCode += getStorageId().hashCode();
        }
        if (getBusType() != null) {
            _hashCode += getBusType().hashCode();
        }
        if (getDeviceNumber() != null) {
            _hashCode += getDeviceNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectStorageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "connectStorageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "busType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
