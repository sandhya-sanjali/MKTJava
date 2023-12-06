package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider1 
{
	@DataProvider(name="data2")
	public Object[][] method1()
	{
		return new Object[][] {{"Ram"},{"Vishnu"},{"vivek"}};
	}
	@Test(dataProvider="data2")
	public void testcase1(String value1)
	{
		System.out.println( value1);
		System.out.println(value1.concat("works at google"));
	}
}
