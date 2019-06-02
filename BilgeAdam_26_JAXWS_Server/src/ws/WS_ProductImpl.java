package ws;

import java.util.List;

import javax.jws.WebService;

import DAO.ProductDAO;
import models.Product;

@WebService(endpointInterface="ws.WS_Product")
public class WS_ProductImpl implements WS_Product{
	
	ProductDAO dao = new ProductDAO();
	
	@Override
	public Product find() {
		return dao.find();
	}

	@Override
	public List<Product> findAll() {
		return dao.findAll();
	}

}
