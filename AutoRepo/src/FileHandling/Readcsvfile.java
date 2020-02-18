package FileHandling;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Readcsvfile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
	
		Scanner sc = new Scanner(new File("/Users/apollozealot/Documents/AutoRepo/AutoRepo/AutoRepo/src/FileHandling/SampleData.csv"));
	
	sc.useDelimiter(",");
	
	while(sc.hasNext())
	{
		System.out.print(sc.next()+" ");
	}
	
	sc.close();
	}
/*
 * Go to selenium folder. 3
 * 
 */
	
	
	
}
