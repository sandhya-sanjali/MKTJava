package Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartautosugg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//try {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[.='✕']")).click();
			WebElement searchtf= driver.findElement(By.name("q"));
			searchtf.sendKeys("shoe");
			Thread.sleep(3000);
			List<WebElement> autos=  driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
			int countofautos= autos.size();
			System.out.println(autos.size());
			searchtf.sendKeys(Keys.ARROW_DOWN);
			searchtf.sendKeys(Keys.ARROW_DOWN);
			searchtf.sendKeys(Keys.ARROW_DOWN);
			autos.get(3).click();
			
		//}catch(Exception e) {
			//System.out.println(e);
		//}
		
		
	}

}
