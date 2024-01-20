package Page_Object_Module;

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

public void VerifyKiteLHomePageUserid() 
{
	String actuserid = userid.getText();
	String expuserid = "VS6640";
	
	if (actuserid.equals(expuserid)) 
	{
		System.out.println("pass");
	} 
	else
	{
System.out.println("fail");
	}
	
}

}
