/**
 * CreateSnapshotRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class CreateSnapshotRequest  implements java.io.Serializable {
    private java.lang.String storageId;

    private java.lang.String description;

    private java.lang.String snapshotName;

    public CreateSnapshotRequest() {
    }

    public CreateSnapshotRequest(
           java.lang.String storageId,
           java.lang.String description,
           java.lang.String snapshotName) {
           this.storageId = storageId;
           this.description = description;
           this.snapshotName = snapshotName;
    }


    /**
     * Gets the storageId value for this CreateSnapshotRequest.
     * 
     * @return storageId
     */
    public java.lang.String getStorageId() {
        return storageId;
    }


    /**
     * Sets the storageId value for this CreateSnapshotRequest.
     * 
     * @param storageId
     */
    public void setStorageId(java.lang.String storageId) {
        this.storageId = storageId;
    }


    /**
     * Gets the description value for this CreateSnapshotRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CreateSnapshotRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the snapshotName value for this CreateSnapshotRequest.
     * 
     * @return snapshotName
     */
    public java.lang.String getSnapshotName() {
        return snapshotName;
    }


    /**
     * Sets the snapshotName value for this CreateSnapshotRequest.
     * 
     * @param snapshotName
     */
    public void setSnapshotName(java.lang.String snapshotName) {
        this.snapshotName = snapshotName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSnapshotRequest)) return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.snapshotName==null && other.getSnapshotName()==null) || 
             (this.snapshotName!=null &&
              this.snapshotName.equals(other.getSnapshotName())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSnapshotName() != null) {
            _hashCode += getSnapshotName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSnapshotRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createSnapshotRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snapshotName"));
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
