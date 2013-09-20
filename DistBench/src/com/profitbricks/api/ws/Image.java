/**
 * Image.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class Image  implements java.io.Serializable {
    private java.lang.Boolean cpuHotpluggable;

    private java.lang.String imageId;

    private java.lang.String imageName;

    private java.lang.Long imageSize;

    private com.profitbricks.api.ws.ImageType imageType;

    private java.lang.Boolean memoryHotpluggable;

    private com.profitbricks.api.ws.OsType osType;

    private com.profitbricks.api.ws.Region region;

    private java.lang.String[] serverIds;

    private java.lang.Boolean writeable;

    public Image() {
    }

    public Image(
           java.lang.Boolean cpuHotpluggable,
           java.lang.String imageId,
           java.lang.String imageName,
           java.lang.Long imageSize,
           com.profitbricks.api.ws.ImageType imageType,
           java.lang.Boolean memoryHotpluggable,
           com.profitbricks.api.ws.OsType osType,
           com.profitbricks.api.ws.Region region,
           java.lang.String[] serverIds,
           java.lang.Boolean writeable) {
           this.cpuHotpluggable = cpuHotpluggable;
           this.imageId = imageId;
           this.imageName = imageName;
           this.imageSize = imageSize;
           this.imageType = imageType;
           this.memoryHotpluggable = memoryHotpluggable;
           this.osType = osType;
           this.region = region;
           this.serverIds = serverIds;
           this.writeable = writeable;
    }


    /**
     * Gets the cpuHotpluggable value for this Image.
     * 
     * @return cpuHotpluggable
     */
    public java.lang.Boolean getCpuHotpluggable() {
        return cpuHotpluggable;
    }


    /**
     * Sets the cpuHotpluggable value for this Image.
     * 
     * @param cpuHotpluggable
     */
    public void setCpuHotpluggable(java.lang.Boolean cpuHotpluggable) {
        this.cpuHotpluggable = cpuHotpluggable;
    }


    /**
     * Gets the imageId value for this Image.
     * 
     * @return imageId
     */
    public java.lang.String getImageId() {
        return imageId;
    }


    /**
     * Sets the imageId value for this Image.
     * 
     * @param imageId
     */
    public void setImageId(java.lang.String imageId) {
        this.imageId = imageId;
    }


    /**
     * Gets the imageName value for this Image.
     * 
     * @return imageName
     */
    public java.lang.String getImageName() {
        return imageName;
    }


    /**
     * Sets the imageName value for this Image.
     * 
     * @param imageName
     */
    public void setImageName(java.lang.String imageName) {
        this.imageName = imageName;
    }


    /**
     * Gets the imageSize value for this Image.
     * 
     * @return imageSize
     */
    public java.lang.Long getImageSize() {
        return imageSize;
    }


    /**
     * Sets the imageSize value for this Image.
     * 
     * @param imageSize
     */
    public void setImageSize(java.lang.Long imageSize) {
        this.imageSize = imageSize;
    }


    /**
     * Gets the imageType value for this Image.
     * 
     * @return imageType
     */
    public com.profitbricks.api.ws.ImageType getImageType() {
        return imageType;
    }


    /**
     * Sets the imageType value for this Image.
     * 
     * @param imageType
     */
    public void setImageType(com.profitbricks.api.ws.ImageType imageType) {
        this.imageType = imageType;
    }


    /**
     * Gets the memoryHotpluggable value for this Image.
     * 
     * @return memoryHotpluggable
     */
    public java.lang.Boolean getMemoryHotpluggable() {
        return memoryHotpluggable;
    }


    /**
     * Sets the memoryHotpluggable value for this Image.
     * 
     * @param memoryHotpluggable
     */
    public void setMemoryHotpluggable(java.lang.Boolean memoryHotpluggable) {
        this.memoryHotpluggable = memoryHotpluggable;
    }


    /**
     * Gets the osType value for this Image.
     * 
     * @return osType
     */
    public com.profitbricks.api.ws.OsType getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this Image.
     * 
     * @param osType
     */
    public void setOsType(com.profitbricks.api.ws.OsType osType) {
        this.osType = osType;
    }


    /**
     * Gets the region value for this Image.
     * 
     * @return region
     */
    public com.profitbricks.api.ws.Region getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Image.
     * 
     * @param region
     */
    public void setRegion(com.profitbricks.api.ws.Region region) {
        this.region = region;
    }


    /**
     * Gets the serverIds value for this Image.
     * 
     * @return serverIds
     */
    public java.lang.String[] getServerIds() {
        return serverIds;
    }


    /**
     * Sets the serverIds value for this Image.
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
     * Gets the writeable value for this Image.
     * 
     * @return writeable
     */
    public java.lang.Boolean getWriteable() {
        return writeable;
    }


    /**
     * Sets the writeable value for this Image.
     * 
     * @param writeable
     */
    public void setWriteable(java.lang.Boolean writeable) {
        this.writeable = writeable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Image)) return false;
        Image other = (Image) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpuHotpluggable==null && other.getCpuHotpluggable()==null) || 
             (this.cpuHotpluggable!=null &&
              this.cpuHotpluggable.equals(other.getCpuHotpluggable()))) &&
            ((this.imageId==null && other.getImageId()==null) || 
             (this.imageId!=null &&
              this.imageId.equals(other.getImageId()))) &&
            ((this.imageName==null && other.getImageName()==null) || 
             (this.imageName!=null &&
              this.imageName.equals(other.getImageName()))) &&
            ((this.imageSize==null && other.getImageSize()==null) || 
             (this.imageSize!=null &&
              this.imageSize.equals(other.getImageSize()))) &&
            ((this.imageType==null && other.getImageType()==null) || 
             (this.imageType!=null &&
              this.imageType.equals(other.getImageType()))) &&
            ((this.memoryHotpluggable==null && other.getMemoryHotpluggable()==null) || 
             (this.memoryHotpluggable!=null &&
              this.memoryHotpluggable.equals(other.getMemoryHotpluggable()))) &&
            ((this.osType==null && other.getOsType()==null) || 
             (this.osType!=null &&
              this.osType.equals(other.getOsType()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.serverIds==null && other.getServerIds()==null) || 
             (this.serverIds!=null &&
              java.util.Arrays.equals(this.serverIds, other.getServerIds()))) &&
            ((this.writeable==null && other.getWriteable()==null) || 
             (this.writeable!=null &&
              this.writeable.equals(other.getWriteable())));
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
        if (getCpuHotpluggable() != null) {
            _hashCode += getCpuHotpluggable().hashCode();
        }
        if (getImageId() != null) {
            _hashCode += getImageId().hashCode();
        }
        if (getImageName() != null) {
            _hashCode += getImageName().hashCode();
        }
        if (getImageSize() != null) {
            _hashCode += getImageSize().hashCode();
        }
        if (getImageType() != null) {
            _hashCode += getImageType().hashCode();
        }
        if (getMemoryHotpluggable() != null) {
            _hashCode += getMemoryHotpluggable().hashCode();
        }
        if (getOsType() != null) {
            _hashCode += getOsType().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
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
        if (getWriteable() != null) {
            _hashCode += getWriteable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Image.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "image"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuHotpluggable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpuHotpluggable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "imageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryHotpluggable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memoryHotpluggable"));
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
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "region"));
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
        elemField.setFieldName("writeable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "writeable"));
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
