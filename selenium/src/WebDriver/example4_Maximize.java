package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_Maximize 
{
public static void main(String[] args) throws InterruptedException 

{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https:/www.facebook.com");
	Thread.sleep(5000);
	
	
driver.manage().window().maximize();

    // options s1= driver.manage();  // options is return type and webdriver is interface
    //windows s2=s1.window();
    //s2.maximize();
	
}
}
