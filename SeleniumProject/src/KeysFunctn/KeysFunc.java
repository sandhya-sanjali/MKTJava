package KeysFunctn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunc 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("sachin Tendulkar");
		search.sendKeys(Keys.ENTER);
	}

}
