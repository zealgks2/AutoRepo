package functions;

public class NonStaticFunctions {

	
	public static void main(String[] args) {
		
		
		//sum(10,20);// non static function ,need an object to call 
		
		NonStaticFunctions nfs = new NonStaticFunctions();
		
		int sum = nfs.sum(2, 3);
		System.out.println(sum);
	}
	
	//static functions can only call static functions and variables
	//to call non static function , user has to create an object of that class
	
	//object is an instance of an class
	
	public int sum(int a, int b)
	{
		return a+b;
		
	}
	
}
