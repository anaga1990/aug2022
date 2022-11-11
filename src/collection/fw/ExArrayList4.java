package collection.fw;

import java.util.ArrayList;

public class ExArrayList4 {
	public static void main(String[] args) {
		ArrayList<String> firstList = new ArrayList<String>();
		System.out.println(firstList);//[]
		firstList.add("naga");
		firstList.add("bala");
		firstList.add("lakshmi");
		firstList.add("bagi");
		firstList.add("mahi");
		System.out.println(firstList);
		firstList.clear();
		System.out.println(firstList);
		firstList.add("naga");
		firstList.add("bala");
		firstList.add("lakshmi");
		firstList.add("bagi");
		firstList.add("mahi");
		System.out.println(firstList.contains("NAGA"));
		String ss = "NAGA";
		System.out.println(firstList.contains(ss.toLowerCase()));
		firstList.clear();
		firstList.add("naga");
		firstList.add("bala");
		firstList.add("lakshmi");
		firstList.add("bagi");
		firstList.add("mahi");
		ArrayList<String> secondList = new ArrayList<String>();
		secondList.add("bala");
		secondList.add("lakshmi");
		secondList.add("naga");
		Boolean dataPresentOrNot=firstList.containsAll(secondList);
		System.out.println("***************");
		System.out.println(dataPresentOrNot);
		
	}
}
