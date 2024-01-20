package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_without_DDF
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");

//Enter UN
driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("VS6640");

//Enter password
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7066650010");

//click on login btn
driver.findElement(By.xpath("//button[text()='Login ']")).click();

//enter pin
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("706665");

//click on continue button
driver.findElement(By.xpath("//button[text()='Continue ']")).click();

String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
String ExpUserId = "VS6640";
if (actUserID.equals(ExpUserId)) 
{
	System.out.println("Pass");
	
} 
else
{
System.out.println("Fail");
}
Thread.sleep(3000);
driver.close();  


	
}
	
	
	
}
