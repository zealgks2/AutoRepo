package Constructor;

public class User {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Cars Mustang = new Cars();
		
		
		//static variables get one single assignment and its global
		
		//non static can get more than one assignment as per the objects and its static
		
		
		Mustang.color="Matt Black";
Mustang.model="Ford Mustang";
Mustang.wheels = "4";

Mustang.features();


Cars slsamg = new Cars();

// in selenium - data liek testpath , url etc can be declared as static

//non static fucntions can be like launch browsers

//we use constructor to initialize the object 
// every class has a default constructor 

slsamg.color="Matt Green";
slsamg.model="Mercedes SLS AMG Coupe";
slsamg.wheels = "4";

slsamg.features();

Cars bmw = new Cars("White","350c","4");
bmw.features();
		
		
	}

}
