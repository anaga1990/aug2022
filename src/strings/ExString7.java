package strings;

public class ExString7 {
	public static void main(String[] args) {
		String s = "firstname middleName surename";
		//System.out.println(s.hashCode());
		System.out.println(s.indexOf('n'));
		System.out.println(s.indexOf("Name"));
		System.out.println(s.indexOf('n', 6));
		System.out.println(s.indexOf("Name", 6));
		
		
	}
}
