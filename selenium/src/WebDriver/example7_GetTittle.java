package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_GetTittle 
{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	String tittle=driver.getTitle();
         System.out.println(tittle);
	//System.out.println(driver.getTitle());
}
}
