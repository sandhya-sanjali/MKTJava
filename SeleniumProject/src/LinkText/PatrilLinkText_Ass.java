package LinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatrilLinkText_Ass 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.partialLinkText("Men's Bouncer-01 Sports,Walking,Gym,Trainin")).click();
		
		
	}

}
