package map;

import java.util.HashMap;

public class ExHashMap {
	public static void main(String[] args) {
//		/<K, V> =>  k = key , v = value

		HashMap<String, Double> nagarjunaMarks = new HashMap<String, Double>();
		nagarjunaMarks.put("Physics", 65D);
		nagarjunaMarks.put("Chemistry", 55D);
		nagarjunaMarks.put("Biology", 67D);
		nagarjunaMarks.put("Maths", 83D);
		nagarjunaMarks.put("English", 50D);
		nagarjunaMarks.put("Social", 70.5D);
		nagarjunaMarks.put("Social", 60.5D);
		nagarjunaMarks.put(null, null);
		nagarjunaMarks.put(null, null);
		//list or set []
		//map {key=value,key1=value1}
		// HashMap Keys are unique , duplicates are not allowed
		// keys as null allowed, values can null 
		System.out.println(nagarjunaMarks);
	}
}
