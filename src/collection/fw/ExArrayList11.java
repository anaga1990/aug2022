package collection.fw;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExArrayList11 {
	public static void main(String[] args) {
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(10);
		firstList.add(2);
		firstList.add(5);
		firstList.add(10);
		firstList.add(7);
		firstList.add(10);
		System.out.println(firstList);
		ListIterator<Integer> listIterator = firstList.listIterator();
		while (listIterator.hasNext()) {
			if(listIterator.next() == 10) {
				listIterator.set(9);
				System.out.println(listIterator.nextIndex());
			}
		}
		System.out.println(firstList);
		ListIterator<Integer> listIterator1 = firstList.listIterator();
		while (listIterator1.hasNext()) {
			if(listIterator1.next() == 2) {
				listIterator1.remove();
			}
		}
		System.out.println(firstList);
	}
}
