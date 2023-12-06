package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		//step1: location of the excelsheet by using FileInputStream class object
		FileInputStream FIS= new FileInputStream("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\ExcelSheet\\sandhyasheet.xlsx");
		//step 2: using workbookFactory, use "create" method to open the excel sheet
		Workbook wb= WorkbookFactory.create(FIS);
		//step 3: utilise a method - getsheet
		Sheet s1= wb.getSheet("login_cred");
		//step 4: use get row method
		Row r1= s1.getRow(1);
		//step 5: use get cell method
		Cell c1= r1.getCell(1);
		//Step 6: use get string cell value method
		String password= c1.getStringCellValue();
		System.out.println(password);
		Row r2= s1.getRow(1);
		Cell c2= r1.getCell(0);
		String username= c2.getStringCellValue();
		System.out.println(username);
		
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/");
		WebElement login= d1.findElement(By.xpath("//*[@id=\"email\"]\r\n"
				+ ""));
		login.sendKeys(username);
		WebElement password1= d1.findElement(By.xpath("//*[@id=\"pass\"]\r\n"
				+ ""));
		password1.sendKeys(password);
		WebElement click= d1.findElement(By.xpath("//*[@id=\"email\"]\r\n"
				+ ""));
		Thread.sleep(2000);
		click.sendKeys(Keys.ENTER);
	}
	
}
