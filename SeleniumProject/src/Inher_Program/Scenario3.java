package Inher_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario3 extends LaunchandQuit
{
	//login in amazon-searching the product-adding to cart-payment using cc
	
	@Test
	public void testcase3()
	{
		WebElement searchtf=	driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("shoe");
		searchtf.sendKeys(Keys.ENTER);
	}

}
