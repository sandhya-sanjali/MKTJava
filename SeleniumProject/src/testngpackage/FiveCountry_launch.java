package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FiveCountry_launch 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch1()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void testcase()
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("America");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void testcase1()
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Africa");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void testcase2()
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Australia");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void testcase3()
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Canada");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void testcase4()
	{
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Europe");
		search.sendKeys(Keys.ENTER);
	}
	@AfterMethod 
	public void quit1()
	{
		driver.close();
	}
}

