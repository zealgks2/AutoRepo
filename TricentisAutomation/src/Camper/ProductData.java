package Camper;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ProductData extends Navigate{

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Product BeforeClass");
	}
	@AfterClass
	public void AfterClass() 
	
	{
		System.out.println("Product AfterClass");
	}
	
	
}
