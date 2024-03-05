package TestngPack;

import org.testng.annotations.Test;

public class FirstTestng
{
	
	@Test (priority=1)
	public void Login()
	{
		System.out.println("Successfully Login");
	}
	
	
	@Test(priority=2)
	public void Logout()
	{
		System.out.println("Successfully logout");
	}
	
	

}
