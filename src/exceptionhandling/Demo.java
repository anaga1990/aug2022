package exceptionhandling;

public class Demo {
	public void test(String in_browser){
		String browser = in_browser;
		if(browser.equals("chrome")) {
			System.out.println("running testes in chrome Browser");
		}else if (browser.equals("firefox")){
			throw new MyEx(browser);
		}else {
			throw new ArithmeticException(browser+"is not suported");
		}
		
	}
	public static void main(String[] args){
		Demo  d = new Demo();
		d.test("firefox");
	}
}
