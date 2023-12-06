package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
		WebElement lastname= driver.findElement(By.id("121"));
		boolean a= lastname.isEnabled();
		System.out.println(a);
		//lastname.sendKeys("sandhya");
		if(lastname.isEnabled()==true)
		{
			System.out.println("perform action on it");
		}
		else
		{
			System.out.println("Element is disabled to perform action");
		}
			
		
	}

}
