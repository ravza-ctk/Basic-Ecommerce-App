package eticaret_uyg;

public class User(String username, String password) {

	//constructor
	public user{
		this.username=username;
		this.password=password;
        this.cart = new ArrayList<>(); //user sepeti için constructor
	}
	
	
	public void login(String username,String password)
	{
		if(username==this.username && password==this.password)
			System.out.println("The login was successfull");
		else
			System.out.println("You entered wrong username or password")
	}
	

}
