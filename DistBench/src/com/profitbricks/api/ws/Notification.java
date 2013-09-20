/**
 * Notification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class Notification  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String networkUUid;

    private java.lang.String relatedItemUuid;

    private java.util.Calendar timestamp;

    private com.profitbricks.api.ws.NotificationCode messageCode;

    private com.profitbricks.api.ws.VirtualItemType relatedItemType;

    private java.lang.String message;

    public Notification() {
    }

    public Notification(
           java.lang.String id,
           java.lang.String networkUUid,
           java.lang.String relatedItemUuid,
           java.util.Calendar timestamp,
           com.profitbricks.api.ws.NotificationCode messageCode,
           com.profitbricks.api.ws.VirtualItemType relatedItemType,
           java.lang.String message) {
           this.id = id;
           this.networkUUid = networkUUid;
           this.relatedItemUuid = relatedItemUuid;
           this.timestamp = timestamp;
           this.messageCode = messageCode;
           this.relatedItemType = relatedItemType;
           this.message = message;
    }


    /**
     * Gets the id value for this Notification.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Notification.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the networkUUid value for this Notification.
     * 
     * @return networkUUid
     */
    public java.lang.String getNetworkUUid() {
        return networkUUid;
    }


    /**
     * Sets the networkUUid value for this Notification.
     * 
     * @param networkUUid
     */
    public void setNetworkUUid(java.lang.String networkUUid) {
        this.networkUUid = networkUUid;
    }


    /**
     * Gets the relatedItemUuid value for this Notification.
     * 
     * @return relatedItemUuid
     */
    public java.lang.String getRelatedItemUuid() {
        return relatedItemUuid;
    }


    /**
     * Sets the relatedItemUuid value for this Notification.
     * 
     * @param relatedItemUuid
     */
    public void setRelatedItemUuid(java.lang.String relatedItemUuid) {
        this.relatedItemUuid = relatedItemUuid;
    }


    /**
     * Gets the timestamp value for this Notification.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this Notification.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the messageCode value for this Notification.
     * 
     * @return messageCode
     */
    public com.profitbricks.api.ws.NotificationCode getMessageCode() {
        return messageCode;
    }


    /**
     * Sets the messageCode value for this Notification.
     * 
     * @param messageCode
     */
    public void setMessageCode(com.profitbricks.api.ws.NotificationCode messageCode) {
        this.messageCode = messageCode;
    }


    /**
     * Gets the relatedItemType value for this Notification.
     * 
     * @return relatedItemType
     */
    public com.profitbricks.api.ws.VirtualItemType getRelatedItemType() {
        return relatedItemType;
    }


    /**
     * Sets the relatedItemType value for this Notification.
     * 
     * @param relatedItemType
     */
    public void setRelatedItemType(com.profitbricks.api.ws.VirtualItemType relatedItemType) {
        this.relatedItemType = relatedItemType;
    }


    /**
     * Gets the message value for this Notification.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Notification.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Notification)) return false;
        Notification other = (Notification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.networkUUid==null && other.getNetworkUUid()==null) || 
             (this.networkUUid!=null &&
              this.networkUUid.equals(other.getNetworkUUid()))) &&
            ((this.relatedItemUuid==null && other.getRelatedItemUuid()==null) || 
             (this.relatedItemUuid!=null &&
              this.relatedItemUuid.equals(other.getRelatedItemUuid()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.messageCode==null && other.getMessageCode()==null) || 
             (this.messageCode!=null &&
              this.messageCode.equals(other.getMessageCode()))) &&
            ((this.relatedItemType==null && other.getRelatedItemType()==null) || 
             (this.relatedItemType!=null &&
              this.relatedItemType.equals(other.getRelatedItemType()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNetworkUUid() != null) {
            _hashCode += getNetworkUUid().hashCode();
        }
        if (getRelatedItemUuid() != null) {
            _hashCode += getRelatedItemUuid().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getMessageCode() != null) {
            _hashCode += getMessageCode().hashCode();
        }
        if (getRelatedItemType() != null) {
            _hashCode += getRelatedItemType().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Notification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "notification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkUUid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkUUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedItemUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "notificationCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "virtualItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
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
