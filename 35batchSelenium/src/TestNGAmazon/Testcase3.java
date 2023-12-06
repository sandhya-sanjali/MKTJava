package TestNGAmazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testcase3 extends LaunchandQuit{
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
//		WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		search.sendKeys("lavie handbags");
//		search.sendKeys(Keys.ENTER);
//		//List<WebElement> bag= driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div"));
//		//System.out.println(bag.size());
//		//bag.get(5).click();
//		Thread.sleep(3000);
//		WebElement bag= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[9]/div/div/div/div/div[1]/div/span/a/div/img\r\n"
//				+ ""));
//		bag.click();
//		
//		Set<String> parentandchildid= driver.getWindowHandles();
//		Iterator<String> pc= parentandchildid.iterator();
//		String id1=pc.next();
//		String id2=pc.next();
//		driver.switchTo().window(id2);
//		
//		Thread.sleep(5000);
//		WebElement cart= driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
//	    cart.click();
//		//Thread.sleep(2000);
//		//WebElement buynow= driver.findElement(By.xpath("(//input[@id='buy-now-button'])[1]"));
//		//buynow.click();
//	   WebElement proceed=  driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
//	   proceed.click();
//	   WebElement address= driver.findElement(By.xpath("//*[@id=\"shipToThisAddressButton\"]/span/input\r\n"
//	   		+ ""));
//	   address.click();
//	   Thread.sleep(10000);
//	   WebElement creditcard= driver.findElement(By.xpath("(//*[@name=\"ppw-instrumentRowSelection\"])[3]"));
//	   creditcard.click();
	}

}
