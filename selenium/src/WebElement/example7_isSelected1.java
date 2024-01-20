package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_isSelected1 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
//click on create new acc link
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(3000);

//female radio button

 boolean result = driver.findElement(By.xpath("(//input[@name='sex'])[1]")).isSelected();
 System.out.println(result);
 
 if(result==true)
 {
	 System.out.println("radio button selected");
 }
 else
 {
	 System.out.println("radio button de-selected");
 }



}
}
