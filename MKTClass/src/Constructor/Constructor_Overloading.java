package Constructor;

public class Constructor_Overloading 
{
	Constructor_Overloading()
	{
		System.out.println("1");
	}
	Constructor_Overloading(int a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		Constructor_Overloading c1=new Constructor_Overloading();
		new Constructor_Overloading();

	}

}
