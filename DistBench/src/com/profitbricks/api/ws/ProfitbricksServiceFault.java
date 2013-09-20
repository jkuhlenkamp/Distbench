/**
 * ProfitbricksServiceFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class ProfitbricksServiceFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.profitbricks.api.ws.FaultCode faultCode1;

    private java.lang.String httpCode;

    private java.lang.String message1;

    private java.lang.String requestId;

    public ProfitbricksServiceFault() {
    }

    public ProfitbricksServiceFault(
           com.profitbricks.api.ws.FaultCode faultCode1,
           java.lang.String httpCode,
           java.lang.String message1,
           java.lang.String requestId) {
        this.faultCode1 = faultCode1;
        this.httpCode = httpCode;
        this.message1 = message1;
        this.requestId = requestId;
    }


    /**
     * Gets the faultCode1 value for this ProfitbricksServiceFault.
     * 
     * @return faultCode1
     */
    public com.profitbricks.api.ws.FaultCode getFaultCode1() {
        return faultCode1;
    }


    /**
     * Sets the faultCode1 value for this ProfitbricksServiceFault.
     * 
     * @param faultCode1
     */
    public void setFaultCode1(com.profitbricks.api.ws.FaultCode faultCode1) {
        this.faultCode1 = faultCode1;
    }


    /**
     * Gets the httpCode value for this ProfitbricksServiceFault.
     * 
     * @return httpCode
     */
    public java.lang.String getHttpCode() {
        return httpCode;
    }


    /**
     * Sets the httpCode value for this ProfitbricksServiceFault.
     * 
     * @param httpCode
     */
    public void setHttpCode(java.lang.String httpCode) {
        this.httpCode = httpCode;
    }


    /**
     * Gets the message1 value for this ProfitbricksServiceFault.
     * 
     * @return message1
     */
    public java.lang.String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this ProfitbricksServiceFault.
     * 
     * @param message1
     */
    public void setMessage1(java.lang.String message1) {
        this.message1 = message1;
    }


    /**
     * Gets the requestId value for this ProfitbricksServiceFault.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this ProfitbricksServiceFault.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfitbricksServiceFault)) return false;
        ProfitbricksServiceFault other = (ProfitbricksServiceFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultCode1==null && other.getFaultCode1()==null) || 
             (this.faultCode1!=null &&
              this.faultCode1.equals(other.getFaultCode1()))) &&
            ((this.httpCode==null && other.getHttpCode()==null) || 
             (this.httpCode!=null &&
              this.httpCode.equals(other.getHttpCode()))) &&
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId())));
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
        if (getFaultCode1() != null) {
            _hashCode += getFaultCode1().hashCode();
        }
        if (getHttpCode() != null) {
            _hashCode += getHttpCode().hashCode();
        }
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfitbricksServiceFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "faultCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestId"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
