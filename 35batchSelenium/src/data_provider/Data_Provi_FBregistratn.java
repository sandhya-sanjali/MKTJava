package data_provider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provi_FBregistratn 
{
	ChromeDriver driver;
	@DataProvider(name="data1")
	public Object[][]fblogin()
	{
		Object data[][]=new Object [5][4];
		data[0][0]="sandhya";
		data[0][1]="upadhyay";		
		data[0][2]="8748993169";
		data[0][3]="ssss123";
		data[1][0]="surendra";
		data[1][1]="reddy";
		data[1][2]="7204418245";
		data[1][3]="gggg123";
		data[2][0]="usha";
		data[2][1]="Yadav";
		data[2][2]="1234567890";
		data[2][3]="uuuu123";
		data[3][0]="murali";
		data[3][1]="yadav";
		data[3][2]="1234567891";
		data[3][3]="mmmm123";
		data[4][0]="mani";
		data[4][1]="yadav";
		data[4][2]="1234567892";
		data[4][3]="nnnn123";
		return data;
	}
	@Test(dataProvider="data1")
	public void fb_reg(String fn, String sn, String mobileno, String pwd) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement newreg= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a\r\n"
				+ ""));
		newreg.click();
		Thread.sleep(5000);
		WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys(fn);
		WebElement surname= driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys(sn);
		WebElement cellno= driver.findElement(By.xpath("//input[@name='reg_email__']"));
		cellno.sendKeys(mobileno);
		WebElement password=  driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys(pwd);
		Thread.sleep(2000);
		driver.close();
	}
}
