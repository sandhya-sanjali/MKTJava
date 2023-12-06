package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDDT1
{
	public String user="";
	public String pass="";
	
	void fetch() throws EncryptedDocumentException, IOException
	{
			FileInputStream fis = new FileInputStream("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\ExcelSheet\\sandhyasheet.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			user= wb.getSheet("login_cred").getRow(1).getCell(0).getStringCellValue();
			pass= wb.getSheet("login_cred").getRow(1).getCell(1).getStringCellValue();
		
	}
		
}
