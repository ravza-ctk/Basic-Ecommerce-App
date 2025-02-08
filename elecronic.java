package eticaret_uyg;

public class elecronic extends Product{

	int timeOfGrantee;
	
	public elecronic{
		this.timeOfGrantee=timeOfGrantee;
	}
	
	
	@Override
	public void displayDetails() {
        System.out.println(name + " " + price + "  " + timeOfGrantee);
    }
}
