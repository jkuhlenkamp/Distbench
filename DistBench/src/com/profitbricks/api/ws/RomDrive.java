/**
 * RomDrive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class RomDrive  implements java.io.Serializable {
    private boolean bootDevice;

    private java.lang.String imageId;

    private java.lang.String imageName;

    public RomDrive() {
    }

    public RomDrive(
           boolean bootDevice,
           java.lang.String imageId,
           java.lang.String imageName) {
           this.bootDevice = bootDevice;
           this.imageId = imageId;
           this.imageName = imageName;
    }


    /**
     * Gets the bootDevice value for this RomDrive.
     * 
     * @return bootDevice
     */
    public boolean isBootDevice() {
        return bootDevice;
    }


    /**
     * Sets the bootDevice value for this RomDrive.
     * 
     * @param bootDevice
     */
    public void setBootDevice(boolean bootDevice) {
        this.bootDevice = bootDevice;
    }


    /**
     * Gets the imageId value for this RomDrive.
     * 
     * @return imageId
     */
    public java.lang.String getImageId() {
        return imageId;
    }


    /**
     * Sets the imageId value for this RomDrive.
     * 
     * @param imageId
     */
    public void setImageId(java.lang.String imageId) {
        this.imageId = imageId;
    }


    /**
     * Gets the imageName value for this RomDrive.
     * 
     * @return imageName
     */
    public java.lang.String getImageName() {
        return imageName;
    }


    /**
     * Sets the imageName value for this RomDrive.
     * 
     * @param imageName
     */
    public void setImageName(java.lang.String imageName) {
        this.imageName = imageName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RomDrive)) return false;
        RomDrive other = (RomDrive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bootDevice == other.isBootDevice() &&
            ((this.imageId==null && other.getImageId()==null) || 
             (this.imageId!=null &&
              this.imageId.equals(other.getImageId()))) &&
            ((this.imageName==null && other.getImageName()==null) || 
             (this.imageName!=null &&
              this.imageName.equals(other.getImageName())));
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
        if (getImageId() != null) {
            _hashCode += getImageId().hashCode();
        }
        if (getImageName() != null) {
            _hashCode += getImageName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RomDrive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "romDrive"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bootDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageName"));
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
