package testngpackage;

import org.testng.annotations.Test;

public class Invocationcount 
{
	@Test(invocationCount=10)
	public void testcase1()
	{
		//if the same test case has to be run for multiple times
	}

}
