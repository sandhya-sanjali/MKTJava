package Disabledelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
		WebElement c1= driver.findElement(By.xpath("(//input)[4]"));
		boolean l1= c1.isEnabled();
		//c1.sendKeys("Sandhya");
		System.out.println(l1);
		
		WebElement c2= 	driver.findElement(By.xpath("(//input[@id='121'])[1]"));
		boolean l2= c2.isDisplayed();
		System.out.println(l2);
		
		if(l1 && l2) 
		{
			WebElement submit=driver.findElement(By.xpath("(//input[@value='Submit'])[1]"));
			Thread.sleep(3000);
			submit.click();
			System.out.println("form submitted successfully");
		}
		
	}

}
