package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinates {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement countryname= driver.findElement(By.linkText("Spain"));
		Point xandy= countryname.getLocation();
		int x=xandy.getX();
		System.out.println(x);
		int y=xandy.getY();
		System.out.println(y);
		
		
	}

}
