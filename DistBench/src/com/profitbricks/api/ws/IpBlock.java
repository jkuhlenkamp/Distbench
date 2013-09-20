/**
 * IpBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class IpBlock  implements java.io.Serializable {
    private java.lang.String blockId;

    private com.profitbricks.api.ws.PublicIp[] publicIps;

    private com.profitbricks.api.ws.Region region;

    public IpBlock() {
    }

    public IpBlock(
           java.lang.String blockId,
           com.profitbricks.api.ws.PublicIp[] publicIps,
           com.profitbricks.api.ws.Region region) {
           this.blockId = blockId;
           this.publicIps = publicIps;
           this.region = region;
    }


    /**
     * Gets the blockId value for this IpBlock.
     * 
     * @return blockId
     */
    public java.lang.String getBlockId() {
        return blockId;
    }


    /**
     * Sets the blockId value for this IpBlock.
     * 
     * @param blockId
     */
    public void setBlockId(java.lang.String blockId) {
        this.blockId = blockId;
    }


    /**
     * Gets the publicIps value for this IpBlock.
     * 
     * @return publicIps
     */
    public com.profitbricks.api.ws.PublicIp[] getPublicIps() {
        return publicIps;
    }


    /**
     * Sets the publicIps value for this IpBlock.
     * 
     * @param publicIps
     */
    public void setPublicIps(com.profitbricks.api.ws.PublicIp[] publicIps) {
        this.publicIps = publicIps;
    }

    public com.profitbricks.api.ws.PublicIp getPublicIps(int i) {
        return this.publicIps[i];
    }

    public void setPublicIps(int i, com.profitbricks.api.ws.PublicIp _value) {
        this.publicIps[i] = _value;
    }


    /**
     * Gets the region value for this IpBlock.
     * 
     * @return region
     */
    public com.profitbricks.api.ws.Region getRegion() {
        return region;
    }


    /**
     * Sets the region value for this IpBlock.
     * 
     * @param region
     */
    public void setRegion(com.profitbricks.api.ws.Region region) {
        this.region = region;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpBlock)) return false;
        IpBlock other = (IpBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blockId==null && other.getBlockId()==null) || 
             (this.blockId!=null &&
              this.blockId.equals(other.getBlockId()))) &&
            ((this.publicIps==null && other.getPublicIps()==null) || 
             (this.publicIps!=null &&
              java.util.Arrays.equals(this.publicIps, other.getPublicIps()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion())));
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
        if (getBlockId() != null) {
            _hashCode += getBlockId().hashCode();
        }
        if (getPublicIps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublicIps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublicIps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ipBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicIps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicIps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "publicIp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "region"));
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
