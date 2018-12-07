package session;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptop 
{
	public static void main(String[] args) 
	{
		//setting the path for chrome driver executable file
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launching chrome driver
		WebDriver driver = new ChromeDriver();
		//providing implicit wait for the browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//statement to maximize the browser window
		driver.manage().window().maximize();
		//statement to direct to datatables.com
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptops");
		search.sendKeys(Keys.ENTER);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int noOfLinks = allLinks.size();
		System.out.println("No. of Links: "+noOfLinks);
		
		for(int i=1; i<noOfLinks; i++)
		{
			System.out.println(allLinks.get(i).getAttribute("href"));
			System.out.println(allLinks.get(i).getText());
		}
		
		System.out.println("Test pass");
		driver.close();
	}

}
