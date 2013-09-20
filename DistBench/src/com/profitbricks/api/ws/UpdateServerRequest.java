/**
 * UpdateServerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class UpdateServerRequest  implements java.io.Serializable {
    private java.lang.String serverId;

    private java.lang.String serverName;

    private java.lang.Integer cores;

    private java.lang.Integer ram;

    private java.lang.String bootFromStorageId;

    private java.lang.String bootFromImageId;

    private com.profitbricks.api.ws.OsType osType;

    private com.profitbricks.api.ws.AvailabilityZone availabilityZone;

    public UpdateServerRequest() {
    }

    public UpdateServerRequest(
           java.lang.String serverId,
           java.lang.String serverName,
           java.lang.Integer cores,
           java.lang.Integer ram,
           java.lang.String bootFromStorageId,
           java.lang.String bootFromImageId,
           com.profitbricks.api.ws.OsType osType,
           com.profitbricks.api.ws.AvailabilityZone availabilityZone) {
           this.serverId = serverId;
           this.serverName = serverName;
           this.cores = cores;
           this.ram = ram;
           this.bootFromStorageId = bootFromStorageId;
           this.bootFromImageId = bootFromImageId;
           this.osType = osType;
           this.availabilityZone = availabilityZone;
    }


    /**
     * Gets the serverId value for this UpdateServerRequest.
     * 
     * @return serverId
     */
    public java.lang.String getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this UpdateServerRequest.
     * 
     * @param serverId
     */
    public void setServerId(java.lang.String serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the serverName value for this UpdateServerRequest.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this UpdateServerRequest.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the cores value for this UpdateServerRequest.
     * 
     * @return cores
     */
    public java.lang.Integer getCores() {
        return cores;
    }


    /**
     * Sets the cores value for this UpdateServerRequest.
     * 
     * @param cores
     */
    public void setCores(java.lang.Integer cores) {
        this.cores = cores;
    }


    /**
     * Gets the ram value for this UpdateServerRequest.
     * 
     * @return ram
     */
    public java.lang.Integer getRam() {
        return ram;
    }


    /**
     * Sets the ram value for this UpdateServerRequest.
     * 
     * @param ram
     */
    public void setRam(java.lang.Integer ram) {
        this.ram = ram;
    }


    /**
     * Gets the bootFromStorageId value for this UpdateServerRequest.
     * 
     * @return bootFromStorageId
     */
    public java.lang.String getBootFromStorageId() {
        return bootFromStorageId;
    }


    /**
     * Sets the bootFromStorageId value for this UpdateServerRequest.
     * 
     * @param bootFromStorageId
     */
    public void setBootFromStorageId(java.lang.String bootFromStorageId) {
        this.bootFromStorageId = bootFromStorageId;
    }


    /**
     * Gets the bootFromImageId value for this UpdateServerRequest.
     * 
     * @return bootFromImageId
     */
    public java.lang.String getBootFromImageId() {
        return bootFromImageId;
    }


    /**
     * Sets the bootFromImageId value for this UpdateServerRequest.
     * 
     * @param bootFromImageId
     */
    public void setBootFromImageId(java.lang.String bootFromImageId) {
        this.bootFromImageId = bootFromImageId;
    }


    /**
     * Gets the osType value for this UpdateServerRequest.
     * 
     * @return osType
     */
    public com.profitbricks.api.ws.OsType getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this UpdateServerRequest.
     * 
     * @param osType
     */
    public void setOsType(com.profitbricks.api.ws.OsType osType) {
        this.osType = osType;
    }


    /**
     * Gets the availabilityZone value for this UpdateServerRequest.
     * 
     * @return availabilityZone
     */
    public com.profitbricks.api.ws.AvailabilityZone getAvailabilityZone() {
        return availabilityZone;
    }


    /**
     * Sets the availabilityZone value for this UpdateServerRequest.
     * 
     * @param availabilityZone
     */
    public void setAvailabilityZone(com.profitbricks.api.ws.AvailabilityZone availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateServerRequest)) return false;
        UpdateServerRequest other = (UpdateServerRequest) obj;
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
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.cores==null && other.getCores()==null) || 
             (this.cores!=null &&
              this.cores.equals(other.getCores()))) &&
            ((this.ram==null && other.getRam()==null) || 
             (this.ram!=null &&
              this.ram.equals(other.getRam()))) &&
            ((this.bootFromStorageId==null && other.getBootFromStorageId()==null) || 
             (this.bootFromStorageId!=null &&
              this.bootFromStorageId.equals(other.getBootFromStorageId()))) &&
            ((this.bootFromImageId==null && other.getBootFromImageId()==null) || 
             (this.bootFromImageId!=null &&
              this.bootFromImageId.equals(other.getBootFromImageId()))) &&
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
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getCores() != null) {
            _hashCode += getCores().hashCode();
        }
        if (getRam() != null) {
            _hashCode += getRam().hashCode();
        }
        if (getBootFromStorageId() != null) {
            _hashCode += getBootFromStorageId().hashCode();
        }
        if (getBootFromImageId() != null) {
            _hashCode += getBootFromImageId().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateServerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateServerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ram");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ram"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
