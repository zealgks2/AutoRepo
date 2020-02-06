package abstraction;

public abstract class MSword {

	

		//Abstraction is the mechanism to hide the implementation and expose only the functionality
		
		/* two ways to achieve Abstraction in java 
			- by using abstract keyword
			- by using interface */
		public abstract void write();
		
//In case of classes the abstract method can only exist in abstract classes not in a concrete class
		
// when a class is abstract , it cannot be initialized i.e object cannot be created
		
// when a method is abstract , the method body cannot be defined
		
		// If a class is abstract it is not necessary to have any abstract methods
		
		public abstract void save();
		public abstract void image();
		public abstract void copy();
		public abstract void delete();
		public abstract void layout();
		
		
		
		
		
		
	}


