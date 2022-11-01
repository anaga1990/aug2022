package strings;

public class ExString3 {
	public static void main(String[] args) {
		String s1 = "naga123";
		String s2 = "NaGA123";
		/*System.out.println(s1.charAt(0));
		char c = s1.charAt(0);
		System.out.println(c);
		int num = s1.compareTo(s2);//97-65 
		System.out.println(num);
		System.out.println(s1.compareToIgnoreCase(s2)); //65 - 
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		*/
		System.out.println(s1.contentEquals(s2));
		
	}

}
