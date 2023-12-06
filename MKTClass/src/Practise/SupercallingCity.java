package Practise;
class state11
{
	state11()
	{
		System.out.println("State Method");
	}
}
public class SupercallingCity extends state11
{
	SupercallingCity()
	{
		System.out.println("City Method");
	}
	public static void main(String[] args) 
	{
		new SupercallingCity();
		
	}

}
// implicit way of super calling statement.
//it means in non parameterised methods, u dont have to mention it
//seperately. it will be accessed automatically
//writing super(); is not required, 