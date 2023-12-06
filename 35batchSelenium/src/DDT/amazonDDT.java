package DDT;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class amazonDDT extends ExcelDDT1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ExcelDDT1 ec1 = new ExcelDDT1();
		ec1.fetch();
		
		System.out.println("******************* -> "+ec1.user);
		System.out.println("******************* -> "+ec1.pass);
		
		EdgeDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin= driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
		signin.click();
		WebElement login= driver.findElement(By.xpath("//input[@name='email']"));
		login.sendKeys(ec1.user);
		WebElement cont= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		cont.click();
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(ec1.pass);
		WebElement signinclick= driver.findElement(By.xpath("//input[@class='a-button-input']"));
		signinclick.click();
	}

}
