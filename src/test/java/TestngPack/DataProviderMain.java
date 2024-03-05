package TestngPack;

import org.testng.annotations.DataProvider;

public class DataProviderMain {
	

	@DataProvider
	public Object[][] dataset()
	{
	
		Object[][] dataset=new Object[3][2];
		dataset[0][0]="USER 1";
		dataset[0][1]="PASS 1";
		
		dataset[1][0]="USER 2";
		dataset[1][1]="PASS 2";
		
		dataset[2][0]="USER 3";
		dataset[2][1]="PASS 3";
		
		return dataset;
		
	}
	
	
	@DataProvider(name="SecondDP")
	public Object[][] dataset1()
	{
		return new Object[][]
				{
		{"UN1","PSWRD1","TEST1"},
		{"UN2","PSWRD2","TEST2"},
	
				};
				
	}
	
	
	
	@DataProvider(name="Login")
	public Object[][] dataset2()
	{
		return new Object[][]
				{
		{"standard_user22","secret_sauce"},
	
				};
				
	}
	

}
