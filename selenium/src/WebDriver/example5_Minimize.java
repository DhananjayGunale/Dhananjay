package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_Minimize 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
driver.get("https://facebook.com");

Thread.sleep(3000);
  driver.manage().window().minimize();
  
  //Options s1=driver.manage()
// window s2=s1.window();
  //s2.minimize();
  
}
}
