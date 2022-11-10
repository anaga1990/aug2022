package exceptionhandling;

public class Ex_Try_With_Finally {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 20;
			String bb = "122adcvff";
			System.out.println("before Integer.valueOf");
			int i = Integer.valueOf(bb);//number format
			System.out.println("after Integer.valueOf");
			int c = a + b;
			int d = a - b;
			int e = a * b;
			System.out.println("last line of Try block");
		}finally {
			System.out.println("we are in Finally balock");
		}
		System.out.println("code continue....");
	}
}
