package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class example10_linktext 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
driver.manage().window().maximize();
Thread.sleep(3000);
	driver.get("file:///F:/HTML/example10_linktext.html");
	driver.findElement(By.linkText("facebook")).click();
}
}
