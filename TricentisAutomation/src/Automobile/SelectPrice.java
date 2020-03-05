package Automobile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SelectPrice extends Navigate{

	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Price BeforeClass");
	}
	@AfterClass
	public void AfterClass() 
	
	{
		System.out.println("Price AfterClass");
	}
}
