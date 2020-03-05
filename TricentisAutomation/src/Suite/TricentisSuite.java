package Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TricentisSuite {

	@BeforeSuite
	public void suiteInitialization()
	
	{
		System.out.println("Start services");
		
		
		
	}
	@AfterSuite
	public void suiteTeardown()
	{
		System.out.println("Close service");
		
	}
	
}
