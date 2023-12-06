package Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Autos {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		WebElement search= driver.findElement(By.xpath("//input[@name='search_query']"));
		Thread.sleep(3000);
		search.sendKeys("shahrukh");
		search.sendKeys(Keys.ENTER);
	List<WebElement>autosuggestion=	driver.findElements(By.xpath("//div[@class='gstl_50 sbdd_a']/div/div/div/ul/li"));
	int count=autosuggestion.size();
	System.out.println(count);
	}//not working

}
