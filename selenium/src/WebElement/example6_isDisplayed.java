package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isDisplayed
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
 boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();  //logo of facebook
System.out.println(result);
if(result==true)
{
System.out.println("Element is displayed");

}
else
{
System.out.println("Element is not displayed");	
}
}
}
