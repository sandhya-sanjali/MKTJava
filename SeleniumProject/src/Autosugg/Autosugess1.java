package Autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugess1 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver s1=new ChromeDriver();
		s1.manage().window().maximize();
		s1.get("https://www.amazon.in/");
		WebElement searchtf= s1.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("Shoe");
		Thread.sleep(1000);
	List<WebElement> autos=	s1.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count= autos.size();
		System.out.println(count);
		//Thread.sleep(4000);
		//autos.get(count-4).click();//u will get 7th sugession=>10-4=6, buy count is 7
		
	}
	

}
