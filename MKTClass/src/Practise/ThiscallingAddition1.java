package Practise;

public class ThiscallingAddition1 
{
	ThiscallingAddition1()
	{

		System.out.println("Additin of one number");
	}
	ThiscallingAddition1(int a, int b)
	{
		this();
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		new ThiscallingAddition1(100, 200);
	}

	

}
