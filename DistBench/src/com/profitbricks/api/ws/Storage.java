/**
 * Storage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class Storage  extends com.profitbricks.api.ws.VersionResponse  implements java.io.Serializable {
    private java.lang.String storageId;

    private java.lang.Long size;

    private java.lang.String storageName;

    private com.profitbricks.api.ws.MountImage mountImage;

    private java.lang.String[] serverIds;

    private com.profitbricks.api.ws.ProvisioningState provisioningState;

    private java.util.Calendar creationTime;

    private java.util.Calendar lastModificationTime;

    public Storage() {
    }

    public Storage(
           java.lang.String requestId,
           java.lang.String dataCenterId,
           java.lang.Integer dataCenterVersion,
           java.lang.String storageId,
           java.lang.Long size,
           java.lang.String storageName,
           com.profitbricks.api.ws.MountImage mountImage,
           java.lang.String[] serverIds,
           com.profitbricks.api.ws.ProvisioningState provisioningState,
           java.util.Calendar creationTime,
           java.util.Calendar lastModificationTime) {
        super(
            requestId,
            dataCenterId,
            dataCenterVersion);
        this.storageId = storageId;
        this.size = size;
        this.storageName = storageName;
        this.mountImage = mountImage;
        this.serverIds = serverIds;
        this.provisioningState = provisioningState;
        this.creationTime = creationTime;
        this.lastModificationTime = lastModificationTime;
    }


    /**
     * Gets the storageId value for this Storage.
     * 
     * @return storageId
     */
    public java.lang.String getStorageId() {
        return storageId;
    }


    /**
     * Sets the storageId value for this Storage.
     * 
     * @param storageId
     */
    public void setStorageId(java.lang.String storageId) {
        this.storageId = storageId;
    }


    /**
     * Gets the size value for this Storage.
     * 
     * @return size
     */
    public java.lang.Long getSize() {
        return size;
    }


    /**
     * Sets the size value for this Storage.
     * 
     * @param size
     */
    public void setSize(java.lang.Long size) {
        this.size = size;
    }


    /**
     * Gets the storageName value for this Storage.
     * 
     * @return storageName
     */
    public java.lang.String getStorageName() {
        return storageName;
    }


    /**
     * Sets the storageName value for this Storage.
     * 
     * @param storageName
     */
    public void setStorageName(java.lang.String storageName) {
        this.storageName = storageName;
    }


    /**
     * Gets the mountImage value for this Storage.
     * 
     * @return mountImage
     */
    public com.profitbricks.api.ws.MountImage getMountImage() {
        return mountImage;
    }


    /**
     * Sets the mountImage value for this Storage.
     * 
     * @param mountImage
     */
    public void setMountImage(com.profitbricks.api.ws.MountImage mountImage) {
        this.mountImage = mountImage;
    }


    /**
     * Gets the serverIds value for this Storage.
     * 
     * @return serverIds
     */
    public java.lang.String[] getServerIds() {
        return serverIds;
    }


    /**
     * Sets the serverIds value for this Storage.
     * 
     * @param serverIds
     */
    public void setServerIds(java.lang.String[] serverIds) {
        this.serverIds = serverIds;
    }

    public java.lang.String getServerIds(int i) {
        return this.serverIds[i];
    }

    public void setServerIds(int i, java.lang.String _value) {
        this.serverIds[i] = _value;
    }


    /**
     * Gets the provisioningState value for this Storage.
     * 
     * @return provisioningState
     */
    public com.profitbricks.api.ws.ProvisioningState getProvisioningState() {
        return provisioningState;
    }


    /**
     * Sets the provisioningState value for this Storage.
     * 
     * @param provisioningState
     */
    public void setProvisioningState(com.profitbricks.api.ws.ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
    }


    /**
     * Gets the creationTime value for this Storage.
     * 
     * @return creationTime
     */
    public java.util.Calendar getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this Storage.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.util.Calendar creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the lastModificationTime value for this Storage.
     * 
     * @return lastModificationTime
     */
    public java.util.Calendar getLastModificationTime() {
        return lastModificationTime;
    }


    /**
     * Sets the lastModificationTime value for this Storage.
     * 
     * @param lastModificationTime
     */
    public void setLastModificationTime(java.util.Calendar lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Storage)) return false;
        Storage other = (Storage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.storageId==null && other.getStorageId()==null) || 
             (this.storageId!=null &&
              this.storageId.equals(other.getStorageId()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.storageName==null && other.getStorageName()==null) || 
             (this.storageName!=null &&
              this.storageName.equals(other.getStorageName()))) &&
            ((this.mountImage==null && other.getMountImage()==null) || 
             (this.mountImage!=null &&
              this.mountImage.equals(other.getMountImage()))) &&
            ((this.serverIds==null && other.getServerIds()==null) || 
             (this.serverIds!=null &&
              java.util.Arrays.equals(this.serverIds, other.getServerIds()))) &&
            ((this.provisioningState==null && other.getProvisioningState()==null) || 
             (this.provisioningState!=null &&
              this.provisioningState.equals(other.getProvisioningState()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.lastModificationTime==null && other.getLastModificationTime()==null) || 
             (this.lastModificationTime!=null &&
              this.lastModificationTime.equals(other.getLastModificationTime())));
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
        if (getStorageId() != null) {
            _hashCode += getStorageId().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getStorageName() != null) {
            _hashCode += getStorageName().hashCode();
        }
        if (getMountImage() != null) {
            _hashCode += getMountImage().hashCode();
        }
        if (getServerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProvisioningState() != null) {
            _hashCode += getProvisioningState().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getLastModificationTime() != null) {
            _hashCode += getLastModificationTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Storage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "storage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("storageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mountImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "mountImage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provisioningState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "provisioningState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModificationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastModificationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
