package data_provider;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping_Amazon 
{
	EdgeDriver driver;
	@BeforeMethod
	public void Launch()
	{
		driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();	
	}
	@Test
	public void scenario1() throws InterruptedException {
		
		WebElement signin= driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
		signin.click();
		WebElement login= driver.findElement(By.xpath("//input[@name='email']"));
		login.sendKeys("sandhya.sanjali@gmail.com");
		WebElement cont= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		cont.click();
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("#Sandhya123");
		WebElement signinclick= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		signinclick.click();
		WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("lavie handbags");
		search.sendKeys(Keys.ENTER);
		WebElement bag= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[9]/div/div/div/div/div[1]/div/span/a/div/img\r\n"
				+ ""));
		bag.click();
		
		Set<String> parentandchildid= driver.getWindowHandles();
		Iterator<String> pc= parentandchildid.iterator();
		String id1=pc.next();
		String id2=pc.next();
		driver.switchTo().window(id2);
		
		Thread.sleep(5000);
		WebElement cart= driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	    cart.click();
	    WebElement proceed=  driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
		   proceed.click();
		   WebElement address= driver.findElement(By.xpath("//*[@id=\"shipToThisAddressButton\"]/span/input\r\n"
		   		+ ""));
		   address.click();
		   Thread.sleep(10000);
		   WebElement creditcard= driver.findElement(By.xpath("(//*[@name=\"ppw-instrumentRowSelection\"])[1]"));
		   creditcard.click();
		}
	

}
