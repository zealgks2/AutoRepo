package AM;

public class TestAccessModAtPackageLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AccessModifiers am = new AccessModifiers();
		
		am.publicFunction();
		//am.privateFunction();
		am.protectedFunction();
		am.noAccessModFunction();
	}

}
