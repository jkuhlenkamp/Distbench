/**
 * LoadBalancer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class LoadBalancer  extends com.profitbricks.api.ws.VersionResponse  implements java.io.Serializable {
    private java.lang.String loadBalancerId;

    private java.lang.String loadBalancerName;

    private com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm;

    private boolean internetAccess;

    private java.lang.String ip;

    private int lanId;

    private com.profitbricks.api.ws.BalancedServer[] balancedServers;

    private com.profitbricks.api.ws.ProvisioningState provisioningState;

    private java.util.Calendar creationTime;

    private java.util.Calendar lastModificationTime;

    private com.profitbricks.api.ws.Firewall firewall;

    public LoadBalancer() {
    }

    public LoadBalancer(
           java.lang.String requestId,
           java.lang.String dataCenterId,
           java.lang.Integer dataCenterVersion,
           java.lang.String loadBalancerId,
           java.lang.String loadBalancerName,
           com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm,
           boolean internetAccess,
           java.lang.String ip,
           int lanId,
           com.profitbricks.api.ws.BalancedServer[] balancedServers,
           com.profitbricks.api.ws.ProvisioningState provisioningState,
           java.util.Calendar creationTime,
           java.util.Calendar lastModificationTime,
           com.profitbricks.api.ws.Firewall firewall) {
        super(
            requestId,
            dataCenterId,
            dataCenterVersion);
        this.loadBalancerId = loadBalancerId;
        this.loadBalancerName = loadBalancerName;
        this.loadBalancerAlgorithm = loadBalancerAlgorithm;
        this.internetAccess = internetAccess;
        this.ip = ip;
        this.lanId = lanId;
        this.balancedServers = balancedServers;
        this.provisioningState = provisioningState;
        this.creationTime = creationTime;
        this.lastModificationTime = lastModificationTime;
        this.firewall = firewall;
    }


    /**
     * Gets the loadBalancerId value for this LoadBalancer.
     * 
     * @return loadBalancerId
     */
    public java.lang.String getLoadBalancerId() {
        return loadBalancerId;
    }


    /**
     * Sets the loadBalancerId value for this LoadBalancer.
     * 
     * @param loadBalancerId
     */
    public void setLoadBalancerId(java.lang.String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }


    /**
     * Gets the loadBalancerName value for this LoadBalancer.
     * 
     * @return loadBalancerName
     */
    public java.lang.String getLoadBalancerName() {
        return loadBalancerName;
    }


    /**
     * Sets the loadBalancerName value for this LoadBalancer.
     * 
     * @param loadBalancerName
     */
    public void setLoadBalancerName(java.lang.String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }


    /**
     * Gets the loadBalancerAlgorithm value for this LoadBalancer.
     * 
     * @return loadBalancerAlgorithm
     */
    public com.profitbricks.api.ws.LoadBalancerAlgorithm getLoadBalancerAlgorithm() {
        return loadBalancerAlgorithm;
    }


    /**
     * Sets the loadBalancerAlgorithm value for this LoadBalancer.
     * 
     * @param loadBalancerAlgorithm
     */
    public void setLoadBalancerAlgorithm(com.profitbricks.api.ws.LoadBalancerAlgorithm loadBalancerAlgorithm) {
        this.loadBalancerAlgorithm = loadBalancerAlgorithm;
    }


    /**
     * Gets the internetAccess value for this LoadBalancer.
     * 
     * @return internetAccess
     */
    public boolean isInternetAccess() {
        return internetAccess;
    }


    /**
     * Sets the internetAccess value for this LoadBalancer.
     * 
     * @param internetAccess
     */
    public void setInternetAccess(boolean internetAccess) {
        this.internetAccess = internetAccess;
    }


    /**
     * Gets the ip value for this LoadBalancer.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this LoadBalancer.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the lanId value for this LoadBalancer.
     * 
     * @return lanId
     */
    public int getLanId() {
        return lanId;
    }


    /**
     * Sets the lanId value for this LoadBalancer.
     * 
     * @param lanId
     */
    public void setLanId(int lanId) {
        this.lanId = lanId;
    }


    /**
     * Gets the balancedServers value for this LoadBalancer.
     * 
     * @return balancedServers
     */
    public com.profitbricks.api.ws.BalancedServer[] getBalancedServers() {
        return balancedServers;
    }


    /**
     * Sets the balancedServers value for this LoadBalancer.
     * 
     * @param balancedServers
     */
    public void setBalancedServers(com.profitbricks.api.ws.BalancedServer[] balancedServers) {
        this.balancedServers = balancedServers;
    }

    public com.profitbricks.api.ws.BalancedServer getBalancedServers(int i) {
        return this.balancedServers[i];
    }

    public void setBalancedServers(int i, com.profitbricks.api.ws.BalancedServer _value) {
        this.balancedServers[i] = _value;
    }


    /**
     * Gets the provisioningState value for this LoadBalancer.
     * 
     * @return provisioningState
     */
    public com.profitbricks.api.ws.ProvisioningState getProvisioningState() {
        return provisioningState;
    }


    /**
     * Sets the provisioningState value for this LoadBalancer.
     * 
     * @param provisioningState
     */
    public void setProvisioningState(com.profitbricks.api.ws.ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
    }


    /**
     * Gets the creationTime value for this LoadBalancer.
     * 
     * @return creationTime
     */
    public java.util.Calendar getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this LoadBalancer.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.util.Calendar creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the lastModificationTime value for this LoadBalancer.
     * 
     * @return lastModificationTime
     */
    public java.util.Calendar getLastModificationTime() {
        return lastModificationTime;
    }


    /**
     * Sets the lastModificationTime value for this LoadBalancer.
     * 
     * @param lastModificationTime
     */
    public void setLastModificationTime(java.util.Calendar lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }


    /**
     * Gets the firewall value for this LoadBalancer.
     * 
     * @return firewall
     */
    public com.profitbricks.api.ws.Firewall getFirewall() {
        return firewall;
    }


    /**
     * Sets the firewall value for this LoadBalancer.
     * 
     * @param firewall
     */
    public void setFirewall(com.profitbricks.api.ws.Firewall firewall) {
        this.firewall = firewall;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoadBalancer)) return false;
        LoadBalancer other = (LoadBalancer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.loadBalancerId==null && other.getLoadBalancerId()==null) || 
             (this.loadBalancerId!=null &&
              this.loadBalancerId.equals(other.getLoadBalancerId()))) &&
            ((this.loadBalancerName==null && other.getLoadBalancerName()==null) || 
             (this.loadBalancerName!=null &&
              this.loadBalancerName.equals(other.getLoadBalancerName()))) &&
            ((this.loadBalancerAlgorithm==null && other.getLoadBalancerAlgorithm()==null) || 
             (this.loadBalancerAlgorithm!=null &&
              this.loadBalancerAlgorithm.equals(other.getLoadBalancerAlgorithm()))) &&
            this.internetAccess == other.isInternetAccess() &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            this.lanId == other.getLanId() &&
            ((this.balancedServers==null && other.getBalancedServers()==null) || 
             (this.balancedServers!=null &&
              java.util.Arrays.equals(this.balancedServers, other.getBalancedServers()))) &&
            ((this.provisioningState==null && other.getProvisioningState()==null) || 
             (this.provisioningState!=null &&
              this.provisioningState.equals(other.getProvisioningState()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.lastModificationTime==null && other.getLastModificationTime()==null) || 
             (this.lastModificationTime!=null &&
              this.lastModificationTime.equals(other.getLastModificationTime()))) &&
            ((this.firewall==null && other.getFirewall()==null) || 
             (this.firewall!=null &&
              this.firewall.equals(other.getFirewall())));
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
        if (getLoadBalancerId() != null) {
            _hashCode += getLoadBalancerId().hashCode();
        }
        if (getLoadBalancerName() != null) {
            _hashCode += getLoadBalancerName().hashCode();
        }
        if (getLoadBalancerAlgorithm() != null) {
            _hashCode += getLoadBalancerAlgorithm().hashCode();
        }
        _hashCode += (isInternetAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        _hashCode += getLanId();
        if (getBalancedServers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalancedServers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalancedServers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProvisioningState() != null) {
            _hashCode += getProvisioningState().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getLastModificationTime() != null) {
            _hashCode += getLastModificationTime().hashCode();
        }
        if (getFirewall() != null) {
            _hashCode += getFirewall().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoadBalancer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "loadBalancer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadBalancerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadBalancerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("internetAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internetAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancedServers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balancedServers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "balancedServer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provisioningState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "provisioningState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModificationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastModificationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
