package operators;

public class Relational {
	public static void main(String[] args) {
		System.out.println(" ex of <");
		System.out.println(10 < 20);
		System.out.println(" ex of >");
		System.out.println(10 > 9);
		System.out.println(" ex of >=");
		int age = 10;
		int actualAgeToProcessJob = 18;
		boolean isElig = age >= actualAgeToProcessJob; // 10 >=18 = false
		System.out.println(isElig);
		System.out.println(" ex of <=");
		isElig = age <= actualAgeToProcessJob; // 10 <=18 = true
		System.out.println(isElig);
		System.out.println(" ex of ==");
		int tt = 10;
		int bb = 10;
		boolean a = tt == bb;
		System.out.println(a);
		System.out.println(" ex of !=");
		System.out.println(!true);
		a = tt != bb;
		System.out.println(a);
	
	}
}
