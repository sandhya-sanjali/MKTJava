package Practise;

public class Return2 
{
	static int add(int a, int b)
	{
		int c=a+b;
		
		return c;
	}
	
	double add(int a, double b)
	{
		double c=a+b;
		return c;
	}
	
	String add()
	{
		String a="I am new to addition";
		return a;
	}
	
	public static void main(String[] args) 
	{
		add(17,30);
		
		System.out.println(add(17,30));
		
		Return2 r=new Return2();
		
		System.out.println(r.add(23, 34.5));
		System.out.println(r.add());
	}

}
