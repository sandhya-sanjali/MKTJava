package Inher_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1 extends LaunchandQuit
{
	//login in amazon--> searching the product->cart->COD
	@Test
	public void testcase1()
	{
		WebElement searchtf=	driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("shoe");
		searchtf.sendKeys(Keys.ENTER);
	}
}
