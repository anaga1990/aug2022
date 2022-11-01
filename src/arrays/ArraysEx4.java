package arrays;

public class ArraysEx4 {

	public static void main(String[] args) {
		String names[] = {"naga","bala", "laks","bagi","mahi"};
		
		System.out.println("size of the array => " + names.length);
		for (int marksIndex = 0; marksIndex < names.length; marksIndex++) {
			System.out.println(names[marksIndex]);
		}
		
		System.out.println("********** for each ************");
		for(String a : names) {
			System.out.println(a);
		}

	}
}
