package control.statements;

public class IfWithForLoopEx2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		for (int i = 0; i < 100; i++) {
			if (i < a) {//0 <20 = true
				System.out.println("if condition");
			} else if (i < b) {//10<10 = true
				System.out.println("1 st else if executed");
			} else if(i < a && i < b) {
				System.out.println("2 nd else if executed");
			} else if(i == b){
				break;
			} else {
				System.out.println("no record match come out of if-else block");
			} //10,00,000 = 1234 5678 1234 = 1 match found
			//1,00,00,00,000
		}
	}
}
