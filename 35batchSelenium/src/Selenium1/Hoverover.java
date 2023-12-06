package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement Accountsandsignin= driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Accountsandsignin).perform();
		Thread.sleep(3000);
		WebElement signin= driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();
		WebElement emailid=driver.findElement(By.id("ap_email"));
		emailid.sendKeys("sandhya.sanjali@gmail.com");
		WebElement contn= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		contn.sendKeys(Keys.ENTER);
		WebElement password= driver.findElement(By.id("ap_password"));
		password.sendKeys("Sandhya@123");
		WebElement log= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		log.sendKeys(Keys.ENTER);
	}

}
