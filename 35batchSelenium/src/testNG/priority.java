package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority
{
	@Test
	void method1()
	{
		System.out.println("method1");
	}
	
	@Test(priority=-1)
	void method2()
	{
		System.out.println("method2");
		Reporter.log("Heyyyyyyyy");
	}
}
