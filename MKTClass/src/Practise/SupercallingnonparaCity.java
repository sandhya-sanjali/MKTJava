package Practise;

	class state12
	{
		state12(int a)
		{
			System.out.println("State Method");
		}
	}
	public class SupercallingnonparaCity extends state12
	{
		SupercallingnonparaCity()
		{
			super(10000);
			System.out.println("City Method");
		}

	public static void main(String[] args) 
	{
		new SupercallingnonparaCity();
	}

}
