package arrays;

public class LabeledBreak {

	public static void main(String[] args) {
		
		
		temp:
		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=3;c++)
{
	System.out.println(r+" "+c);
}
			
			if (r==2)
			
				break temp;
			
		}
		
		// TODO Auto-generated method stub

	}

}
