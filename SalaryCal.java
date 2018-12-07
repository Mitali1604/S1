package session;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalaryCal 
{
	public static void main(String[] args) throws InterruptedException 
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
				driver.get("https://datatables.net/");
				
				int totalSalary = 0;
				//to iterate through all the pages and fetch no. of rows
				for(int i=1; i<=6;i++)
				{
					List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
					int noOfRows = rows.size();
					//to iterate through each name of each page and fetch salary
					for(int j=1; j<=noOfRows; j++)
					{
						Thread.sleep(1000);
						WebElement nameEle = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]"));
						nameEle.click();
						WebElement salEle = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[1]/descendant::span[2]"));
						String sal = salEle.getText();
						sal = sal.replace("$","").replace(",","");
						int salary = Integer.parseInt(sal);
						nameEle.click();
						totalSalary = totalSalary + salary;
					}
					driver.findElement(By.id("example_next")).click();
					}
					
			System.out.println("Total salary is = "+totalSalary);
			driver.quit();
	}

}
