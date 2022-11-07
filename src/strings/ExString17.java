package strings;

public class ExString17 {
	public static void main(String[] args) {
		String fullname = "fullnameSwathi annabathina";
		
		String s = fullname.substring(8);
		System.out.println(s);
		String firstName=s.split(" ")[0];
		System.out.println(firstName);
		
		String[] firstName1=s.split(" ");
		System.out.println(firstName1[0]);
		
	}
}
