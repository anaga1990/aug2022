package com.annabathina.orm.tests.v2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.annabathina.orm.pages.DashboardPage;
import com.annabathina.orm.pages.LeavePage;
import com.annabathina.orm.pages.LoginPage;

public class GetCurrentLeaveListTest {
	public WebDriver driver;
	
	@Test
	public void getCurrentLeaveListTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboardPage =loginPage.loginOrm();
		dashboardPage.verifyDashboardPageText();
		LeavePage leavePage = dashboardPage.navigate_to_LeavePage();
		leavePage.setFromDateDy();
		Thread.sleep(4000);
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
	public void closeBrowser() throws InterruptedException {
		//driver.quit();
	}
}
