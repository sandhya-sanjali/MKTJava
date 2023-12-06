package TypeCasting;
class State
{
	void Statename() 
	{
		System.out.println("Karnataka");
	}
	void Stateroad()
	{
		System.out.println("Airport Road");
	}
}
public class Upcasting1 extends State
{
	void Cityname()
	{
		System.out.println("Bangalore");
	}
	void Cityroad()
	{
		System.out.println("Hebbal");
	}

	public static void main(String[] args)
	{
		State s1=new Upcasting1();//upcasting syntax
		s1.Statename();
		s1.Stateroad();
		Upcasting1 u1=(Upcasting1)s1;//downcasting syntax
		u1.Cityname();
		u1.Cityroad();
	}

}
