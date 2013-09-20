/**
 * CreateServerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class CreateServerRequest  implements java.io.Serializable {
    private java.lang.String dataCenterId;

    private int cores;

    private int ram;

    private java.lang.String serverName;

    private java.lang.String bootFromStorageId;

    private java.lang.String bootFromImageId;

    private boolean internetAccess;

    private java.lang.Integer lanId;

    private com.profitbricks.api.ws.OsType osType;

    private com.profitbricks.api.ws.AvailabilityZone availabilityZone;

    public CreateServerRequest() {
    }

    public CreateServerRequest(
           java.lang.String dataCenterId,
           int cores,
           int ram,
           java.lang.String serverName,
           java.lang.String bootFromStorageId,
           java.lang.String bootFromImageId,
           boolean internetAccess,
           java.lang.Integer lanId,
           com.profitbricks.api.ws.OsType osType,
           com.profitbricks.api.ws.AvailabilityZone availabilityZone) {
           this.dataCenterId = dataCenterId;
           this.cores = cores;
           this.ram = ram;
           this.serverName = serverName;
           this.bootFromStorageId = bootFromStorageId;
           this.bootFromImageId = bootFromImageId;
           this.internetAccess = internetAccess;
           this.lanId = lanId;
           this.osType = osType;
           this.availabilityZone = availabilityZone;
    }


    /**
     * Gets the dataCenterId value for this CreateServerRequest.
     * 
     * @return dataCenterId
     */
    public java.lang.String getDataCenterId() {
        return dataCenterId;
    }


    /**
     * Sets the dataCenterId value for this CreateServerRequest.
     * 
     * @param dataCenterId
     */
    public void setDataCenterId(java.lang.String dataCenterId) {
        this.dataCenterId = dataCenterId;
    }


    /**
     * Gets the cores value for this CreateServerRequest.
     * 
     * @return cores
     */
    public int getCores() {
        return cores;
    }


    /**
     * Sets the cores value for this CreateServerRequest.
     * 
     * @param cores
     */
    public void setCores(int cores) {
        this.cores = cores;
    }


    /**
     * Gets the ram value for this CreateServerRequest.
     * 
     * @return ram
     */
    public int getRam() {
        return ram;
    }


    /**
     * Sets the ram value for this CreateServerRequest.
     * 
     * @param ram
     */
    public void setRam(int ram) {
        this.ram = ram;
    }


    /**
     * Gets the serverName value for this CreateServerRequest.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this CreateServerRequest.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the bootFromStorageId value for this CreateServerRequest.
     * 
     * @return bootFromStorageId
     */
    public java.lang.String getBootFromStorageId() {
        return bootFromStorageId;
    }


    /**
     * Sets the bootFromStorageId value for this CreateServerRequest.
     * 
     * @param bootFromStorageId
     */
    public void setBootFromStorageId(java.lang.String bootFromStorageId) {
        this.bootFromStorageId = bootFromStorageId;
    }


    /**
     * Gets the bootFromImageId value for this CreateServerRequest.
     * 
     * @return bootFromImageId
     */
    public java.lang.String getBootFromImageId() {
        return bootFromImageId;
    }


    /**
     * Sets the bootFromImageId value for this CreateServerRequest.
     * 
     * @param bootFromImageId
     */
    public void setBootFromImageId(java.lang.String bootFromImageId) {
        this.bootFromImageId = bootFromImageId;
    }


    /**
     * Gets the internetAccess value for this CreateServerRequest.
     * 
     * @return internetAccess
     */
    public boolean isInternetAccess() {
        return internetAccess;
    }


    /**
     * Sets the internetAccess value for this CreateServerRequest.
     * 
     * @param internetAccess
     */
    public void setInternetAccess(boolean internetAccess) {
        this.internetAccess = internetAccess;
    }


    /**
     * Gets the lanId value for this CreateServerRequest.
     * 
     * @return lanId
     */
    public java.lang.Integer getLanId() {
        return lanId;
    }


    /**
     * Sets the lanId value for this CreateServerRequest.
     * 
     * @param lanId
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }


    /**
     * Gets the osType value for this CreateServerRequest.
     * 
     * @return osType
     */
    public com.profitbricks.api.ws.OsType getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this CreateServerRequest.
     * 
     * @param osType
     */
    public void setOsType(com.profitbricks.api.ws.OsType osType) {
        this.osType = osType;
    }


    /**
     * Gets the availabilityZone value for this CreateServerRequest.
     * 
     * @return availabilityZone
     */
    public com.profitbricks.api.ws.AvailabilityZone getAvailabilityZone() {
        return availabilityZone;
    }


    /**
     * Sets the availabilityZone value for this CreateServerRequest.
     * 
     * @param availabilityZone
     */
    public void setAvailabilityZone(com.profitbricks.api.ws.AvailabilityZone availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateServerRequest)) return false;
        CreateServerRequest other = (CreateServerRequest) obj;
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
            this.cores == other.getCores() &&
            this.ram == other.getRam() &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.bootFromStorageId==null && other.getBootFromStorageId()==null) || 
             (this.bootFromStorageId!=null &&
              this.bootFromStorageId.equals(other.getBootFromStorageId()))) &&
            ((this.bootFromImageId==null && other.getBootFromImageId()==null) || 
             (this.bootFromImageId!=null &&
              this.bootFromImageId.equals(other.getBootFromImageId()))) &&
            this.internetAccess == other.isInternetAccess() &&
            ((this.lanId==null && other.getLanId()==null) || 
             (this.lanId!=null &&
              this.lanId.equals(other.getLanId()))) &&
            ((this.osType==null && other.getOsType()==null) || 
             (this.osType!=null &&
              this.osType.equals(other.getOsType()))) &&
            ((this.availabilityZone==null && other.getAvailabilityZone()==null) || 
             (this.availabilityZone!=null &&
              this.availabilityZone.equals(other.getAvailabilityZone())));
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
        _hashCode += getCores();
        _hashCode += getRam();
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getBootFromStorageId() != null) {
            _hashCode += getBootFromStorageId().hashCode();
        }
        if (getBootFromImageId() != null) {
            _hashCode += getBootFromImageId().hashCode();
        }
        _hashCode += (isInternetAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLanId() != null) {
            _hashCode += getLanId().hashCode();
        }
        if (getOsType() != null) {
            _hashCode += getOsType().hashCode();
        }
        if (getAvailabilityZone() != null) {
            _hashCode += getAvailabilityZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateServerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createServerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCenterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCenterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ram");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ram"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootFromStorageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bootFromStorageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootFromImageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bootFromImageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internetAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internetAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("osType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "osType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availabilityZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "availabilityZone"));
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
