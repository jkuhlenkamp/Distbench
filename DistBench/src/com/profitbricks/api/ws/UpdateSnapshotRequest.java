/**
 * UpdateSnapshotRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class UpdateSnapshotRequest  implements java.io.Serializable {
    private java.lang.String snapshotId;

    private java.lang.String description;

    private java.lang.String snapshotName;

    private java.lang.Boolean bootable;

    private com.profitbricks.api.ws.OsType osType;

    private java.lang.Boolean cpuHotPlug;

    private java.lang.Boolean ramHotPlug;

    private java.lang.Boolean nicHotPlug;

    private java.lang.Boolean nicHotUnPlug;

    public UpdateSnapshotRequest() {
    }

    public UpdateSnapshotRequest(
           java.lang.String snapshotId,
           java.lang.String description,
           java.lang.String snapshotName,
           java.lang.Boolean bootable,
           com.profitbricks.api.ws.OsType osType,
           java.lang.Boolean cpuHotPlug,
           java.lang.Boolean ramHotPlug,
           java.lang.Boolean nicHotPlug,
           java.lang.Boolean nicHotUnPlug) {
           this.snapshotId = snapshotId;
           this.description = description;
           this.snapshotName = snapshotName;
           this.bootable = bootable;
           this.osType = osType;
           this.cpuHotPlug = cpuHotPlug;
           this.ramHotPlug = ramHotPlug;
           this.nicHotPlug = nicHotPlug;
           this.nicHotUnPlug = nicHotUnPlug;
    }


    /**
     * Gets the snapshotId value for this UpdateSnapshotRequest.
     * 
     * @return snapshotId
     */
    public java.lang.String getSnapshotId() {
        return snapshotId;
    }


    /**
     * Sets the snapshotId value for this UpdateSnapshotRequest.
     * 
     * @param snapshotId
     */
    public void setSnapshotId(java.lang.String snapshotId) {
        this.snapshotId = snapshotId;
    }


    /**
     * Gets the description value for this UpdateSnapshotRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateSnapshotRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the snapshotName value for this UpdateSnapshotRequest.
     * 
     * @return snapshotName
     */
    public java.lang.String getSnapshotName() {
        return snapshotName;
    }


    /**
     * Sets the snapshotName value for this UpdateSnapshotRequest.
     * 
     * @param snapshotName
     */
    public void setSnapshotName(java.lang.String snapshotName) {
        this.snapshotName = snapshotName;
    }


    /**
     * Gets the bootable value for this UpdateSnapshotRequest.
     * 
     * @return bootable
     */
    public java.lang.Boolean getBootable() {
        return bootable;
    }


    /**
     * Sets the bootable value for this UpdateSnapshotRequest.
     * 
     * @param bootable
     */
    public void setBootable(java.lang.Boolean bootable) {
        this.bootable = bootable;
    }


    /**
     * Gets the osType value for this UpdateSnapshotRequest.
     * 
     * @return osType
     */
    public com.profitbricks.api.ws.OsType getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this UpdateSnapshotRequest.
     * 
     * @param osType
     */
    public void setOsType(com.profitbricks.api.ws.OsType osType) {
        this.osType = osType;
    }


    /**
     * Gets the cpuHotPlug value for this UpdateSnapshotRequest.
     * 
     * @return cpuHotPlug
     */
    public java.lang.Boolean getCpuHotPlug() {
        return cpuHotPlug;
    }


    /**
     * Sets the cpuHotPlug value for this UpdateSnapshotRequest.
     * 
     * @param cpuHotPlug
     */
    public void setCpuHotPlug(java.lang.Boolean cpuHotPlug) {
        this.cpuHotPlug = cpuHotPlug;
    }


    /**
     * Gets the ramHotPlug value for this UpdateSnapshotRequest.
     * 
     * @return ramHotPlug
     */
    public java.lang.Boolean getRamHotPlug() {
        return ramHotPlug;
    }


    /**
     * Sets the ramHotPlug value for this UpdateSnapshotRequest.
     * 
     * @param ramHotPlug
     */
    public void setRamHotPlug(java.lang.Boolean ramHotPlug) {
        this.ramHotPlug = ramHotPlug;
    }


    /**
     * Gets the nicHotPlug value for this UpdateSnapshotRequest.
     * 
     * @return nicHotPlug
     */
    public java.lang.Boolean getNicHotPlug() {
        return nicHotPlug;
    }


    /**
     * Sets the nicHotPlug value for this UpdateSnapshotRequest.
     * 
     * @param nicHotPlug
     */
    public void setNicHotPlug(java.lang.Boolean nicHotPlug) {
        this.nicHotPlug = nicHotPlug;
    }


    /**
     * Gets the nicHotUnPlug value for this UpdateSnapshotRequest.
     * 
     * @return nicHotUnPlug
     */
    public java.lang.Boolean getNicHotUnPlug() {
        return nicHotUnPlug;
    }


    /**
     * Sets the nicHotUnPlug value for this UpdateSnapshotRequest.
     * 
     * @param nicHotUnPlug
     */
    public void setNicHotUnPlug(java.lang.Boolean nicHotUnPlug) {
        this.nicHotUnPlug = nicHotUnPlug;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSnapshotRequest)) return false;
        UpdateSnapshotRequest other = (UpdateSnapshotRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.snapshotId==null && other.getSnapshotId()==null) || 
             (this.snapshotId!=null &&
              this.snapshotId.equals(other.getSnapshotId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.snapshotName==null && other.getSnapshotName()==null) || 
             (this.snapshotName!=null &&
              this.snapshotName.equals(other.getSnapshotName()))) &&
            ((this.bootable==null && other.getBootable()==null) || 
             (this.bootable!=null &&
              this.bootable.equals(other.getBootable()))) &&
            ((this.osType==null && other.getOsType()==null) || 
             (this.osType!=null &&
              this.osType.equals(other.getOsType()))) &&
            ((this.cpuHotPlug==null && other.getCpuHotPlug()==null) || 
             (this.cpuHotPlug!=null &&
              this.cpuHotPlug.equals(other.getCpuHotPlug()))) &&
            ((this.ramHotPlug==null && other.getRamHotPlug()==null) || 
             (this.ramHotPlug!=null &&
              this.ramHotPlug.equals(other.getRamHotPlug()))) &&
            ((this.nicHotPlug==null && other.getNicHotPlug()==null) || 
             (this.nicHotPlug!=null &&
              this.nicHotPlug.equals(other.getNicHotPlug()))) &&
            ((this.nicHotUnPlug==null && other.getNicHotUnPlug()==null) || 
             (this.nicHotUnPlug!=null &&
              this.nicHotUnPlug.equals(other.getNicHotUnPlug())));
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
        if (getSnapshotId() != null) {
            _hashCode += getSnapshotId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSnapshotName() != null) {
            _hashCode += getSnapshotName().hashCode();
        }
        if (getBootable() != null) {
            _hashCode += getBootable().hashCode();
        }
        if (getOsType() != null) {
            _hashCode += getOsType().hashCode();
        }
        if (getCpuHotPlug() != null) {
            _hashCode += getCpuHotPlug().hashCode();
        }
        if (getRamHotPlug() != null) {
            _hashCode += getRamHotPlug().hashCode();
        }
        if (getNicHotPlug() != null) {
            _hashCode += getNicHotPlug().hashCode();
        }
        if (getNicHotUnPlug() != null) {
            _hashCode += getNicHotUnPlug().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSnapshotRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateSnapshotRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snapshotId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bootable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("cpuHotPlug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpuHotPlug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ramHotPlug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ramHotPlug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicHotPlug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicHotPlug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicHotUnPlug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicHotUnPlug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
