package Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Tablet 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.id("nav-link-shopall"));
		//Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		//Thread.sleep(1000);
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Tablets']"));
		//Thread.sleep(1000);
		action.moveToElement(ele).moveToElement(ele2).moveToElement(ele3).click().build().perform();
		Thread.sleep(2000);
		
		WebElement size = driver.findElement(By.xpath("//img[@alt='10inch']"));
		size.click();
		Thread.sleep(2000);
		WebElement tab = driver.findElement(By.xpath("//img[@alt='Apple iPad(6th Gen) Tablet (9.7 inch, 32GB, Wi-Fi), Space Grey']"));
		tab.click();
		Thread.sleep(1000);
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		Thread.sleep(1000);
		WebElement proceed = driver.findElement(By.id("hlb-ptc-btn-native"));
		proceed.click();
		WebElement createAcc = driver.findElement(By.id("createAccountSubmit"));
		createAcc.click();
		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();
		
		WebElement error = driver.findElement(By.xpath("//div[@class='a-alert-content']"));
		String text = error.getText();
		System.out.println(text);
		
		Assert.assertEquals("Enter your name", true);
		Assert.assertEquals("Enter your mobile number", true);
		Assert.assertEquals("Enter your password", true);
		
	}

}
