package collection.fw;

import java.util.LinkedList;
import java.util.List;

public class ExLinkedList {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(9);
		l.add(0);
		l.add(10);
		l.add(0);
		l.add(null);
		l.add(null);
		System.out.println(l);
		/*
		 * LINKEDLIST store the Data in user provided Order,
		 * Duplicates values allowed
		 * null allowed
		 * [10, 2, 5, 7, 9, 0, 10, 0, null, null]
		 */
	}
}
