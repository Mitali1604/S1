package Assessment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		WebElement entryEle = driver.findElement(By.name("example_length"));
		Select sel = new Select(entryEle);
		sel.selectByValue("50");
		
		for(int i=1; i<=2;i++)
		{
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
			int noOfRows = rows.size();
			//to iterate through each name of each page and fetch salary
			for(int j=1; j<=noOfRows; j++)
			{
				WebElement ageElem = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[4]"));
				String age = ageElem.getText();
				WebElement nameEle = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]"));
				nameEle.click();
				nameEle.getText();
				WebElement salEle = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[1]/descendant::span[2]"));
				String sal = salEle.getText();
				nameEle.click();
				if (age.equals("50") && sal.equals("$200,000"))
				{
					System.out.println(nameEle);
					System.out.println("Age of person is:"+age);
					System.out.println("Salary of the person:"+sal);
				}
			}
			driver.findElement(By.id("example_next")).click();	
		}
		driver.close();
		System.out.println("Test pass");
		
	}

}
