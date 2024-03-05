package Common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.ScreenshortFiles;

public class ReportTESTNGListeners extends ScreenshortFiles implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Method is " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Method is " +result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

}
