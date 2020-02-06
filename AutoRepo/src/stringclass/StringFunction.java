package stringclass;

public class StringFunction {

	public static void main(String[] args) {
		
		String name ="Silver";
		
		//Length function
		
		System.out.println(name.length());
		
		//CharAt function
		
		System.out.println(name.charAt(3));
		
		//equals function
		
		String name2="sIlver";
		
		System.out.println(name.equals(name2));
		
		//equals ignore case
		
		System.out.println(name.equalsIgnoreCase(name2));
				
		//split function
		
		String name3 = "Silver Silver";
		
		String[] arr = name3.split(" ");
		
		for(String s:arr)

		{
			System.out.println(s);
		}
		
		//substring
		
		System.out.println(name3.substring(7));
		System.out.println(name3.substring(0,6));
		
		//replace
		
		System.out.println(name3.replace(" ", ""));
		
		//trim
		
		String name4 = " Silver ";
		System.out.println(name4);
		System.out.println(name4.trim());
		
		//upper and lower case
		
		String name5 = "SiLvEr";
		System.out.println(name5.toLowerCase());
		System.out.println(name5.toUpperCase());
		
		//
	
		int count=0;
		
		for(int i=0; i<name5.length(); i++)
			
		{
			
			String letter = name5.
			
			
			
			if (letter=="l")
			{
				
				count++;
				System.out.println(count);
			}
			
			
		}
		
		
		

	}

}
