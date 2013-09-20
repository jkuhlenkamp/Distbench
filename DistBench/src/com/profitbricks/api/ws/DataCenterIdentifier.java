/**
 * DataCenterIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class DataCenterIdentifier  implements java.io.Serializable {
    private java.lang.String dataCenterId;

    private java.lang.String dataCenterName;

    private java.lang.Integer dataCenterVersion;

    public DataCenterIdentifier() {
    }

    public DataCenterIdentifier(
           java.lang.String dataCenterId,
           java.lang.String dataCenterName,
           java.lang.Integer dataCenterVersion) {
           this.dataCenterId = dataCenterId;
           this.dataCenterName = dataCenterName;
           this.dataCenterVersion = dataCenterVersion;
    }


    /**
     * Gets the dataCenterId value for this DataCenterIdentifier.
     * 
     * @return dataCenterId
     */
    public java.lang.String getDataCenterId() {
        return dataCenterId;
    }


    /**
     * Sets the dataCenterId value for this DataCenterIdentifier.
     * 
     * @param dataCenterId
     */
    public void setDataCenterId(java.lang.String dataCenterId) {
        this.dataCenterId = dataCenterId;
    }


    /**
     * Gets the dataCenterName value for this DataCenterIdentifier.
     * 
     * @return dataCenterName
     */
    public java.lang.String getDataCenterName() {
        return dataCenterName;
    }


    /**
     * Sets the dataCenterName value for this DataCenterIdentifier.
     * 
     * @param dataCenterName
     */
    public void setDataCenterName(java.lang.String dataCenterName) {
        this.dataCenterName = dataCenterName;
    }


    /**
     * Gets the dataCenterVersion value for this DataCenterIdentifier.
     * 
     * @return dataCenterVersion
     */
    public java.lang.Integer getDataCenterVersion() {
        return dataCenterVersion;
    }


    /**
     * Sets the dataCenterVersion value for this DataCenterIdentifier.
     * 
     * @param dataCenterVersion
     */
    public void setDataCenterVersion(java.lang.Integer dataCenterVersion) {
        this.dataCenterVersion = dataCenterVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataCenterIdentifier)) return false;
        DataCenterIdentifier other = (DataCenterIdentifier) obj;
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
            ((this.dataCenterName==null && other.getDataCenterName()==null) || 
             (this.dataCenterName!=null &&
              this.dataCenterName.equals(other.getDataCenterName()))) &&
            ((this.dataCenterVersion==null && other.getDataCenterVersion()==null) || 
             (this.dataCenterVersion!=null &&
              this.dataCenterVersion.equals(other.getDataCenterVersion())));
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
        if (getDataCenterName() != null) {
            _hashCode += getDataCenterName().hashCode();
        }
        if (getDataCenterVersion() != null) {
            _hashCode += getDataCenterVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataCenterIdentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "dataCenterIdentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCenterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCenterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCenterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCenterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCenterVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCenterVersion"));
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
