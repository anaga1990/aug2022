package collection.fw;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList13 {
	public static void main(String[] args) {
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(10);
		firstList.add(2);
		firstList.add(5);
		firstList.add(7);
		firstList.add(6);
		System.out.println(firstList);
		firstList.stream().forEach(c -> System.out.println(c));
	}
}
