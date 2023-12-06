package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag= driver.findElement(By.xpath("(//img[@class='entered lazyloaded'])[7]"));
		WebElement drop= driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		WebElement drag1= driver.findElement(By.xpath("//img[@id='drag7']"));
		WebElement backtoplace= driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag1, backtoplace).perform();
		Thread.sleep(3000);
		WebElement drag2= driver.findElement(By.xpath("//img[@id='drag11']"));
		WebElement droptoanotherplace = driver.findElement(By.xpath(" //div[@id='div2']"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(drag2, droptoanotherplace).perform();
		
	}

}
