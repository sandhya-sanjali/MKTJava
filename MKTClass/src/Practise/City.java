package Practise;
class State //parent class
{
	static void statehighway()
	{
		System.out.println("i am travelling in state");
	}
}
public class City extends State //child class
{
	static void cityroad()
	{
		System.out.println("i sm travelling in city");
	}

	public static void main(String[] args) 
	{
		cityroad();
		statehighway();
	}

}
