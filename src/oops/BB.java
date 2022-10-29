package oops;

public class BB{
	public static void main(String[] args) {
		EnsapsEx ex = new EnsapsEx(10, 3, false, "VENKI");
		System.out.println(ex.getAge());
		ex.setAge(111);
		System.out.println(ex.getAge());
	}
}
