package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class case3 
{
	@BeforeSuite
	public void bs () 
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void bt () 
	{
		System.out.println("BeforeSuite");
	}
	@AfterTest
	public void at () 
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void as () 
	{
		System.out.println("AfterSuite");
	}
}
