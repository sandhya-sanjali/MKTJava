package Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosugg {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(1000);
		List<WebElement> autosuggestion= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int countofauto= autosuggestion.size();
		System.out.println(countofauto);
		autosuggestion.get(7).click();
	}

}
