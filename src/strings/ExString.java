package strings;

public class ExString {
	public static void main(String[] args) {
		// S.c.p
		String s1 = "naga"; // S.C.P
		String s2 = "naga"; // S.C.P
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//
		String s3 = new String("naga"); // heap memory
		System.out.println(s1 == s3); //== check address of the object creation
		System.out.println(s2 == s3);
		String s4 = new String("A"); // heap memory
		System.out.println(s4 == s3);
		System.out.println("equals()------------------");
		System.out.println(s4.equals(s3)); // equals() will check Right side values same or not 
		System.out.println(s4.equals(s1));
		System.out.println(s3.equals(s1));
		
		
	}
}
