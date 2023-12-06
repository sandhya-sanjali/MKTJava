package Disabledelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
	WebElement lastname= 	driver.findElement(By.xpath("(//input[@id='121'])[1]"));
	boolean l=lastname.isEnabled();
	//lastname.click();
	System.out.println(l);
	if(l==true)
	{
		lastname.sendKeys("Element is enabled");
	}
	else
	{
		System.out.println("Element is Disabled");
	}
	
	}

}
