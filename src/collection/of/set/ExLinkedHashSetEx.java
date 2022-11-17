package collection.of.set;

import java.util.LinkedHashSet;

public class ExLinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("java");
		lhs.add(".net");
		lhs.add("python");
		lhs.add("c");
		lhs.add("c++");
		lhs.add("javaScript");
		lhs.add("java");
		System.out.println(lhs);
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		lh.add("java");
		lh.add("python");
		lh.add(".net");
		System.out.println(lhs.containsAll(lh));//true
		lh.add("Pava");
		lh.add("python");
		lh.add(".net");
		System.out.println(lhs.containsAll(lh));//false
		lhs.removeAll(lh);
		System.out.println("lhs.removeAll(lh);");
		System.out.println(lhs);
		lhs.add("java");
		lhs.add(".net");
		lhs.add("python");
		lhs.add("c");
		lhs.add("c++");
		lhs.add("javaScript");
		lhs.add("java");
		lhs.retainAll(lh);
		System.out.println("lhs.retainAll(lh);");
		System.out.println(lhs);
	}
}
