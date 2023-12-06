package popup;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Coordinate_Prog1 {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		WebElement country= driver.findElement(By.xpath("//a[.='Canada']"));
		Point xandy= country.getLocation();
		int x= xandy.getX();
		System.out.println(x);
		int y= xandy.getY();
		System.out.println(y);
		
	}

}
