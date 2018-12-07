package package2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import newpackage.BaseClass;

public class WebElementDemo extends BaseClass
	{
	public static void main(String[] args) throws InterruptedException
		{
		//http://localhost/login.do
		driver.get("http://localhost/login.do");
		 WebElement unTB=driver.findElement(By.id("username"));
		 boolean displayed = unTB.isDisplayed();
		 if(displayed)
		 {
			 System.out.println("UserName textbox is displayed");
		 }
		 else
		 {
			 System.out.println("UserName textbox is not displayed");
		 }
		driver.close(); 
	}

}
