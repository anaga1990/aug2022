package e2e;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class LoginUserData {
	
  @Test(dataProvider = "loginUserDataProvider", enabled = false)
  public void loginTest(String userName, String password) {
	  System.out.println("userName is => "+userName);
	  System.out.println("password is => "+password);
  }

  //dataProvider= methodname where you used @DataProvider
  //dataProviderClass= class name @DataProvider method
  @Test(dataProvider = "userCred", dataProviderClass = com.test.e2e.TestData.class)
  public void loginTestFromDifferentPack(String userName, String password) {
	  System.out.println("userName is => "+userName);
	  System.out.println("password is => "+password);
  }  
  @DataProvider
  public String[][] loginUserDataProvider() {
    return new String[][] {
      new String[] { "naga", "Test1234" },
      new String[] { "venu", "venuTest1234" },
      new String[] { "venki", "venkiTest1234" },
      new String[] { "naresh", "nareshTest1234" },
      new String[] { "Praveen", "PraveenTest1234" },
      new String[] { "bala", "balaTest1234" },
    };
  }
}
