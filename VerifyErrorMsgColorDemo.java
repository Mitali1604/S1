package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import newpackage.BaseClass;

public class VerifyErrorMsgColorDemo extends BaseClass
{
	public static void main(String[] args) 
	{
		driver.get("http://localhost/login.do");
		//Click  on login button-- click() method
		driver.findElement(By.xpath("//div[text()='Login '}")).click();
		//verify the error msg is displayed or not-- isDisplayed() method
		String xpath = "//spam[contains(text(),'invalid')]";
		WebElement errMsgObj = driver.findElement(By.xpath(xpath));
		boolean displayed = errMsgObj.isDisplayed();
		
		if(displayed)
		{
			System.out.println("Error msg is displayed");
		}
		else
		{
			System.out.println("Msg not displayed");
		}
		//verify the error msg is in RED clr-- getCSSValue() method
		String actualColorValue = errMsgObj.getCssValue("color");
		System.out.println("Before: actual clr val: "+actualColorValue);
		String ColorAsHex = Color.fromString(actualColorValue).asHex();
		
		if(ColorAsHex.equals("#ce0100"))
		{
			System.out.println("Valid clr:RED");
		}
		else
		{
			System.out.println("Invalid clr");
		}
		driver.close();
	}
	

}
