package package2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File destFile= new File("./screenshot/fb.png");
		FileUtils.copyFile(f1, destFile);
		System.out.println("Done");
		
		
		//File f1 = ts.getScreenshotAs(OutputType.FILE);
		
		//File destFile = new File("./screenshots/fb.png");
		
		//FileUtils.copyFile(f2, destFile);
		
	}

}
