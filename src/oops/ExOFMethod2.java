package oops;

public class ExOFMethod2 {

	// method overloading : if you have more than one method() with same method name with in the class/in same class,  
	//method name same but 
	//different parameters or different type of Data type for parameters
	public void additionOfTwoValues() {
		//1st method
		int a = 10 + 20;
		System.out.println(a);
	}

	public void additionOfTwoValues(short a , short b) {
		//7th method
		System.out.println("7th method");
		int sum = a+b;
		System.out.println(sum);
	}
	
	public int additionOfTwoValues(long firstNumber , int lastNumber) {
		//3rd method
		System.out.println("3rd method");
		long sum = firstNumber+lastNumber;
		System.out.println(sum);
		return 20;
	}
	
	public int additionOfTwoValues(int firstNumber , long lastNumber) {
		//8th method
		System.out.println("8th method");
		long sum = firstNumber+lastNumber;
		System.out.println(sum);
		return 20;
	}
	
	public long additionOfTwoValues(long firstNumber , long lastNumber) {
		//4th method
		System.out.println("4th method");
		long sum = firstNumber+lastNumber;
		System.out.println(sum);
		return sum;
	}
	
	public void additionOfTwoValues(int a) {
		//5th method
		System.out.println("5th method");
		System.out.println(a);
	}
	
	public void additionOfTwoValues(String s1, String s2) {
		//6th method
		System.out.println(s1+s2);
	}
	
	public void Mone(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ExOFMethod2 exOFMethod2 = new ExOFMethod2();//object creation
		exOFMethod2.additionOfTwoValues();
		exOFMethod2.additionOfTwoValues(10L, 12);
		exOFMethod2.additionOfTwoValues("naga","rjuna");
	}


}
