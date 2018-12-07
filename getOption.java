package newpackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import newpackage.BaseClass;

public class getOption extends BaseClass
{

	public static void main(String[] args) 
	{
		driver.get("file:///C:/Users/DELL/Desktop/idli.html");
		WebElement elemObj = driver.findElement(By.id("mtr"));
		
		Select s = new Select(elemObj);
		
		List<WebElement> allOptions = s.getOptions();
		s.selectByIndex(0);
		s.selectByValue("d");
		List<WebElement> allSelectOpt = s.getAllSelectedOptions();
		
		System.out.println("Size of the list box: "+allOptions.size());
		
		System.out.println("No of selected options: "+allSelectOpt.size());
		
		for(WebElement option: allOptions)
		{
			String s1 = option.getText();
			System.out.println("Names of the element:"+s1);
			
		}
		
		
		
		
		 
	}

}
