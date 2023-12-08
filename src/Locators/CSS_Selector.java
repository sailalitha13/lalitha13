package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector
{

	
	public static void main(String[] args)throws Exception
	{
	
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     System.out.println("facebook page is displayed");
       
     //name
     WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
     email.click();
     email.sendKeys("lalitha");
     Thread.sleep(4000);
     
     
     //class
     WebElement pwd=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
     pwd.click();
     pwd.sendKeys("asdfghjkl");
     Thread.sleep(4000);
     
     
     WebElement login=driver.findElement(By.cssSelector(" button[class*='_4'] "));
     login.click();
     Thread.sleep(4000);
     
     
     //WebElement login=driver.findElement(By.cssSelector(" button[name^='l'] "));
     //login.click();
     //Thread.sleep(4000);
      
     
}
}
