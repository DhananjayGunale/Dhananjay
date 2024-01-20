package Excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2_GetNumericData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("C:\\Selenium\\sss.xlsx");	
double value = WorkbookFactory.create(file).getSheet("sheet1").getRow(3).getCell(4).getNumericCellValue();
System.out.println(value);

}
}
