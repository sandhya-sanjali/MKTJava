package data_provider;

import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_ProviderAssgn 
{
	Scanner s = new Scanner(System.in);
	String s1 ="";
	@DataProvider(name="select")
	public Object test1()
	{
		s1 = s.nextLine();
		return new Object[][] {{"salman"},{"shahrukh"},{"amir"},{"kareena"},{"katrina"},{"aliya"},{"deepika"},
			{"ranveer"},{"akshay"},{"ajay"}};
			
	}
	@Test(dataProvider="select")
	public void method1(String value1)
	{
		if(value1.equals(s1))
		{
			System.out.println("the input is present inside the data provider");
		}
		else
		{
			System.out.println("the input is not matching");
		}
	}
	}


