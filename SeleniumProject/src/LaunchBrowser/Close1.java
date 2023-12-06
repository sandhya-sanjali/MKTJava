package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close1 
{
	public static void main(String[] args) 
	{
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.amazon.com/");
		d1.close();
		
	}

}
