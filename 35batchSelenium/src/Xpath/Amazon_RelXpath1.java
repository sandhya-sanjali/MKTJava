package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_RelXpath1 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement acc= d1.findElement(By.xpath("(//input)[7]"));
		acc.sendKeys("sandhya.sanjali@gmail.com");
		WebElement conti= d1.findElement(By.xpath("(//input)[10]"));
		conti.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		
	}

}
