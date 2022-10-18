package control.statements;

public class ForLoopEx {
	public static void main(String[] args) {
		/*
		 * for("initialize a variable -1"; "condition_check-2"; increment/decrement-4){
		 *  stmt-n-3
		 * }
		 */ 
		// print 1 to 10
		int startingNumber = 50;
		int endingNumber = 100000;
		
		for(int printNum =startingNumber; printNum<=endingNumber; printNum++) {
			System.out.println("current printNum holding NUM "+printNum);
		}
		
		System.out.println("rest of the code running....");
		
	}
}
