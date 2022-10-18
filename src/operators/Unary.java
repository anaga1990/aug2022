package operators;

public class Unary {
	public static void main(String[] args) {
		// expr++ = 10++ = 10 +1 = 11
		// expr-- = 10-- = 10 -1 = 9
		int a = 10;
		System.out.println(a++);// 10++ = 10 +1 = 11
		System.out.println(a);
		System.out.println("***************************");
		int b = 12;
		System.out.println(b--);
		System.out.println(b);
		System.out.println("***************************");
		int c = 10;
		c++;
		System.out.println(c++);
		System.out.println(c);
	}
}
