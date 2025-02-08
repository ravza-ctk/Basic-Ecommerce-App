package eticaret_uyg;

public class Cart {
	
	addProduct(Product product){
		cart.add(product);
	}
	
	removeProduct(Product product)
	{
		cart.remove(product);
        System.out.println(product.name + "It has been removed from cart");
	}
	

	double calculateTotal(){
		double total=0;
		for(int i=0;i<cart.size;i++)
		{
			total=get.Pricecart[i];
		}
		return total;
		}
	
	 for (Product i : product) {
         i.displayDetails();
     }
     System.out.println("Toplam fiyat: " + calculateTotal() + " TL");
 }
}
