package session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Exceptions 
{
	public static void main(String[] args) 
	{
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
	}

}
