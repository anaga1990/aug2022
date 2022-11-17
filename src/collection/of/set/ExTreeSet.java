package collection.of.set;

import java.util.TreeSet;


public class ExTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(10);
		set.add(21);
		set.add(61);
		set.add(18);
		set.add(12);
		System.out.println(set);
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("venu");
		set1.add("naga");
		set1.add("bala");
		set1.add("venki");
		set1.add("naresh");
		set1.add("venu");
		set1.add("1");
		System.out.println(set1);
		// TreeSet user insertion order now followed
		// increment or Accending order data will be stored
		// duplicate value not allowed 
		// null value not allowed (single Null value also not allowed -> null pointer ex)
		// non-generic different data types we con't provide to Tree set we will get RUN Exception: ClassCastException
		TreeSet set2 = new TreeSet();
		set2.add("venu");
		set2.add("naga");
		set2.add("bala");
		set2.add("venki");
		set2.add("naresh");
		set2.add("venu");
		set2.add(1);
		System.out.println(set1);
		
		
		
		
		
		
		
		
		
	}
}
