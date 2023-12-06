package TextMsg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextmsgXpath2 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("( //input)[@id='email']")).sendKeys("sandhya.sanjali@gmail.com");
	}

}//none of the programs on tag name are working
