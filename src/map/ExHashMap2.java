package map;

import java.util.HashMap;

public class ExHashMap2 {
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
		HashMap<String, Double> hm1 = new HashMap<String, Double>();
		hm1.put("MOne", 47D);
		hm1.put("AI", 100D);
		hm.putAll(hm1);
		System.out.println(hm);
		hm.putIfAbsent("JAVA", 100D);
		hm.putIfAbsent("Maths", 100D);
		hm.putIfAbsent("Physics", 500D);
		System.out.println(hm);
		hm.replace("Physics", 500D);
		hm.replace("AI", 100D, 98D);
		hm.replace("Chemistry", 54D, 100D);
		System.out.println("replace===========================================================================>");
		System.out.println(hm);
		
	}
}
