package com.annabathina.orm.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualificationsPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[normalize-space()='Skills']")
	WebElement skills_click;

	@FindBy(xpath = "//h6[contains(.,'Skills')]")
	WebElement verify_skills_displayed_or_not;


	public QualificationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public SkillsPage navigate_to_Skills() {
		skills_click.click();
		return new SkillsPage(driver);
	}

}
