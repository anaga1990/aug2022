package oops;

public class ExOFMethod {
	/*
	 * header, Body
	 * 
	 * header: 1= access Modifier => (with in class = private) (package = default)
	 * (inheritance of the class = protected) (any one can access = public)
	 * 
	 * 2 = keyword (static or Non-static(instance method Note:if its non-static
	 * method we need created object and call the method))
	 * 
	 * 3 = method need to return =Primitive/non-Primitive, do want to return = void
	 * 4 = method name 5 = Arguments/parameters (zero , one , more) Body 1 = if your
	 * method have return type as we declared in 3 point we must return in method
	 * body
	 */
	public static void main(String[] args) {
		System.out.println(isBigvalue(120));
	
		ExOFMethod exOFMethod = new ExOFMethod();
		int a = exOFMethod.additionOfNumbers(1232323, 343443);
		System.out.println(a);
		System.out.println("*******************************");
		System.out.println(exOFMethod.isbigName("wsdjbnsd1"));
	}

	private int additionOfNumbers(int a, int b) {
		int c = a + b;
		// System.out.println(c);
		return c;
	}

	static boolean isBigvalue(int a) {
		boolean is = a > 1000;
		return is;
	}
	
	protected String isbigName(String a) {
		String value= null;
		if(a.length() >= 10) {
			value = a + " => is a big Name";
		}else {
			value = a + " => is a small Name";
		}
		return value;
	}
	
	public ExOFMethod() {
		System.out.println("asbnsbnS");
	}
}
