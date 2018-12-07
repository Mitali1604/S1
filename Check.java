package package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//opening https://spicejet.com in the driver
		driver.get("http://spicejet.com");
		//selecting the RoundTrip
		WebElement roundEle=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		roundEle.click();
		//Finding the Origin and passing to the WebElement
		WebElement oriEle = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		oriEle.click();
		//Selecting the Origin
		WebElement oriSel=driver.findElement(By.xpath("//a[@value='MAA']"));
		oriSel.click();
		//Finding the Destination and passing to the WebElement
		WebElement destEle=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		destEle.click();
		//Selecting the Destination
		WebElement destSel=driver.findElement(By.xpath("(//a[@value='BLR'])[2]"));
		destSel.click();
		//selecting the Journey From Date
		WebElement fromCalEle=driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[4])[2]"));
		fromCalEle.click();
		//Finding the Return Date Calendar and passing to the WebElement
		WebElement returnDateEle=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
		returnDateEle.click();
		//Selecting the Return date
		WebElement toCalEle=driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[6])[1]"));
		toCalEle.click();
		//finding the passengers and passing to the WebElement
		WebElement passEle=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passEle.click();
		//Selecting the Adult Passengers
		WebElement adultEle=driver.findElement(By.xpath("(//*[@class='pax-add pax-enabled'])[1]"));
		adultEle.click();
		//confirming the passengers selection
		WebElement doneEle=driver.findElement(By.xpath("//input[@id='btnclosepaxoption']"));
		doneEle.click();
		//Finding the currency dropdown and passing to the WebElement
		WebElement currEle=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		currEle.click();
		//selecting the Currency from the dropdown
		Select currSelect=new Select(currEle);
		currSelect.selectByVisibleText("USD");
		Thread.sleep(3000);
		//Finding on the Search button and passing to the WebElement
		WebElement searchEle=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']"));
		searchEle.click();
	}

}
