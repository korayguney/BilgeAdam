package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import models.Product;


@WebService
public interface WS_Product {
	
	@WebMethod
	public Product find();

	@WebMethod
	public List<Product> findAll();
	
	
	
}
