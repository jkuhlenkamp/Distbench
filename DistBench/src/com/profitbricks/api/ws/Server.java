/**
 * Server.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class Server  extends com.profitbricks.api.ws.VersionResponse  implements java.io.Serializable {
    private java.lang.String serverId;

    private java.lang.String serverName;

    private java.lang.Integer cores;

    private java.lang.Integer ram;

    private boolean internetAccess;

    private java.lang.String[] ips;

    private com.profitbricks.api.ws.ConnectedStorage[] connectedStorages;

    private com.profitbricks.api.ws.RomDrive[] romDrives;

    private com.profitbricks.api.ws.Nic[] nics;

    private com.profitbricks.api.ws.ProvisioningState provisioningState;

    private com.profitbricks.api.ws.VirtualMachineState virtualMachineState;

    private java.util.Calendar creationTime;

    private java.util.Calendar lastModificationTime;

    private com.profitbricks.api.ws.OsType osType;

    private com.profitbricks.api.ws.AvailabilityZone availabilityZone;

    public Server() {
    }

    public Server(
           java.lang.String requestId,
           java.lang.String dataCenterId,
           java.lang.Integer dataCenterVersion,
           java.lang.String serverId,
           java.lang.String serverName,
           java.lang.Integer cores,
           java.lang.Integer ram,
           boolean internetAccess,
           java.lang.String[] ips,
           com.profitbricks.api.ws.ConnectedStorage[] connectedStorages,
           com.profitbricks.api.ws.RomDrive[] romDrives,
           com.profitbricks.api.ws.Nic[] nics,
           com.profitbricks.api.ws.ProvisioningState provisioningState,
           com.profitbricks.api.ws.VirtualMachineState virtualMachineState,
           java.util.Calendar creationTime,
           java.util.Calendar lastModificationTime,
           com.profitbricks.api.ws.OsType osType,
           com.profitbricks.api.ws.AvailabilityZone availabilityZone) {
        super(
            requestId,
            dataCenterId,
            dataCenterVersion);
        this.serverId = serverId;
        this.serverName = serverName;
        this.cores = cores;
        this.ram = ram;
        this.internetAccess = internetAccess;
        this.ips = ips;
        this.connectedStorages = connectedStorages;
        this.romDrives = romDrives;
        this.nics = nics;
        this.provisioningState = provisioningState;
        this.virtualMachineState = virtualMachineState;
        this.creationTime = creationTime;
        this.lastModificationTime = lastModificationTime;
        this.osType = osType;
        this.availabilityZone = availabilityZone;
    }


    /**
     * Gets the serverId value for this Server.
     * 
     * @return serverId
     */
    public java.lang.String getServerId() {
        return serverId;
    }


    /**
     * Sets the serverId value for this Server.
     * 
     * @param serverId
     */
    public void setServerId(java.lang.String serverId) {
        this.serverId = serverId;
    }


    /**
     * Gets the serverName value for this Server.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this Server.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the cores value for this Server.
     * 
     * @return cores
     */
    public java.lang.Integer getCores() {
        return cores;
    }


    /**
     * Sets the cores value for this Server.
     * 
     * @param cores
     */
    public void setCores(java.lang.Integer cores) {
        this.cores = cores;
    }


    /**
     * Gets the ram value for this Server.
     * 
     * @return ram
     */
    public java.lang.Integer getRam() {
        return ram;
    }


    /**
     * Sets the ram value for this Server.
     * 
     * @param ram
     */
    public void setRam(java.lang.Integer ram) {
        this.ram = ram;
    }


    /**
     * Gets the internetAccess value for this Server.
     * 
     * @return internetAccess
     */
    public boolean isInternetAccess() {
        return internetAccess;
    }


    /**
     * Sets the internetAccess value for this Server.
     * 
     * @param internetAccess
     */
    public void setInternetAccess(boolean internetAccess) {
        this.internetAccess = internetAccess;
    }


    /**
     * Gets the ips value for this Server.
     * 
     * @return ips
     */
    public java.lang.String[] getIps() {
        return ips;
    }


    /**
     * Sets the ips value for this Server.
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
     * Gets the connectedStorages value for this Server.
     * 
     * @return connectedStorages
     */
    public com.profitbricks.api.ws.ConnectedStorage[] getConnectedStorages() {
        return connectedStorages;
    }


    /**
     * Sets the connectedStorages value for this Server.
     * 
     * @param connectedStorages
     */
    public void setConnectedStorages(com.profitbricks.api.ws.ConnectedStorage[] connectedStorages) {
        this.connectedStorages = connectedStorages;
    }

    public com.profitbricks.api.ws.ConnectedStorage getConnectedStorages(int i) {
        return this.connectedStorages[i];
    }

    public void setConnectedStorages(int i, com.profitbricks.api.ws.ConnectedStorage _value) {
        this.connectedStorages[i] = _value;
    }


    /**
     * Gets the romDrives value for this Server.
     * 
     * @return romDrives
     */
    public com.profitbricks.api.ws.RomDrive[] getRomDrives() {
        return romDrives;
    }


    /**
     * Sets the romDrives value for this Server.
     * 
     * @param romDrives
     */
    public void setRomDrives(com.profitbricks.api.ws.RomDrive[] romDrives) {
        this.romDrives = romDrives;
    }

    public com.profitbricks.api.ws.RomDrive getRomDrives(int i) {
        return this.romDrives[i];
    }

    public void setRomDrives(int i, com.profitbricks.api.ws.RomDrive _value) {
        this.romDrives[i] = _value;
    }


    /**
     * Gets the nics value for this Server.
     * 
     * @return nics
     */
    public com.profitbricks.api.ws.Nic[] getNics() {
        return nics;
    }


    /**
     * Sets the nics value for this Server.
     * 
     * @param nics
     */
    public void setNics(com.profitbricks.api.ws.Nic[] nics) {
        this.nics = nics;
    }

    public com.profitbricks.api.ws.Nic getNics(int i) {
        return this.nics[i];
    }

    public void setNics(int i, com.profitbricks.api.ws.Nic _value) {
        this.nics[i] = _value;
    }


    /**
     * Gets the provisioningState value for this Server.
     * 
     * @return provisioningState
     */
    public com.profitbricks.api.ws.ProvisioningState getProvisioningState() {
        return provisioningState;
    }


    /**
     * Sets the provisioningState value for this Server.
     * 
     * @param provisioningState
     */
    public void setProvisioningState(com.profitbricks.api.ws.ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
    }


    /**
     * Gets the virtualMachineState value for this Server.
     * 
     * @return virtualMachineState
     */
    public com.profitbricks.api.ws.VirtualMachineState getVirtualMachineState() {
        return virtualMachineState;
    }


    /**
     * Sets the virtualMachineState value for this Server.
     * 
     * @param virtualMachineState
     */
    public void setVirtualMachineState(com.profitbricks.api.ws.VirtualMachineState virtualMachineState) {
        this.virtualMachineState = virtualMachineState;
    }


    /**
     * Gets the creationTime value for this Server.
     * 
     * @return creationTime
     */
    public java.util.Calendar getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this Server.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.util.Calendar creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the lastModificationTime value for this Server.
     * 
     * @return lastModificationTime
     */
    public java.util.Calendar getLastModificationTime() {
        return lastModificationTime;
    }


    /**
     * Sets the lastModificationTime value for this Server.
     * 
     * @param lastModificationTime
     */
    public void setLastModificationTime(java.util.Calendar lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }


    /**
     * Gets the osType value for this Server.
     * 
     * @return osType
     */
    public com.profitbricks.api.ws.OsType getOsType() {
        return osType;
    }


    /**
     * Sets the osType value for this Server.
     * 
     * @param osType
     */
    public void setOsType(com.profitbricks.api.ws.OsType osType) {
        this.osType = osType;
    }


    /**
     * Gets the availabilityZone value for this Server.
     * 
     * @return availabilityZone
     */
    public com.profitbricks.api.ws.AvailabilityZone getAvailabilityZone() {
        return availabilityZone;
    }


    /**
     * Sets the availabilityZone value for this Server.
     * 
     * @param availabilityZone
     */
    public void setAvailabilityZone(com.profitbricks.api.ws.AvailabilityZone availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Server)) return false;
        Server other = (Server) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serverId==null && other.getServerId()==null) || 
             (this.serverId!=null &&
              this.serverId.equals(other.getServerId()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.cores==null && other.getCores()==null) || 
             (this.cores!=null &&
              this.cores.equals(other.getCores()))) &&
            ((this.ram==null && other.getRam()==null) || 
             (this.ram!=null &&
              this.ram.equals(other.getRam()))) &&
            this.internetAccess == other.isInternetAccess() &&
            ((this.ips==null && other.getIps()==null) || 
             (this.ips!=null &&
              java.util.Arrays.equals(this.ips, other.getIps()))) &&
            ((this.connectedStorages==null && other.getConnectedStorages()==null) || 
             (this.connectedStorages!=null &&
              java.util.Arrays.equals(this.connectedStorages, other.getConnectedStorages()))) &&
            ((this.romDrives==null && other.getRomDrives()==null) || 
             (this.romDrives!=null &&
              java.util.Arrays.equals(this.romDrives, other.getRomDrives()))) &&
            ((this.nics==null && other.getNics()==null) || 
             (this.nics!=null &&
              java.util.Arrays.equals(this.nics, other.getNics()))) &&
            ((this.provisioningState==null && other.getProvisioningState()==null) || 
             (this.provisioningState!=null &&
              this.provisioningState.equals(other.getProvisioningState()))) &&
            ((this.virtualMachineState==null && other.getVirtualMachineState()==null) || 
             (this.virtualMachineState!=null &&
              this.virtualMachineState.equals(other.getVirtualMachineState()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.lastModificationTime==null && other.getLastModificationTime()==null) || 
             (this.lastModificationTime!=null &&
              this.lastModificationTime.equals(other.getLastModificationTime()))) &&
            ((this.osType==null && other.getOsType()==null) || 
             (this.osType!=null &&
              this.osType.equals(other.getOsType()))) &&
            ((this.availabilityZone==null && other.getAvailabilityZone()==null) || 
             (this.availabilityZone!=null &&
              this.availabilityZone.equals(other.getAvailabilityZone())));
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
        if (getServerId() != null) {
            _hashCode += getServerId().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getCores() != null) {
            _hashCode += getCores().hashCode();
        }
        if (getRam() != null) {
            _hashCode += getRam().hashCode();
        }
        _hashCode += (isInternetAccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getConnectedStorages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectedStorages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectedStorages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRomDrives() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRomDrives());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRomDrives(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProvisioningState() != null) {
            _hashCode += getProvisioningState().hashCode();
        }
        if (getVirtualMachineState() != null) {
            _hashCode += getVirtualMachineState().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getLastModificationTime() != null) {
            _hashCode += getLastModificationTime().hashCode();
        }
        if (getOsType() != null) {
            _hashCode += getOsType().hashCode();
        }
        if (getAvailabilityZone() != null) {
            _hashCode += getAvailabilityZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Server.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "server"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ram");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ram"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("ips");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedStorages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectedStorages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "connectedStorage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("romDrives");
        elemField.setXmlName(new javax.xml.namespace.QName("", "romDrives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "romDrive"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "nic"));
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
        elemField.setFieldName("virtualMachineState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtualMachineState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "virtualMachineState"));
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
        elemField.setFieldName("osType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "osType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availabilityZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "availabilityZone"));
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
