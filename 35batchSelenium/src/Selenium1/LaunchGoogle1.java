package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		System.out.println(d1.getTitle());
		d1.manage().window().maximize();
		WebElement search= d1.findElement(By.id("APjFqb"));
		search.sendKeys("First president of India");
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);

	}

}
