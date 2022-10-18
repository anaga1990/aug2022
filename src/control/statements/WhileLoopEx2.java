package control.statements;

public class WhileLoopEx2 {
	public static void main(String[] args) {
		int startingNumber = 10;
		int endingNumber = 1;
		while (startingNumber >= endingNumber) {//11>=1 = true
			System.out.println(startingNumber);
			startingNumber--;
		}
		System.out.println("rest of the code running...");
	}
}
