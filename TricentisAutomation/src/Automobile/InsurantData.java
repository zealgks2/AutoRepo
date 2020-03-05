package Automobile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class InsurantData extends Navigate {
	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Insurant BeforeClass");
	}
	@AfterClass
	public void AfterClass() 
	
	{
		System.out.println("Insurant AfterClass");
	}

}