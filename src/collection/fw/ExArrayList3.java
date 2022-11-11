package collection.fw;

import java.util.ArrayList;

public class ExArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> firstList = new ArrayList<String>();
		firstList.add("naga");
		firstList.add("bala");
		firstList.add("lakshmi");
		firstList.add("bagi");
		firstList.add("mahi");
		System.out.println(firstList);
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		secondList.add(3);
		secondList.add(1);
		secondList.add(6);
		secondList.add(8);
		// secondList.addAll(firstList); 
		//The method addAll(Collection<? extends
		// Integer>) in the type ArrayList<Integer> is not applicable for the arguments
		// (ArrayList<String>)
		
		
	}
}
