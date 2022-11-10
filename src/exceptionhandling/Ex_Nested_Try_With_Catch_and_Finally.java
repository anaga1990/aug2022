package exceptionhandling;

public class Ex_Nested_Try_With_Catch_and_Finally {
	public static void main(String[] args) {
		try {
			System.out.println("########### parent try block started");
			try {
				System.out.println("********* child try block started");
				int a = 10;
				String b = "false";
				char c = 'r';
				try {
					int i = Integer.valueOf("wdkd");
				}catch (NumberFormatException e) {
					e.printStackTrace();
				}
				int i = Integer.valueOf(b);
				System.out.println(i);
				System.out.println("************ child try block ended");
			}finally {
				System.out.println("child finally block");
			}
			int a = 20;
			System.out.println("a values in Parent try is =>   "+ a);
			System.out.println("############# parent try block ended");
		}catch (Exception e) {
			System.out.println("parent catch block started");
			e.printStackTrace();
		}finally {
			System.out.println("parent finally block");
		}
		System.out.println("code continue....");
	}
}
