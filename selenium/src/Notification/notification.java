package Notification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification 
{
public static void main(String[] args) 

{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	
System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
WebDriver driver=new  ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");


driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("VS6640");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7066650010");
driver.findElement(By.xpath("//button[text()='Login ']")).click();

	
}
}
