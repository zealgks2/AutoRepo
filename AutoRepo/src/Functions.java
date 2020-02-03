
public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition();
		
		int c = addition2(2, 45);
		
		System.out.println(c);
		
		
		
		
		String naming = namecall("Name1 ");
		System.out.print(naming);
		int age = age(57);
		System.out.print("and your age is "+age);
		
		float percent = percent(45,55,65,75,85);
		
		System.out.println(" and your percentage is "+percent);
		
	}
public static void addition()
{
	int a =10;
	int b=20;
	
	System.out.println(a+b);
}

public static void addition(int a, int b)
{
	System.out.println(a+b);
}

public static int addition2(int a, int b)

{
	return a+b;
	
}
public static String namecall(String names)
{
	return "Your name is "+ names;
	
}

public static int age (int a)
{
 return a;
}

public static float percent(float a,float b,float c,float d, float e)
{
	
	return ((a+b+c+d+e)/500)*100;

}

}


// if the function is a part of other class then function can be called as classname.function()

//method overloading is static Polymorphism
//method overloading is only possible when number of parameters , data type is different