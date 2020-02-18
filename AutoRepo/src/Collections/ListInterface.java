package Collections;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
 

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Object[] arr = new Object[3];
		
		arr[0]="abc";
		arr[1]=true;
		arr[2]=31;*/
	
		//ARRAY LIST
		
		
		List<String> list = new ArrayList<>();
		
		list.add("abc");
		list.add("def");
		
		for (String s : list)
		{
			System.out.println(s);
		}
		
		//VECTOR
		
		list = new Vector<>();
		
		list.add("abc");
		list.add("def");
		
		for (String s : list)
		{
			System.out.println(s);
		}
				
		//LINKED LIST
		
		list = new LinkedList<>();
		
		list.add("abc");
		list.add("def");
		
		for (String s : list)
		{
			System.out.println(s);
		}
		
	}

}
