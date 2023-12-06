package Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugges 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement searchtextfield= driver.findElement(By.name("q"));
		searchtextfield.sendKeys("India");
		Thread.sleep(1000);
		List<WebElement> autosuggestion= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int countofautos= autosuggestion.size();
		System.out.println(countofautos);
		autosuggestion.get(4).click();	
		//autosuggestion.get(countofautos-6).click();
	}

}
////div[@class='OBMEnb']/ul/li