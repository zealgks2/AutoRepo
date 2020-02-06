package Inheritance;


public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telephone ph = new Telephone();
		
		ph.calling();
		
		Mobile mob = new Mobile ();
		
		mob.calling();
		mob.texting();
		
		Smartphone s =  new Smartphone(); 
		
		s.calling();
		s.texting();
		s.internet();
		
		
		
	

	}

}
