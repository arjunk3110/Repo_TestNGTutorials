package Common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.ScreenshortFiles;

public class TESTNGListeners extends ScreenshortFiles implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TESTNG LSTENER STARTED");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TESTNG LSTENER SUCCESS");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TESTNG LSTENER FAILED");
		
		try {
			GetScreenShort();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
