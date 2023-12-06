package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Class1 {

	public static void main(String[] args) 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		WebElement search= d1.findElement(By.className("gLFyf"));
		search.sendKeys("India");
	}

}
