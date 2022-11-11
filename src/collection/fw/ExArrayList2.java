package collection.fw;

import java.util.ArrayList;

public class ExArrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		firstList.add(10);
		firstList.add(2);
		firstList.add(5);
		firstList.add(7);
		firstList.add(9);
		firstList.add(0);
		firstList.add(10);
		firstList.add(0);
		firstList.add(null);
		firstList.add(null);
		System.out.println(firstList);
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		secondList.add(3);
		secondList.add(1);
		secondList.add(6);
		secondList.add(8);
		secondList.add(0, 1);
		System.out.println(secondList);
		secondList.addAll(firstList);
		System.out.println(secondList);
		firstList.addAll(1, secondList);
		System.out.println(firstList);
		//[10, 3, 1, 6, 8, 10, 2, 5, 7, 9, 0, 10, 0, null, null,2, 5, 7, 9, 0, 10, 0, null, null]
	}
}
