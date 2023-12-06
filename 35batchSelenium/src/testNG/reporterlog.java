package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class reporterlog 
{
	@Test
	public void google()
	{
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement countryname= driver.findElement(By.linkText("Australia"));
		Point xandy= countryname.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		Reporter.log("Test case 1 last line");
	}
}
