package Practise;

abstract class Teacher//abstract class
{
	abstract void add();//abstract method
}
public class Student extends Teacher//concrete class
{

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.add();
	}

	@Override
	void add() //concrete method
	{
	int a=20;
	int b=30;
	int c=a+b;
	System.out.println(c);
		
	}

}
