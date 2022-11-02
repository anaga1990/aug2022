package strings;

public class ExString5 {
	public static void main(String[] args) {
		String env;
		env = "qatest_prod";
		if(env.startsWith("qa")) {
			System.out.println("run jobs in QA platform");
		}else if(env.startsWith("prod")) {
			System.out.println("run jobs in PRODUCTION platform");
		}else {
			System.out.println("no platform configured to run test");
		}
	}
}
