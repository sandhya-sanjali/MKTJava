package tagname;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Facebook {

	public static void main(String[] args) 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
		d1.manage().window().maximize();
		WebElement login=d1.findElement(By.name("email"));
		login.sendKeys("Sandhya.sanjali@gmail.com");
		//WebElement passwrd= d1.findElement(By.id("pass"));
		//passwrd.sendKeys("#Surendra2023");
		//WebElement conti= d1.findElement(By.name("login"));
		//conti.sendKeys(Keys.ENTER);
		
		
	}

}
