package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MethodWithTestAnnotationTest {
	@Test
	public void f() {
		System.out.println("************ @TEST Started *********");
		System.out.println("entered valid username");
		System.out.println("entered valid Password");
		System.out.println("click on Login Button");
		System.out.println("Verify the Homepage Displyed & Title of the page");
		System.out.println("************ @TEST Finshed *********");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("************ @BeforeMethod Started *********");
		System.out.println("open User Specified Web Browser");
		System.out.println("Web Browser headless and Cookies & Max");
		System.out.println("hit the base URL");
		System.out.println("************ @BeforeMethod Finshed *********");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("************ @AfterMethod Started *********");
		System.out.println("Logout the application");
		System.out.println("Close the Web Browser");
		System.out.println("************ @AfterMethod Finshed *********");
	}

}
