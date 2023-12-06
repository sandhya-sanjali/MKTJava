package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Relxpathtxtmsg {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//WebElement close= driver.findElement(By.xpath("//span[.='✕']")); //relative xpath by text name is working
		//Thread.sleep(3000);
		//close.click();
		
		WebElement login= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		login.sendKeys("Sandhya.sanjali@gmail.com");
	}

	//not working
}
