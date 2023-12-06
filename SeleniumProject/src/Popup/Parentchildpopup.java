package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildpopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=Cj0KCQjwxuCnBhDLARIsAB-cq1rBKJNV6E-LwdjaIFbqx2Y1L3T6lpD_hyQfYlPlq6JSTM7_qfuycvUaAlKbEALw_wcB&gclsrc=aw.ds");
		driver.findElement(By.xpath("//span[.='Google']")).click();
		//String parent= driver.getWindowHandle();not required, for learning purpose only
		Set<String> parentandchild= driver.getWindowHandles();
		System.out.println(parentandchild);
		Iterator<String> a=	parentandchild.iterator();
		String parentid= a.next();// 1st next method gives parent id seperately
		String childid= a.next();//2nd next method gives u 1st child id
		//a.next();//3rd method will give u 2nd child id
		System.out.println(parentid);
		System.out.println(childid);
		//driver.close();//still control is with parent
		driver.switchTo().window(childid);//move the control from parent to child
		Thread.sleep(3000);
		driver.close();//child will be closed
		driver.switchTo().window(parentid);
		Thread.sleep(3000);
		driver.close();
	}

}
