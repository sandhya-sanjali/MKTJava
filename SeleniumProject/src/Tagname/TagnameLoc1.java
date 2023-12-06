package Tagname;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLoc1
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("file:///C:/Users/Sandhya/Downloads/learningHTML1%20(1).html");
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
		driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.className("sddf")).sendKeys("adsf");
	}

}
