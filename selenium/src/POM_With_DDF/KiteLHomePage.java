package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLHomePage 
{
@FindBy(xpath="//span[@class='user-id']")private WebElement userid;

public KiteLHomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void VerifyKiteLHomePageUserid(String expUserid) 
{
	String actuserid = userid.getText();
	
	
	if (actuserid.equals(expUserid)) 
	{
		System.out.println("pass");
	} 
	else
	{
System.out.println("fail");
	}
	
}

}
