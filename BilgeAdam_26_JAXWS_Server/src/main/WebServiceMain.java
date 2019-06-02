package main;

import javax.xml.ws.Endpoint;

import ws.WS_DemoImpl;
import ws.WS_ProductImpl;

public class WebServiceMain {

	public static void main(String[] args) {
		
		try {
			Endpoint.publish("http://localhost:2591/ws/demo", new WS_DemoImpl());
			Endpoint.publish("http://localhost:2591/ws/product", new WS_ProductImpl());
			
			System.out.println("Published");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
