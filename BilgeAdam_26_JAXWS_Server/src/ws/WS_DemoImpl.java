package ws;

import javax.jws.WebService;

@WebService(endpointInterface="ws.WS_Demo")
public class WS_DemoImpl implements WS_Demo {

	@Override
	public String helloworld() {
		return "Welcome to WS World!";
	}

	@Override
	public String greet(String name) {
		return "Welcome " + name;
	}

}
