package Exception;

import Constructor.Cars;

public class ExceptionHandling3 {

	public static Cars car;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			
			System.out.println(10/2);
			
			String str = "Silver";
			System.out.println(str.charAt(3));
			car.features();

		}
		catch (ArithmeticException e) 
		
		
		{
			
			System.out.println(e.getMessage());
		}
	
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		
		catch (Exception e)
		
		{
	System.out.println(e.getMessage());
		}
	}

}
