package Practise;

public class This1 
{
	int age; String name; double weight;//global variables
	
	void studentinfo(int age, String name, double weight)
	{
		this.age=age;
		this.name=name;
		this.weight=weight;
		//System.out.println("Hi, I am"+name);
		
	}

	public static void main(String[] args)
	{
		This1 t1=new This1();
		t1.studentinfo(21, "RAM", 55);//local variables
		System.out.println(t1.age);//with this output will b o as LV of int is 0 
		System.out.println(t1.name);// LV value is null
		System.out.println(t1.weight);//LV value is 0.0
	}
}
//this keyword coverts global variable to local variable