package testngpackage;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(enabled=false)
	public void testcase1()//by default alphabatically it will be executed
	{
							// by giving priority, it will be executed first
	}
	@Test
	public void testcase2()
	{
		
	}
	@Test()
	public void testcase3()
	{
		
	}
	@Test()
	public void testcase4()
	{
		
	}
	@Test(priority=-1)
	public void testcase5()
	{
		
	}
	
}
