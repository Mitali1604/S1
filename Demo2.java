package testnggg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test(priority=0)
	public void createUser()
	{
		Reporter.log("Create User", true);
	}
	@Test(priority=2, invocationCount=2, enabled=false)
	public void editUser()
	{
		Reporter.log("Edit user", true);
	}
	@Test(priority=0)
	public void deleteUser()
	{
		Reporter.log("Delete user", true);
	}
}
