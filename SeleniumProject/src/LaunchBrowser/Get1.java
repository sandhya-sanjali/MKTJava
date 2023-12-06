package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get1 
{
	public static void main(String[] args)
	{
		ChromeDriver d1=new ChromeDriver();
		//d1.get("https://www.google.com/");
		//d1.get("https://www.youtube.com/");
		d1.get("https://www.facebook.com/");
		d1.getWindowHandle();
	}

}
