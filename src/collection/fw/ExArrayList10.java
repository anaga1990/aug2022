package collection.fw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExArrayList10 {
	public static void main(String[] args) {
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(10);
		firstList.add(2);
		firstList.add(5);
		firstList.add(7);
		System.out.println(firstList);
		Iterator<Integer> iterator = firstList.iterator(); //Iterator ready to process
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			if(iterator.next() == 2) {
				iterator.remove();
			}
		}
		System.out.println(firstList);
		/*
		 *  Iterator can read the value form List
		 *  Iterator can delete the value form List
		 *  Iterator only read data in forward direction
		 */
	}
}
