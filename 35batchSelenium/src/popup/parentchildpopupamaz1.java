package popup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildpopupamaz1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(id1);
		driver.close();
		
	}

}
