package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
	 driver.get("http://localhost/login.do");
			
			WebElement obj = driver.findElement(By.id("keepLoggedInLabel"));

			Actions action = new Actions(driver);
			action.moveToElement(obj).perform();
		}

}
