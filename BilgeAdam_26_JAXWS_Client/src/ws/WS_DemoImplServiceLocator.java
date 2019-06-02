/**
 * WS_DemoImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class WS_DemoImplServiceLocator extends org.apache.axis.client.Service implements ws.WS_DemoImplService {

    public WS_DemoImplServiceLocator() {
    }


    public WS_DemoImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WS_DemoImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WS_DemoImplPort
    private java.lang.String WS_DemoImplPort_address = "http://localhost:2589/ws/demo";

    public java.lang.String getWS_DemoImplPortAddress() {
        return WS_DemoImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WS_DemoImplPortWSDDServiceName = "WS_DemoImplPort";

    public java.lang.String getWS_DemoImplPortWSDDServiceName() {
        return WS_DemoImplPortWSDDServiceName;
    }

    public void setWS_DemoImplPortWSDDServiceName(java.lang.String name) {
        WS_DemoImplPortWSDDServiceName = name;
    }

    public ws.WS_Demo getWS_DemoImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WS_DemoImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWS_DemoImplPort(endpoint);
    }

    public ws.WS_Demo getWS_DemoImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.WS_DemoImplPortBindingStub _stub = new ws.WS_DemoImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWS_DemoImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWS_DemoImplPortEndpointAddress(java.lang.String address) {
        WS_DemoImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.WS_Demo.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.WS_DemoImplPortBindingStub _stub = new ws.WS_DemoImplPortBindingStub(new java.net.URL(WS_DemoImplPort_address), this);
                _stub.setPortName(getWS_DemoImplPortWSDDServiceName());
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
        if ("WS_DemoImplPort".equals(inputPortName)) {
            return getWS_DemoImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "WS_DemoImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "WS_DemoImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WS_DemoImplPort".equals(portName)) {
            setWS_DemoImplPortEndpointAddress(address);
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
