package Assignments;
interface One
{
	void add();
}
interface Two
{
	void substract();
}
class Three
{
	static void multiply()
	{
		int a=5; int b=5; int c=a*b;
		System.out.println(c);
	}
}
class Four extends Three
{
	static void division()
	{
		int a=5; int b=5; int c=a/b;
		System.out.println(c);
	}
}
public class Interface_Assn extends Four implements One,Two
{
	public static void main(String[] args) 
	{
		Interface_Assn i=new Interface_Assn();
		i.add();
		i.substract();
		multiply();
		division();
	}

	@Override
	public void substract()
	{
		//int a=5; int b=5; int c=a-b;
		System.out.println("substraction of 2 numbers");
	}

	@Override
	public void add() 
	{
		//int a=5;int b=5; int c=a+b;
		System.out.println("addition of 2 numbers");
	}

}
