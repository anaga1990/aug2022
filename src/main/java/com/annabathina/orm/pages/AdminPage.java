package com.annabathina.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	public WebDriver driver;
	
	
	@FindBy (xpath = "//span[normalize-space()='Job']") WebElement job_click;
	@FindBy (xpath = "//span[normalize-space()='Qualifications']") WebElement qualifications_click;
	
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public JobPage navigate_to_Job() {
		job_click.click();
		return new JobPage(driver);
	}
	
	public UserManagementPage navigate_to_userManagement() {
		return new UserManagementPage(driver);
	}

	public QualificationsPage navigate_to_qualifications() {
		qualifications_click.click();
		return new QualificationsPage(driver);
	}
}
