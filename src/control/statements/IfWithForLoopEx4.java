package control.statements;

public class IfWithForLoopEx4 {
	public static void main(String[] args) throws InterruptedException {

		for (long i = 1; i <= 20; i++) {
			if (i == 4)
				continue;
			System.out.println(i);
		}
	}
}
