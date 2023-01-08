package com.annabathina.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPage {
	public WebDriver driver;
	
	
	@FindBy (xpath = "//a[normalize-space()='Job Titles']") WebElement job_titles_click;
	@FindBy (xpath="//a[normalize-space()='Pay Grades']") WebElement payGrades_click;
	@FindBy (xpath="//a[normalize-space()='Employment Status']") WebElement employmentStatus_click;
	
	public JobPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public JobTitlesPage navigate_to_job_titles() {
		job_titles_click.click();
		return new JobTitlesPage(driver);
	}

	
}
