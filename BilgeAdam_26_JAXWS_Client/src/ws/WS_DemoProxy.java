package ws;

public class WS_DemoProxy implements ws.WS_Demo {
  private String _endpoint = null;
  private ws.WS_Demo wS_Demo = null;
  
  public WS_DemoProxy() {
    _initWS_DemoProxy();
  }
  
  public WS_DemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initWS_DemoProxy();
  }
  
  private void _initWS_DemoProxy() {
    try {
      wS_Demo = (new ws.WS_DemoImplServiceLocator()).getWS_DemoImplPort();
      if (wS_Demo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wS_Demo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wS_Demo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wS_Demo != null)
      ((javax.xml.rpc.Stub)wS_Demo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.WS_Demo getWS_Demo() {
    if (wS_Demo == null)
      _initWS_DemoProxy();
    return wS_Demo;
  }
  
  public java.lang.String helloworld() throws java.rmi.RemoteException{
    if (wS_Demo == null)
      _initWS_DemoProxy();
    return wS_Demo.helloworld();
  }
  
  public java.lang.String greet(java.lang.String arg0) throws java.rmi.RemoteException{
    if (wS_Demo == null)
      _initWS_DemoProxy();
    return wS_Demo.greet(arg0);
  }
  
  
}