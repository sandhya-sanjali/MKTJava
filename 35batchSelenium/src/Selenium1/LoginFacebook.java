package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
		d1.manage().window().maximize();
		d1.findElement(By.id("email")).sendKeys("sandhya.sanjali@gmail.com");
		d1.findElement(By.id("pass")).sendKeys("#Surendra20");
		d1.findElement(By.name("login")).click();
		
		;
	}

}
