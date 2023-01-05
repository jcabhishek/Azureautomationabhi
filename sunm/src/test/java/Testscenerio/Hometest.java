package Testscenerio;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Baseclass;
import pages.Homepages;
import pages.Loginpage1;

public class Hometest extends Baseclass
{
	public static  WebDriver ldriver;
	@Test
	public  void Hometest1() throws InterruptedException
	{
	Loginpage1 page=new Loginpage1(driver);
	page.clicklogin(username,userpassword);
	Thread.sleep(4000);
	Homepages page1=new Homepages(driver);
	page1.blacklist(vehiclevin);
	Thread.sleep(4000);
	//page.clicklogin(UsernamePasswordCredentials);
	//page.clicklogin();
	}

}
