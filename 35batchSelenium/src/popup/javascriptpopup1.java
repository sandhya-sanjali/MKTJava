package popup;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopup1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
