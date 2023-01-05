package Testscenerio;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Baseclass;
import pages.Loginpage1;

public class Logintest extends Baseclass
{
	public static  WebDriver driver;
	@Test
	public  void logingtest()
	{
	Loginpage1 page=new Loginpage1(driver);
	page.clicklogin(username,userpassword);
	//page.clicklogin(UsernamePasswordCredentials);
	//page.clicklogin();
	}
	
	
	

}
