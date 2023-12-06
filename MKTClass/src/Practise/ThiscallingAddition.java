package Practise;

public class ThiscallingAddition
{
	ThiscallingAddition()
	{
		this(100);
		System.out.println("Additin of one number");
	}
	ThiscallingAddition(int a)
	{
		int b=a+6;
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		new ThiscallingAddition();
	}

}
