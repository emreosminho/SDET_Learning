package oopWithlayeredApp;

import oopWithlayeredApp.business.ProductManager;
import oopWithlayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone xr",1000);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product1);
	
	}

}
