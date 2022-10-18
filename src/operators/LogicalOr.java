package operators;

public class LogicalOr {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a < b || b < c); // true || true = true 
		System.out.println(a < b || b > c); // true || false = true
		System.out.println(a > b || b < c); // false || true = true
		System.out.println(a > b || b > c); // false || false = false
		/*
		 * LogicalOR ( statement1 || statement2)
		 * true || true = true 
		 * true || false = true 
		 * false || true = true 
		 * false || false = false
		 * 
		 */
		a = 10;
		b = 20;
		c = 30;
		
		System.out.println("***********************");
		System.out.println(c + " before Condition check");
		System.out.println(a < b || b < c++); // true && true = true
		System.out.println(c);//31
		
	}
}
