package control.statements;

public class IfWithForLoopEx {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "  -> is a even number");
			} else if (i % 2 != 0) {
				System.out.println(i + "  -> is a odd number");
			}
		}
	}
}
