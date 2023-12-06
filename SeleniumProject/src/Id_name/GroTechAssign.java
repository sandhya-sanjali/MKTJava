package Id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechAssign 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("1")).sendKeys("Sandhya");
		driver.findElement(By.id("2")).sendKeys("Upadhyay");
		driver.findElement(By.name("Password")).sendKeys("Sand1234");
		driver.findElement(By.id("4")).sendKeys("sandhyarani");
		driver.findElement(By.id("5")).sendKeys("upadhyayula");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.name("checkbox-833[]")).click();
		driver.findElement(By.className("submit")).click();		
	}

}
