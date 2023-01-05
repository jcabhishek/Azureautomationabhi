package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepages extends Baseclass
{
	public WebDriver ldriver;
	public Homepages(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//a[@id='mobile-collapse']")
	WebElement clickon;
	@FindBy(xpath = "//span[text()='BlacklistVehicles']")
	WebElement clickonblacklist;
	@FindBy(xpath = "//input[@placeholder='Enter minimum 4 characters']")
	WebElement Entervin;
	
	public void blacklist( String vin) 
	{
		clickon.click();
		clickonblacklist.click();
		Entervin.sendKeys(vin);
		
	}

	


}
