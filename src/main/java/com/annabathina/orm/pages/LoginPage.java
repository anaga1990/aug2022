package com.annabathina.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	//driver.findElement(By.xpath("//input[@placeholder='Username']"))
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement username_text;
	@FindBy (xpath = "//input[@placeholder='Password']") WebElement password_text;
	@FindBy (xpath = "//button[normalize-space()='Login']") WebElement login_button;
	
	//By username = By.xpath("//input[@placeholder='Username']");
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void enterTheUsername() {
		username_text.sendKeys("Admin");
	}
	
	public void enterThePassword() {
		password_text.sendKeys("admin123");
	}
	
	public DashboardPage clickOnLogin() {
		login_button.click();
		return new DashboardPage(driver);
		
	}
	
	public DashboardPage loginOrm() {
		username_text.sendKeys("Admin");
		password_text.sendKeys("admin123");
		login_button.click();
		return new DashboardPage(driver);
	}
	
	/*
	public String getLoginpageTitle() {
		String loginPageTitle=driver.getTitle();
		return loginPageTitle;
	}
	*/
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
}
