import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/OneDrive/Desktop/JSAM.html");
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='321']"));
		boolean a=checkbox.isDisplayed();
		boolean b= checkbox.isEnabled();
		checkbox.click();
		System.out.println(a);
		System.out.println(b);
		if(checkbox.isDisplayed()==true && checkbox.isEnabled()==true)
		{
			System.out.println("sandhya");
		}
		else
		{
			System.out.println("upadhyay");
		}
	}

}
