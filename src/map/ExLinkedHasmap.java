package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExLinkedHasmap {
	public static void main(String[] args) {

		LinkedHashMap<String, Double> hm = new LinkedHashMap<String, Double>();
		hm.put("Physics", 65D);// entry 
		hm.put("Chemistry", 55D);
		hm.put("Biology", 67D);
		hm.put("Maths", null);
		hm.put("English", null);
		hm.put(null, 70.5D);
		hm.put(null, 60.5D);
		System.out.println(hm);
		for(Map.Entry<String, Double> eachPair : hm.entrySet()) {
			System.out.println(eachPair.getKey() +" <=> "+eachPair.getValue());
			if(eachPair.getValue() == null) {
				eachPair.setValue(222D);
			}
		}
		//map {key=value,key1=value1}
		// LinkedHashMap Keys are unique , values can be duplicates
		// keyS & values can be null
		// Insertion Order preserve
	}
}
