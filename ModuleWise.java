package testnggg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModuleWise 
{
	@Test(priority = 1, groups= {"user","smoke"})
	public void createUser()
	{
		Reporter.log("Create User",true);
	}
	@Test(priority = 2, groups= {"user","regression"})
	public void editUser()
	{
		Reporter.log("Edit User",true);
	}
	@Test(priority = 3, groups= {"user","regression"})
	public void deleteUser()
	{
		Reporter.log("Delete User",true);
	}
	@Test(priority = 1, groups= {"product","smoke"})
	public void createProd()
	{
		Reporter.log("Create Product",true);
	}
	@Test(priority = 2, groups= {"product","regression"})
	public void editProd()
	{
		Reporter.log("Edit prod",true);
	}
	@Test(priority = 3, groups= {"product","regression"})
	public void deleteProd()
	{
		Reporter.log("delete product",true);
	}
	
}
