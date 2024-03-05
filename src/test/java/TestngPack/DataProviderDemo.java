package TestngPack;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
	


	
	@Test(dataProvider="dataset",dataProviderClass=DataProviderMain.class)
	public void set(String UserName,String Password)
	{
		System.out.println(UserName+"-----"+Password);
	}

	

	
	@Test(dataProvider="SecondDP",dataProviderClass=DataProviderMain.class)
	public void set1(String UserName,String Password,String Test)
	{
		System.out.println(UserName+"-----"+Password+"------"+Test);
	}

	
}
