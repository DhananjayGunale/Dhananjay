package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example2_TestNg_TestClass 
{
	@Test
public void openFacebookApp() throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
   Thread.sleep(3000);
   driver.close();
	
	
}

}
