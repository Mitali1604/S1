package newpackage;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySel {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",".\\drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");

		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	
	Thread.sleep(2000);
    System.out.println(driver.getTitle());
    
    driver.quit();
	
}
}