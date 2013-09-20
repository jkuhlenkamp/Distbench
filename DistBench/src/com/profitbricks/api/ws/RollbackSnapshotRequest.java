/**
 * RollbackSnapshotRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class RollbackSnapshotRequest  implements java.io.Serializable {
    private java.lang.String storageId;

    private java.lang.String snapshotId;

    public RollbackSnapshotRequest() {
    }

    public RollbackSnapshotRequest(
           java.lang.String storageId,
           java.lang.String snapshotId) {
           this.storageId = storageId;
           this.snapshotId = snapshotId;
    }


    /**
     * Gets the storageId value for this RollbackSnapshotRequest.
     * 
     * @return storageId
     */
    public java.lang.String getStorageId() {
        return storageId;
    }


    /**
     * Sets the storageId value for this RollbackSnapshotRequest.
     * 
     * @param storageId
     */
    public void setStorageId(java.lang.String storageId) {
        this.storageId = storageId;
    }


    /**
     * Gets the snapshotId value for this RollbackSnapshotRequest.
     * 
     * @return snapshotId
     */
    public java.lang.String getSnapshotId() {
        return snapshotId;
    }


    /**
     * Sets the snapshotId value for this RollbackSnapshotRequest.
     * 
     * @param snapshotId
     */
    public void setSnapshotId(java.lang.String snapshotId) {
        this.snapshotId = snapshotId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RollbackSnapshotRequest)) return false;
        RollbackSnapshotRequest other = (RollbackSnapshotRequest) obj;
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
            ((this.snapshotId==null && other.getSnapshotId()==null) || 
             (this.snapshotId!=null &&
              this.snapshotId.equals(other.getSnapshotId())));
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
        if (getSnapshotId() != null) {
            _hashCode += getSnapshotId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RollbackSnapshotRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "rollbackSnapshotRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snapshotId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
