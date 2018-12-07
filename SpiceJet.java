package session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//setting the path for chrome driver executable file
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//launching chrome driver
				WebDriver driver = new ChromeDriver();
				//providing implicit wait for the browser
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//statement to maximize the browser window
				driver.manage().window().maximize();
				//statement to direct to magento.com
				driver.get("https://www.spicejet.com/");
				//selecting round trip radio button and clicking on it
				WebElement rtrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
				rtrip.click();
				//writing chennai in source box
				WebElement src =driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
				src.sendKeys(("Chennai"));
				Thread.sleep(1000);
				//writing bengaluru in destination box
				driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Begaluru");
				//selecting dates
				driver.findElement(By.xpath("//*[@class=\"ui-datepicker-group ui-datepicker-group-last\"]/table/tbody/tr[2]/td[4]/a")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
				driver.findElement(By.xpath("//*[@class=\"ui-datepicker-group ui-datepicker-group-last\"]/table/tbody/tr[2]/td[6]/a")).click();
				Thread.sleep(1000);
				
				//Selecting no.of adults
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("hrefIncAdt")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("btnclosepaxoption")).click();			
				Thread.sleep(1000);
				
				WebElement curr = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				curr.click();
				Thread.sleep(1000);
				Select sel = new Select(curr);
				sel.selectByValue("USD");
				
				WebElement submit = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
				submit.click();
				
				//verifying the result
				String title = driver.getTitle();
				System.out.println("Title of the page is "+title);
				
				if(title.equals("Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines"))
				{
					System.out.println("Test Pass");
				}
				else
				{
					System.out.println("Test Fail");
				}
	}

}
