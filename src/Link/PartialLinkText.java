package Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.partialLinkText("Contact")).click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
	}

}
