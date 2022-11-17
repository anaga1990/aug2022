package collection.of.set;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add("nagarjuna");
		set.add(true);
		set.add('d');
		set.add(100.12d);
		set.add(777);
		System.out.println(set);
		//[d, 100.12, nagarjuna, 777, true]
		//[d, 100.12, nagarjuna, 777, true]
		
		//user insertion oder not preserver 
	}
}
