package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_Launch 
{ChromeDriver driver;//created a global variable here
	@BeforeMethod //preactivity
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
	}
	@Test//actual activity
	public void testcase1()
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
	@AfterMethod//post activity
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
