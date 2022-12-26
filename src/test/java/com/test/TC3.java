package com.test;

import org.testng.annotations.Test;

public class TC3 {
	// 1.40 hours minutes
	@Test
	public void loginApplication() {
		System.out.println("open URL");
		System.out.println("entered valid phone Number");
		System.out.println("entered valid OTP");
		System.out.println("click on Login Button");
		System.out.println("Verify the Homepage Displyed & Title of the page");
	}

	
	@Test(dependsOnMethods = {"loginApplication"} )
	public void buy32InchSmartTv() {
		System.out.println("************ buy32InchSmartTv Started *********");
		System.out.println("search for 32 inch Smart TV");
		System.out.println("click the releme 32 inch TV");
		System.out.println("verify releme 32 inch TV open in new tab");
		System.out.println("click on Add to Cart");
	}
	
	@Test(dependsOnMethods = {"loginApplication"} )
	public void buy43InchSmartTv() {
		System.out.println("************ buy43InchSmartTv Started *********");
		System.out.println("search for 43 inch Smart TV");
		System.out.println("click the releme 43 inch TV");
		System.out.println("verify releme 43 inch TV open in new tab");
		System.out.println("click on Add to Cart");
	}
	
	@Test(dependsOnMethods = {"loginApplication"} )
	public void laptop_i5_11th_generation() {
		System.out.println("************ laptop_i5_11th_generation Started *********");
		System.out.println("search for laptop i5 11th gen");
		System.out.println("click the releme i5 11th gen processer");
		System.out.println("verify releme laptop open in new tab");
		System.out.println("click on Add to Cart");
	}
	
	@Test(dependsOnMethods = {"buy32InchSmartTv", "buy43InchSmartTv", "laptop_i5_11th_generation"})
	public void plaeOrderAndPerformPayment() {
		System.out.println("click place order");
		System.out.println("click CONTINUE");
		System.out.println("check notification popup and Accept & Continue");
		System.out.println("plaeOrderAndPerformPayment Finished");
	}
	
}
