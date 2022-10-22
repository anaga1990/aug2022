package oops;

public class ExOfStaticAndInstance {
	//static variable
	//static method
	//static block
	
	/**
	 * Its Static Variables
	 */
	static int as; // default value = 0
	static String names ; // default value = null
	static boolean isOks; // default value = false
	
	
	/**
	 * Its Static method
	 */
	public static void getDetails() {
		System.out.println("we are in Static method");
	}
	
	
	/**
	 * Its Static block
	 */

	static {
		System.out.println("we are in Static block");
		as = 10;
		names = "nagarjuna";
		isOks = true;
		getDetails();
		System.out.println("Static ==>"+as + " "+names +" "+isOks);
	}
	
	/**
	 * instance Variables
	 */
	int a = 20;
	String name = "nag";
	boolean is = true;

	/**
	 * instance Method
	 */
	public void printAllInstanceVariablesDetails() {
		System.out.println("hi, it's instance Method");
		System.out.println("instance ==>"+a + " " + name + " " + is);
	}

	/**
	 * instance block
	 */
	{
		System.out.println("hi, it's instance block");
		printAllInstanceVariablesDetails();
		a = 2000;
		name = "jkqsb";
		printAllInstanceVariablesDetails();
		System.out.println("**********************************");
	}
	
	public static void main(String[] args) {
		ExOfStaticAndInstance exOFInstance = new ExOfStaticAndInstance();
		ExOfStaticAndInstance exOFInstance1 = new ExOfStaticAndInstance();
	}
}
