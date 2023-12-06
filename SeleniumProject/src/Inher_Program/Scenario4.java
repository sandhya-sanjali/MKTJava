package Inher_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario4 extends LaunchandQuit 
{
//making the payment using UPI
	@Test
	public void testcase4()
	{
		WebElement searchtf=	driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("shoe");
		searchtf.sendKeys(Keys.ENTER);
	}
}



