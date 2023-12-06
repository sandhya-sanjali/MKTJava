package testNG;

import org.testng.annotations.Test;

public class invocationcount 
{
	@Test(priority=1,invocationCount=2)
	public void add()
	{
		System.out.println("add");
	}
	@Test(enabled=false)
	public void substract()
	{
		System.out.println("substract");
	}
	@Test(invocationCount=5,priority=2)
	public void multiply()
	{
		System.out.println("multiply");
	}
}
