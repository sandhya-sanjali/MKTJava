package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FLipkartHoverover {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		Thread.sleep(3000);
		WebElement signin= driver.findElement(By.xpath("//span[.='Sign in']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
		signin.click();
		
		//WebElement login= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		//login.sendKeys("sandhya.sanjali@gmail.com");
	}

}
