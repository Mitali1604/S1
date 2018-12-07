package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass
	{
	static
	{

	System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

	}
	//public static WebDriver driver = new FirefoxDriver();
	public static WebDriver driver = new ChromeDriver();

	
}