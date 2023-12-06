package Practise;
abstract class Google1//grand parent abstract class
{
	abstract void auth();//abstract
	void signin()//concrete method
	{
		System.out.println("helping zoom to signin");
	}
}
abstract class Facebook1 extends Google1//parent class concrete class
{
	void loginfromfb()//concrete
	{
		System.out.println("helping zoom to login");
	}
}
public class Zoom1 extends Facebook1//child class//concrete class
{
	void loginfromgoogle()//concrete method
	{
		System.out.println("login to zoom");
	}
	@Override
	void auth() //concrete method
	{
	System.out.println("Authentication to zoom");	
	}

	public static void main(String[] args) //concrete
	{
		Zoom1 z=new Zoom1();
		z.loginfromgoogle();
		z.loginfromfb();
		z.auth();
		z.signin();
		

	}


}
