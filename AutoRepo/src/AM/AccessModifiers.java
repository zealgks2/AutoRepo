package AM;

public class AccessModifiers {

	public static void main(String[] args) {
		
		/*there are 4 access modifiers : public , private , protected , NoAccessModifier
		
		 TODO Auto-generated method stub
		
		
		Public -> can be accessed throughout the project 
		
		Private -> within the class only 
		
		Default or No Access Modifier -> can be accessed throughout the package (only till the package)
		
		Protected -> can be accessed throughout the package 
		and by using child class can be accessed throughout the project */
	
	
	
		AccessModifiers am = new AccessModifiers();
		
		am.publicFunction();
		am.privateFunction();
		am.protectedFunction();
		am.noAccessModFunction();//Default access modifier
		
	
	}
		
		
		public void publicFunction()
		{
			System.out.println("Extrovert - Iam public");
		}
		
		private void privateFunction()
		{
			System.out.println("Introvert - I am private");
		}
		
		void noAccessModFunction()
		{
			System.out.println("Animal - I have no modifier");
		}
		
		protected void protectedFunction()
		
		{
			System.out.println("Ambivert - I am protected");
		}
		
		


}
