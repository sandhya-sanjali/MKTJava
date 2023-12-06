package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
		WebElement religion= driver.findElement(By.tagName("select"));
		Select s1=new Select(religion);
		s1.selectByIndex(0);
		
	}

}
