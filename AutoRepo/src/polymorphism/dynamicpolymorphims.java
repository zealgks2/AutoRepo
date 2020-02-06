package polymorphism;

import Inheritance.*;

public class dynamicpolymorphims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telephone phone = new Mobile();
		phone.calling();
		
		phone = new Telephone();
		
		phone.calling();
		phone = new Smartphone();
		
		phone.calling();
		
		
		//calling of overridden function is resolved at runtime rather than compile time
		
		
		

	}

}
