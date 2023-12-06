package testcase_retry;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Prog implements IRetryAnalyzer
{
	int count=0;//initial count of retry is 0
	int retrynumber=3;//this is the no of times i wish to retry
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
