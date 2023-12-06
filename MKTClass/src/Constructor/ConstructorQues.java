package Constructor;

public class ConstructorQues 
{
	ConstructorQues()
	{
		System.out.println("constructor method");
	}
	void add()
	{
	System.out.println("Non Static Method");
	}
	static void substract ()
	{
		System.out.println("Static Method");
	
	}
	public static void main(String[] args) 
	{
	
		substract();
		ConstructorQues c1=new ConstructorQues();
		c1.add();

	}

}
