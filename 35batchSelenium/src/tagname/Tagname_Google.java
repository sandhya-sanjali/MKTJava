package tagname;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Google {

	public static void main(String[] args)
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		WebElement search= d1.findElement(By.tagName("textarea"));
		search.sendKeys("india");
		search.sendKeys(Keys.ENTER);
	}

}
