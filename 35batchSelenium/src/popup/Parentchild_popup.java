package popup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild_popup {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement google= driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		String parentid= driver.getWindowHandle();
		System.out.println("parentid is="+parentid);
		Set<String>parentandchild= driver.getWindowHandles();
		System.out.println("parentandchild are="+parentandchild);
		Thread.sleep(1000);
		//driver.close();//parentwindow will be closed
		Iterator<String> pc= parentandchild.iterator();
		String id1= pc.next();//1st gives parent id
		String id2= pc.next();//2nd next method gives u the 1st child id
		System.out.println(id1);
		System.out.println(id2);
		driver.switchTo().window(id2);//moves the control to child
		driver.close();
		
	}

}
