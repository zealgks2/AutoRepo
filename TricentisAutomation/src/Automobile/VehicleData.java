package Automobile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class VehicleData extends Navigate {
	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Vehicle BeforeClass");
	}
	@AfterClass
	public void AfterClass() 
	
	{
		System.out.println("Vehicle AfterClass");
	}

}
