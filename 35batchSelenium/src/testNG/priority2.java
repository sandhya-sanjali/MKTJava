package testNG;

import org.testng.annotations.Test;

public class priority2
{
	@Test(enabled=false)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=-1)
	public void registration()
	{
		System.out.println("registration");
	}
}
