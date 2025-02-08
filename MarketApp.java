package eticaret_uyg;

public class MarketApp {

	    public static void main(String[] args) {
	        // Ürün kataloğu oluştur
	        Product product = new product();

	        Manager manager = new Manager("manager", "1235");
	        manager.login("manager", "1236");

	        Product phone = new elecronic("Phone", 10000, 2);
	        Product tshirt = new Clothes("Tshirt", 150, "L");

	        manager.addProduct(phone, product);
	        manager.addProduct(tshirt, product);


	        Customer customer = new Customer("ali", "5778");
	        customer.login("ali", "5778");

	        customer.getCart().addProduct(phone);
	        customer.getCart().addProduct(tshirt);

	        
	        customer.getCart().showCart();
	    }
	}
