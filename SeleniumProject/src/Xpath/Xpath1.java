package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sandhya/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='1']")).sendKeys("sandhya");
		driver.findElement(By.xpath("//input[@id='2']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@id='3']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Upadhyay");
		driver.findElement(By.xpath("//input[@id='123']")).click();
		driver.findElement(By.xpath("//input[@name='name2']")).click();
		driver.findElement(By.xpath("//input[@name='name3']")).click();
		driver.findElement(By.xpath("(//input)[11]")).click();
		driver.findElement(By.xpath("(//input)[12]")).click();
		driver.findElement(By.xpath("(//input)[13]")).click();

	}

}
