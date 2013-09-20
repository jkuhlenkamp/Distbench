/**
 * ProfitbricksApiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class ProfitbricksApiServiceLocator extends org.apache.axis.client.Service implements com.profitbricks.api.ws.ProfitbricksApiService {

    public ProfitbricksApiServiceLocator() {
    }


    public ProfitbricksApiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProfitbricksApiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProfitbricksApiServicePort
    private java.lang.String ProfitbricksApiServicePort_address = "https://api.profitbricks.com/1.2";

    public java.lang.String getProfitbricksApiServicePortAddress() {
        return ProfitbricksApiServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProfitbricksApiServicePortWSDDServiceName = "ProfitbricksApiServicePort";

    public java.lang.String getProfitbricksApiServicePortWSDDServiceName() {
        return ProfitbricksApiServicePortWSDDServiceName;
    }

    public void setProfitbricksApiServicePortWSDDServiceName(java.lang.String name) {
        ProfitbricksApiServicePortWSDDServiceName = name;
    }

    public com.profitbricks.api.ws.ProfitbricksApiServicePortType getProfitbricksApiServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProfitbricksApiServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProfitbricksApiServicePort(endpoint);
    }

    public com.profitbricks.api.ws.ProfitbricksApiServicePortType getProfitbricksApiServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub _stub = new com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub(portAddress, this);
            _stub.setPortName(getProfitbricksApiServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProfitbricksApiServicePortEndpointAddress(java.lang.String address) {
        ProfitbricksApiServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.profitbricks.api.ws.ProfitbricksApiServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub _stub = new com.profitbricks.api.ws.ProfitbricksApiServicePortBindingStub(new java.net.URL(ProfitbricksApiServicePort_address), this);
                _stub.setPortName(getProfitbricksApiServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProfitbricksApiServicePort".equals(inputPortName)) {
            return getProfitbricksApiServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksApiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksApiServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProfitbricksApiServicePort".equals(portName)) {
            setProfitbricksApiServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
