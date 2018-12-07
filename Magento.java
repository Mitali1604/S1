package session;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento 
{
	public static void main(String[] args) 
	{	//setting the path for chrome driver executable file
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launching chrome driver
		WebDriver driver = new ChromeDriver();
		//providing implicit wait for the browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//statement to maximize the browser window
		driver.manage().window().maximize();
		//statement to direct to magento.com
		driver.get("https://magento.com/");
					driver.findElement(By.xpath("//span[text()='Account']/ancestor::a")).click();
					driver.findElement(By.xpath("//button[@type='button']")).click();
		WebElement fn = driver.findElement(By.id("firstname"));//address of fistname textbox
		fn.sendKeys("Ram");//entering text to the field using sendKeys() method
		WebElement ln = driver.findElement(By.id("lastname"));
		ln.sendKeys("Shyam");
		
		WebElement ml = driver.findElement(By.id("email_address"));
		ml.sendKeys("ram@gmail.com");
				
		WebElement pass = driver.findElement(By.id("password"));	
		pass.sendKeys("welcome123");
		
		WebElement cpass = driver.findElement(By.id("confirmation"));
		cpass.sendKeys("welcome123");
		
		driver.findElement(By.id("agree_terms")).click();//clicking on the I agree checkbox
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		System.out.println("Done Automating");//finally end of the program
	}
}
