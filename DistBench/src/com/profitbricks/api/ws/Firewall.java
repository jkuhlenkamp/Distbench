/**
 * Firewall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class Firewall  implements java.io.Serializable {
    private boolean active;

    private java.lang.String firewallId;

    private com.profitbricks.api.ws.FirewallRule[] firewallRules;

    private java.lang.String nicId;

    private com.profitbricks.api.ws.ProvisioningState provisioningState;

    public Firewall() {
    }

    public Firewall(
           boolean active,
           java.lang.String firewallId,
           com.profitbricks.api.ws.FirewallRule[] firewallRules,
           java.lang.String nicId,
           com.profitbricks.api.ws.ProvisioningState provisioningState) {
           this.active = active;
           this.firewallId = firewallId;
           this.firewallRules = firewallRules;
           this.nicId = nicId;
           this.provisioningState = provisioningState;
    }


    /**
     * Gets the active value for this Firewall.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Firewall.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the firewallId value for this Firewall.
     * 
     * @return firewallId
     */
    public java.lang.String getFirewallId() {
        return firewallId;
    }


    /**
     * Sets the firewallId value for this Firewall.
     * 
     * @param firewallId
     */
    public void setFirewallId(java.lang.String firewallId) {
        this.firewallId = firewallId;
    }


    /**
     * Gets the firewallRules value for this Firewall.
     * 
     * @return firewallRules
     */
    public com.profitbricks.api.ws.FirewallRule[] getFirewallRules() {
        return firewallRules;
    }


    /**
     * Sets the firewallRules value for this Firewall.
     * 
     * @param firewallRules
     */
    public void setFirewallRules(com.profitbricks.api.ws.FirewallRule[] firewallRules) {
        this.firewallRules = firewallRules;
    }

    public com.profitbricks.api.ws.FirewallRule getFirewallRules(int i) {
        return this.firewallRules[i];
    }

    public void setFirewallRules(int i, com.profitbricks.api.ws.FirewallRule _value) {
        this.firewallRules[i] = _value;
    }


    /**
     * Gets the nicId value for this Firewall.
     * 
     * @return nicId
     */
    public java.lang.String getNicId() {
        return nicId;
    }


    /**
     * Sets the nicId value for this Firewall.
     * 
     * @param nicId
     */
    public void setNicId(java.lang.String nicId) {
        this.nicId = nicId;
    }


    /**
     * Gets the provisioningState value for this Firewall.
     * 
     * @return provisioningState
     */
    public com.profitbricks.api.ws.ProvisioningState getProvisioningState() {
        return provisioningState;
    }


    /**
     * Sets the provisioningState value for this Firewall.
     * 
     * @param provisioningState
     */
    public void setProvisioningState(com.profitbricks.api.ws.ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Firewall)) return false;
        Firewall other = (Firewall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.firewallId==null && other.getFirewallId()==null) || 
             (this.firewallId!=null &&
              this.firewallId.equals(other.getFirewallId()))) &&
            ((this.firewallRules==null && other.getFirewallRules()==null) || 
             (this.firewallRules!=null &&
              java.util.Arrays.equals(this.firewallRules, other.getFirewallRules()))) &&
            ((this.nicId==null && other.getNicId()==null) || 
             (this.nicId!=null &&
              this.nicId.equals(other.getNicId()))) &&
            ((this.provisioningState==null && other.getProvisioningState()==null) || 
             (this.provisioningState!=null &&
              this.provisioningState.equals(other.getProvisioningState())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFirewallId() != null) {
            _hashCode += getFirewallId().hashCode();
        }
        if (getFirewallRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirewallRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirewallRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNicId() != null) {
            _hashCode += getNicId().hashCode();
        }
        if (getProvisioningState() != null) {
            _hashCode += getProvisioningState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Firewall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firewallId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firewallRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewallRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provisioningState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "provisioningState"));
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
