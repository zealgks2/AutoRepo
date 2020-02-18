package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

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
		
		
	for (String s : set)
	{
		System.out.println(s);
	}
	System.out.println("silversilversilversilversilversilversilversilversilver");	
		
	

	
	set = new LinkedHashSet<>(); //output in order of insertion
	set.add("xyz");
	set.add("abc");
	set.add("abc");
	set.add("def");
	set.add("ghi");
	set.add("abc");
	set.add("def");
	
	for (String s : set)
	{
		System.out.println(s);
	}
	System.out.println("silversilversilversilversilversilversilversilversilver");	
		
	set = new TreeSet<>();//output in sorted ascending order manner
	set.add("xyz");
	set.add("abc");
	set.add("abc");
	set.add("def");
	set.add("ghi");
	set.add("abc");
	set.add("def");
	
	for (String s : set)
	{
		System.out.println(s);
	}
	System.out.println("silversilversilversilversilversilversilversilversilver");	
		

	}
}
