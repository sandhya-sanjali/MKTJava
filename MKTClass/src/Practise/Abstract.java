package Practise;
abstract class Grandparent
{
	abstract void add();
	void substract()
	{
		int a=4; int b=5; int c=a-b;
		System.out.println(c);
	}
}
abstract class Parent1 extends Grandparent
{
	void multiply()
	{
		int a=4; int b=5; int c=a*b;
		System.out.println(c);
	}
	
}
public class Abstract extends Parent1 //child class
{
	void divide()
	{
		int a=4; int b=2; int c=a/b;
		System.out.println(c);
	}
	
	void add()
	{
	int a=4; int b=5; int c=a+b;
	System.out.println(c);
		
	}

	public static void main(String[] args) 
	{
		Abstract a=new Abstract();
		a.add();
		a.substract();
		a.multiply();
		a.divide();

	}

}
