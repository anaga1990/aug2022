package collection.fw;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList6 {
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
		System.out.println(firstList.size());
		firstList.add(0, "123");
		System.out.println(firstList);
		System.out.println(firstList.size());
		firstList.set(4, "BAGI");
		System.out.println(firstList);
		System.out.println(firstList.size());
		List<String> myUni = firstList.subList(3, 7);
		System.out.println(myUni);
		
		
	}
}
