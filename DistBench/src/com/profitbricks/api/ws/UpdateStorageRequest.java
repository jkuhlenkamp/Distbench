/**
 * UpdateStorageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class UpdateStorageRequest  implements java.io.Serializable {
    private java.lang.String storageId;

    private java.lang.Long size;

    private java.lang.String storageName;

    private java.lang.String mountImageId;

    public UpdateStorageRequest() {
    }

    public UpdateStorageRequest(
           java.lang.String storageId,
           java.lang.Long size,
           java.lang.String storageName,
           java.lang.String mountImageId) {
           this.storageId = storageId;
           this.size = size;
           this.storageName = storageName;
           this.mountImageId = mountImageId;
    }


    /**
     * Gets the storageId value for this UpdateStorageRequest.
     * 
     * @return storageId
     */
    public java.lang.String getStorageId() {
        return storageId;
    }


    /**
     * Sets the storageId value for this UpdateStorageRequest.
     * 
     * @param storageId
     */
    public void setStorageId(java.lang.String storageId) {
        this.storageId = storageId;
    }


    /**
     * Gets the size value for this UpdateStorageRequest.
     * 
     * @return size
     */
    public java.lang.Long getSize() {
        return size;
    }


    /**
     * Sets the size value for this UpdateStorageRequest.
     * 
     * @param size
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }


    /**
     * Gets the storageName value for this UpdateStorageRequest.
     * 
     * @return storageName
     */
    public java.lang.String getStorageName() {
        return storageName;
    }


    /**
     * Sets the storageName value for this UpdateStorageRequest.
     * 
     * @param storageName
     */
    public void setStorageName(java.lang.String storageName) {
        this.storageName = storageName;
    }


    /**
     * Gets the mountImageId value for this UpdateStorageRequest.
     * 
     * @return mountImageId
     */
    public java.lang.String getMountImageId() {
        return mountImageId;
    }


    /**
     * Sets the mountImageId value for this UpdateStorageRequest.
     * 
     * @param mountImageId
     */
    public void setMountImageId(java.lang.String mountImageId) {
        this.mountImageId = mountImageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateStorageRequest)) return false;
        UpdateStorageRequest other = (UpdateStorageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storageId==null && other.getStorageId()==null) || 
             (this.storageId!=null &&
              this.storageId.equals(other.getStorageId()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.storageName==null && other.getStorageName()==null) || 
             (this.storageName!=null &&
              this.storageName.equals(other.getStorageName()))) &&
            ((this.mountImageId==null && other.getMountImageId()==null) || 
             (this.mountImageId!=null &&
              this.mountImageId.equals(other.getMountImageId())));
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
        if (getStorageId() != null) {
            _hashCode += getStorageId().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getStorageName() != null) {
            _hashCode += getStorageName().hashCode();
        }
        if (getMountImageId() != null) {
            _hashCode += getMountImageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateStorageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateStorageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountImageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mountImageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
