package eticaret_uyg;

public class Clothes extends Product{

	String sizes;
	
	public Clothes{
		this.sizes=sizes;
	}
	
	
	@Override
	public void displayDetails() {
        System.out.println(name + " " + price + "  " + size);
    }
}
