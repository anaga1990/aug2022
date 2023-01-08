package com.annabathina.orm.tests.v2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.annabathina.orm.pages.AdminPage;
import com.annabathina.orm.pages.DashboardPage;
import com.annabathina.orm.pages.LoginPage;
import com.annabathina.orm.pages.QualificationsPage;
import com.annabathina.orm.pages.SkillsPage;

public class GetSkillsTest {
	public WebDriver driver;
	
	@Test(enabled = false)
	public void getSkills() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboardPage =loginPage.loginOrm();
		dashboardPage.verifyDashboardPageText();
		AdminPage adminPage = dashboardPage.navigate_to_AdminPage();
		QualificationsPage qualificationsPage = adminPage.navigate_to_qualifications();
		SkillsPage skillsPage =qualificationsPage.navigate_to_Skills();
		skillsPage.getCountOfResult();
		skillsPage.getSkillsResultByRow();
		dashboardPage=skillsPage.navigate_to_Dashboard_menu();
		dashboardPage.logOutOrm();
	}
	
	@Test
	public void getSkillsByMap() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboardPage =loginPage.loginOrm();
		dashboardPage.verifyDashboardPageText();
		AdminPage adminPage = dashboardPage.navigate_to_AdminPage();
		QualificationsPage qualificationsPage = adminPage.navigate_to_qualifications();
		SkillsPage skillsPage =qualificationsPage.navigate_to_Skills();
		skillsPage.getCountOfResult();
		Map<String, String> actual_skillsResults = skillsPage.setSkillsResultByRow();
		System.out.println(actual_skillsResults);
		List<String> list_of_skills_name = new ArrayList<>();
		List<String> list_of_skills_Description = new ArrayList<>();
		for (Map.Entry<String, String> entry : actual_skillsResults.entrySet()) {
			String key = entry.getKey();
			list_of_skills_name.add(key);
			String val = entry.getValue();
			list_of_skills_Description.add(val);
		}
		
		List<String> expected_list_of_skills_name = new ArrayList<>();
		expected_list_of_skills_name.add("C#");
		expected_list_of_skills_name.add("JavaScript");
		expected_list_of_skills_name.add("Java");
		expected_list_of_skills_name.add("UI/UX Design");
		Assert.assertTrue(list_of_skills_name.containsAll(expected_list_of_skills_name), "default skills are not available in Skills Create Jira");
		
		dashboardPage=skillsPage.navigate_to_Dashboard_menu();
		dashboardPage.logOutOrm();
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
		driver.quit();
	}
	
	
	
	
}
