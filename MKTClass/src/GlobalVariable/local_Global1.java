package GlobalVariable;

public class local_Global1
{
	int a;
	double b;
	String c;
	
	void add(int a, double b, String c)
	{
		System.out.println("1");
	}

	public static void main(String[] args)
	{
		System.out.println("hello");
		local_Global1 l=new local_Global1();
		l.add(65, 075.0, "sandhya");
		System.out.println(l.a);
		System.out.println(l.b);
		System.out.println(l.c);
	}

}
