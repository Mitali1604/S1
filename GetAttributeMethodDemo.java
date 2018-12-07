package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetAttributeMethodDemo extends BaseClass 
{

	public static void main(String[] args) 
	{
		driver.get("http://localhost/login.do");
		
		WebElement checkBoxObj = driver.findElement(By.id("keepLoggedInCheckBox"));
		String actualToolTipMsg = checkBoxObj.getAttribute("title");
		System.out.println("Actual tool tip msg: "+actualToolTipMsg);
		String expToolTipMsg ="Do not select if this computer is shared";
		
		if(actualToolTipMsg.equals(expToolTipMsg))
		{
			System.out.println("Message is correct");
		}
		else
		{
			System.out.println("Message is invalid");
		}
		driver.close();
	}

}
