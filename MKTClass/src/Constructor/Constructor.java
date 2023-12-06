package Constructor;

public class Constructor 
{
	Constructor()
	{
		System.out.println("I live in India");
	}
	public static void main(String[] args)
	{
		System.out.println("Hi, I am main method");
		Constructor c1=new Constructor();// creating object for non static method
		Constructor c2= new Constructor();
		new Constructor();//for invoking constructor
	}

}
