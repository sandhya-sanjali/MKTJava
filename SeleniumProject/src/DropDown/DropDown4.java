package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown4 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
		Select s1= new Select(dropdown);
		List<WebElement> a= s1.getOptions();
		System.out.println(a.size());
		
	}

}
