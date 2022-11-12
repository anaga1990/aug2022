package collection.fw;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList8 {
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
		for (int i = 0; i < firstList.size(); i++) {
			String element = firstList.get(i);
			System.out.println(element);
		}
		
	}
}
