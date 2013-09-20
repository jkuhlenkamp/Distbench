/**
 * ConnectedStorage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class ConnectedStorage  implements java.io.Serializable {
    private boolean bootDevice;

    private com.profitbricks.api.ws.BusType busType;

    private java.lang.Integer deviceNumber;

    private java.lang.Long size;

    private java.lang.String storageId;

    private java.lang.String storageName;

    public ConnectedStorage() {
    }

    public ConnectedStorage(
           boolean bootDevice,
           com.profitbricks.api.ws.BusType busType,
           java.lang.Integer deviceNumber,
           java.lang.Long size,
           java.lang.String storageId,
           java.lang.String storageName) {
           this.bootDevice = bootDevice;
           this.busType = busType;
           this.deviceNumber = deviceNumber;
           this.size = size;
           this.storageId = storageId;
           this.storageName = storageName;
    }


    /**
     * Gets the bootDevice value for this ConnectedStorage.
     * 
     * @return bootDevice
     */
    public boolean isBootDevice() {
        return bootDevice;
    }


    /**
     * Sets the bootDevice value for this ConnectedStorage.
     * 
     * @param bootDevice
     */
    public void setBootDevice(boolean bootDevice) {
        this.bootDevice = bootDevice;
    }


    /**
     * Gets the busType value for this ConnectedStorage.
     * 
     * @return busType
     */
    public com.profitbricks.api.ws.BusType getBusType() {
        return busType;
    }


    /**
     * Sets the busType value for this ConnectedStorage.
     * 
     * @param busType
     */
    public void setBusType(com.profitbricks.api.ws.BusType busType) {
        this.busType = busType;
    }


    /**
     * Gets the deviceNumber value for this ConnectedStorage.
     * 
     * @return deviceNumber
     */
    public java.lang.Integer getDeviceNumber() {
        return deviceNumber;
    }


    /**
     * Sets the deviceNumber value for this ConnectedStorage.
     * 
     * @param deviceNumber
     */
    public void setDeviceNumber(java.lang.Integer deviceNumber) {
        this.deviceNumber = deviceNumber;
    }


    /**
     * Gets the size value for this ConnectedStorage.
     * 
     * @return size
     */
    public java.lang.Long getSize() {
        return size;
    }


    /**
     * Sets the size value for this ConnectedStorage.
     * 
     * @param size
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }


    /**
     * Gets the storageId value for this ConnectedStorage.
     * 
     * @return storageId
     */
    public java.lang.String getStorageId() {
        return storageId;
    }


    /**
     * Sets the storageId value for this ConnectedStorage.
     * 
     * @param storageId
     */
    public void setStorageId(java.lang.String storageId) {
        this.storageId = storageId;
    }


    /**
     * Gets the storageName value for this ConnectedStorage.
     * 
     * @return storageName
     */
    public java.lang.String getStorageName() {
        return storageName;
    }


    /**
     * Sets the storageName value for this ConnectedStorage.
     * 
     * @param storageName
     */
    public void setStorageName(java.lang.String storageName) {
        this.storageName = storageName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectedStorage)) return false;
        ConnectedStorage other = (ConnectedStorage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bootDevice == other.isBootDevice() &&
            ((this.busType==null && other.getBusType()==null) || 
             (this.busType!=null &&
              this.busType.equals(other.getBusType()))) &&
            ((this.deviceNumber==null && other.getDeviceNumber()==null) || 
             (this.deviceNumber!=null &&
              this.deviceNumber.equals(other.getDeviceNumber()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.storageId==null && other.getStorageId()==null) || 
             (this.storageId!=null &&
              this.storageId.equals(other.getStorageId()))) &&
            ((this.storageName==null && other.getStorageName()==null) || 
             (this.storageName!=null &&
              this.storageName.equals(other.getStorageName())));
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
        _hashCode += (isBootDevice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBusType() != null) {
            _hashCode += getBusType().hashCode();
        }
        if (getDeviceNumber() != null) {
            _hashCode += getDeviceNumber().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getStorageId() != null) {
            _hashCode += getStorageId().hashCode();
        }
        if (getStorageName() != null) {
            _hashCode += getStorageName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectedStorage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "connectedStorage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bootDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageId"));
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
