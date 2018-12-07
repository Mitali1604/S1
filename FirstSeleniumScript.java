package newpackage;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		//in case of chrome driver use this line of code
		System.setProperty("webdriver.chrome.driver",".\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//In case of Firefox driver use this line of code
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.google.co.in");
		
		String title=driver.getTitle();
		System.out.println("The title of the page is "+title);
		
		System.out.println("The current url is "+ driver.getCurrentUrl());
		
		driver.close();
	}

}
