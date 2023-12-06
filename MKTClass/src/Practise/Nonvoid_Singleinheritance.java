package Practise;

class state1 //parent
{
	static void statehighway()//though the parent clss is non static,
	{
		System.out.println("i am travelling in state");
	}
}// the same ref varaible created below can b used.

public class Nonvoid_Singleinheritance extends state1
{
	void cityroad()
	{
		System.out.println("i am travelling in city");
	}

	public static void main(String[] args)
	{
		Nonvoid_Singleinheritance c=new Nonvoid_Singleinheritance();
		c.cityroad();
		statehighway();
	
	}

}
