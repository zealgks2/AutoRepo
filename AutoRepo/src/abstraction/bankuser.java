package abstraction;

public class bankuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rbiinterface bank1 = new hdfc();
		
		bank1.credit();
		bank1.debit();
		bank1.savingacc();
		bank1.curracc();
		
	
		
		
		
		
	}

}
