package com.test;

import org.testng.annotations.Test;

public class TestNgTestAnnotation2 {
	
	/**
	 * if you don't provide priority for all @test methods then methods will executed Alphabet Order 
	 * 
	 * if you provide priority large '-'ve value to '+'ve value, default priority = 0
	 */
	
	@Test
	public void loginTestOne() {
		System.out.println("loginTestOne entered username");
		System.out.println("loginTestOne entered Password");
		System.out.println("loginTestOne click on Login Button");
	}
	
	@Test(priority = -11)
	public void loginTestTwo() {
		System.out.println("loginTestTwo entered username");
		System.out.println("loginTestTwo entered Password");
		System.out.println("loginTestTwo click on Login Button");
	}
	
	
	@Test(priority = -1)
	public void loginTestThree() {
		System.out.println("loginTestThree entered username");
		System.out.println("loginTestThree entered Password");
		System.out.println("loginTestThree click on Login Button");
	}
	
	@Test(priority = 4)
	public void loginTestFour() {
		System.out.println("loginTestFour entered username");
		System.out.println("loginTestFour entered Password");
		System.out.println("loginTestFour click on Login Button");
	}
	
	
}
