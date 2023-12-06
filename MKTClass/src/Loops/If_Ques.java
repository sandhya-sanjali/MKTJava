package Loops;

public class If_Ques 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		if(a<b&&a==b)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
		if(a<b||a==b)
		{
			System.out.println("3");
		}
		if(!(a>b&&a!=b))
		{
			System.out.println("4");
		}
		if(!(a<b||a==b))
		{
			System.out.println("5");
		}
	}

}
