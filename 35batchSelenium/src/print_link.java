import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class print_link 
{
	@Test
	public void Amazon_links() 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		List <WebElement> links1=driver.findElements(By.tagName("a"));
		int totalcount= links1.size();
		WebElement linkurl= links1.get(totalcount);
		
		
	}
	
}
