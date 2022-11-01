package strings;

public class ExString2 {
	public static void main(String[] args) {
		String s1 = "naga123";
		String s2 = "NaGA123";
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		s1 =s2.concat(s2);
		System.out.println(s1);
		
		String ss = "hi ANABATHINA, how are doing" ;
		System.out.println(ss.contains("ANABATHINA"));
	}

}
