package newpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class frame extends BaseClass 
{
	public static void main(String[] args) 
	{
		driver.get("file:///C:/Users/DELL/Desktop/Q/p2.html");
		driver.switchTo().frame(0);
		
		WebElement obj = driver.findElement(By.id("t1"));
		obj.sendKeys("Welcome To");
		driver.switchTo().defaultContent();
		
		WebElement obj1 = driver.findElement(By.id("t2"));
		obj1.sendKeys("AcadGild");
	}
}
