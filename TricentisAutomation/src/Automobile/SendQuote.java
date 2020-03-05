package Automobile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SendQuote extends Navigate{

	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Quote BeforeClass");
	}
	@AfterClass
	public void AfterClass() 
	
	{
		System.out.println("Quote AfterClass");
	}
	
}
