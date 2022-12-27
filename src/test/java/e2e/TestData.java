package e2e;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider
	public String[][] dp() {
		return new String[][] { new String[] { "1naga", "Test1234" }, new String[] { "2venu", "venuTest1234" },
				new String[] { "3venki", "venkiTest1234" }, new String[] { "4naresh", "nareshTest1234" },
				new String[] { "5Praveen", "PraveenTest1234" }, new String[] { "6bala", "balaTest1234" }, };
	}

	@DataProvider
	public Integer[][] marksData() {
		Integer[][] marks = new Integer[][] { { 12, 23, 36, 84, 89, 47 }, { 50, 78, 36, 90, 72, 59 } };
		return marks;
	}
}
