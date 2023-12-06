package testngpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot 
{
	@Test
	public void testcase1() throws IOException, InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		//step 1:
		TakesScreenshot ts= driver;
		//step 2:
		ts.getScreenshotAs(OutputType.FILE);
		File source=ts.getScreenshotAs(OutputType.FILE);
		//step 3:
		File destination=new File("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\SeleniumProject\\sandy");
		//step 4:
		FileUtils.copyFile(source, destination);
		
		Thread.sleep(3000);
		driver.quit();
	}
	

}
