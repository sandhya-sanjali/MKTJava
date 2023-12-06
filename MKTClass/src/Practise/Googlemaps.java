package Practise;
interface GoogleAuth//interface
{
	void un();//abstract method
	void pwd();//abstract method
}
interface Google2wayAuth
{
	void sms();//abstract method
	void call();//abstract method
}

public class Googlemaps implements Google2wayAuth,GoogleAuth//concrete class
{

	public static void main(String[] args) //concrete method
	{
		Googlemaps g=new Googlemaps();
		g.un();
		g.pwd();
		g.call();
		g.sms();

	}

	@Override
	public void un() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pwd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

}
