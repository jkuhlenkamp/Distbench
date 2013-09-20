/**
 * DataCenter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class DataCenter  extends com.profitbricks.api.ws.VersionResponse  implements java.io.Serializable {
    private java.lang.String dataCenterName;

    private com.profitbricks.api.ws.Server[] servers;

    private com.profitbricks.api.ws.Storage[] storages;

    private com.profitbricks.api.ws.LoadBalancer[] loadBalancers;

    private com.profitbricks.api.ws.ProvisioningState provisioningState;

    private com.profitbricks.api.ws.Region region;

    public DataCenter() {
    }

    public DataCenter(
           java.lang.String requestId,
           java.lang.String dataCenterId,
           java.lang.Integer dataCenterVersion,
           java.lang.String dataCenterName,
           com.profitbricks.api.ws.Server[] servers,
           com.profitbricks.api.ws.Storage[] storages,
           com.profitbricks.api.ws.LoadBalancer[] loadBalancers,
           com.profitbricks.api.ws.ProvisioningState provisioningState,
           com.profitbricks.api.ws.Region region) {
        super(
            requestId,
            dataCenterId,
            dataCenterVersion);
        this.dataCenterName = dataCenterName;
        this.servers = servers;
        this.storages = storages;
        this.loadBalancers = loadBalancers;
        this.provisioningState = provisioningState;
        this.region = region;
    }


    /**
     * Gets the dataCenterName value for this DataCenter.
     * 
     * @return dataCenterName
     */
    public java.lang.String getDataCenterName() {
        return dataCenterName;
    }


    /**
     * Sets the dataCenterName value for this DataCenter.
     * 
     * @param dataCenterName
     */
    public void setDataCenterName(java.lang.String dataCenterName) {
        this.dataCenterName = dataCenterName;
    }


    /**
     * Gets the servers value for this DataCenter.
     * 
     * @return servers
     */
    public com.profitbricks.api.ws.Server[] getServers() {
        return servers;
    }


    /**
     * Sets the servers value for this DataCenter.
     * 
     * @param servers
     */
    public void setServers(com.profitbricks.api.ws.Server[] servers) {
        this.servers = servers;
    }

    public com.profitbricks.api.ws.Server getServers(int i) {
        return this.servers[i];
    }

    public void setServers(int i, com.profitbricks.api.ws.Server _value) {
        this.servers[i] = _value;
    }


    /**
     * Gets the storages value for this DataCenter.
     * 
     * @return storages
     */
    public com.profitbricks.api.ws.Storage[] getStorages() {
        return storages;
    }


    /**
     * Sets the storages value for this DataCenter.
     * 
     * @param storages
     */
    public void setStorages(com.profitbricks.api.ws.Storage[] storages) {
        this.storages = storages;
    }

    public com.profitbricks.api.ws.Storage getStorages(int i) {
        return this.storages[i];
    }

    public void setStorages(int i, com.profitbricks.api.ws.Storage _value) {
        this.storages[i] = _value;
    }


    /**
     * Gets the loadBalancers value for this DataCenter.
     * 
     * @return loadBalancers
     */
    public com.profitbricks.api.ws.LoadBalancer[] getLoadBalancers() {
        return loadBalancers;
    }


    /**
     * Sets the loadBalancers value for this DataCenter.
     * 
     * @param loadBalancers
     */
    public void setLoadBalancers(com.profitbricks.api.ws.LoadBalancer[] loadBalancers) {
        this.loadBalancers = loadBalancers;
    }

    public com.profitbricks.api.ws.LoadBalancer getLoadBalancers(int i) {
        return this.loadBalancers[i];
    }

    public void setLoadBalancers(int i, com.profitbricks.api.ws.LoadBalancer _value) {
        this.loadBalancers[i] = _value;
    }


    /**
     * Gets the provisioningState value for this DataCenter.
     * 
     * @return provisioningState
     */
    public com.profitbricks.api.ws.ProvisioningState getProvisioningState() {
        return provisioningState;
    }


    /**
     * Sets the provisioningState value for this DataCenter.
     * 
     * @param provisioningState
     */
    public void setProvisioningState(com.profitbricks.api.ws.ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
    }


    /**
     * Gets the region value for this DataCenter.
     * 
     * @return region
     */
    public com.profitbricks.api.ws.Region getRegion() {
        return region;
    }


    /**
     * Sets the region value for this DataCenter.
     * 
     * @param region
     */
    public void setRegion(com.profitbricks.api.ws.Region region) {
        this.region = region;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataCenter)) return false;
        DataCenter other = (DataCenter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataCenterName==null && other.getDataCenterName()==null) || 
             (this.dataCenterName!=null &&
              this.dataCenterName.equals(other.getDataCenterName()))) &&
            ((this.servers==null && other.getServers()==null) || 
             (this.servers!=null &&
              java.util.Arrays.equals(this.servers, other.getServers()))) &&
            ((this.storages==null && other.getStorages()==null) || 
             (this.storages!=null &&
              java.util.Arrays.equals(this.storages, other.getStorages()))) &&
            ((this.loadBalancers==null && other.getLoadBalancers()==null) || 
             (this.loadBalancers!=null &&
              java.util.Arrays.equals(this.loadBalancers, other.getLoadBalancers()))) &&
            ((this.provisioningState==null && other.getProvisioningState()==null) || 
             (this.provisioningState!=null &&
              this.provisioningState.equals(other.getProvisioningState()))) &&
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
        int _hashCode = super.hashCode();
        if (getDataCenterName() != null) {
            _hashCode += getDataCenterName().hashCode();
        }
        if (getServers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStorages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStorages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStorages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoadBalancers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoadBalancers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoadBalancers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProvisioningState() != null) {
            _hashCode += getProvisioningState().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataCenter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "dataCenter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCenterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCenterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "server"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "storage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadBalancers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadBalancers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "loadBalancer"));
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
