package Disabledelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled1 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
		WebElement firstname= driver.findElement(By.xpath("(//input)[4]"));
	boolean l=	firstname.isEnabled();//if the element is enabled
	System.out.println(l);
	firstname.sendKeys("Sandhya");
	
	WebElement lastname= 	driver.findElement(By.xpath("(//input[@id='121'])[1]"));
	boolean l1=lastname.isEnabled();
	System.out.println(l1);
	//boolean l3=lastname.isDisplayed();//if the element is displayed
	//System.out.println(l3);
	}

}
