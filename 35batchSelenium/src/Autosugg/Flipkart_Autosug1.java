package Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosug1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("shoe");
		List<WebElement>actualsearch= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search']/ul/li"));
		int countofsearch=actualsearch.size();
		System.out.println(countofsearch);
	}//not working

}
