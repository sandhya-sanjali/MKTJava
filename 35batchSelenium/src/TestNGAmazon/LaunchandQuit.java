package TestNGAmazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit 
{
	EdgeDriver driver; //create a global variable to use Edgedriver in 2 methods
	
	@BeforeMethod
	public void Launch()
	{
		driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void Quit(ITestResult result) throws InterruptedException, IOException
	{
		String className = result.getInstance().getClass().getSimpleName();
		Thread.sleep(3000);
		TakesScreenshot s1=       driver;
		File source=  s1.getScreenshotAs(OutputType.FILE);
		//File destination=new File("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\screenshot\\s1"+Math.random()+".png");
		File destination=new File("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\screenshot\\s1"+className+".png");
		FileUtils.copyFile(source, destination);
		Thread.sleep(5000);
		driver.close();
	}
	
}
