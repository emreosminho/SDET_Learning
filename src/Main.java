public class Main {

	public static void main(String[] args) {
				//set value
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitInStock(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Mnagoli Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitInStock(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Samba Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitInStock(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
	}
}
