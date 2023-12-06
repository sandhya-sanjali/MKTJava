package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AbsXpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//WebElement search= driver.findElement(By.xpath("(((((((((html/body/div)[1]/div)[3]/form)/div)[1]/div)[1]/div)[1]/div)/div)[2]/textarea)"));
		WebElement search1=driver.findElement(By.xpath("(//textarea)[1]"));
		search1.sendKeys("India");
	}

}
