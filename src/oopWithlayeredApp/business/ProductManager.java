package oopWithlayeredApp.business;

import oopWithlayeredApp.dataAccess.JdbcProductDao;
import oopWithlayeredApp.entities.Product;

public class ProductManager {
	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10dan küçük olamaz");
		}
		
		JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);
	}
}
