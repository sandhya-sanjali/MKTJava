package TextMsg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextmsgXpath1 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		//driver.findElement(By.linkText("Bluetooth Headphones")).click();
	}

}
