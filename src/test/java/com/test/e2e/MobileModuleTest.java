package com.test.e2e;

import org.testng.annotations.Test;

public class MobileModuleTest {
	@Test( groups = {"sanityTest","regressionTest", "mobileTest", "loginTest", "smoke"} )
	public void LoginApplication() {
		System.out.println("Mobile LoginApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "mobileTest", "loginTest", "smoke"} )
	public void LogOutApplication() {
		System.out.println("Mobile LogOutApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "mobileTest"} )
	public void orderIphone() {
		System.out.println("Mobile orderIphone");
	}
	
	@Test( groups = {"regressionTest", "mobileTest"} )
	public void orderAndroidPhone() {
		System.out.println("Mobile orderAndroidPhone");
	}
	
	@Test( groups = {"regressionTest", "mobileTest"} )
	public void orderToys() {
		System.out.println("Mobile orderToys");
	}
	
	@Test( groups = {"regressionTest", "mobileTest"} )
	public void orderHomeApplications() {
		System.out.println("Mobile orderHomeApplications");
	}
	
	@Test( groups = {"sanityTest", "regressionTest", "mobileTest"} )
	public void addAddress() {
		System.out.println("Mobile addAddress");
	}
	
	@Test( groups = {"regressionTest", "mobileTest"} )
	public void updateAddress() {
		System.out.println("Mobile updateAddress");
	}
	
	@Test( groups = {"regressionTest", "mobileTest"} )
	public void deleteAddress() {
		System.out.println("Mobile deleteAddress");
	}
}
