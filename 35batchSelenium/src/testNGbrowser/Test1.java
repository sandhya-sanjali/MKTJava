package testNGbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void scenario1(String browsername) throws InterruptedException
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}

	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement login= driver.findElement(By.xpath("//*[@id=\"email\"]\r\n"
				+ ""));
		login.sendKeys("Sandhya.sanjali@gmail.com");
		WebElement password= driver.findElement(By.xpath("//*[@id=\"pass\"]\r\n"
				+ ""));
		password.sendKeys("#Surendra20");
		WebElement click= driver.findElement(By.xpath("//*[@id=\"email\"]\r\n"
				+ ""));
		Thread.sleep(2000);
		click.sendKeys(Keys.ENTER);
		driver.close();
	
}
}


