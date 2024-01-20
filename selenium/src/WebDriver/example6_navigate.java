package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_navigate
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();


driver.navigate().to("https://web.whatsapp.com/");
 Thread.sleep(2000);
 driver.navigate().to("https://mail.google.com/mail/u/4/#inbox");
 Thread.sleep(2000);
 driver.navigate().back();
 Thread.sleep(2000);
 driver.navigate().forward();
 Thread.sleep(2000);
 driver.navigate().refresh();
}
}
