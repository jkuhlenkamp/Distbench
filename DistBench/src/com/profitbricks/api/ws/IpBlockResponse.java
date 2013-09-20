/**
 * IpBlockResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class IpBlockResponse  extends com.profitbricks.api.ws.RequestResponse  implements java.io.Serializable {
    private java.lang.String blockId;

    private com.profitbricks.api.ws.Region region;

    private java.lang.String[] ips;

    public IpBlockResponse() {
    }

    public IpBlockResponse(
           java.lang.String requestId,
           java.lang.String blockId,
           com.profitbricks.api.ws.Region region,
           java.lang.String[] ips) {
        super(
            requestId);
        this.blockId = blockId;
        this.region = region;
        this.ips = ips;
    }


    /**
     * Gets the blockId value for this IpBlockResponse.
     * 
     * @return blockId
     */
    public java.lang.String getBlockId() {
        return blockId;
    }


    /**
     * Sets the blockId value for this IpBlockResponse.
     * 
     * @param blockId
     */
    public void setBlockId(java.lang.String blockId) {
        this.blockId = blockId;
    }


    /**
     * Gets the region value for this IpBlockResponse.
     * 
     * @return region
     */
    public com.profitbricks.api.ws.Region getRegion() {
        return region;
    }


    /**
     * Sets the region value for this IpBlockResponse.
     * 
     * @param region
     */
    public void setRegion(com.profitbricks.api.ws.Region region) {
        this.region = region;
    }


    /**
     * Gets the ips value for this IpBlockResponse.
     * 
     * @return ips
     */
    public java.lang.String[] getIps() {
        return ips;
    }


    /**
     * Sets the ips value for this IpBlockResponse.
     * 
     * @param ips
     */
    public void setIps(java.lang.String[] ips) {
        this.ips = ips;
    }

    public java.lang.String getIps(int i) {
        return this.ips[i];
    }

    public void setIps(int i, java.lang.String _value) {
        this.ips[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpBlockResponse)) return false;
        IpBlockResponse other = (IpBlockResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blockId==null && other.getBlockId()==null) || 
             (this.blockId!=null &&
              this.blockId.equals(other.getBlockId()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.ips==null && other.getIps()==null) || 
             (this.ips!=null &&
              java.util.Arrays.equals(this.ips, other.getIps())));
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
        if (getBlockId() != null) {
            _hashCode += getBlockId().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getIps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpBlockResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ipBlockResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("ips");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
