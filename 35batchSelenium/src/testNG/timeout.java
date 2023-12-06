package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeout
{
	@Test(timeOut=2000)
	public void login()
	{
		System.out.println("login");
	}
	@Test(timeOut=2000)
	public void login1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("login");
		
	}
}
