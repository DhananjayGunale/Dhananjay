package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class 1

public class KiteLogin1Page 
{

	//step1:declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement un;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//button[text()='Login ']")private WebElement loginbtn;
	
	//step2:Initialization
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//step3:Usage
	
	public void SetKiteLogin1PageUsername() 
	{
		un.sendKeys("VS6640");
	}
	public void SetKiteLogin1PagePassword() 
	{
		pwd.sendKeys("7066650010");
	}
	public void clickKiteLogin1Pageloinbtn() 
	{
		loginbtn.click();
	}
	
	
	
	
	
	
	
	
}
