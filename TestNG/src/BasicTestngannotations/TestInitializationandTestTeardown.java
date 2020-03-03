package BasicTestngannotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestInitializationandTestTeardown extends Suiteinitializationandtestteardown{

	@BeforeTest
	public void autombiletestInitialization()
	{
		System.out.println("Execute preconditions of Automobile Module");
	}
	@AfterTest
	public void automobileTestTeardown()
	
	{
		System.out.println("revert back the changes made in initialization part");
	}
	
	
}
