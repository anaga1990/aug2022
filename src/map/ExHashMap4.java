package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExHashMap4 {
	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("Physics", 65D);// entry 
		hm.put("Chemistry", 55D);
		hm.put("Biology", 67D);
		hm.put("Maths", null);
		hm.put("English", 50D);
		hm.put("Social", 70.5D);
		hm.put("Social", 60.5D);
		System.out.println(hm);
		for(Map.Entry<String, Double> eachPair : hm.entrySet()) {
			//System.out.println(eachPair.getKey());
			//System.out.println(eachPair.getValue());
			//System.out.println("**************");
			System.out.println(eachPair.getKey() +" <=> "+eachPair.getValue());
			if(eachPair.getValue() == null) {
				eachPair.setValue(222D);
			}
		}
		System.out.println(hm);
		System.out.println(hm.get("Social"));
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		for(Map.Entry<String, Double> eachPair : hm.entrySet()) {
			System.out.println(eachPair.getValue());
			
		}
		System.out.println("Social key present or not => "+hm.containsKey("Social"));
		System.out.println("SOCial key present or not => "+hm.containsKey("SOCial"));
		System.out.println("JAVA key present or not => "+hm.containsKey("JAVA"));
		System.out.println(hm.containsValue(60.5));
		Collection<Double> value = hm.values();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		for (Double double1 : value) {
			System.out.println(double1);
		}
	}
}
