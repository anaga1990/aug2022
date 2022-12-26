package com.test.e2e;

import org.testng.annotations.Test;

public class APIModuleTest2 {
	@Test( groups = {"sanityTest","regressionTest", "APIV2Test", "loginTest"} )
	public void LoginApplication() {
		System.out.println("API2 LoginApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "APIV2Test", "loginTest"} )
	public void LogOutApplication() {
		System.out.println("API2 LogOutApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "APIV2Test"} )
	public void orderIphone() {
		System.out.println("API2 orderIphone");
	}
	
	@Test( groups = {"regressionTest", "APIV2Test"} )
	public void orderAndroidPhone() {
		System.out.println("API2 orderAndroidPhone");
	}
	
	@Test( groups = {"regressionTest", "APIV2Test"} )
	public void orderToys() {
		System.out.println("API2 orderToys");
	}
	

	@Test( groups = {"regressionTest", "APIV2Test"} )
	public void orderHomeApplications() {
		System.out.println("API2 orderHomeApplications");
	}
	
	@Test( groups = {"regressionTest", "APIV2Test", "sanityTest"} )
	public void addAddress() {
		System.out.println("API2 addAddress");
	}
	
	@Test( groups = {"regressionTest", "APIV2Test"} )
	public void updateAddress() {
		System.out.println("API2 updateAddress");
	}
	
	@Test( groups = {"regressionTest", "APIV2Test"} )
	public void deleteAddress() {
		System.out.println("API2 deleteAddress");
	}
}
