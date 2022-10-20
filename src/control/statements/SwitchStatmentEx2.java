package control.statements;

public class SwitchStatmentEx2 {
	public static void main(String[] args) {
		int a = 20;
		switch (a) {
		case 10 -> System.out.println("10");
		case 20 -> System.out.println("20");
		case 30 -> System.out.println("30");
		case 40 -> System.out.println("40");
		default -> throw new IllegalArgumentException("Unexpected value: " + a);
		}
	}
}
