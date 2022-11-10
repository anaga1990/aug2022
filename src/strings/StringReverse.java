package strings;

public class StringReverse {
	public static void main(String[] args) {
		String str = "0123456789";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		// our own revser method
		strRevers(str);
	}
	
	public static void strRevers(String str) {
		for(int i =str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
