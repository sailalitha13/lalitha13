package DropDown;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement drdp=driver.findElement(By.id("course"));
		drdp.click();
		new Select(drdp).selectByIndex(3);
		
		
		
		WebElement drdp1=driver.findElement(By.id("ide"));
		drdp1.click();
		new Select(drdp1).selectByVisibleText("visual studio");
		
		
		
		WebElement drdp2=driver.findElement(By.id("ide"));
		drdp2.click();
		new Select(drdp2).selectByValue("1");
		
		
		
		
		

	}

}
