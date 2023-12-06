package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fileuploadpopoup1 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(1000);
		WebElement un= driver.findElement(By.id("1"));
		un.sendKeys("sandhya");
		WebElement pass= driver.findElement(By.id("3"));
		pass.sendKeys("sandhya@123");
		WebElement fn= driver.findElement(By.id("4"));
		fn.sendKeys("upadhyay");
		WebElement ln= driver.findElement(By.id("5"));
		ln.sendKeys("surendra");
		Thread.sleep(1000);
		WebElement radiobutton= driver.findElement(By.xpath("//input[@value='FeMale']"));
		radiobutton.click();
		Thread.sleep(1000);
		WebElement option= driver.findElement(By.xpath("//select[@name='menu-600']"));
		Select s=new Select(option);
		s.getOptions();
		s.selectByVisibleText("Technical Skills");
		Thread.sleep(2000);
		WebElement country= driver.findElement(By.xpath("//span[@class='select2-selection__rendered'][4]"));
		Select s1=new Select(country);
		s1.getOptions();
		s.selectByVisibleText("India");
		country.click();
	}

}
