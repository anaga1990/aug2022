package com.annabathina.orm.tests.v2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.annabathina.orm.pages.AdminPage;
import com.annabathina.orm.pages.DashboardPage;
import com.annabathina.orm.pages.LoginPage;
import com.annabathina.orm.pages.UserManagementPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class VerifyUserDetailsInOrmAdminMenuUserManagementV2 {

	public WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void verifyAdminUserDetailsInAdminMenu() {
		LoginPage loginPage = new LoginPage(driver);
		String actual_login_page_title = loginPage.getLoginPageTitle();
		softAssert.assertEquals(actual_login_page_title, "OrangeHRM");
		DashboardPage dashboardPage = loginPage.loginOrm();
		String actual_DashboardPageText=dashboardPage.getDashboardPageText();
		softAssert.assertEquals(actual_DashboardPageText, "Dashboard","Verify the text in DashboardPage failed");
		AdminPage adminPage = dashboardPage.navigate_to_AdminPage();
		UserManagementPage userManagementPage = adminPage.navigate_to_userManagement();
		userManagementPage.searchByUsernameAndStatus();
		String actualNumberOfrecords = userManagementPage.getNumberOfRecords();//(1) Record Found
		softAssert.assertEquals(actualNumberOfrecords.trim(), "(1) Record Found");
		System.out.println("user datesils in List ==> "+userManagementPage.getUserDetails());
		System.out.println("user datesils in Map ==> "+userManagementPage.getUserDetailsInMap());
		userManagementPage.logOutOrm();
		softAssert.assertAll();
	}
	
	
	@BeforeMethod
	public void OpenApplicationInWebBrowser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}

}
