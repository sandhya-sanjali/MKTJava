package Constructor;

public class CO_Prac 
{
	CO_Prac(int a)
	{
		System.out.println("1");
	}
	CO_Prac(float b, int c)
	{
		System.out.println("1.345, 345");
	}
	CO_Prac(char d, double e)
	{
		System.out.println("'s',123.23");
	}
	CO_Prac(int a, float b, char d, double e, String f)
	{
		System.out.println("123,1.234,'S',23.34,'SANDHYA'");
	}
	public static void main(String[] args) 
	{
		new CO_Prac(2);
		new CO_Prac(1,2);
		new CO_Prac('s',4.0);
		new CO_Prac(1,2f,'s',2.3,"SAND");
		
		

	}

}
