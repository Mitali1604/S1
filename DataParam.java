package testnggg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParam 
{
	@Parameters({"city","area"})
	@Test
	public void dataParameters(String city, String area)
	{
		System.out.println(city+":"+area);
	}
}
