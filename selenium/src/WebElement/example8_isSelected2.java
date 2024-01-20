package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_isSelected2 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//click on create new acc
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	WebElement femaleRadioBtn = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
	boolean result1 = femaleRadioBtn.isSelected();
	if(result1==true)
	{
		System.out.println("radio button already selected");
	}
	else
	{
		Thread.sleep(3000);
		femaleRadioBtn.click();  //click on radio button
		
		boolean result2=femaleRadioBtn.isSelected();
		if(result2==true)
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button is de-selected");
		}
	}
	
}
}
