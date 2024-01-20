package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_SendKeys 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//enter UN
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
	
	WebElement UN=driver.findElement(By.xpath("//input[@id='email']"));
	UN.sendKeys("abc");
	
}	
}
