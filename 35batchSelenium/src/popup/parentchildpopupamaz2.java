package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildpopupamaz2 {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoe");
	search.sendKeys(Keys.ENTER);
	WebElement clik= driver.findElement(By.linkText("Men EVOZ Black Running Shoes (MEVOZMK3)"));
	clik.click();
	String parentid=driver.getWindowHandle();
	Set<String> parentandchildid= driver.getWindowHandles();
	System.out.println("parentid id"+parentid);
	System.out.println("parentandchildid is"+parentandchildid);
	Iterator<String> pc= parentandchildid.iterator();
	String id1=pc.next();
	String id2=pc.next();
	System.out.println(id1);
	System.out.println(id2);
	driver.switchTo().window(id2);
	WebElement cart= driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
	cart.sendKeys(Keys.ENTER);
	WebElement checkout= driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	checkout.sendKeys(Keys.ENTER);
		
	}

}
