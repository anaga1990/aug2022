package com.test.e2e;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider
	public Integer[][] marksData() {
		Integer[][] marks = new Integer[][] { { 12, 23, 36, 84, 89, 47 }, { 50, 78, 36, 90, 72, 59 } };
		return marks;
	}

	@DataProvider
	public String[][] userCred() {
		String[][] userDataDetails = new String[][] { { "1naga", "Test1234" }, { "3venki", "venkiTest1234" } };
		return userDataDetails;
	}
	
	@DataProvider
	public String[] nameTest() {
		String[] names = new String[] {
			"naga", "jeva", "see"	
		};
		return names;
	}

}
