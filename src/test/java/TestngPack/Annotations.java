package TestngPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations
{
	@Test (priority=1,description="@TEST1 DESCRIPTION",groups="Smoke Test")
	public void afirsttc()
	{
		System.out.println("SCORE CHECKED- TEST CASE- 1");
	}
	
	
	@Test(priority=2,description="@TEST2 DESCRIPTION",groups="Regression Test")
	public void asecondtc()
	{
		System.out.println("OVER CHECKED- TEST CASE- 2");
	}
	
	
	
	@BeforeGroups (value="Regression Test")
	public void BG()
	{
		System.out.println("TEST - BEFORE GROUP1111111111111111111111111111111111111111");
	}
	
	
	
	@BeforeTest (description="@BEFORETEST LOGIN DESCRIPTION")
	public void Login()
	{
		System.out.println("OPEN BROWSER- BEFORE TEST");
	}
	

	@AfterTest (description="Logout Success- AFTER TEST")
	public void Logout()
	{
		System.out.println("CLOSE BROWSER -AFTER TEST");
	}
	
	
	

	@BeforeClass (description="@BEFORECLASS DB CONNECT")
	public void DBConnec()
	{
		System.out.println("DB CONNNECTED -BEFORE CLASS");
	}
	

	@AfterClass(description="@AFTERTEST LOGIN DESCRIPTION")
	public void DBDisconnect()
	{
		System.out.println("DB DISCONNECTED-AFTER CLASS");
	}
	
	
	
	
	@BeforeMethod (description="@BEFORE METHOD")
	public void LoginPag()
	{
		System.out.println("Prerequistic drivers -BEFORE METHOD");
	}
	

	@AfterMethod (description="@AFTER METHOD")
	public void DBDISCONNECT()
	{
		System.out.println("Driver quit - AFTER METHOD");
	}
	


	
}
