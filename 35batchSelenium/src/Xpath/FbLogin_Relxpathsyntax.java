package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin_Relxpathsyntax {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement signin= driver.findElement(By.xpath("//input[@id='email']"));
		signin.sendKeys("sandhya.sanjali@gmail.com");
		WebElement passwrd= driver.findElement(By.xpath("//input[@id='pass']"));
		passwrd.sendKeys("Sandhya123");
		WebElement login=driver.findElement(By.xpath("//button"));
		login.sendKeys(Keys.ENTER);
				
	}

}
