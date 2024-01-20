package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\New folder\\sss.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	KiteLogin1Page login1=new KiteLogin1Page(driver);
	login1.SetKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
	login1.SetKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	login1.clickKiteLogin1Pageloinbtn();
	
	KiteLogin2Page login2=new KiteLogin2Page(driver);
	login2.SetKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
	login2.ClickKiteLogin2Pagecontnbtn();
	
	KiteLHomePage homepage=new KiteLHomePage(driver);
	 homepage.VerifyKiteLHomePageUserid(sh.getRow(0).getCell(3).getStringCellValue());
	 Thread.sleep(3000);
	 driver.close();
	
	
	
}
}
