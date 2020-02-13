package Exception;

import functions.*;

public class CheckedException {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		
		//static functions are always called using class name 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Functions.addition();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//we use throws keyword to pass the information of checked exceptions to the next user
		
	}

}
