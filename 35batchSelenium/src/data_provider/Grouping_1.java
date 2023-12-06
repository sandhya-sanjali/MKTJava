package data_provider;

import org.testng.annotations.Test;

public class Grouping_1 
{
	@Test(groups= {"smoketesting","systemtesting"})
	public void method1()
	{
		System.out.println("1");
	}
	@Test(groups= {"smoketesting","regressiontesting"})
	public void method2()
	{
		System.out.println("2");
	}
	@Test(groups= {"regressiontesting","integrationtesting","smoketesting"})
	public void method3()
	{
		System.out.println("3");
	}
	@Test(groups= {"integrationtesting","smoketesting"})
	public void method4()
	{
		System.out.println("4");
	}
	@Test(groups= {"regressiontesting"})
	public void method5()
	{
		System.out.println("5");
	}
	
}
