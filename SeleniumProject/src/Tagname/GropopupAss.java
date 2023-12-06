package Tagname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GropopupAss 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement user= driver.findElement(By.id("1"));
		user.sendKeys("Sandhya");
		driver.findElement(By.id("2")).sendKeys("Miss");
		driver.findElement(By.id("3")).sendKeys("123456");
		driver.findElement(By.id("4")).sendKeys("Sandhya");
		driver.findElement(By.id("5")).sendKeys("Upadhyay");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		WebElement religion= driver.findElement(By.tagName("Select"));
		Select s1=new Select(religion);
		s1.selectByIndex(1);
		List<WebElement>Countofdd=s1.getOptions();
		System.out.println(Countofdd);
		WebElement upload= driver.findElement(By.xpath("//input[@name='file-935']"));
		upload.sendKeys("C:\\Users\\Sandhya\\Downloads\\GroTechminds (1).pdf");
		driver.findElement(By.xpath("//input[@name='checkbox-833[]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		
	}

}
