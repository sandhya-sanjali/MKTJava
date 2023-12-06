package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class emptycell_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Sandhya\\OneDrive\\Desktop\\Eclipse\\35batchSelenium\\ExcelSheet\\sandhyasheet.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String cash= wb.getSheet("payment_details").getRow(2).getCell(0).getStringCellValue();
		System.out.println(cash);
	}

}
