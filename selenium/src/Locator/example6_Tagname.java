package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_Tagname 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///F:/HTML/example6_tagname.html");
	
	//enter username
	driver.findElement(By.tagName("input")).sendKeys("abc");
	//enter pass
	driver.findElement(By.tagName("input")).sendKeys("xyz");
}
}
