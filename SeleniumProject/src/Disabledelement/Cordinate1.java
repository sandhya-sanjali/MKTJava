package Disabledelement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cordinate1 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver D=new ChromeDriver();//will take to blank page where no forward or backward
		D.get("https://www.google.co.in/");
		D.manage().window().maximize();
		Thread.sleep(3000);
		D.navigate().back();
		Thread.sleep(2000);
		D.navigate().forward();
		Thread.sleep(2000);
		D.navigate().refresh();
	}

}
