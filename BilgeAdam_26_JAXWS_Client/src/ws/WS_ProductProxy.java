package ws;

public class WS_ProductProxy implements ws.WS_Product {
  private String _endpoint = null;
  private ws.WS_Product wS_Product = null;
  
  public WS_ProductProxy() {
    _initWS_ProductProxy();
  }
  
  public WS_ProductProxy(String endpoint) {
    _endpoint = endpoint;
    _initWS_ProductProxy();
  }
  
  private void _initWS_ProductProxy() {
    try {
      wS_Product = (new ws.WS_ProductImplServiceLocator()).getWS_ProductImplPort();
      if (wS_Product != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wS_Product)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wS_Product)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wS_Product != null)
      ((javax.xml.rpc.Stub)wS_Product)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.WS_Product getWS_Product() {
    if (wS_Product == null)
      _initWS_ProductProxy();
    return wS_Product;
  }
  
  public ws.Product find() throws java.rmi.RemoteException{
    if (wS_Product == null)
      _initWS_ProductProxy();
    return wS_Product.find();
  }
  
  public ws.Product[] findAll() throws java.rmi.RemoteException{
    if (wS_Product == null)
      _initWS_ProductProxy();
    return wS_Product.findAll();
  }
  
  
}