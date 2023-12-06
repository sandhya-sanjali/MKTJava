package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sandhya/Downloads/learningHTML1%20(1).html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("sandhya");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Ms.");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("U Smart");
		driver.findElement(By.xpath("(/html/body/form)[1]/input[1]")).sendKeys("sandhya reddy");
		//driver.findElement(By.xpath("(/html/body/form)[1]/input[3]")).click();
		driver.findElement(By.xpath("(/html/body/form)[2]/input[1]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("(/html/body/form)[2]/input[3]")).click();
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		driver.findElement(By.xpath("(/html/body/input)[7]")).click();
		//driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]")).click(); 
		/*driver.findElement(By.tagName("a")).click();	
		driver.findElement(By.className("gLFyf")).sendKeys("India")*/
;		
	}

}
