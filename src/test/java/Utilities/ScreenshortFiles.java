package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Common.BaseTest;

public class ScreenshortFiles extends BaseTest
{	
	
	
		public void GetScreenShort() throws IOException
		{
			Date CurrentDate= new Date();
			String FN=CurrentDate.toString().replace("", "-").replace(":" , "-");
			
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(".//screeshort//"+ FN +".png"));
		}
		
		
		
}

	
