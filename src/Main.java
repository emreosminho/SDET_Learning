public class Main {

	public static void main(String[] args) {
				//set value
		Product product1 = new Product();
		product1.name = "Delaongi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitInStock = 3;
		product1.imageUrl = "bilmemne1.jpg";
		
		Product product2 = new Product();
		product2.name = "Seta Kahve Makinesi";
		product2.unitPrice = 3500;
		product2.discount = 7;
		product2.unitInStock = 5;
		product2.imageUrl = "bilmemne2.jpg";
		
		Product product3 = new Product();
		product3.name = "Mendo Kahve Makinesi";
		product3.unitPrice = 7500;
		product3.discount = 3;
		product3.unitInStock = 9;
		product3.imageUrl = "bilmemne3.jpg";
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
	}
}
