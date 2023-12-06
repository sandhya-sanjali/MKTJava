package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title1 
{
	public static void main(String[] args) 
	{
		ChromeDriver d1= new ChromeDriver();
		/*d1.get("https://www.amazon.com/");
		String title=d1.getTitle();
		System.out.println(title);*/
		
		/*d1.get("https://www.facebook.com/");
		String title=d1.getTitle();
		System.out.println(title);*/
		
		d1.get("https://www.youtube.com/");
		String title=d1.getTitle();
		System.out.println(title);
		System.out.println(d1.getWindowHandle());
		
	}
}
