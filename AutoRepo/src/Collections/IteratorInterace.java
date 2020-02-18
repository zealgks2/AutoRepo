package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorInterace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set<String> set = new HashSet<>(); //output random order
		
		set.add("xyz");
		set.add("abc");
		set.add("abc");
		set.add("def");
		set.add("ghi");
		set.add("abc");
		set.add("def");
		
		
	Iterator<String> it = set.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}
