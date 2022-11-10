package exceptionhandling;

import java.io.FileNotFoundException;

public class A {
	public void dummy_A() throws FileNotFoundException{
		System.out.println("i am in A class");
	}
	
	public void dummy_A(int a) throws FileNotFoundException{
		System.out.println("i am in A class dummy_A(int)");
	}
}
