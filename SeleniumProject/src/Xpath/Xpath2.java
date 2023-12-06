package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='1']")).sendKeys("Sandhya");
		driver.findElement(By.xpath("//input[@id='2']")).sendKeys("Upadhyay");
		driver.findElement(By.xpath("//input[@id='3']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='4']")).sendKeys("Sandhya Surendra");
		driver.findElement(By.xpath("//input[@id='5']")).sendKeys("Sandhya Reddy");
		driver.findElement(By.xpath("(//input)[25]")).click();	
		driver.findElement(By.xpath("//input[@name='checkbox-833[]']")).click();
		}

}
