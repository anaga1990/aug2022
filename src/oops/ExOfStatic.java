package oops;

public class ExOfStatic {
	//static variable
	//static method
	//static block
	
	/**
	 * Its Static Variables
	 */
	static int a; // default value = 0
	static String name ; // default value = null
	static boolean isOk; // default value = false
	
	
	/**
	 * Its Static method
	 */
	public static void getDetails() {
		System.out.println("we are in Static method");
	}
	
	public static void getDetails(int a) {
		System.out.println("we are in Static method");
	}
	
	/**
	 * Its Static block
	 */
	static {
		System.out.println("we are in Static block1");
		System.out.println(a + " "+name +" "+isOk);
	}
	
	static {
		System.out.println("we are in Static block2");
		a = 10;
		name = "nagarjuna";
		isOk = true;
	}
	
	static {
		System.out.println("we are in Static block3");
		getDetails();
		System.out.println(a + " "+name +" "+isOk);
	}
	
	public static void main(String[] args) {
		getDetails();
		//ExOfStatic exOfStatic = new ExOfStatic();
		//ExOfStatic exOfStatic1 = new ExOfStatic();
	}
}
