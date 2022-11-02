package strings;

public class ExString4 {
	public static void main(String[] args) {
		String env = new String("india_qa");
		env = "qatest_prod";
		if(env.endsWith("qa")) {
			System.out.println("run jobs in QA platform");
		}else if(env.endsWith("prod")) {
			System.out.println("run jobs in PRODUCTION platform");
		}else {
			System.out.println("no platform configured to run test");
		}
	}
}
