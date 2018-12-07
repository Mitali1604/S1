package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import newpackage.BaseClass;

public class WebElementDemo1 extends BaseClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		driver.get("http://localhost/login.do");
		WebElement unTb = driver.findElement(By.id("username"));
		Boolean displayed = unTb.isDisplayed();
		
		if(displayed)
		{
			System.out.println("Username textbox is displayed");
		}
		else
		{
			System.out.println("Username textbox is not displayed");
		}
       Boolean enable = unTb.isDisplayed();
		
		if(enable)
		{
			System.out.println("Username textbox is enable");
			unTb.sendKeys("admin");
			Thread.sleep(3000);
		}
		else
		{
			System.out.println("Username textbox is not enabled");
		}
		unTb.clear();
		
		Point p = unTb.getLocation();
		int unXcor = p.getX();
		Dimension d = unTb.getSize();
		int unHeight = d.getHeight();
		int unWidth = d.getWidth();
		
		WebElement pwdTb = driver.findElement(By.name("pwd"));
		int pwdXcor = pwdTb.getLocation().getX();
		int pwdHeight = pwdTb.getSize().getHeight();
		int pwdWidth = pwdTb.getSize().getWidth();
		
		if(unXcor==pwdXcor && unHeight==pwdHeight && unWidth==pwdWidth)
		{
			System.out.println("Username and password Textbox are alligned");
		}
		else
		{
			System.out.println("Username and password Textbox are NOT alligned");
		}
		System.out.println("Xcordinate are :"+unXcor+"=="+pwdXcor);
		System.out.println("Heights are :"+unHeight+"=="+pwdHeight);
		System.out.println("Widths are :"+unWidth+"=="+pwdWidth);
		
		driver.close();
	}

}
