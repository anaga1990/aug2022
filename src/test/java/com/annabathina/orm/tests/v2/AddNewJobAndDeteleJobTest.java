package com.annabathina.orm.tests.v2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.annabathina.orm.pages.AdminPage;
import com.annabathina.orm.pages.DashboardPage;
import com.annabathina.orm.pages.JobPage;
import com.annabathina.orm.pages.JobTitlesPage;
import com.annabathina.orm.pages.LoginPage;

public class AddNewJobAndDeteleJobTest {
	public WebDriver driver;
	
	
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
		driver.quit();
	}
	
	
	/**
	 * addNewJobInJobTitles action performing on AdminPage -> JobMenu -> job Titles MenuList
	 * @throws InterruptedException 
	 */
	
	@Test
	public void addNewJobInJobTitles() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboardPage =loginPage.loginOrm();
		dashboardPage.verifyDashboardPageText();
		AdminPage adminPage = dashboardPage.navigate_to_AdminPage();
		JobPage jobPage = adminPage.navigate_to_Job();
		JobTitlesPage jobTitlesPage = jobPage.navigate_to_job_titles();
		jobTitlesPage.add_new_job("JAVA_WITH_Selenium");
		dashboardPage=jobTitlesPage.navigate_to_Dashboard_menu();
		dashboardPage.logOutOrm();
	}
	
	@Test
	public void deleteJobInJobTitles() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboardPage =loginPage.loginOrm();
		dashboardPage.verifyDashboardPageText();
		AdminPage adminPage = dashboardPage.navigate_to_AdminPage();
		JobPage jobPage = adminPage.navigate_to_Job();
		JobTitlesPage jobTitlesPage = jobPage.navigate_to_job_titles();
		jobTitlesPage.detelet_job("JAVA_WITH_Selenium");
		dashboardPage=jobTitlesPage.navigate_to_Dashboard_menu();
		dashboardPage.logOutOrm();
	}
}
