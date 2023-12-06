package Practise;

abstract class Google
{
	abstract void auth();//abstract method
	abstract void authentication();//abstract method
	void loginwithgoogle()//concrete method
	{
		System.out.println("1");
	}
}
public class Zoom extends Google//concrete method
{
	void login()
	{
		System.out.println("login in zoom");
	
	}
	void logout()
	{
		System.out.println("logout in zoom");	
	}

	public static void main(String[] args) 
	{
		
	}
	@Override
	void auth()
	{
		System.out.println("Getting the auth from Google");	
	}
	@Override
	void authentication()
	{
		System.out.println("Getting the authentication from google");
	}

}
