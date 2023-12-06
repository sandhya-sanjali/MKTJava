package GlobalVariable;

public class Global_variable1 
{
	static int a=10;//static global variable
	int b=10;//non static global variable
	void add()//non static method
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void subract()
	{
		System.out.println("sandhya");
	}

	public static void main(String[] args)
	{
		a=100;
		System.out.println(a);
		Global_variable1 g1=new Global_variable1();
		g1.add();
		subract();
		g1.b=120;
		g1.add();
		

	}

}
