package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_click 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//click on create new aaccount link
	driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
	
	Thread.sleep(4000);
	//click on female radio button
	driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
	
	
}
}
