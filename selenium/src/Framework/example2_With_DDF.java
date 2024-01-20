package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_With_DDF 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{
	FileInputStream file = new FileInputStream("C:\\Selenium\\New folder\\sss.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	
System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");

//Enter UN
String UN = sh.getRow(0).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
//Enter pwd
String pwd = sh.getRow(0).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
//click on login btn
driver.findElement(By.xpath("//button[text()='Login ']")).click();
//Enter pin
String pin = sh.getRow(0).getCell(2).getStringCellValue();
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
//click on continue
driver.findElement(By.xpath("//button[text()='Continue ']")).click();
String actuserid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
String expuserid = sh.getRow(0).getCell(3).getStringCellValue();

if (actuserid.equals(expuserid)) 
{
System.out.println("pass");	
} 
else 
{
System.out.println("fail");
}
Thread.sleep(3000);
driver.close();





}

}
