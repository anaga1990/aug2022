package exceptionhandling;

import java.io.IOException;

public class UncheckedExceptions4 {
	public static void main(String[] args) {
		// R.t Exception
		int a = 123;
		int bb = 10;
		try {
			//int c = a/bb;
			//String b = "122adcvff";
			//int i = Integer.valueOf(b);
			int[] data = new int[2];
			data[3]=200;
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code will run"); // this line not executed with Throws
	}
}
