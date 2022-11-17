package collection.of.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ExTreeSet2 {
	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(1);
		tr.add(4);
		tr.add(41);
		tr.add(14);
		tr.add(81);
		tr.add(18);
		tr.add(91);
		tr.add(12);
		tr.add(18);
		tr.add(10);
		System.out.println(tr);
		//[1, 4, 10, 12, 14, 18, 41, 81, 91]
		System.out.println(tr.first());
		System.out.println(tr.last());
		System.out.println(tr.ceiling(11));
		System.out.println(tr.floor(11));//10
		tr.pollFirst();
		System.out.println(tr);
		tr.pollLast();
		System.out.println(tr);
		tr.headSet(13);
		System.out.println(tr);
		//[4, 10, 12, 14, 18, 41, 81]
		List<Integer> l = new  ArrayList<>(tr);
		System.out.println(l.get(0));
		
		for (Integer integer : tr) {
			System.out.println(integer);
		}
		
		Iterator<Integer> iterator = tr.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
