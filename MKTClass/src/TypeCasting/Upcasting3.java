package TypeCasting;
class One
{
	void add()
	{
		System.out.println("Addition");
	}
}
class Two extends One
{
	void substract()
	{
		System.out.println("Substraction");
	}
}
public class Upcasting3 extends Two
{
	void multiply()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args)
	{
		Two t1= new Upcasting3();//upcasting
		t1.add();
		t1.substract();
		Upcasting3 u1=(Upcasting3)t1;//downcasting
		u1.substract();
	}

}
