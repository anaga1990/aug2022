package exceptionhandling;

import java.io.IOException;

public class UncheckedExceptions3 {
	public static void main(String[] args) {
		// R.t Exception
		int a = 123;
		int bb = 10;
		try {
			int c = a/bb;
			String b = "122adcvff";
			int i = Integer.valueOf(b);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code will run"); // this line not executed with Throws
	}
}
