import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_Links 
{	ChromeDriver driver;
	@Test
	public void launchamazon() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links1= driver.findElements(By.tagName("a"));
		
		int totalcount= links1.size();
		System.out.println(totalcount);
		for(int i=0;i<=totalcount-1;i++)
		{
			WebElement linkurl= links1.get(i);
			String urlis= linkurl.getAttribute("href");//get attribute is method available for web element, not elements
			System.out.println(urlis);
			
		}
		
	}
	}
	
