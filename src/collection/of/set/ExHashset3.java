package collection.of.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ExHashset3 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(9);
		l.add(0);
		l.add(10);
		HashSet<Integer> hs = new HashSet<>(l);
		hs.add(30);
		hs.add(300);
		hs.add(12);
		System.out.println(hs);
		System.out.println(hs.contains(20));
		System.out.println(hs.contains(300));
		Iterator<Integer> iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
