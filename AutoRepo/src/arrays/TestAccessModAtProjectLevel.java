package arrays;

import AM.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

AccessModifiers am = new AccessModifiers();
		
		//am.publicFunction();
		//am.privateFunction();
		//am.protectedFunction();
		//am.noAccessModFunction();
		
		TestAccessModAtProjectLevel pl = new TestAccessModAtProjectLevel();
		
		pl.protectedFunction();
		
	}

}
