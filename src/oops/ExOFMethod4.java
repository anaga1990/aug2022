package oops;

public class ExOFMethod4 {

	public int doTodayAllWorks(int a, int b) {
		return a+b;
	}
	
	public static String doTodayAllWorks(boolean a, boolean b) {
		String ss = String.valueOf(a);
		//String sss = String.valueOf(b);
		return ss+b;
	}
	public static void main(String[] args) {
		String ssss=doTodayAllWorks(true, false);
		System.out.println(ssss);
	}
}
