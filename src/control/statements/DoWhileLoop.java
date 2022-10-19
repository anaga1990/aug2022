package control.statements;

public class DoWhileLoop {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int c = 20;
		do {
			a--;
			System.out.println(a);
		} while (a > b && b < c);
		System.out.println("rest of the code");
	}
}
