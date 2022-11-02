package strings;

public class ExString10 {
	public static void main(String[] args) {
		String s = "01234567890";
		System.out.println(s.length());
		System.out.println(s.replace('0', 'n'));
		System.out.println(s.replace("0", "naga"));
		s = s.replace("0", "naga");
		System.out.println(s);
		
		
	}
}
