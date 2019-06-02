package DAO;

import java.util.ArrayList;
import java.util.List;

import models.Product;

public class ProductDAO {

	public Product find() {
		Product product = new Product(1,"Product 1", 25);
		return product;
	}
	
	public List<Product> findAll() {
		
		List<Product> arr = new ArrayList<>();
		arr.add(new Product(2, "Product 2", 25.45));
		arr.add(new Product(3, "Product 3", 21.75));
		arr.add(new Product(4, "Product 4", 45.45));
		
		return arr;
	}
	
	
}
