package exceptionhandling;

import java.io.FileNotFoundException;

public class B extends A {
	public void dummy_B() throws ArithmeticException{
		System.out.println("B class dummy_B()");
	}
	public static void main(String[] args) throws FileNotFoundException  {
		B b = new B();
		b.dummy_A();
	}
	
	@Override
	public void dummy_A(int a) {
		try {
			super.dummy_A(a);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
