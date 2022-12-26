package e2e;

import org.testng.annotations.Test;

public class APIModuleTest {
	@Test( groups = {"sanityTest","regressionTest", "APITest", "loginTest"} )
	public void apiLoginApplication() {
		System.out.println("API LoginApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "APITest", "loginTest"} )
	public void apiLogOutApplication() {
		System.out.println("API LogOutApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "APITest"} )
	public void apiorderIphone() {
		System.out.println("API orderIphone");
	}
	
	@Test( groups = {"regressionTest", "APITest"} )
	public void apiorderAndroidPhone() {
		System.out.println("API orderAndroidPhone");
	}
	
	@Test( groups = {"regressionTest", "APITest"})
	public void apiorderToys() {
		System.out.println("API orderToys");
	}
	

	@Test( groups = {"regressionTest", "APITest"} )
	public void apiorderHomeApplications() {
		System.out.println("API orderHomeApplications");
	}
	
	@Test( groups = {"regressionTest", "APITest", "sanityTest"} )
	public void addAddress_api() {
		System.out.println("API addAddress");
	}
	
	@Test( groups = {"regressionTest", "APITest"} )
	public void api_updateAddress() {
		System.out.println("API updateAddress");
	}
	
	@Test( groups = {"regressionTest", "APITest"} )
	public void deleteAddress_api() {
		System.out.println("API deleteAddress");
	}
}
