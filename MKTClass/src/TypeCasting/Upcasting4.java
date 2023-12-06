package TypeCasting;
class One1
{
	void method1() 
	{
		System.out.println("I am Method1");
	}
}
class Two1 extends One1
{
	void method2()
	{
		System.out.println("I am Method2");
	}
}
public class Upcasting4 extends Two
{
	void method3()
	{
		System.out.println("I am Method3");
	}
	public static void main(String[] args) 
	{
		One1 o1=new Two1();//upcasting
		o1.method1();
		Two1 t1=(Two1)o1;//downcasting
		t1.method1();
		t1.method2();
	}

}
