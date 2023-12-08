package Link;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Example 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https:instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Locations")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("India")).click();

		driver.findElement(By.linkText("Delhi")).click();

		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
	}

}
