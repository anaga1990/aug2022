package collection.of.set;

import java.util.LinkedHashSet;

public class ExLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> numbersSet = new LinkedHashSet<Integer>();
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
		// LinkedHashSet user insertion order followed (if any duplicate vales those will be removed)
		// duplicate value not allowed 
		// null value allowed
	}
}
