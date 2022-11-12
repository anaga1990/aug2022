package collection.fw;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList7 {
	public static void main(String[] args) {
		List<String> firstList = new ArrayList<String>();
		firstList.add("naga");
		firstList.add("bala");
		firstList.add("lakshmi");
		firstList.add("bagi");
		firstList.add("mahi");
		firstList.add("venki");
		firstList.add("venu");
		firstList.add("naresh");
		System.out.println(firstList);
		ArrayList<String> secondList = new ArrayList<String>();
		secondList.add("bala");
		secondList.add("bala");
		secondList.add("bala");
		secondList.add("bala");
		secondList.add("bala");
		secondList.add("lakshmi");
		secondList.add("naga");
		secondList.add("naga");
		secondList.add("naga");
		System.out.println(secondList);
		firstList.retainAll(secondList);// get command data/ elements from list
		System.out.println("afetr retainAll =>");
		System.out.println(firstList);
		System.out.println(secondList);
		
	}
}
