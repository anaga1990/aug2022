package com.test.e2e;

import org.testng.annotations.Test;

public class WebBrowserModuleTest {
	@Test( groups = {"sanityTest","regressionTest", "WebBrowserTest", "loginTest"} )
	public void LoginApplication() {
		System.out.println("WebBrowser LoginApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "WebBrowserTest", "loginTest"} )
	public void LogOutApplication() {
		System.out.println("WebBrowser LogOutApplication");
	}
	
	@Test( groups = {"sanityTest","regressionTest", "WebBrowserTest"} )
	public void orderIphone() {
		System.out.println("WebBrowser orderIphone");
	}
	
	@Test( groups = {"regressionTest", "WebBrowserTest"} )
	public void orderAndroidPhone() {
		System.out.println("WebBrowser orderAndroidPhone");
	}
	
	@Test( groups = {"regressionTest", "WebBrowserTest"} )
	public void orderToys() {
		System.out.println("WebBrowser orderToys");
	}
	

	@Test( groups = {"regressionTest", "WebBrowserTest"} )
	public void orderHomeApplications() {
		System.out.println("WebBrowser orderHomeApplications");
	}
	
	@Test( groups = {"regressionTest", "WebBrowserTest", "sanityTest"} )
	public void addAddress() {
		System.out.println("WebBrowser addAddress");
	}
	
	@Test( groups = {"regressionTest", "WebBrowserTest"} )
	public void updateAddress() {
		System.out.println("WebBrowser updateAddress");
	}
	
	@Test( groups = {"regressionTest", "WebBrowserTest"} )
	public void deleteAddress() {
		System.out.println("WebBrowser deleteAddress");
	}
}
