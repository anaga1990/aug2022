package strings;

public class ExString11 {
	public static void main(String[] args) {
		String s = "01234567890";
		System.out.println(s.replaceAll("0", "naga"));
		System.out.println(s.replaceFirst("0", "n"));//n1234567890
		System.out.println(s.replace("0", "n"));//n123456789n
		s = "NagaAA";
		System.out.println("*****************************");
		System.out.println(s.toLowerCase());//nagaaa
		System.out.println(s.toUpperCase());//NAGAAA
		System.out.println(s);
		
	}
}
