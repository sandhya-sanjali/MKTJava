package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_partiallinktext {

	public static void main(String[] args) //blackcoloured elements in html code are linktexts
	{
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.google.com/");
		WebElement image=d1.findElement(By.partialLinkText("Imag"));
		image.sendKeys(Keys.ENTER);
	}

}
