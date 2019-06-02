package main;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import ws.Product;
import ws.WS_Demo;
import ws.WS_DemoImplService;
import ws.WS_DemoImplServiceLocator;
import ws.WS_Product;
import ws.WS_ProductImplService;
import ws.WS_ProductImplServiceLocator;

public class WSClientTest {

	public static void main(String[] args) throws ServiceException, RemoteException {
		
		WS_DemoImplService demoImplService = new WS_DemoImplServiceLocator();
		WS_Demo demo = demoImplService.getWS_DemoImplPort();
		
		System.out.println(demo.helloworld());
		System.out.println(demo.greet("Koray"));
		
		WS_ProductImplService productImplService = new WS_ProductImplServiceLocator();
		WS_Product product = productImplService.getWS_ProductImplPort();
		
		System.out.println(product.find().getName());
		
		for (Product p : product.findAll()) {
			System.out.println("===============================");
			System.out.println("Product ID : " + p.getId());
			System.out.println("Product Name : " + p.getName());
			System.out.println("Product Price : " + p.getPrice());
		}
		
	}

}
