package Practise;
class state13
{
	state13()
	{
		System.out.println("State Method");
	}
}

public class SupercallingparaCity1 extends state13
{
	SupercallingparaCity1(String a)
	{
		
		System.out.println("City Method");
	}


	public static void main(String[] args)
	{
		new SupercallingparaCity1("Sandhya");

	}

}
