package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_getCurrentUrl 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	//String url=driver.getCurrentUrl();
	//System.out.println(url);
	
	System.out.println(driver.getCurrentUrl());
	
}
}
