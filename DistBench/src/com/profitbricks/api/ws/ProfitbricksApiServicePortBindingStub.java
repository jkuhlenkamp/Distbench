/**
 * ProfitbricksApiServicePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public class ProfitbricksApiServicePortBindingStub extends org.apache.axis.client.Stub implements com.profitbricks.api.ws.ProfitbricksApiServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[58];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDataCenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataCenterName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "region"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "region"), com.profitbricks.api.ws.Region.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createDcResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.CreateDcResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDataCenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateDcRequest"), com.profitbricks.api.ws.UpdateDcRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("clearDataCenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataCenterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteDataCenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataCenterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllDataCenters");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "dataCenterIdentifier"));
        oper.setReturnClass(com.profitbricks.api.ws.DataCenterIdentifier[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createServerRequest"), com.profitbricks.api.ws.CreateServerRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createServerResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.CreateServerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateServerRequest"), com.profitbricks.api.ws.UpdateServerRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "server"));
        oper.setReturnClass(com.profitbricks.api.ws.Server.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createNic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createNicRequest"), com.profitbricks.api.ws.CreateNicRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createNicResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.CreateNicResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteNic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nicId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateNic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateNicRequest"), com.profitbricks.api.ws.UpdateNicRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nicId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "nic"));
        oper.setReturnClass(com.profitbricks.api.ws.Nic.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setInternetAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataCenterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "lanId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "internetAccess"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createStorage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createStorageRequest"), com.profitbricks.api.ws.CreateStorageRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createStorageResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.CreateStorageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateStorage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateStorageRequest"), com.profitbricks.api.ws.UpdateStorageRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteStorage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "storageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("connectStorageToServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "connectStorageRequest"), com.profitbricks.api.ws.ConnectStorageRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("disconnectStorageFromServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "storageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllImages");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "image"));
        oper.setReturnClass(com.profitbricks.api.ws.Image[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setImageOsType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "imageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "osType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "osType"), com.profitbricks.api.ws.OsType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRomDriveToServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "romDriveRequest"), com.profitbricks.api.ws.RomDriveRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeRomDriveFromServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "imageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "imageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "image"));
        oper.setReturnClass(com.profitbricks.api.ws.Image.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataCenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataCenterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "dataCenter"));
        oper.setReturnClass(com.profitbricks.api.ws.DataCenter.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataCenterState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataCenterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "provisioningState"));
        oper.setReturnClass(com.profitbricks.api.ws.ProvisioningState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStorage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "storageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "storage"));
        oper.setReturnClass(com.profitbricks.api.ws.Storage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reservePublicIpBlock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "blockSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "region"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "region"), com.profitbricks.api.ws.Region.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ipBlockResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.IpBlockResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("releasePublicIpBlock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "blockId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPublicIpToNic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ip"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nicId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removePublicIpFromNic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ip"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nicId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllPublicIpBlocks");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ipBlock"));
        oper.setReturnClass(com.profitbricks.api.ws.IpBlock[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createLoadBalancer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createLbRequest"), com.profitbricks.api.ws.CreateLbRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createLbResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.CreateLbResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateLoadBalancer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateLbRequest"), com.profitbricks.api.ws.UpdateLbRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteLoadBalancer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loadBalancerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLoadBalancer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loadBalancerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "loadBalancer"));
        oper.setReturnClass(com.profitbricks.api.ws.LoadBalancer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerServersOnLoadBalancer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loadBalancerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "registerLbServerResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RegisterLbServerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deregisterServersOnLoadBalancer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loadBalancerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateLoadBalancingOnServers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loadBalancerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deactivateLoadBalancingOnServers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loadBalancerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "serverIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addFirewallRulesToNic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewallRuleRequest"), com.profitbricks.api.ws.FirewallRuleRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nicId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewall"));
        oper.setReturnClass(com.profitbricks.api.ws.Firewall.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addFirewallRulesToLoadBalancer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewallRuleRequest"), com.profitbricks.api.ws.FirewallRuleRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loadBalancerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewall"));
        oper.setReturnClass(com.profitbricks.api.ws.Firewall.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeFirewallRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "firewallRuleIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateFirewalls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "firewallIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deactivateFirewalls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "firewallIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteFirewalls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "firewallIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFirewall");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "firewallId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewall"));
        oper.setReturnClass(com.profitbricks.api.ws.Firewall.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllSnapshots");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "snapshot"));
        oper.setReturnClass(com.profitbricks.api.ws.Snapshot[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSnapshot");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateSnapshotRequest"), com.profitbricks.api.ws.UpdateSnapshotRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSnapshot");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "snapshotId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "snapshot"));
        oper.setReturnClass(com.profitbricks.api.ws.Snapshot.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSnapshot");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createSnapshotRequest"), com.profitbricks.api.ws.CreateSnapshotRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createSnapshotResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.CreateSnapshotResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSnapshot");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "snapshotId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.RequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rollbackSnapshot");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "rollbackSnapshotRequest"), com.profitbricks.api.ws.RollbackSnapshotRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse"));
        oper.setReturnClass(com.profitbricks.api.ws.VersionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNotifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "networkUUID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "notification"));
        oper.setReturnClass(com.profitbricks.api.ws.Notification[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteNotifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "notificationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"),
                      "com.profitbricks.api.ws.ProfitbricksServiceFault",
                      new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault"), 
                      true
                     ));
        _operations[57] = oper;

    }

    public ProfitbricksApiServicePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProfitbricksApiServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProfitbricksApiServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "availabilityZone");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.AvailabilityZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "balancedServer");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.BalancedServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "busType");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.BusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "connectedStorage");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.ConnectedStorage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "connectStorageRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.ConnectStorageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createDcResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateDcResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createLbRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateLbRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createLbResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateLbResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createNicRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateNicRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createNicResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateNicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createServerRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateServerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createServerResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateServerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createSnapshotRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateSnapshotRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createSnapshotResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateSnapshotResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createStorageRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateStorageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createStorageResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.CreateStorageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "dataCenter");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.DataCenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "dataCenterIdentifier");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.DataCenterIdentifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "faultCode");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.FaultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewall");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Firewall.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewallRule");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.FirewallRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "firewallRuleRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.FirewallRuleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "image");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Image.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "imageType");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.ImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ipBlock");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.IpBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ipBlockResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.IpBlockResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "loadBalancer");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.LoadBalancer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "loadBalancerAlgorithm");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.LoadBalancerAlgorithm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "mountImage");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.MountImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "nic");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Nic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "notification");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "notificationCode");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.NotificationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "osType");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.OsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "ProfitbricksServiceFault");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.ProfitbricksServiceFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "protocol");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Protocol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "provisioningState");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.ProvisioningState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "publicIp");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.PublicIp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "region");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Region.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "registerLbServerResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.RegisterLbServerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "requestResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.RequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "rollbackSnapshotRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.RollbackSnapshotRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "romDrive");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.RomDrive.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "romDriveRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.RomDriveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "server");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Server.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "snapshot");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Snapshot.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "storage");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.Storage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateDcRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.UpdateDcRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateLbRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.UpdateLbRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateNicRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.UpdateNicRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateServerRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.UpdateServerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateSnapshotRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.UpdateSnapshotRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateStorageRequest");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.UpdateStorageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "versionResponse");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.VersionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "virtualItemType");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.VirtualItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "virtualMachineState");
            cachedSerQNames.add(qName);
            cls = com.profitbricks.api.ws.VirtualMachineState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.profitbricks.api.ws.CreateDcResponse createDataCenter(java.lang.String dataCenterName, com.profitbricks.api.ws.Region region) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createDataCenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataCenterName, region});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.CreateDcResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.CreateDcResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.CreateDcResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse updateDataCenter(com.profitbricks.api.ws.UpdateDcRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateDataCenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse clearDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "clearDataCenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataCenterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RequestResponse deleteDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deleteDataCenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataCenterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.DataCenterIdentifier[] getAllDataCenters() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getAllDataCenters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.DataCenterIdentifier[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.DataCenterIdentifier[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.DataCenterIdentifier[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.CreateServerResponse createServer(com.profitbricks.api.ws.CreateServerRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.CreateServerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.CreateServerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.CreateServerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse updateServer(com.profitbricks.api.ws.UpdateServerRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse deleteServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deleteServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RequestResponse stopServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "stopServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RequestResponse startServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "startServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RequestResponse resetServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "resetServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Server getServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Server) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Server) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Server.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.CreateNicResponse createNic(com.profitbricks.api.ws.CreateNicRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createNic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.CreateNicResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.CreateNicResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.CreateNicResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse deleteNic(java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deleteNic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nicId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse updateNic(com.profitbricks.api.ws.UpdateNicRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateNic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Nic getNic(java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getNic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {nicId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Nic) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Nic) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Nic.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse setInternetAccess(java.lang.String dataCenterId, java.lang.Integer lanId, boolean internetAccess) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "setInternetAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataCenterId, lanId, new java.lang.Boolean(internetAccess)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.CreateStorageResponse createStorage(com.profitbricks.api.ws.CreateStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createStorage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.CreateStorageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.CreateStorageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.CreateStorageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse updateStorage(com.profitbricks.api.ws.UpdateStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateStorage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse deleteStorage(java.lang.String storageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deleteStorage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {storageId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse connectStorageToServer(com.profitbricks.api.ws.ConnectStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "connectStorageToServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse disconnectStorageFromServer(java.lang.String storageId, java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "disconnectStorageFromServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {storageId, serverId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Image[] getAllImages() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getAllImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Image[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Image[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Image[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RequestResponse setImageOsType(java.lang.String imageId, com.profitbricks.api.ws.OsType osType) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "setImageOsType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {imageId, osType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse addRomDriveToServer(com.profitbricks.api.ws.RomDriveRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "addRomDriveToServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse removeRomDriveFromServer(java.lang.String imageId, java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "removeRomDriveFromServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {imageId, serverId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Image getImage(java.lang.String imageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {imageId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Image) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Image) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Image.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.DataCenter getDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getDataCenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataCenterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.DataCenter) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.DataCenter) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.DataCenter.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.ProvisioningState getDataCenterState(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getDataCenterState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataCenterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.ProvisioningState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.ProvisioningState) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.ProvisioningState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Storage getStorage(java.lang.String storageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getStorage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {storageId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Storage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Storage) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Storage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.IpBlockResponse reservePublicIpBlock(int blockSize, com.profitbricks.api.ws.Region region) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "reservePublicIpBlock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(blockSize), region});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.IpBlockResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.IpBlockResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.IpBlockResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RequestResponse releasePublicIpBlock(java.lang.String blockId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "releasePublicIpBlock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {blockId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse addPublicIpToNic(java.lang.String ip, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "addPublicIpToNic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ip, nicId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse removePublicIpFromNic(java.lang.String ip, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "removePublicIpFromNic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ip, nicId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.IpBlock[] getAllPublicIpBlocks() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getAllPublicIpBlocks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.IpBlock[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.IpBlock[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.IpBlock[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.CreateLbResponse createLoadBalancer(com.profitbricks.api.ws.CreateLbRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createLoadBalancer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.CreateLbResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.CreateLbResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.CreateLbResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse updateLoadBalancer(com.profitbricks.api.ws.UpdateLbRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateLoadBalancer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse deleteLoadBalancer(java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deleteLoadBalancer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loadBalancerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.LoadBalancer getLoadBalancer(java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getLoadBalancer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loadBalancerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.LoadBalancer) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.LoadBalancer) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.LoadBalancer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RegisterLbServerResponse registerServersOnLoadBalancer(java.lang.String[] serverIds, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "registerServersOnLoadBalancer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverIds, loadBalancerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RegisterLbServerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RegisterLbServerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RegisterLbServerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse deregisterServersOnLoadBalancer(java.lang.String[] serverIds, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deregisterServersOnLoadBalancer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serverIds, loadBalancerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse activateLoadBalancingOnServers(java.lang.String loadBalancerId, java.lang.String[] serverIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "activateLoadBalancingOnServers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loadBalancerId, serverIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse deactivateLoadBalancingOnServers(java.lang.String loadBalancerId, java.lang.String[] serverIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deactivateLoadBalancingOnServers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {loadBalancerId, serverIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Firewall addFirewallRulesToNic(com.profitbricks.api.ws.FirewallRuleRequest[] request, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "addFirewallRulesToNic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, nicId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Firewall) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Firewall) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Firewall.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Firewall addFirewallRulesToLoadBalancer(com.profitbricks.api.ws.FirewallRuleRequest[] request, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "addFirewallRulesToLoadBalancer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request, loadBalancerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Firewall) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Firewall) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Firewall.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse removeFirewallRules(java.lang.String[] firewallRuleIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "removeFirewallRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {firewallRuleIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse activateFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "activateFirewalls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {firewallIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse deactivateFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deactivateFirewalls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {firewallIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse deleteFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deleteFirewalls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {firewallIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Firewall getFirewall(java.lang.String firewallId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getFirewall"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {firewallId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Firewall) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Firewall) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Firewall.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Snapshot[] getAllSnapshots() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getAllSnapshots"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Snapshot[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Snapshot[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Snapshot[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RequestResponse updateSnapshot(com.profitbricks.api.ws.UpdateSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "updateSnapshot"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Snapshot getSnapshot(java.lang.String snapshotId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getSnapshot"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {snapshotId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Snapshot) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Snapshot) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Snapshot.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.CreateSnapshotResponse createSnapshot(com.profitbricks.api.ws.CreateSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "createSnapshot"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.CreateSnapshotResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.CreateSnapshotResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.CreateSnapshotResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.RequestResponse deleteSnapshot(java.lang.String snapshotId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deleteSnapshot"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {snapshotId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.RequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.RequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.RequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.VersionResponse rollbackSnapshot(com.profitbricks.api.ws.RollbackSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "rollbackSnapshot"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.VersionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.VersionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.VersionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.profitbricks.api.ws.Notification[] getNotifications(java.lang.String networkUUID) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "getNotifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {networkUUID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.profitbricks.api.ws.Notification[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.profitbricks.api.ws.Notification[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.profitbricks.api.ws.Notification[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteNotifications(java.lang.String[] notificationId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.api.profitbricks.com/", "deleteNotifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {notificationId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.profitbricks.api.ws.ProfitbricksServiceFault) {
              throw (com.profitbricks.api.ws.ProfitbricksServiceFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
