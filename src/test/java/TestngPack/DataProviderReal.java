package TestngPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderReal

{
	public static String browser="Chrome";
	public static WebDriver driver;

	@Test(dataProvider="Login",dataProviderClass=DataProviderMain.class)
	public void Login(String UserName,String Password)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("login-buttonO")).click();

	}


}
