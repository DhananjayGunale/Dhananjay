package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//username
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc");
	//password
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("xyz");
	//click on login
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
}
}
