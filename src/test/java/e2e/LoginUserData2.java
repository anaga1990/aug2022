package e2e;

import org.testng.annotations.Test;

public class LoginUserData2 {
	
  @Test(dataProvider = "dp", dataProviderClass = e2e.TestData.class)
  public void loginTest(Object userName, Object password) {
	  System.out.println("userName is => "+userName);
	  System.out.println("password is => "+password);
  }

  
}
