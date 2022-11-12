package collection.fw;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExArrayList12 {
	public static void main(String[] args) {
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(10);
		firstList.add(2);
		firstList.add(5);
		firstList.add(7);
		firstList.add(6);
		System.out.println(firstList);
		ListIterator<Integer> listIterator = firstList.listIterator(firstList.size());
		while (listIterator.hasPrevious()) {
			System.out.println(" ==> "+listIterator.previous());
			System.out.println(listIterator.previousIndex());
		}
		System.out.println(firstList);
		/*
		 *  ListIterator can read the value from List Bi-direction
		 *  ListIterator can delete the value form List
		 *  ListIterator read data in forward direction
		 *  ListIterator updated data in forward direction
		 */
	}
}
