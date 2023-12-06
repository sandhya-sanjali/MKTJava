package Practise;

public class Accessspecifierpublicclass 
{
	public void add()
	{
		System.out.println("1");
	}
	private void substract()
	{
		System.out.println("2");	
	}
	protected void multiplicatio() 
	{
		System.out.println("3");
	}
	void divide() 
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
		Accessspecifierpublicclass a1=new Accessspecifierpublicclass();
		a1.add();
		a1.substract();
		a1.multiplicatio();
		a1.divide();

	}

}
