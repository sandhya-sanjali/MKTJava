package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement fileupload=driver.findElement(By.xpath("//input[@name='file-935']"));
		fileupload.sendKeys("C:\\Users\\Sandhya\\Downloads\\GroTechminds_1.pdf");
	//	fileupload.sendKeys(Keys.ENTER);
	}

}
