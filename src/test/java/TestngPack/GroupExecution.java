package TestngPack;

import org.testng.annotations.Test;

public class GroupExecution
{

	
	@Test (groups="regression")
	public void First()
	{
		System.out.println("TEST 1");
	}
	
	
	@Test(groups="regression")
	public void Second()
	{
		System.out.println("TEST 2");
	}
	
	

	@Test(groups={"regression","bvt"})
	public void Third()
	{
		System.out.println("TEST 3");
	}
	
	

	@Test(groups="bvt")
	public void Fourth()
	{
		System.out.println("TEST 4");
	}
	
	
}
