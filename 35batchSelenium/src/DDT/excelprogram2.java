package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelprogram2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream FIS= new FileInputStream("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\ExcelSheet\\sandhyasheet.xlsx");
		Workbook wb= WorkbookFactory.create(FIS);
		String username= wb.getSheet("login_cred").getRow(0).getCell(0).getStringCellValue();
		String password= wb.getSheet("login_cred").getRow(0).getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		
	}

}
