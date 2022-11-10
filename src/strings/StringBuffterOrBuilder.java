package strings;

public class StringBuffterOrBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("12345");
		System.out.println(sb.capacity());
		sb.append(10.122d);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb = new StringBuilder("12345");
		System.out.println(sb.delete(0, 4));
		System.out.println(sb);
		sb = new StringBuilder("nagarjuna");
		sb.deleteCharAt(5);
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("nagarjuna");
		sb1.reverse();
		System.out.println(sb);
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
	}
}
