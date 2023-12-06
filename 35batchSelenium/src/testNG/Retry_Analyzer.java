package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer
{
	int count=0;//initial retry count=0
	int retrynumber=3;//no of times i wish to retry the program
	@Override
	public boolean retry(ITestResult result)
	{
		if(count<retrynumber)
		{
			count++;
			return true;
		}
		return false;
	}
	
}
