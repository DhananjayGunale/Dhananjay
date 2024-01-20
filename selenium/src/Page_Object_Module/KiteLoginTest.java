package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	login1.SetKiteLogin1PageUsername();
	login1.SetKiteLogin1PagePassword();
	login1.clickKiteLogin1Pageloinbtn();
	
	KiteLogin2Page login2=new KiteLogin2Page(driver);
	login2.SetKiteLogin2PagePin();
	login2.ClickKiteLogin2Pagecontnbtn();
	
	KiteLHomePage homepage=new KiteLHomePage(driver);
	 homepage.VerifyKiteLHomePageUserid();
	 Thread.sleep(3000);
	 driver.close();
	
	
	
}
}
