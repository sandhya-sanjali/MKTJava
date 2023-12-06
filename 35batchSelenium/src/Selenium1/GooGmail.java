package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooGmail {

	public static void main(String[] args)
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		WebElement ss=d1.findElement(By.linkText("Gmail"));
		ss.sendKeys(Keys.ENTER);
	}

}
