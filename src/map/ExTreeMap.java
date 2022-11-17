package map;

import java.util.Map;
import java.util.TreeMap;

public class ExTreeMap {
	public static void main(String[] args) {

		TreeMap<String, Double> hm = new TreeMap<String, Double>();
		hm.put("Physics", 65D);// entry 
		hm.put("Chemistry", 55D);
		hm.put("Biology", 67D);
		hm.put("Maths", null);
		hm.put("English", null);
		hm.put("jkava", 70.5D);
		hm.put("Social", 60.5D);
		System.out.println(hm);
		for(Map.Entry<String, Double> eachPair : hm.entrySet()) {
			System.out.println(eachPair.getKey() +" <=> "+eachPair.getValue());
			if(eachPair.getValue() == null) {
				eachPair.setValue(222D);
			}
		}
		//map {key=value,key1=value1}
		// TreeMap Keys are unique , values can be duplicates
		// key as null Not allowed, but values can null 
	}
}
