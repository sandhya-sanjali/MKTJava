package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_dropdwn {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(dropdown);
		s1.getOptions();
		//s1.selectByVisibleText("Books");
		//s1.selectByValue("search-alias=stripbooks");
		s1.selectByIndex(10);
		WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Human");
		search.sendKeys(Keys.ENTER);
	}

}
