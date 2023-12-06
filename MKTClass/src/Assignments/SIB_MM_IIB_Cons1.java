package Assignments;

public class SIB_MM_IIB_Cons1 
{
	static
	{
		System.out.println("SIB1");
	}
	static
	{
		System.out.println("SIB2");
	}
	static void add()
	{
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	void multiply()
	{
		int a=1; int b=3; int c=a*b;
		System.out.println(c);
	}
	{
		System.out.println("I am IIB1");
	}
	{
		System.out.println("I am IIB2");
	}
	SIB_MM_IIB_Cons1()
	{
		System.out.println("constructor1");
	}
	SIB_MM_IIB_Cons1(int a)
	{
		System.out.println("constructor2");
	}
	
	public static void main(String[] args) 
	{
		new SIB_MM_IIB_Cons1();
		SIB_MM_IIB_Cons1 a1=new SIB_MM_IIB_Cons1();
		a1.multiply();
		add();
}
}
