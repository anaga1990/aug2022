package arrays;

public class ArraysEx6 {

	public static void main(String[] args) {
		int data[] = new int[100]; // size of the array fixed or final
		
		for(int i =1; i < data.length; i++) {
			data[i] = i+1;
		}
		
		for(int j : data) {
			System.out.print(j+", ");
		}

	}
}
