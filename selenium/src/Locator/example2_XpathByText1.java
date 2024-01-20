package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_XpathByText1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");  //enter username
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");  //enter password
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();  //click on login button
	
	
	
	
	
}
}
