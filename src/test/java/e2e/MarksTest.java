package e2e;


import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners({com.test.e2e.MyListener.class})
public class MarksTest {
	@Test(dataProvider = "marksData", dataProviderClass = com.test.e2e.TestData.class, enabled = false)
	public void f(int a, int b, int c, int d, int e, int f) {
		System.out.println(a+ " "+b+" "+c+" "+d+" "+e+" "+f);
	}
	
	@Test(dataProvider = "marksData", dataProviderClass = com.test.e2e.TestData.class, enabled = false)
	public void f1(int a, int b, int c, int d, int e, int f) {
		System.out.println(a+ " "+b+" "+c+" "+d+" "+e+" "+f);
	}
	
	@Test(dataProvider = "nameTest", dataProviderClass = com.test.e2e.TestData.class)
	public void f3(String a) throws InterruptedException {
		System.out.println(a);
	}
	
	@Parameters({"user","pwd"})
	@Test(enabled = false)
	public void f4(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
}
