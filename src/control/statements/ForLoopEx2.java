package control.statements;

public class ForLoopEx2 {
	public static void main(String[] args) {
		/*
		 * for("initialize a variable -1"; "condition_check-2"; increment/decrement-4){
		 *  stmt-n-3
		 * }
		 */ 
		// print 10 to 1
		for(int printNum =10; printNum>=1; printNum--) {// 5>5
			System.out.println("current printNum holding NUM "+printNum);//10,9,8,7,6
		}
		
		System.out.println("rest of the code running....");
		
	}
}
