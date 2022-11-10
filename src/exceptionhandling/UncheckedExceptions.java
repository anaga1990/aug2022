package exceptionhandling;

public class UncheckedExceptions {
	public static void main(String[] args) throws ArithmeticException {
		// R.t Exception
		int a = 123;
		int c = a/0;
		System.out.println("rest of the code will run"); // this line not executed with Throws
	}
}
