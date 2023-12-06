package Practise;

public class OrderofExe 
{
	static
	{
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("I am Main Method");
		new OrderofExe();
	
	}
	

}
