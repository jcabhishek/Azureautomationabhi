package partern.sunm;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhi 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//abhishek.jc//Downloads//chromedriver_win32 (4)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sm-atom-staging.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='col-sm-1']")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("peddakotla.sanjaydatta@sunmobility.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Kotla@2021");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();

		 
		

		
	}

}
