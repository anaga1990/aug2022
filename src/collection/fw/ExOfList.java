package collection.fw;

import java.util.ArrayList;
import java.util.List;

public class ExOfList {
	public static void main(String[] args) {
		ExOfList ex = new ExOfList();
		List list = new ArrayList<>();
		list.add("nagarjuna");
		list.add(true);
		list.add('d');
		list.add(100.12d);
		list.add(ex);
		System.out.println(list);
		list.add(0, 123);
		System.out.println(list);
		
		/*
		 * ArrayList
		 * LinkedList
		 * Vector -> Stack
		 */
	}
}
