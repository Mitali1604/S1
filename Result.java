package newpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Result 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=((TakesScreenshot)driver);
		
		WebElement un = driver.findElement(By.id("identifierId"));
		un.sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(2000);		
		
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		//File f2= new File("D:\\result.png");
		File f2= new File("./Screenshot\\result.png");
		FileUtils.copyFile(f1,f2);
		System.out.println("Done");
		driver.close();
	}

}
