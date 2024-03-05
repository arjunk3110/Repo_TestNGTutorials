package TestngPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions
{

	
	public static String browser="Firefox";
	public static WebDriver driver;

@Test
	public void TitleTest()
	{
		if (browser.equals("Chrome"))
		{
		driver=new ChromeDriver();
			
		}
		
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://www.saucedemo.com/");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle= "Swag Labs";
		
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		
		
	}
}
