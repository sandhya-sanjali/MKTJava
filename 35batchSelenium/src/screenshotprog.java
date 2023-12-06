import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenshotprog

{
	@Test
	public void launchgoogle() throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		TakesScreenshot s1=       driver;
		File source=  s1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\screenshot\\screenshot1.jpeg");
		FileUtils.copyFile(source, destination);
		
	}

}
