package Id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("sandhya.sanjali@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("#Surendra20");
		driver.findElement(By.name("login")).click();
	}

}
