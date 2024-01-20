package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exzample9_name 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/HTML/example9_name.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("xyz123")).sendKeys("abc");
		driver.findElement(By.name("xyz123")).sendKeys("xyz");
		

	}
}
