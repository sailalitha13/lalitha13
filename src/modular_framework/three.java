package modular_framework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class three extends two

{

	public void browseropen()
	{
	driver =new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	
	}
	public void loginoperation() throws InterruptedException
	{
		driver.findElement(By.name(eml)).sendKeys(uname);
		driver.findElement(By.name(pwd)).sendKeys(pwrd);
		driver.findElement(By.xpath(lgn)).click();
		Thread.sleep(2000);
	}
	public void closebrowser()
	{
		driver.quit();
	}
	
	
	
	
	
}
