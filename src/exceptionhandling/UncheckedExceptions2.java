package exceptionhandling;

import java.io.IOException;

public class UncheckedExceptions2 {
	public static void main(String[] args) {
		// R.t Exception
		int a = 123;
		int bb = 10;
		try {
			int c = a/bb;
			String b = "122adcvff";
			int i = Integer.valueOf(b);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code will run"); // this line not executed with Throws
	}
}
