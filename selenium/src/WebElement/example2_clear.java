package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_clear 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='email']")).clear();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
	
	
	
}
}