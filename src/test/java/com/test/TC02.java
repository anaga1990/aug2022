package com.test;

import org.testng.annotations.Test;

public class TC02 {
	
	//5 hours time to RUN
	@Test
	public void loginApplicationWithValidData() {
		System.out.println("open URL");
		System.out.println("entered valid phone Number");
		System.out.println("entered valid OTP");
		System.out.println("click on Login Button");
		System.out.println("Verify the Homepage Displyed & Title of the page");
	}

	
	@Test
	public void buy32InchSmartTv() {
		System.out.println("************ buy32InchSmartTv Started *********");
		loginApplicationWithValidData();
		System.out.println("search for 32 inch Smart TV");
		System.out.println("click the releme 32 inch TV");
		System.out.println("verify releme 32 inch TV open in new tab");
		System.out.println("click on Add to Cart");
		plaeOrderAndPerformPayment();
	}
	
	@Test
	public void buy43InchSmartTv() {
		System.out.println("************ buy43InchSmartTv Started *********");
		loginApplicationWithValidData();
		System.out.println("search for 43 inch Smart TV");
		System.out.println("click the releme 43 inch TV");
		System.out.println("verify releme 43 inch TV open in new tab");
		System.out.println("click on Add to Cart");
		plaeOrderAndPerformPayment();
		
	}
	
	@Test
	public void laptop_i5_11th_generation() {
		System.out.println("************ laptop_i5_11th_generation Started *********");
		loginApplicationWithValidData();
		System.out.println("search for laptop i5 11th gen");
		System.out.println("click the releme i5 11th gen processer");
		System.out.println("verify releme laptop open in new tab");
		System.out.println("click on Add to Cart");
		plaeOrderAndPerformPayment();
	}
	
	@Test
	public void plaeOrderAndPerformPayment() {
		System.out.println("click place order");
		System.out.println("click CONTINUE");
		System.out.println("check notification popup and Accept & Continue");
	}
	
}
