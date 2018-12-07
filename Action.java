package newpackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends BaseClass
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		driver.get("http://localhost/login.do");
		WebElement obj = driver.findElement(By.linkText("actiTIME Inc."));
		
		Actions action = new Actions(driver);
		action.contextClick(obj).perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		driver.quit();
		
		
	}

}
