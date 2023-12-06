package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class phno_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\ExcelSheet\\sandhyasheet.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String username= wb.getSheet("login_cred").getRow(3).getCell(0).getStringCellValue();
		System.out.println(username);
		String mobileno= NumberToTextConverter.toText(wb.getSheet("login_cred").getRow(3).getCell(1).getNumericCellValue());
		System.out.println(mobileno);
	}

}
