package oopWithlayeredApp.dataAccess;

import oopWithlayeredApp.entities.Product;

public class JdbcProductDao {
	public void add(Product product) {
		//sadece db erişim kodları buraya yazılır.
		System.out.println("JDBC ile veritabanına eklendi");
	}
}


