package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.configuration.Config;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Readdata;

public class Baseclass 
{
    Readdata config=new Readdata();
    public String username=config.getUsername();
	public String userpassword=config.getPassword();
	public String vehiclevin=config.getvin();
	//public String userurl1=config.geturl();
	
	
	public static WebDriver driver;
	@BeforeTest
	public static void steup()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://sm-partnerportal-stage.azurewebsites.net/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		
		
	}
	
	//@AfterTest
	//public static void teardowntest()
	{
		
	//	driver.close();
	}
}


