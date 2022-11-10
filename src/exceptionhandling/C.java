package exceptionhandling;


public class C extends B {
	public static void main(String[] args)  {
		C c = new C();
		c.dummy_A(1);
	}

	@Override
	public void dummy_A(int a) {
		super.dummy_A(a);
	}
	
	
}
