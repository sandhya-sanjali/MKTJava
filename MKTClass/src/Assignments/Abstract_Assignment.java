package Assignments;
abstract class Grandparent1
{
	 static void add()
	{
		int a=3; int b=5; int c=a+b;
		System.out.println(c);
	}
	void substract()
	{
		int a=3; int b=5; int c=a-b;
		System.out.println(c);
	}
	abstract void add(int a, int b);
	abstract void substract(int a, int b);
}
abstract class Parent1 extends Grandparent1
{
	static void multiply()
	{
		int a=3; int b=5; int c=a*b;
		System.out.println(c);
	}
	void division()
	{
		int a=6; int b=3;int c=a/b;
		System.out.println(c);
	}
	abstract void multiply(int a, int b);
	abstract void division(int a, int b);	
}
public class Abstract_Assignment extends Parent1
{
	static void add(int a, int b, int c)
	{
		System.out.println("Sandhya");
	}
	static void substract(int a, int b, int c)
	{
		System.out.println("upadhyay");
	}
	@Override
	void multiply(int a, int b) 
	{
		System.out.println("Multiplication of 2 numbers");	
	}
	@Override
	void division(int a, int b) 
	{
		System.out.println("Division of 2 numbers");
	}
	@Override
	void add(int a, int b) 
	{
		System.out.println("Addition of 2 numbers");
	}
	@Override
	void substract(int a, int b) 
	{
		System.out.println("Substraction of 2 numbers");
	}
	public static void main(String[] args)
	{
		Abstract_Assignment a=new Abstract_Assignment();
		add();
		a.substract();
		a.add(4, 6);
		a.substract(4, 6);
		multiply();
		a.division();
		a.multiply(4, 6);
		a.division(6, 6);
		add(1,2,3);
		substract(6,4,2);

	}

}
