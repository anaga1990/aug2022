package collection.fw;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList9 {
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
		for(String str: firstList) {
			System.out.println(str);
			if(str.equals("venu")) {
				firstList.remove(firstList.indexOf("venu"));
			}
		}
		System.out.println(firstList);
	}
}
