package testngpackage;

import org.testng.annotations.Test;

public class Math_Class 
{
	@Test
	public void scenario1()
	{
	double q=	Math.PI;
	System.out.println(q);
	System.out.println(Math.addExact(3, 5));
	System.out.println(Math.subtractExact(10, 100));
	System.out.println(Math.max(11, 12));
	System.out.println(Math.multiplyExact(5, 6));
	System.out.println(Math.random());//random will always gives a unique value in btw 0.0 and 1.0
	
	
	}
}
