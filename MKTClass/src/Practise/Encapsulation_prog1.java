package Practise;

class details
{
	private String username="sandhya.sanjali@gmail.com";
	private String password="sandhya@123";
	private int phno=87489;
	
	public void set_username(String username)
	{
		this.username=username;
	}
	public void set_password(String password)
	{
		this.password=password;
	}
	public void set_phno(int phno)
	{
		this.phno=phno;
	}
	
	public String get_username()
	{
		return username;
	}
	public String get_password()
	{
		return password;
	}
	public int get_phno()
	{
		return phno;
	}
}
public class Encapsulation_prog1 
{
	public static void main(String[] args) 
	{
		details d1=new details();
		d1.set_username("gsr.gsr7@gmail.com");
		d1.set_password("gsr@123");
		d1.set_phno(7204);
		
		System.out.println(d1.get_username());
		System.out.println(d1.get_password());
		System.out.println(d1.get_phno());
	}

}
