package arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		int tenthMarks[] = new int[30]; // size of the array fixed or final
		tenthMarks[0] = 40; // tu
		tenthMarks[1] = 60; // hi
		tenthMarks[2] = 70; // en
		tenthMarks[3] = 45; // ma
		tenthMarks[4] = 80; // si
		tenthMarks[5] = 35; // sl
		tenthMarks[15] = 35; // sl
		tenthMarks[16] = 35; // sl
		tenthMarks[29] = 35; // sl

		System.out.println("size of the array => " + tenthMarks.length);
		for (int marksIndex = 0; marksIndex < tenthMarks.length; marksIndex++) {
			System.out.println(tenthMarks[marksIndex]);
		}

	}
}
