package e2e;

import org.testng.annotations.Test;

public class APIModuleTest2 {
	@Test( groups = {"smoke"} )
	public void apiLoginApplication() {
		System.out.println("dependsOnGroups apiLoginApplication");
	}
	
	@Test( groups = {"smoke"} , dependsOnMethods = {"apiLoginApplication"})
	public void apiLogOutApplication() {
		System.out.println("dependsOnGroups apiLogOutApplication");
	}
	
	
	@Test( groups = {"regressionTest"}, dependsOnGroups = {"smoke"})
	public void addAddress_api() {
		System.out.println("dependsOnGroups addAddress_api");
	}
	

}
