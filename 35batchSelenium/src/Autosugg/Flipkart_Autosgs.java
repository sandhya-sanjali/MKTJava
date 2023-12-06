package Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart_Autosgs 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("shoe");
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search']/ul"));
		System.out.println(autosuggestion);
		int countofautos=autosuggestion.size();
		System.out.println(countofautos); //not working
  }
}
