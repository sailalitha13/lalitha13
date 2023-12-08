package modular_framework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class three extends two
{

	public void browseropen()
	{
	driver =new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}
	public void loginoperation() throws InterruptedException
	{
		
		driver.findElement(By.xpath(una)).sendKeys(urna);
		driver.findElement(By.xpath(pwd)).sendKeys(pswd);
		driver.findElement(By.xpath(lgn)).submit();
		Thread.sleep(2000);
	}
	public void closebrowser()
	{
		driver.quit();
	}


}
