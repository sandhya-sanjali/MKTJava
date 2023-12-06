package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookX 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("(//input)[3]")).sendKeys("sandhya.sanjali@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sandhya.sanjali@gmail.com");
		//driver.findElement(By.xpath("(//input)[4]")).sendKeys("#Surendra20");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("#Surendra20");
		//driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
