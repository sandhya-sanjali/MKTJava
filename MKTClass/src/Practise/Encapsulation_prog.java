package Practise;

class Studentdetails
{
	private String emailid="contact@grotechmainds.com";
	public void set_emailid(String emailid)//converting local variable to global variable
	{
		this.emailid=emailid;	
	}
	public String get_emailid()//return changed the modifier from void to string
	{
		return emailid;
	}
}
public class Encapsulation_prog
{
	public static void main(String[] args) 
	{
		Studentdetails s1=new Studentdetails();
		s1.set_emailid("sandhya.sanjali@gmail.com");
		System.out.println(s1.get_emailid());
	}

}
