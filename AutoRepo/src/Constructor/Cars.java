package Constructor;

public class Cars {
	
	String color;
	String model;
	
	String wheels;
	
	public void features()
	{
		System.out.println("Your "+wheels+" wheeler "+model+" now comes in the new "+color+" SE color.");
		
	}
	
	public Cars()
	{
	
	}
	
	public Cars(String color , String model, String wheel)
	{
		this.color=color;
		this.model=model;
		this.wheels=wheel;
	}
}
