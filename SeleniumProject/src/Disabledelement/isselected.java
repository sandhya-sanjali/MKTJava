package Disabledelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoe");
		WebElement search= driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		WebElement tomorrowdelivery= driver.findElement(By.xpath("//span[.='Get It by Tomorrow']"));
		tomorrowdelivery.click();
	}
	

}
