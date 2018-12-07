package package2;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelProg {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".\\drivers/geckodriver.exe");

 
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		driver.getTitle();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		String title=driver.getTitle();
		Thread.sleep(3000);

		System.out.println("The title of the page is "+title);
		
		driver.navigate().back();
		Thread.sleep(3000);

		String title2=driver.getTitle();
		System.out.println("Current title of the page is "+title2);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		String title3=driver.getTitle();
		System.out.println("Now the page is directed to "+title3);
		
		driver.navigate().refresh();
		driver.close();
		
	}

}
