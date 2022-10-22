package oops;

public class ExOFInstance {

	/**
	 * instance Variables
	 */
	int a;
	String name;
	boolean is;

	/**
	 * instance Method
	 */
	public void printAllInstanceVariablesDetails() {
		System.out.println("hi, it's instance Method");
		System.out.println(a + " " + name + " " + is);
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
		ExOFInstance exOFInstance = new ExOFInstance();
		ExOFInstance exOFInstance1 = new ExOFInstance();
		ExOFInstance exOFInstance2 = new ExOFInstance();
		ExOFInstance exOFInstance3 = new ExOFInstance();
	}

}
