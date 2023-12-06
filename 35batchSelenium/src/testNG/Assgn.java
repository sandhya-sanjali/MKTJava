package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assgn 
{
	@BeforeMethod
	public void bm() 
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void bt1() 
	{
		System.out.println("Test1");
	}
	@Test
	public void bt2() 
	{
		System.out.println("Test2");
	}
	@Test
	public void bt3() 
	{
		System.out.println("Test3");
	}
	@AfterMethod
	public void am() 
	{
		System.out.println("AfterMethod");
	}
	
}
