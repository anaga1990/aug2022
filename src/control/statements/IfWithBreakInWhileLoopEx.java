package control.statements;

public class IfWithBreakInWhileLoopEx {
	public static void main(String[] args) throws InterruptedException {
		int a = 1;
		while(true) {
			System.out.println(a);
			a++;
			if(a==3) {
				System.out.println("you reached max incorrect login atempts, wait for 24 hours or Please call 911");
				Thread.sleep(3000);
				break;
			}
		}
	}
}
