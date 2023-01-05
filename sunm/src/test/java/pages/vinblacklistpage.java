package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vinblacklistpage extends Baseclass
{

	public WebDriver ldriver;
	
	public vinblacklistpage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='feather icon-search']")
	WebElement clicksearch;
	
	@FindBy(xpath = "//span[@class='feather icon-search']")
	WebElement clicksearch1;
	
	@FindBy(xpath ="//tr//td//a[@class='ng-star-inserted']" )
	WebElement clickx;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn_primary_styles topmargin']")
	WebElement clicksearch3;
	public void blacklist()
	{
		clicksearch.click();
		clicksearch1.click();
		clickx.click();
		clicksearch3.click();
	}
}
