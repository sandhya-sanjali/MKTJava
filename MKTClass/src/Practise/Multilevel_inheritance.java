package Practise;

class country
{
	void nationalhighway()
	{
		System.out.println("i am Natioanl Highway");
	}
}
class state2 extends country
{
	void statehighway()
	{
		System.out.println("i am State Highway");
	}
}
public class Multilevel_inheritance extends state2
{
	void cityhighway()
	{
		System.out.println("i am City Highway");
	}

	public static void main(String[] args)
	{
		Multilevel_inheritance m= new Multilevel_inheritance();
		m.cityhighway();
		m.statehighway();
		m.nationalhighway();

	}

}
