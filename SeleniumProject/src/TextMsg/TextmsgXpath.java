package TextMsg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextmsgXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Gmail']")).click();
	}

}
