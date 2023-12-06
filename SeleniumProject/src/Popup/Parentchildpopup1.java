package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildpopup1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	WebElement searchtf=	driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("shoe");
		searchtf.sendKeys(Keys.ENTER);
		WebElement shoes= driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoes.click();
		Set<String> a= driver.getWindowHandles();
		Iterator<String> parentchild = a.iterator();
		String parent= parentchild.next();
		String child= parentchild.next();
		driver.switchTo().window(child);//control is with child
		Thread.sleep(3000);
		//driver.close();//child is closed
		//driver.switchTo().window(parent);
		WebElement cart= driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		cart.click();
		Thread.sleep(3000);
		WebElement proceed= driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		proceed.click();
		Thread.sleep(1000);
		WebElement signin= driver.findElement(By.xpath("//input[@id='ap_email']"));
		signin.sendKeys("sandhya.sanjali@gmail.com");
		WebElement cntnue= driver.findElement(By.xpath("//input[@id='continue']"));
		cntnue.click();
		WebElement password= driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("#Surendra123");
		WebElement sign= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		sign.click();
		
		
		
		
	}

}
