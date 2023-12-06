package Practise;

class Three extends Two
{
	static void three3()
	{
		System.out.println("Three");
	}
	
}
class Two 
{
	static void two2()
	{
	System.out.println("two");	
	}
}
class One extends Two
{
	static void one1()
	{
		System.out.println("One");
	
}
}


public class Hybrid_inheritance extends One
{
	static void child()
	{
		System.out.println("child");
	}

	public static void main(String[] args)
	{
		child();
		one1();
		two2();
		Three t1=new Three();
		t1.three3();
		
	}

}
