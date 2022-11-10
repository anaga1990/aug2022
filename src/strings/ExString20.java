package strings;

public class ExString20 {
	public static void main(String[] args) {
		int age = 20;
		boolean isMale = true;
		double salary  = 12333.45d;
		String strOfAge = String.valueOf(age);
		System.out.println(strOfAge);
		System.out.println(Integer.valueOf(strOfAge));
		System.out.println(String.valueOf(isMale));
		System.out.println(String.valueOf(salary));
		
		String a = "TRUES";
		System.out.println(Boolean.valueOf(a));//int,long,float,double
		String dd = "11212.33";
		System.out.println(Double.valueOf(dd));
	}
}
