package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='321']"));
		boolean a= checkbox.isEnabled();
		checkbox.click();
		System.out.println(a);
		if(checkbox.isEnabled()==true)
		{
			System.out.println("click");
		}
		else
		{
			System.out.println("doesnt work");
		}
	}

}
