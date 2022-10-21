package oops;

public class ExOFMethod3 {

	// method overloading : if you have more than one method() with same method name with in the class/in same class,  
	//method name same but 
	//different parameters or different type of Data type for parameters
	public void additionOfTwoValues() {
		//1st method
		int a = 10 + 20;
		System.out.println(a);
	}

	public void additionOfTwoValues(int a , int b) {
		System.out.println("*********************");
	}
	
	public static void main(String[] args) {
		ExOFMethod3 exOFMethod3 = new ExOFMethod3();//object creation
		exOFMethod3.additionOfTwoValues();
		exOFMethod3.additionOfTwoValues(1, 1);
	}


}
