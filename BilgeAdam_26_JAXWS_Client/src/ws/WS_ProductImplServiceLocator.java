/**
 * WS_ProductImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class WS_ProductImplServiceLocator extends org.apache.axis.client.Service implements ws.WS_ProductImplService {

    public WS_ProductImplServiceLocator() {
    }


    public WS_ProductImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WS_ProductImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WS_ProductImplPort
    private java.lang.String WS_ProductImplPort_address = "http://localhost:2591/ws/product";

    public java.lang.String getWS_ProductImplPortAddress() {
        return WS_ProductImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WS_ProductImplPortWSDDServiceName = "WS_ProductImplPort";

    public java.lang.String getWS_ProductImplPortWSDDServiceName() {
        return WS_ProductImplPortWSDDServiceName;
    }

    public void setWS_ProductImplPortWSDDServiceName(java.lang.String name) {
        WS_ProductImplPortWSDDServiceName = name;
    }

    public ws.WS_Product getWS_ProductImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WS_ProductImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWS_ProductImplPort(endpoint);
    }

    public ws.WS_Product getWS_ProductImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.WS_ProductImplPortBindingStub _stub = new ws.WS_ProductImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWS_ProductImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWS_ProductImplPortEndpointAddress(java.lang.String address) {
        WS_ProductImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.WS_Product.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.WS_ProductImplPortBindingStub _stub = new ws.WS_ProductImplPortBindingStub(new java.net.URL(WS_ProductImplPort_address), this);
                _stub.setPortName(getWS_ProductImplPortWSDDServiceName());
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
        if ("WS_ProductImplPort".equals(inputPortName)) {
            return getWS_ProductImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "WS_ProductImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "WS_ProductImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WS_ProductImplPort".equals(portName)) {
            setWS_ProductImplPortEndpointAddress(address);
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
