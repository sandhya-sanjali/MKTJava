package MethodOverloading;

public class Methodoverloading2 
{
	void name(String a)
	{
		System.out.println("my name is Ahmed");
	}
	void name(String a, String b)
	{
		System.out.println("my name is sandhya");
	}
	void name(int a, double b, char c, boolean d)
	{
		System.out.println("my name is surendra");
	}
	public static void main(String[] args) 
	{
		Methodoverloading2 m1=new Methodoverloading2();
		m1.name("Ahmed");
		m1.name("sandhya");
		m1.name(89,67.43,'X',true);
		

	}

}
