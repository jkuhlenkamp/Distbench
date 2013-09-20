/**
 * Nic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class Nic  extends com.profitbricks.api.ws.VersionResponse  implements java.io.Serializable {
    private java.lang.String nicId;

    private java.lang.String nicName;

    private int lanId;

    private java.lang.Boolean internetAccess;

    private java.lang.String serverId;

    private java.lang.String[] ips;

    private java.lang.String macAddress;

    private com.profitbricks.api.ws.Firewall firewall;

    private java.lang.Boolean dhcpActive;

    private java.lang.String gatewayIp;

    private com.profitbricks.api.ws.ProvisioningState provisioningState;

    public Nic() {
    }

    public Nic(
           java.lang.String requestId,
           java.lang.String dataCenterId,
           java.lang.Integer dataCenterVersion,
           java.lang.String nicId,
           java.lang.String nicName,
           int lanId,
           java.lang.Boolean internetAccess,
           java.lang.String serverId,
           java.lang.String[] ips,
           java.lang.String macAddress,
           com.profitbricks.api.ws.Firewall firewall,
           java.lang.Boolean dhcpActive,
           java.lang.String gatewayIp,
           com.profitbricks.api.ws.ProvisioningState provisioningState) {
        super(
            requestId,
            dataCenterId,
            dataCenterVersion);
        this.nicId = nicId;
        this.nicName = nicName;
        this.lanId = lanId;
        this.internetAccess = internetAccess;
        this.serverId = serverId;
        this.ips = ips;
        this.macAddress = macAddress;
        this.firewall = firewall;
        this.dhcpActive = dhcpActive;
        this.gatewayIp = gatewayIp;
        this.provisioningState = provisioningState;
    }


    /**
     * Gets the nicId value for this Nic.
     * 
     * @return nicId
     */
    public java.lang.String getNicId() {
        return nicId;
    }


    /**
     * Sets the nicId value for this Nic.
     * 
     * @param nicId
     */
    public void setNicId(java.lang.String nicId) {
        this.nicId = nicId;
    }


    /**
     * Gets the nicName value for this Nic.
     * 
     * @return nicName
     */
    public java.lang.String getNicName() {
        return nicName;
    }


    /**
     * Sets the nicName value for this Nic.
     * 
     * @param nicName
     */
    public void setNicName(java.lang.String nicName) {
        this.nicName = nicName;
    }


    /**
     * Gets the lanId value for this Nic.
     * 
     * @return lanId
     */
    public int getLanId() {
        return lanId;
    }


    /**
     * Sets the lanId value for this Nic.
     * 
     * @param lanId
     */
    public void setLanId(int lanId) {
        this.lanId = lanId;
    }


    /**
     * Gets the internetAccess value for this Nic.
     * 
     * @return internetAccess
     */
    public java.lang.Boolean getInternetAccess() {
        return internetAccess;
    }


    /**
     * Sets the internetAccess value for this Nic.
     * 
     * @param internetAccess
     */
    public void setInternetAccess(java.lang.Boolean internetAccess) {
        this.internetAccess = internetAccess;
    }


    /**
     * Gets the serverId value for this Nic.
     * 
     * @return serverId
     */
    public java.lang.String getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this Nic.
     * 
     * @param serverId
     */
    public void setServerId(java.lang.String serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the ips value for this Nic.
     * 
     * @return ips
     */
    public java.lang.String[] getIps() {
        return ips;
    }


    /**
     * Sets the ips value for this Nic.
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


    /**
     * Gets the macAddress value for this Nic.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this Nic.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the firewall value for this Nic.
     * 
     * @return firewall
     */
    public com.profitbricks.api.ws.Firewall getFirewall() {
        return firewall;
    }


    /**
     * Sets the firewall value for this Nic.
     * 
     * @param firewall
     */
    public void setFirewall(com.profitbricks.api.ws.Firewall firewall) {
        this.firewall = firewall;
    }


    /**
     * Gets the dhcpActive value for this Nic.
     * 
     * @return dhcpActive
     */
    public java.lang.Boolean getDhcpActive() {
        return dhcpActive;
    }


    /**
     * Sets the dhcpActive value for this Nic.
     * 
     * @param dhcpActive
     */
    public void setDhcpActive(java.lang.Boolean dhcpActive) {
        this.dhcpActive = dhcpActive;
    }


    /**
     * Gets the gatewayIp value for this Nic.
     * 
     * @return gatewayIp
     */
    public java.lang.String getGatewayIp() {
        return gatewayIp;
    }


    /**
     * Sets the gatewayIp value for this Nic.
     * 
     * @param gatewayIp
     */
    public void setGatewayIp(java.lang.String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }


    /**
     * Gets the provisioningState value for this Nic.
     * 
     * @return provisioningState
     */
    public com.profitbricks.api.ws.ProvisioningState getProvisioningState() {
        return provisioningState;
    }


    /**
     * Sets the provisioningState value for this Nic.
     * 
     * @param provisioningState
     */
    public void setProvisioningState(com.profitbricks.api.ws.ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nic)) return false;
        Nic other = (Nic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nicId==null && other.getNicId()==null) || 
             (this.nicId!=null &&
              this.nicId.equals(other.getNicId()))) &&
            ((this.nicName==null && other.getNicName()==null) || 
             (this.nicName!=null &&
              this.nicName.equals(other.getNicName()))) &&
            this.lanId == other.getLanId() &&
            ((this.internetAccess==null && other.getInternetAccess()==null) || 
             (this.internetAccess!=null &&
              this.internetAccess.equals(other.getInternetAccess()))) &&
            ((this.serverId==null && other.getServerId()==null) || 
             (this.serverId!=null &&
              this.serverId.equals(other.getServerId()))) &&
            ((this.ips==null && other.getIps()==null) || 
             (this.ips!=null &&
              java.util.Arrays.equals(this.ips, other.getIps()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.firewall==null && other.getFirewall()==null) || 
             (this.firewall!=null &&
              this.firewall.equals(other.getFirewall()))) &&
            ((this.dhcpActive==null && other.getDhcpActive()==null) || 
             (this.dhcpActive!=null &&
              this.dhcpActive.equals(other.getDhcpActive()))) &&
            ((this.gatewayIp==null && other.getGatewayIp()==null) || 
             (this.gatewayIp!=null &&
              this.gatewayIp.equals(other.getGatewayIp()))) &&
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
        int _hashCode = super.hashCode();
        if (getNicId() != null) {
            _hashCode += getNicId().hashCode();
        }
        if (getNicName() != null) {
            _hashCode += getNicName().hashCode();
        }
        _hashCode += getLanId();
        if (getInternetAccess() != null) {
            _hashCode += getInternetAccess().hashCode();
        }
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
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
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getFirewall() != null) {
            _hashCode += getFirewall().hashCode();
        }
        if (getDhcpActive() != null) {
            _hashCode += getDhcpActive().hashCode();
        }
        if (getGatewayIp() != null) {
            _hashCode += getGatewayIp().hashCode();
        }
        if (getProvisioningState() != null) {
            _hashCode += getProvisioningState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "nic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internetAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internetAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firewall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewall"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcpActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dhcpActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayIp"));
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
