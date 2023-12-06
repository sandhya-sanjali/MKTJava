package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Partiallinktext {

	public static void main(String[] args)
	{
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/");
		WebElement bs=d1.findElement(By.partialLinkText("Sellers"));
		bs.sendKeys(Keys.ENTER);

	}

}
