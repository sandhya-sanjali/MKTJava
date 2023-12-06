package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_AutoandDD {

	public static void main(String[] args) throws InterruptedException 
	{
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		WebElement dropdownsearch= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(dropdownsearch);
		s1.getOptions();
		s1.selectByVisibleText("Beauty");
		WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("hair");
		Thread.sleep(3000);
		
		List<WebElement>autosug= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int countofauto= autosug.size();
		System.out.println(countofauto);
		autosug.get(5).click();
		
		
		
	}

}
