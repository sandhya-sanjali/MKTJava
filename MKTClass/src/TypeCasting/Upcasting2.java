package TypeCasting;
class Teacher
{
	void Mathematics()
	{
		System.out.println("I love Mathematics");
	}
}
class Mentor
{
	void English()
	{
		System.out.println("I speak good English");
	}
}
public class Upcasting2 extends Teacher
{
	void Science()
	{
		System.out.println("Science is life");
	}

	public static void main(String[] args) 
	{
		Teacher t1=new Upcasting2();//upcasting
		t1.Mathematics();
		Upcasting2 u1=(Upcasting2)t1;//downcasting
		u1.Science();
	
	}

}
