package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 extends Baseclass

{
	
	public WebDriver ldriver;
	
	public Loginpage1(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@formcontrolname='useremailid']")
	WebElement name;
	
	@FindBy(xpath = "//input[@formcontrolname='userpassword']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='btn btn-primary mr-1']")
	WebElement login;
	
	public void clicklogin(String uname,String upass)
	{
		name.sendKeys(uname);
		password.sendKeys(upass);
		login.click();
	}
	
	//public void setpassword(String upass)
	{
		//password.sendKeys(upass);
	}
	//public void clicklogin()
	{
		//login.click();
	}

	

}
