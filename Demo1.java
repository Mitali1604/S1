package testnggg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void createUser()
	{
		Reporter.log("Create user in both the places", true);
	}
}
