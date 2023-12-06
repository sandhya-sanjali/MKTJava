package Hierarchiallevel_inheritance;

public class C2 extends Parent
{
	void debitcard()
	{
		System.out.println("debitcard");
	}

	public static void main(String[] args) 
	{
		C2 c=new C2();
		c.debitcard();
		c.login();
		

	}

}
