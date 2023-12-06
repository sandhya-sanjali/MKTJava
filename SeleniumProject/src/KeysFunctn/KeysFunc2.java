package KeysFunctn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunc2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(5000);
		List<WebElement> autosuggestion= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int countofautos=autosuggestion.size();
		System.out.println(autosuggestion.size());
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		
		autosuggestion.get(8).click();	
		//autosuggestion.get(countofautos-9).click();
//		autosuggestion.get(8).sendKeys(Keys.ENTER);
	}

}
