package Disabledelement;

import org.openqa.selenium.By;
//import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayed
{
	public static void main(String[] args)
	{
		try {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
		WebElement lastname=  driver.findElement(By.xpath("(//input[@id='121'])[1]"));
		lastname.sendKeys("Upadhyay");
		//System.out.println(lastname);
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
}
	


