package collection.fw;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList5 {
	public static void main(String[] args) {
		List<String> firstList = new ArrayList<String>();
		System.out.println(firstList);//[]
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
		System.out.println(firstList.get(0));
		System.out.println(firstList.get(4));
		System.out.println(secondList.indexOf("naga"));
		System.out.println(secondList.lastIndexOf("naga"));
		System.out.println(secondList);
		secondList.remove(4);
		System.out.println(secondList);
		firstList.removeAll(secondList);
		System.out.println(secondList);
		System.out.println(firstList);
	}
}
