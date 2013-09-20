/**
 * UpdateLbRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class UpdateLbRequest  implements java.io.Serializable {
    private java.lang.String loadBalancerId;

    private java.lang.String loadBalancerName;

    private com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm;

    private java.lang.String ip;

    public UpdateLbRequest() {
    }

    public UpdateLbRequest(
           java.lang.String loadBalancerId,
           java.lang.String loadBalancerName,
           com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm,
           java.lang.String ip) {
           this.loadBalancerId = loadBalancerId;
           this.loadBalancerName = loadBalancerName;
           this.loadBalancerAlgorithm = loadBalancerAlgorithm;
           this.ip = ip;
    }


    /**
     * Gets the loadBalancerId value for this UpdateLbRequest.
     * 
     * @return loadBalancerId
     */
    public java.lang.String getLoadBalancerId() {
        return loadBalancerId;
    }


    /**
     * Sets the loadBalancerId value for this UpdateLbRequest.
     * 
     * @param loadBalancerId
     */
    public void setLoadBalancerId(java.lang.String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }


    /**
     * Gets the loadBalancerName value for this UpdateLbRequest.
     * 
     * @return loadBalancerName
     */
    public java.lang.String getLoadBalancerName() {
        return loadBalancerName;
    }


    /**
     * Sets the loadBalancerName value for this UpdateLbRequest.
     * 
     * @param loadBalancerName
     */
    public void setLoadBalancerName(java.lang.String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }


    /**
     * Gets the loadBalancerAlgorithm value for this UpdateLbRequest.
     * 
     * @return loadBalancerAlgorithm
     */
    public com.profitbricks.api.ws.LoadBalancerAlgorithm getLoadBalancerAlgorithm() {
        return loadBalancerAlgorithm;
    }


    /**
     * Sets the loadBalancerAlgorithm value for this UpdateLbRequest.
     * 
     * @param loadBalancerAlgorithm
     */
    public void setLoadBalancerAlgorithm(com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm) {
        this.loadBalancerAlgorithm = loadBalancerAlgorithm;
    }


    /**
     * Gets the ip value for this UpdateLbRequest.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this UpdateLbRequest.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateLbRequest)) return false;
        UpdateLbRequest other = (UpdateLbRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loadBalancerId==null && other.getLoadBalancerId()==null) || 
             (this.loadBalancerId!=null &&
              this.loadBalancerId.equals(other.getLoadBalancerId()))) &&
            ((this.loadBalancerName==null && other.getLoadBalancerName()==null) || 
             (this.loadBalancerName!=null &&
              this.loadBalancerName.equals(other.getLoadBalancerName()))) &&
            ((this.loadBalancerAlgorithm==null && other.getLoadBalancerAlgorithm()==null) || 
             (this.loadBalancerAlgorithm!=null &&
              this.loadBalancerAlgorithm.equals(other.getLoadBalancerAlgorithm()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp())));
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
        if (getLoadBalancerId() != null) {
            _hashCode += getLoadBalancerId().hashCode();
        }
        if (getLoadBalancerName() != null) {
            _hashCode += getLoadBalancerName().hashCode();
        }
        if (getLoadBalancerAlgorithm() != null) {
            _hashCode += getLoadBalancerAlgorithm().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateLbRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateLbRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadBalancerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadBalancerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadBalancerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadBalancerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadBalancerAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadBalancerAlgorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "loadBalancerAlgorithm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
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
