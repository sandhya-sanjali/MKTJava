package Inher_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario2 extends LaunchandQuit
{
//logginin-searching the product-cart-making the payment from DC
	@Test
	public void testcase2()
	{
		WebElement searchtf=	driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("shoe");
		searchtf.sendKeys(Keys.ENTER);
	}
	
}
