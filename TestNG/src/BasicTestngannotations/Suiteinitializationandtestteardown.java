package BasicTestngannotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Suiteinitializationandtestteardown {

	@BeforeSuite
	public void suiteInitialization()
	
	{
		System.out.println("Start services");
		System.out.println("Delete log files");
		System.out.println("Deploy");
		System.out.println("Report initialize");
		
		
	}
	@AfterSuite
	public void suiteTeardown()
	{
		System.out.println("Report closing");
		
	}
}
