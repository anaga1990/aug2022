package collection.fw;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
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
		 * ArrayList store the Data in user provided Order,
		 * Duplicates values allowed
		 * null allowed
		 */
	}
}
