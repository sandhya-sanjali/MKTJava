package Assignments;
class Greatgrandparent
{
	void add()
	{
		int a=3; int b=5; int c=a+b;
		System.out.println(c);
	}
}
abstract class Grandparent extends Greatgrandparent
{
	static void substract()
	{
		int a=3; int b=5; int c=a-b;
		System.out.println(c);
	}
	abstract void add(int a, int b);
	abstract void multiply();	
}
abstract class Parent extends Grandparent
{
	abstract void substract (int a, int b);
	abstract void divide();
	static void multiply1()
	{
		int a=3; int b=5; int c=a*b;
		System.out.println(c);
	}
	void divide(int a, int b)
	{
		int c=a/b;
		System.out.println(c);
	}
}
public class Child extends Parent
{
	static void add (int a, int b, int c)
	{
		System.out.println(c);
	}
	void substract (int a, int b, int c)
	{
		System.out.println(c);
	}
	
	@Override
	void substract(int a, int b) 
	{
		System.out.println("Substraction");
	}
	@Override
	void divide() 
	{
		System.out.println("Division");
	}
	@Override
	void add(int a, int b) 
	{
		System.out.println("addition");
	}
	@Override
	void multiply() 
	{
		System.out.println("multiplication");	
	}
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.add();
		substract();
		c.add(2, 2);
		c.multiply();
		c.substract(4, 2);
		c.divide();
		multiply1();
		c.divide(4, 2);
		add(2, 2, 2);
		c.substract(8, 4, 2);
		
	}
}
