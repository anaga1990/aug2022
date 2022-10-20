package control.statements;

public class SwitchStatmentEx3 {
	public static void main(String[] args) {
		String today = "Monday";
		switch (today) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("its week day");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("its weekend day");
			break;
		default:
			System.out.println("its not Week or Weenend");
			break;
		}
	}
}
