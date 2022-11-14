package collection.fw;

import java.util.Enumeration;
import java.util.Vector;

public class ExOFVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(2);
		v.add(20);
		v.add(12);
		v.add(12);
		v.add(12);
		System.out.println(v);
		v.remove(0);
		Enumeration<Integer> enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println( enu.nextElement());
		}
	}
}
