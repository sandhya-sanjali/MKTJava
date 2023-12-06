package testNG;

import org.testng.annotations.Test;

public class priority1
{
	@Test(priority=-1)
	public void add() {
		System.out.println("add");
	}
	@Test(priority=1)
	public void subract() {
		System.out.println("substract");
	}
	@Test
	public void multiply( ) {
		System.out.println("multiply");
	}
}
