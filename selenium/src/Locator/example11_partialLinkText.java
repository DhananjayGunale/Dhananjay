package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11_partialLinkText 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///F:/HTML/example10_linktext.html");
driver.manage().window().maximize();
driver.findElement(By.partialLinkText("face")).click();
}
}
