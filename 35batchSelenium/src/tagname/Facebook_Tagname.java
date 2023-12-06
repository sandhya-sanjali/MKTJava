package tagname;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Tagname {

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/");
		WebElement login= d1.findElement(By.xpath("//*[@id=\"email\"]\r\n"
				+ ""));
		login.sendKeys("Sandhya.sanjali@gmail.com");
		WebElement password= d1.findElement(By.xpath("//*[@id=\"pass\"]\r\n"
				+ ""));
		password.sendKeys("#Surendra20");
		WebElement click= d1.findElement(By.xpath("//*[@id=\"email\"]\r\n"
				+ ""));
		Thread.sleep(2000);
		click.sendKeys(Keys.ENTER);

	}

}
