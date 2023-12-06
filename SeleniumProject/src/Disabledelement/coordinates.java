package Disabledelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class coordinates {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement location= driver.findElement(By.linkText("Canada"));
		Point a= location.getLocation();
		int x= a.getX();
		int y= a.getY();
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
