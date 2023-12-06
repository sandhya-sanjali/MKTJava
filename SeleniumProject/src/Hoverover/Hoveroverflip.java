package Hoverover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoveroverflip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement fashion= driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(fashion).perform();
		WebElement menswear= driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		menswear.click();
		Thread.sleep(4000);
		WebElement menscasual = driver.findElement(By.xpath("//a[@class='_3490ry']"));
		menscasual.clear();
		
		
		
	}

}
