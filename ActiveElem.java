package newpackage;

import org.openqa.selenium.Keys;

public class ActiveElem extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("Top 5 e-commerce site");
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
//U+2764  ♡ ♡ ♡ ♡