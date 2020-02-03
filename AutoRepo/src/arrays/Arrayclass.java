package arrays;

public class Arrayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating arrays
		String[] str = new String[10];
		//last index of an array is length -1 
		
		
		 str[0]="Hazel"; str[1]="Shashank"; str[2]="Shubhangi"; str[3]="Tijid";
		  str[4]="Abhishek"; str[5]="Gaurav"; str[6]="Sushil"; str[7]="Sumit";
		 str[8]="Komal"; str[9]="Ankita";
		  
		 // System.out.println(str[6]);
		 

		/*for (int i=0; i<10; i++)
		{
			System.out.println(str[i]);
		}*/
		
		
		//enhanced FOR loop below
		 
		 // syntax for ("type of variable -which is the same as type of string" "variable" : "array")
		
		for (String s:str)
		{
			System.out.println(s);
		}
	}

}
