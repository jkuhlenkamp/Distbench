/**
 * CreateStorageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class CreateStorageRequest  implements java.io.Serializable {
    private java.lang.String dataCenterId;

    private java.lang.String storageName;

    private long size;

    private java.lang.String mountImageId;

    private java.lang.String profitBricksImagePassword;

    public CreateStorageRequest() {
    }

    public CreateStorageRequest(
           java.lang.String dataCenterId,
           java.lang.String storageName,
           long size,
           java.lang.String mountImageId,
           java.lang.String profitBricksImagePassword) {
           this.dataCenterId = dataCenterId;
           this.storageName = storageName;
           this.size = size;
           this.mountImageId = mountImageId;
           this.profitBricksImagePassword = profitBricksImagePassword;
    }


    /**
     * Gets the dataCenterId value for this CreateStorageRequest.
     * 
     * @return dataCenterId
     */
    public java.lang.String getDataCenterId() {
        return dataCenterId;
    }


    /**
     * Sets the dataCenterId value for this CreateStorageRequest.
     * 
     * @param dataCenterId
     */
    public void setDataCenterId(java.lang.String dataCenterId) {
        this.dataCenterId = dataCenterId;
    }


    /**
     * Gets the storageName value for this CreateStorageRequest.
     * 
     * @return storageName
     */
    public java.lang.String getStorageName() {
        return storageName;
    }


    /**
     * Sets the storageName value for this CreateStorageRequest.
     * 
     * @param storageName
     */
    public void setStorageName(java.lang.String storageName) {
        this.storageName = storageName;
    }


    /**
     * Gets the size value for this CreateStorageRequest.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this CreateStorageRequest.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }


    /**
     * Gets the mountImageId value for this CreateStorageRequest.
     * 
     * @return mountImageId
     */
    public java.lang.String getMountImageId() {
        return mountImageId;
    }


    /**
     * Sets the mountImageId value for this CreateStorageRequest.
     * 
     * @param mountImageId
     */
    public void setMountImageId(java.lang.String mountImageId) {
        this.mountImageId = mountImageId;
    }


    /**
     * Gets the profitBricksImagePassword value for this CreateStorageRequest.
     * 
     * @return profitBricksImagePassword
     */
    public java.lang.String getProfitBricksImagePassword() {
        return profitBricksImagePassword;
    }


    /**
     * Sets the profitBricksImagePassword value for this CreateStorageRequest.
     * 
     * @param profitBricksImagePassword
     */
    public void setProfitBricksImagePassword(java.lang.String profitBricksImagePassword) {
        this.profitBricksImagePassword = profitBricksImagePassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateStorageRequest)) return false;
        CreateStorageRequest other = (CreateStorageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataCenterId==null && other.getDataCenterId()==null) || 
             (this.dataCenterId!=null &&
              this.dataCenterId.equals(other.getDataCenterId()))) &&
            ((this.storageName==null && other.getStorageName()==null) || 
             (this.storageName!=null &&
              this.storageName.equals(other.getStorageName()))) &&
            this.size == other.getSize() &&
            ((this.mountImageId==null && other.getMountImageId()==null) || 
             (this.mountImageId!=null &&
              this.mountImageId.equals(other.getMountImageId()))) &&
            ((this.profitBricksImagePassword==null && other.getProfitBricksImagePassword()==null) || 
             (this.profitBricksImagePassword!=null &&
              this.profitBricksImagePassword.equals(other.getProfitBricksImagePassword())));
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
        if (getDataCenterId() != null) {
            _hashCode += getDataCenterId().hashCode();
        }
        if (getStorageName() != null) {
            _hashCode += getStorageName().hashCode();
        }
        _hashCode += new Long(getSize()).hashCode();
        if (getMountImageId() != null) {
            _hashCode += getMountImageId().hashCode();
        }
        if (getProfitBricksImagePassword() != null) {
            _hashCode += getProfitBricksImagePassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateStorageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createStorageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCenterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCenterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountImageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mountImageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitBricksImagePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profitBricksImagePassword"));
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
