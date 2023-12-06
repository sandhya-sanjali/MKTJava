package Autosugg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement upload= driver.findElement(By.xpath("//input[@name='file-935']"));
		upload.sendKeys("C:\\Users\\Sandhya\\Downloads\\GroTechminds (1).pdf");
	}

}
