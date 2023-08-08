package bank;

class Account
{ 
	public String name;
	protected String email;
	private String password;

	//getter & setters

	public Stirng getPassword()
	{
		return this.password;
	}

	public void setPassword(String pass)
	{
		this.password = pass;
	}
}

public class bank
{
	Account account1 = new Account();
	
	account1.name = "smit";
	account1.email = "smitjogani@gmial.com";

	account1.setPassword("abcd");
	System.out.println(account1.getPassword());
}