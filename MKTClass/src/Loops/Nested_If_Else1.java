package Loops;

public class Nested_If_Else1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		
		if (a>5)
		{
			if (a>6)
			{
				if (a>7)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("2");
				}
			}
			else
			{
				System.out.println("3");
			}
		}
		else
		{
			System.out.println("4");
		}
			
	}
}
		