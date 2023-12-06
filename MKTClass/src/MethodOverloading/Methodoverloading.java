package MethodOverloading;

public class Methodoverloading 
	{
		void add()
		{
			System.out.println("1");
		}
	void add (int a)
	{
		System.out.println("2");
	}
	public static void main (String[]args)
	{
		Methodoverloading m1 = new Methodoverloading();
		m1.add();
		m1.add(0);
	}


}
