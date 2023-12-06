package GlobalVariable;

public class local_variable1 
{
	static int a;
	int b=20;
	void add()
	{
		int c;
		c=100;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		System.out.println(a);
		local_variable1 v=new local_variable1();
		v.add();
		System.out.println(v.b);
	
	}

}
