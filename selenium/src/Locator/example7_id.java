package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_id 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/HTML/example7_ID.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("1234")).sendKeys("abc");
		driver.findElement(By.id("1234")).sendKeys("xyz");
		

	}
	}
