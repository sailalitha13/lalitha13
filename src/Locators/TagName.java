package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webDriver.chrome.driver", "./Drivers\\Chromedriver.Exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("amazon page is dispalyed successfully");
		Thread.sleep(2000);
		WebElement myshopping = driver.findElement(By.id("twotabsearchtextbox"));
		myshopping.click();
		myshopping.sendKeys("womenswear");
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		Thread.sleep(2000);
		driver.close();
	}

}
