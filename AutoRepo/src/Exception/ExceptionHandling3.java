package Exception;

import Constructor.Cars;

public class ExceptionHandling3 {

	public static Cars car;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			
			System.out.println(10/2);
			
			Thread.sleep(3000);
			
			String str = "Silver";
			System.out.println(str.charAt(9));
			car.features();

		}
		
		
		catch (Exception e)
		
		{
	System.out.println(e.getMessage());
		}
	}

	
	
	//use multiple try and blocks when there are independent statements to be executed
	//User single try and multiple catch when there are interdependent statements to be executed
}
