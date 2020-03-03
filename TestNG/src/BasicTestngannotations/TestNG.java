package BasicTestngannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG extends TestInitializationandTestTeardown{
	
	@BeforeClass
	public void BeforeClass()
	
	{
		System.out.println("Preconditions for TestNG class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Postconditions for TestNG class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	
	{
		System.out.println("Precondtion for every test case");
	}
	
	@AfterMethod
public void AfterMethod()
	
	{
		System.out.println("Postcondtion for every test case");
	}
	
	
	
	
	

	@Test(priority=1)
	
	public void test()
	
	{
		System.out.println("silver1");
	}
	
@Test(priority=2)
	
	public void test2()
	
	{
		System.out.println("silver2");
	}

@Test (priority=0)

public void test3()

{
	System.out.println("silver3");
	
}

}


//bydefault if the tests in testng are not given any priority it executes in alphabetical order
//if there is no priority it executes before any tests which has priorities explicitly mentioned



