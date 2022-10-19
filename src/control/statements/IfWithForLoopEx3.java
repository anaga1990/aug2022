package control.statements;

public class IfWithForLoopEx3 {
	public static void main(String[] args) throws InterruptedException {
		long addharNum =123456L;
		
		for (long i = 1; i <= 10000000; i++) {
			if (i < addharNum) {//0 <20 = true
				System.out.println("if condition ==>"+i);
			} else if (i == addharNum) {//10<10 = true
				System.out.println("########################");
				System.out.println("match Found");
				System.out.println("########################");
				Thread.sleep(5000);
			} else {
				System.out.println("no record match come out of if-else block "+ i);
				break;
			}
		}
	}
}
