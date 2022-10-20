package control.statements;

public class SwitchStatmentEx {
	public static void main(String[] args) {
		int a = 20;
		switch (20) {
		case 10: {

			System.out.println("we are n 10s");
		}
		case 20: {
			System.out.println("we are n 20s");
			break;
		}
		case 30: {

			System.out.println("we are n 30s");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + a);
		}
	}
}
