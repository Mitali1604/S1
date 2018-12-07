package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetTextMethodDemo extends BaseClass
{

	public static void main(String[] args) 
	{
		driver.get("");
		String xp = "//nobr[contains(text(),'actiTIME')]";
		
		WebElement actiTIMEVersionObj = driver.findElement(By.xpath(xp));
		
		String actualProdVersion = actiTIMEVersionObj.getText();
		
		System.out.println("Actual version: "+actualProdVersion);
		
		driver.close();
	}

}
