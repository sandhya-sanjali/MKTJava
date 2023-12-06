package data_provider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_providerannotation 
{
	@DataProvider(name="data1")
	public Object[][]method1()
	{
		return new Object[][]{{10},{20},{30}};
	}
	@DataProvider(name="data2")
	public Object[][] method2()
	{
		return new Object[][] {{"Ram"},{"Vishnu"},{"vivek"}};
	}
	@Test(dataProvider="data2")
	public void testcase1(String value1)
	{
		System.out.println( value1);
		System.out.println(value1.concat("works at google"));
	}
	{
		
	}
	/*public void testcase1(int value1)
	{
		int sum=100+value1;
		//System.out.println(sum);
		Reporter.log("hello"+sum);
	}*/
	
}

