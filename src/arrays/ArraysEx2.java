package arrays;

public class ArraysEx2 {
	
	
	public static void main(String[] args) {
		int tenthMarks[] = new int[6];
		tenthMarks[0] = 40; // tu
		tenthMarks[1] = 60; // hi
		tenthMarks[2] = 70; // en
		tenthMarks[3] = 45; //ma
		tenthMarks[4] = 80; // si
		tenthMarks[5] = 35; //sl
		/*
		 * forEach data print from Array
		 * for(DATATYPE_of_Array marks : array_object_ref_variable){
		 * 	s.o.p(marks)
		 */
		for(int marks: tenthMarks) {
			System.out.println(marks);
		}
		
	}
}

























