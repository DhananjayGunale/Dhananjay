package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_switchToChildWindow 
{
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException 

{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	//click on new tab from main page
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	//get child window id
	Set<String> allids = driver.getWindowHandles(); //mainpagerid child window id
	ArrayList<String> al=new ArrayList<String>(allids);  //[mainpage id[0]childwindow id[1]]
	String childwindowid = al.get(1);
	
	//switch to child window 
	
	driver.switchTo().window(childwindowid);   //string windowID
	//click on training link from child window
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	Thread.sleep(2000);
	//switch to main page
	driver.switchTo().window(al.get(0));
	//click on new window  from main page
	driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	
	
}
}
