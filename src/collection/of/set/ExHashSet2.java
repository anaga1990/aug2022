package collection.of.set;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet2 {
	public static void main(String[] args) {
		Set<Integer> numbersSet = new HashSet<Integer>();
		numbersSet.add(10);
		numbersSet.add(2);
		numbersSet.add(5);
		numbersSet.add(7);
		numbersSet.add(9);
		numbersSet.add(0);
		numbersSet.add(10);
		numbersSet.add(0);
		numbersSet.add(null);
		numbersSet.add(null);
		System.out.println(numbersSet);
		// HashSet user insertion order not follow
		// Delicate value not allowed 
		// null value allowed
		
		//[0, null, 2, 5, 7, 9, 10]
	}
}
