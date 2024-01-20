package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Object_Module.KiteLHomePage;
import Page_Object_Module.KiteLogin1Page;
import Page_Object_Module.KiteLogin2Page;

public class KiteLoginTest 
{
public static void main(String[] args) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	KiteLogin1Page login1=new KiteLogin1Page(driver);
	login1.enterun();
	login1.enterpwd();
	login1.clickonloinbtn();
	
	KiteLogin2Page login2=new KiteLogin2Page(driver);
	login2.enterpin();
	login2.clickoncntbtn();
	
	KiteLHomePage homepage=new KiteLHomePage(driver);
	 homepage.verifyuserid();
	 Thread.sleep(3000);
	 driver.close();
	
	
	
}
}
