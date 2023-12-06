package MethodOverloading;
class Parent
{
	void add()
	{
		System.out.println("i am adding 3 numbers");
	}
}
public class Method_Overriding extends Parent
{
	void add()
	{
		System.out.println("I am adding 2 numbers");
		super.add();
	}

	public static void main(String[] args) 
	{
		Method_Overriding m=new Method_Overriding();
		m.add();
	}
		

}
