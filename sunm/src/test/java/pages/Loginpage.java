package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Baseclass
{
	public WebDriver ldriver;
	By useremail=By.xpath("//input[@formcontrolname='useremailid']");
	By passwoed=By.xpath("//input[@formcontrolname='userpassword']");
	By button=By.xpath("//button[@class='btn btn-primary mr-1']");
	
	public Loginpage(WebDriver driver)
	{
		
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void email(String text) 
	{
		driver.findElement(useremail).sendKeys(text);
		
	}
	public void password(String pass)
	{
		driver.findElement(passwoed).sendKeys(pass);
		
	}
	public void loginbutton()
	{
		
		driver.findElement(button).click();
	}

}

