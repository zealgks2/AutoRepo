package BasicTestngannotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Dependsonmethod extends TestInitializationandTestTeardown{


	@BeforeClass
	public void BeforeClass()
	
	{
		System.out.println("Preconditions for dependensonMethod class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Postconditions for dependensonMethod class");
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
	
@Test
	
	public void login()
	
	{
		System.out.println("login");
	
	}
	
@Test (dependsOnMethods= {"login"})
	
	public void homepage()
	
	{
		System.out.println("home");
	}

@Test (dependsOnMethods= {"login","homepage"})

public void logout()

{
	System.out.println("logout");
	
}

}
/* Anotations 
 
 BeforeSuite
 BeforeClass
 beforeTest
 BeforeMethod
 Test
 AfterSuite
 AfterClass
 AfterTest
 AfterMethod
 
*/