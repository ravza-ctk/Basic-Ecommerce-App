package eticaret_uyg;

public abstract class Product(string name,int price){

	public Product{
		this.name=name;
		this.price=price;
	}
	void addToCart(Product product) {
         
        System.out.println(product.getName() + "I added to cart");
	}
	
	public void displayDetails() {
	    System.out.println(name + " " + price);
	}
}
