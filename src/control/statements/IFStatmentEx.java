package control.statements;

public class IFStatmentEx {
	public static void main(String[] args) {
		String today = "monDaY";
		if (today.equalsIgnoreCase("Monday") || today.equalsIgnoreCase("Tuesday") || today.equalsIgnoreCase("Wednesday")
				|| today.equalsIgnoreCase("Thursday") || today.equalsIgnoreCase("Friday")) {
			System.out.println("Its week day");
		}else if(today.equalsIgnoreCase("Saturday") || today.equalsIgnoreCase("Sunday")) {
			System.out.println("its weekend day");
		}else {
			System.out.println("its not Week or Weekend");
		}
		
	}
}
