package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parternportal 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sm-partnerportal-stage.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@formcontrolname='useremailid']")).sendKeys("sunmobilityadmin@sunmobility.co.in");
		driver.findElement(By.xpath("//input[@formcontrolname='userpassword']")).sendKeys("Sunmob@123");
		driver.findElement(By.xpath("//button[@class='btn btn-primary mr-1']")).click();
		driver.findElement(By.xpath("//a[@id='mobile-collapse']")).click();
		driver.findElement(By.xpath("//span[text()='BlacklistVehicles']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter minimum 4 characters']")).sendKeys("MBX0007EFXJ919051");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='feather icon-search']")).click();
		driver.findElement(By.xpath("//span[@class='feather icon-search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr//td//a[@class='ng-star-inserted']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn_primary_styles topmargin']")).click();
		
		
		
	}

}
