package KeysFunctn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunc1
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.id("1"));
		username.sendKeys("Sandhya");
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.CONTROL+"c");
		//username.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.id("2")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("3")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("4")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("5")).sendKeys(Keys.CONTROL+"v");
	}

}
