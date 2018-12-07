package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetTagNameMethodDemo extends BaseClass
{
	public static void main(String[] args) 
	{
		driver.get("http://localhost/login.do");
		WebElement viewLicenseLinkObj = driver.findElement(By.id("licenseLink"));
		String actualTagName =viewLicenseLinkObj.getTagName();
		System.out.println("Actual tagname: "+actualTagName);
		
		if(actualTagName.equals("a"))
		{
			System.out.println("View license is a link");
			viewLicenseLinkObj.click();
		}
		else
		{
			System.out.println("View License is not a link");
		}
		driver.close();
	}

}
