package strings;

public class ExString9 {
	public static void main(String[] args) {
		String s = "01234567890";
		System.out.println(s.lastIndexOf('0'));
		System.out.println(s.lastIndexOf("2345"));
		System.out.println(s.lastIndexOf('0', 9));
		System.out.println(s.lastIndexOf("0", 9));
	}
}
