package package2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import newpackage.BaseClass;

public class Savn extends BaseClass
{
	public static void main(String[] args) throws AWTException
	{
		driver.get("https://www.saavn.com/");
		Robot r = new Robot();
		WebElement obj = driver.findElement(By.id("search"));
		obj.sendKeys("loveyatri");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ob = driver.findElement(By.xpath("//button[//button[@class=\"play\" and @onclick=\"Analytics.logAndSendEventToGA('album:play-all',['albumid','13644757']);Content.playAllSongs('#loveyatriajourneyoflove-2018', true, 0, true);\"]]"));
		ob.click();
	
}
}