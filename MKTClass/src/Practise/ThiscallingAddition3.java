package Practise;

public class ThiscallingAddition3 
{
	ThiscallingAddition3(String a)
	{
		System.out.println("Addition of two numbers");
	}
	ThiscallingAddition3()
	{
		this("Sandhya");
		System.out.println("Addition of one number");
	}
	ThiscallingAddition3(int a, int b)
	{
		this();
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		new ThiscallingAddition3(100,200);
		
	}

}
