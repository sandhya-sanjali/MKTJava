package Constructor;

public class CO1 
{
		CO1()
		{
			System.out.println("1");
		}
		CO1(int a)
		{
			System.out.println("2");
		}
	public static void main(String[] args) 
	{
	new CO1();
	new CO1(-123);
	CO1 c1=new CO1();
	CO1 c2= new CO1(123);
	}

}
