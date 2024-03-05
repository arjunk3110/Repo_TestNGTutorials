package TestngPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTestDemo
{
	@Test
	public void ReportTest1() {
		System.out.println("Tested R1");
		Reporter.log("TEST1 LOGS PRINTED");
	}
	
	@Test
public void ReportTest2() {
	System.out.println("Tested R2");
	Reporter.log("TEST2 LOGS PRINTED");
	}

	@Test
public void ReportTest3() {
	System.out.println("Tested R3");
	Reporter.log("TEST1 LOGS PRINTED");
}

}
