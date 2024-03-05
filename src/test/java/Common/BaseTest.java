package Common;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BaseTest
{
	public static String browser="Chrome";
	public static WebDriver driver;
	
@BeforeSuite
	public void LaunchBrowser()
	{
	
	    driver = new ChromeDriver();
	    
	}



@Test
public void launchapp()
{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("HI");
		driver.findElement(By.id("password")).sendKeys("HOI");
		driver.findElement(By.id("login-buttonO")).click();

	}



@AfterSuite
public void CloseBrowser()
{

    driver.close();
    
}
	
}
