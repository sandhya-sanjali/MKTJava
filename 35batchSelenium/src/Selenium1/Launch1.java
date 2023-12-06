package Selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {

	public static void main(String[] args)
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		String title= d1.getTitle();
		System.out.println(title);
	}

}
