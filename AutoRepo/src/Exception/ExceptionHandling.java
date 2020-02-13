package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			
			System.out.println(10/0);

		}
		catch (ArithmeticException e) 
		
		
		{
			
			System.out.println(e.getMessage());
		}
		try
		{
			String str = "Silver";
			System.out.println(str.charAt(9));
			
		}
		
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

}

/*
 
Throwable 
->Error
	-StackOverflow
	-JVM related
	-Memory Related
->Exception
	-Checked
		-InterruptedException
		-SQLException
		-IOException
		-FileNotFoundException
	-Unchecked
		-RuntimeException
			-ArithmeticException
			-NullPointerException
			-StringIndexOutOfBounds
			-ArrayIndexOutofBounds
*/