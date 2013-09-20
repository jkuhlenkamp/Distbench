/**
 * FirewallRuleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class FirewallRuleRequest  implements java.io.Serializable {
    private java.lang.Integer icmpCode;

    private java.lang.Integer icmpType;

    private java.lang.Integer portRangeEnd;

    private java.lang.Integer portRangeStart;

    private com.profitbricks.api.ws.Protocol protocol;

    private java.lang.String sourceIp;

    private java.lang.String sourceMac;

    private java.lang.String targetIp;

    public FirewallRuleRequest() {
    }

    public FirewallRuleRequest(
           java.lang.Integer icmpCode,
           java.lang.Integer icmpType,
           java.lang.Integer portRangeEnd,
           java.lang.Integer portRangeStart,
           com.profitbricks.api.ws.Protocol protocol,
           java.lang.String sourceIp,
           java.lang.String sourceMac,
           java.lang.String targetIp) {
           this.icmpCode = icmpCode;
           this.icmpType = icmpType;
           this.portRangeEnd = portRangeEnd;
           this.portRangeStart = portRangeStart;
           this.protocol = protocol;
           this.sourceIp = sourceIp;
           this.sourceMac = sourceMac;
           this.targetIp = targetIp;
    }


    /**
     * Gets the icmpCode value for this FirewallRuleRequest.
     * 
     * @return icmpCode
     */
    public java.lang.Integer getIcmpCode() {
        return icmpCode;
    }


    /**
     * Sets the icmpCode value for this FirewallRuleRequest.
     * 
     * @param icmpCode
     */
    public void setIcmpCode(java.lang.Integer icmpCode) {
        this.icmpCode = icmpCode;
    }


    /**
     * Gets the icmpType value for this FirewallRuleRequest.
     * 
     * @return icmpType
     */
    public java.lang.Integer getIcmpType() {
        return icmpType;
    }


    /**
     * Sets the icmpType value for this FirewallRuleRequest.
     * 
     * @param icmpType
     */
    public void setIcmpType(java.lang.Integer icmpType) {
        this.icmpType = icmpType;
    }


    /**
     * Gets the portRangeEnd value for this FirewallRuleRequest.
     * 
     * @return portRangeEnd
     */
    public java.lang.Integer getPortRangeEnd() {
        return portRangeEnd;
    }


    /**
     * Sets the portRangeEnd value for this FirewallRuleRequest.
     * 
     * @param portRangeEnd
     */
    public void setPortRangeEnd(java.lang.Integer portRangeEnd) {
        this.portRangeEnd = portRangeEnd;
    }


    /**
     * Gets the portRangeStart value for this FirewallRuleRequest.
     * 
     * @return portRangeStart
     */
    public java.lang.Integer getPortRangeStart() {
        return portRangeStart;
    }


    /**
     * Sets the portRangeStart value for this FirewallRuleRequest.
     * 
     * @param portRangeStart
     */
    public void setPortRangeStart(java.lang.Integer portRangeStart) {
        this.portRangeStart = portRangeStart;
    }


    /**
     * Gets the protocol value for this FirewallRuleRequest.
     * 
     * @return protocol
     */
    public com.profitbricks.api.ws.Protocol getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this FirewallRuleRequest.
     * 
     * @param protocol
     */
    public void setProtocol(com.profitbricks.api.ws.Protocol protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the sourceIp value for this FirewallRuleRequest.
     * 
     * @return sourceIp
     */
    public java.lang.String getSourceIp() {
        return sourceIp;
    }


    /**
     * Sets the sourceIp value for this FirewallRuleRequest.
     * 
     * @param sourceIp
     */
    public void setSourceIp(java.lang.String sourceIp) {
        this.sourceIp = sourceIp;
    }


    /**
     * Gets the sourceMac value for this FirewallRuleRequest.
     * 
     * @return sourceMac
     */
    public java.lang.String getSourceMac() {
        return sourceMac;
    }


    /**
     * Sets the sourceMac value for this FirewallRuleRequest.
     * 
     * @param sourceMac
     */
    public void setSourceMac(java.lang.String sourceMac) {
        this.sourceMac = sourceMac;
    }


    /**
     * Gets the targetIp value for this FirewallRuleRequest.
     * 
     * @return targetIp
     */
    public java.lang.String getTargetIp() {
        return targetIp;
    }


    /**
     * Sets the targetIp value for this FirewallRuleRequest.
     * 
     * @param targetIp
     */
    public void setTargetIp(java.lang.String targetIp) {
        this.targetIp = targetIp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirewallRuleRequest)) return false;
        FirewallRuleRequest other = (FirewallRuleRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.icmpCode==null && other.getIcmpCode()==null) || 
             (this.icmpCode!=null &&
              this.icmpCode.equals(other.getIcmpCode()))) &&
            ((this.icmpType==null && other.getIcmpType()==null) || 
             (this.icmpType!=null &&
              this.icmpType.equals(other.getIcmpType()))) &&
            ((this.portRangeEnd==null && other.getPortRangeEnd()==null) || 
             (this.portRangeEnd!=null &&
              this.portRangeEnd.equals(other.getPortRangeEnd()))) &&
            ((this.portRangeStart==null && other.getPortRangeStart()==null) || 
             (this.portRangeStart!=null &&
              this.portRangeStart.equals(other.getPortRangeStart()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.sourceIp==null && other.getSourceIp()==null) || 
             (this.sourceIp!=null &&
              this.sourceIp.equals(other.getSourceIp()))) &&
            ((this.sourceMac==null && other.getSourceMac()==null) || 
             (this.sourceMac!=null &&
              this.sourceMac.equals(other.getSourceMac()))) &&
            ((this.targetIp==null && other.getTargetIp()==null) || 
             (this.targetIp!=null &&
              this.targetIp.equals(other.getTargetIp())));
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
        if (getIcmpCode() != null) {
            _hashCode += getIcmpCode().hashCode();
        }
        if (getIcmpType() != null) {
            _hashCode += getIcmpType().hashCode();
        }
        if (getPortRangeEnd() != null) {
            _hashCode += getPortRangeEnd().hashCode();
        }
        if (getPortRangeStart() != null) {
            _hashCode += getPortRangeStart().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getSourceIp() != null) {
            _hashCode += getSourceIp().hashCode();
        }
        if (getSourceMac() != null) {
            _hashCode += getSourceMac().hashCode();
        }
        if (getTargetIp() != null) {
            _hashCode += getTargetIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirewallRuleRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewallRuleRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portRangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portRangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "protocol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceMac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceMac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetIp"));
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
