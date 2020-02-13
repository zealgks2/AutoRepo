package Exception;

import Constructor.Cars;

//Unchecked exceptions are not checked by Compilers


public class ExceptionType1 {
	
	public static Cars car;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(10/2);
		
		//exception1 :Arithmetic exception
		
		//System.out.println(10/0);
		
		/*
		 Exception in thread "main" 5
java.lang.ArithmeticException: / by zero
	at Exception.ExceptionType1.main(ExceptionType1.java:11)
		 
		 */
		
		//exception2 : Array Index Out of Bounds
		
		String name = "Silver";
		
		//System.out.println(name.charAt(8));
		
		/*
		 
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 8
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:709)
	at Exception.ExceptionType1.main(ExceptionType1.java:26)
		 */
		
		//exception3 : Null pointer
		
		//whenever an object is not initialized then its reference points to null
		
		
		car.features();
		
		/*
		 Exception in thread "main" java.lang.NullPointerException
	at Exception.ExceptionType1.main(ExceptionType1.java:45)
		 */
		
	}
	
	
	

}
