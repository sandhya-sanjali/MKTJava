package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazondropdown1 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search= driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(search);
		s.getOptions();
		s.selectByVisibleText("Furniture");
		WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("cupboard");
		
		Thread.sleep(3000);
		
		List<WebElement>autosuggestion= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int countofsuggestion= autosuggestion.size();
		System.out.println(countofsuggestion);
		//autosuggestion.get(5).click();// this directly gives u 5th element
		autosuggestion.get(countofsuggestion-1).click();//this gives the 10th element
		
		
		
		
	}

}
