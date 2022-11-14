package collection.fw;

import java.util.LinkedList;

public class ExLinkedList2 {
	public static void main(String[] args) {
		LinkedList<Integer> firstList = new LinkedList<Integer>();
		firstList.add(10);
		firstList.add(2);
		firstList.add(5);
		firstList.add(7);
		firstList.add(9);
		System.out.println(firstList);
		firstList.addLast(222);
		System.out.println(firstList.getLast());
		System.out.println(firstList.get(firstList.size()-1));
		firstList.offer(555);
		System.out.println(firstList);
		firstList.offerFirst(777);
		System.out.println(firstList);
		System.out.println("firstList.peek()");
		System.out.println(firstList.peek());
		System.out.println(firstList);
		System.out.println(firstList.peekLast());
		firstList.poll();
		System.out.println(firstList);
		firstList.pollLast();
		System.out.println("firstList.pollLast()");
		System.out.println(firstList);
	}
}
