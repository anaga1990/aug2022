package operators;

public class BitwiseAnd {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a < b & b < c); // true & true = true
		System.out.println(a < b & b > c); // true & false = false
		System.out.println(a > b & b < c); // false & true = false
		System.out.println(a > b & b > c); // false & false = false
		/*
		 * BitwiseAnd ( statement1 & statement2)
		 * true & true = true 
		 * true & false = false 
		 * false & true = false 
		 * false & false = false
		 * 
		 */
		a = 10;
		b = 20;
		c = 30;
		
		System.out.println("***********************");
		System.out.println(c + " before Condition check");
		System.out.println(a < b & b > c++); // true & false = false
		System.out.println(c); //31
		System.out.println("***********************");
		System.out.println(a > b & b < c++);// a > b = false 
		System.out.println(c);
	}
}
