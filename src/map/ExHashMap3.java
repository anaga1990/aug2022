package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ExHashMap3 {
	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<String, Double>();
		System.out.println(hm.isEmpty());
		hm.put("Physics", 65D);
		System.out.println(hm.isEmpty());
		hm.put("Chemistry", 55D);
		hm.put("Biology", 67D);
		hm.put("Maths", null);
		hm.put("English", 50D);
		hm.put("Social", 70.5D);
		hm.put("Social", 60.5D);
		System.out.println(hm);
		hm.put("Physics", 35d);
		
		Set<String> subjects = hm.keySet();
		System.out.println(subjects.size());
		for (String string : subjects) {
			System.out.println(string);
		}
		System.out.println("******************************");
		Set<String> subjects1 = hm.keySet();
		Iterator<String> iterator = subjects1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
