/**
 * CreateLbRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class CreateLbRequest  implements java.io.Serializable {
    private java.lang.String dataCenterId;

    private java.lang.String loadBalancerName;

    private com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm;

    private java.lang.String ip;

    private java.lang.Integer lanId;

    private java.lang.String[] serverIds;

    public CreateLbRequest() {
    }

    public CreateLbRequest(
           java.lang.String dataCenterId,
           java.lang.String loadBalancerName,
           com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm,
           java.lang.String ip,
           java.lang.Integer lanId,
           java.lang.String[] serverIds) {
           this.dataCenterId = dataCenterId;
           this.loadBalancerName = loadBalancerName;
           this.loadBalancerAlgorithm = loadBalancerAlgorithm;
           this.ip = ip;
           this.lanId = lanId;
           this.serverIds = serverIds;
    }


    /**
     * Gets the dataCenterId value for this CreateLbRequest.
     * 
     * @return dataCenterId
     */
    public java.lang.String getDataCenterId() {
        return dataCenterId;
    }


    /**
     * Sets the dataCenterId value for this CreateLbRequest.
     * 
     * @param dataCenterId
     */
    public void setDataCenterId(java.lang.String dataCenterId) {
        this.dataCenterId = dataCenterId;
    }


    /**
     * Gets the loadBalancerName value for this CreateLbRequest.
     * 
     * @return loadBalancerName
     */
    public java.lang.String getLoadBalancerName() {
        return loadBalancerName;
    }


    /**
     * Sets the loadBalancerName value for this CreateLbRequest.
     * 
     * @param loadBalancerName
     */
    public void setLoadBalancerName(java.lang.String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }


    /**
     * Gets the loadBalancerAlgorithm value for this CreateLbRequest.
     * 
     * @return loadBalancerAlgorithm
     */
    public com.profitbricks.api.ws.LoadBalancerAlgorithm getLoadBalancerAlgorithm() {
        return loadBalancerAlgorithm;
    }


    /**
     * Sets the loadBalancerAlgorithm value for this CreateLbRequest.
     * 
     * @param loadBalancerAlgorithm
     */
    public void setLoadBalancerAlgorithm(com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm) {
        this.loadBalancerAlgorithm = loadBalancerAlgorithm;
    }


    /**
     * Gets the ip value for this CreateLbRequest.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this CreateLbRequest.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the lanId value for this CreateLbRequest.
     * 
     * @return lanId
     */
    public java.lang.Integer getLanId() {
        return lanId;
    }


    /**
     * Sets the lanId value for this CreateLbRequest.
     * 
     * @param lanId
     */
    public void setLanId(java.lang.Integer lanId) {
        this.lanId = lanId;
    }


    /**
     * Gets the serverIds value for this CreateLbRequest.
     * 
     * @return serverIds
     */
    public java.lang.String[] getServerIds() {
        return serverIds;
    }


    /**
     * Sets the serverIds value for this CreateLbRequest.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateLbRequest)) return false;
        CreateLbRequest other = (CreateLbRequest) obj;
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
            ((this.loadBalancerName==null && other.getLoadBalancerName()==null) || 
             (this.loadBalancerName!=null &&
              this.loadBalancerName.equals(other.getLoadBalancerName()))) &&
            ((this.loadBalancerAlgorithm==null && other.getLoadBalancerAlgorithm()==null) || 
             (this.loadBalancerAlgorithm!=null &&
              this.loadBalancerAlgorithm.equals(other.getLoadBalancerAlgorithm()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.lanId==null && other.getLanId()==null) || 
             (this.lanId!=null &&
              this.lanId.equals(other.getLanId()))) &&
            ((this.serverIds==null && other.getServerIds()==null) || 
             (this.serverIds!=null &&
              java.util.Arrays.equals(this.serverIds, other.getServerIds())));
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
        if (getLoadBalancerName() != null) {
            _hashCode += getLoadBalancerName().hashCode();
        }
        if (getLoadBalancerAlgorithm() != null) {
            _hashCode += getLoadBalancerAlgorithm().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getLanId() != null) {
            _hashCode += getLanId().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateLbRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createLbRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCenterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCenterId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
