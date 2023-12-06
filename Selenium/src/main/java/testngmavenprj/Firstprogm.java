package testngmavenprj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firstprogm {
	@Test
	public void testcase1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
