package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='✕']")).click();
		//WebElement fashion= driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		//Select s=new Select(fashion);
		//s.getOptions();
		//s.selectByVisibleText(null)
		
		
	}

}
