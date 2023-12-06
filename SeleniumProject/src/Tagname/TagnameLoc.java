package Tagname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLoc 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement firstname=driver.findElement(By.xpath("(//input)[3]"));
		firstname.sendKeys("india");
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sandhya.sanjali@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("#Surendra20");
		driver.findElement(By.tagName("button")).click();*/;
	}
//created ref variable, can be used anytime in future;
}
