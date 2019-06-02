package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WS_Demo {
	
	@WebMethod
	public String helloworld();
	
	@WebMethod
	public String greet(String name);
	
	
}
