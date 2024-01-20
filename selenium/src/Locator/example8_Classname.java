package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_Classname
{
public static void main (String [] args)
{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe")	;
WebDriver driver=new ChromeDriver();
driver.get("file:///F:/HTML/exmple_classname.html");
//user name
driver.findElement(By.className("abc123")).sendKeys("abc");
//password
driver.findElement(By.className("abc123")).sendKeys("xyz");
}
}
