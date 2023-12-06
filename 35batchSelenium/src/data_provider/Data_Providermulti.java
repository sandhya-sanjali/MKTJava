package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Providermulti 
{
	EdgeDriver driver;
	
	@DataProvider(name="data1")
	public Object amazonlogin()
	{
		Object data [][]=new Object [2][2];
	
		data[0][0]="sandhya.sanjali@gmail.com";
		data[0][1]="sandhya123";
		data[1][0]="gsr.gsr@gmail.com";
		data[1][1]="gsr123";
		return data;
	}
	@Test(dataProvider="data1")
	public void loginonamazon(String un, String pwd) 
	{
		driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin= driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
		signin.click();
		WebElement login= driver.findElement(By.xpath("//input[@name='email']"));
		login.sendKeys(un);
		WebElement cont= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		cont.click();
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pwd);
		WebElement signinclick= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		signinclick.click();
		driver.close();
		System.out.println(un.concat(pwd));
		
	}
}
