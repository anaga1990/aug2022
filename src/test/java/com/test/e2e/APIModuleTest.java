package com.test.e2e;

import org.testng.annotations.Test;

public class APIModuleTest {
	@Test( groups = {"sanityTest","regressionTest", "APITest", "loginTest"} )
	public void LoginApplication() {
		System.out.println("API LoginApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "APITest", "loginTest"} )
	public void LogOutApplication() {
		System.out.println("API LogOutApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "APITest"} )
	public void orderIphone() {
		System.out.println("API orderIphone");
	}
	
	@Test( groups = {"regressionTest", "APITest"} )
	public void orderAndroidPhone() {
		System.out.println("API orderAndroidPhone");
	}
	
	@Test( groups = {"regressionTest", "APITest"})
	public void orderToys() {
		System.out.println("API orderToys");
	}
	

	@Test( groups = {"regressionTest", "APITest"} )
	public void orderHomeApplications() {
		System.out.println("API orderHomeApplications");
	}
	
	@Test( groups = {"regressionTest", "APITest", "sanityTest"} )
	public void addAddress() {
		System.out.println("API addAddress");
	}
	
	@Test( groups = {"regressionTest", "APITest"} )
	public void updateAddress() {
		System.out.println("API updateAddress");
	}
	
	@Test( groups = {"regressionTest", "APITest"} )
	public void deleteAddress() {
		System.out.println("API deleteAddress");
	}
}
