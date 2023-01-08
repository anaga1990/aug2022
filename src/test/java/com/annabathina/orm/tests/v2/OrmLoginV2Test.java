package com.annabathina.orm.tests.v2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.annabathina.orm.pages.DashboardPage;
import com.annabathina.orm.pages.LoginPage;

public class OrmLoginV2Test {
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApplicationInWebBrowser() { // setup
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test
	public void ormApplicationLoginAndlogoutVerification() {
		System.out.println("ormApplicationLoginAndlogoutVerification Started");
		LoginPage loginPage = new LoginPage(driver);
		String actual_login_page_title=loginPage.getLoginPageTitle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual_login_page_title, "OrangeHRM", "ormApplicationLoginAndlogoutVerification softassert Failed");
		loginPage.enterTheUsername();
		loginPage.enterThePassword();
		DashboardPage dashboardPage = loginPage.clickOnLogin();
		dashboardPage.verifyDashboardPageText();
		dashboardPage.logOutOrm();
		System.out.println("ormApplicationLoginAndlogoutVerification End");
		softAssert.assertAll();
	}
	
	@Test
	public void ormApplicationLoginAndlogoutVerificationV2() {
		System.out.println("ormApplicationLoginAndlogoutVerificationV2 Started");
		LoginPage loginPage = new LoginPage(driver);
		String actual_login_page_title=loginPage.getLoginPageTitle();
		Assert.assertEquals(actual_login_page_title, "OrangeHRM","ormApplicationLoginAndlogoutVerificationV2 HardAsster Failed"); //hard Assert
		DashboardPage dashboardPage = loginPage.loginOrm();
		dashboardPage.verifyDashboardPageText();
		dashboardPage.logOutOrm();
		System.out.println("ormApplicationLoginAndlogoutVerificationV2 End");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
