package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3_GetStringData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("C:\\Selenium\\sss.xlsx");
	String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(2).getCell(3).getStringCellValue();
	System.out.println(value);
	
}
}

