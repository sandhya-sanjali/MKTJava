package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon_excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\ExcelSheet\\sandhyasheet.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	String user= wb.getSheet("login_cred").getRow(1).getCell(0).getStringCellValue();
	String pass= wb.getSheet("login_cred").getRow(1).getCell(1).getStringCellValue();
	
	System.out.println(user);
	System.out.println(pass);
	
	EdgeDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement signin= driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
	signin.click();
	WebElement login= driver.findElement(By.xpath("//input[@name='email']"));
	login.sendKeys(user);
	WebElement cont= driver.findElement(By.xpath("//input[@class='a-button-input']"));
	cont.click();
	WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(pass);
	WebElement signinclick= driver.findElement(By.xpath("//input[@class='a-button-input']"));
	signinclick.click();
	
	
	}
}
