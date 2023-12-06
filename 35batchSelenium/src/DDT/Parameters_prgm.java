package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_prgm
{
WebDriver driver;

	@Test
	@Parameters("browser")
	public void google_India(String nameofthebrowser) 
	{
		if(nameofthebrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofthebrowser.equalsIgnoreCase("edge"))//need not to worry about upper case and lowercase letters
		{
			driver=new EdgeDriver();
			//EdgeDriver driver=new EdgeDriver();	
		}
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin= driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
		signin.click();
		WebElement login= driver.findElement(By.xpath("//input[@name='email']"));
		login.sendKeys("sandhya.sanjali@gmail.com");
		WebElement cont= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		cont.click();
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("#Sandhya123");
		WebElement signinclick= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		signinclick.click();
	}


}