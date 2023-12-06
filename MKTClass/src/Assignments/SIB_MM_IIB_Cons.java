package Assignments;

public class SIB_MM_IIB_Cons 
{
	static
	{
		System.out.println("I am SIB 1");
	}
	static
	{
		System.out.println("I am SIB 2");
	}
	
	{
		System.out.println("I am IIB 1");
	}
	{
		System.out.println("I am IIB 2");
	}
	SIB_MM_IIB_Cons()
	{
		System.out.println("I am Constructor 1");
	}
	SIB_MM_IIB_Cons (int a)
	{
		System.out.println("I am Constructor 2");
	}
	static void multiply()
	{
		int a=5; int b=6; int c=a*b;
		System.out.println(c);
	}
	void add()
	{
		int a=5; int b=6; int c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args)
	{
		multiply();
		SIB_MM_IIB_Cons s1=new SIB_MM_IIB_Cons();
		SIB_MM_IIB_Cons s2=new SIB_MM_IIB_Cons(34);
		s1.add();
		new SIB_MM_IIB_Cons();
		new SIB_MM_IIB_Cons(56);

	}

}
