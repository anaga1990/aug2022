package com.annabathina.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {

	public WebDriver driver;
	
	@FindBy (xpath = "//h6[normalize-space()='Dashboard']") WebElement dashboard_text_verify;
	@FindBy (xpath = "//span[contains(@class,'oxd-userdropdown-tab')]/i") WebElement userLogoutMenu_click;
	@FindBy (linkText = "Logout") WebElement logout_click;
	@FindBy (xpath="//span[text()='Admin']") WebElement admin_menu;
	@FindBy (xpath="//span[normalize-space()='PIM']") WebElement pim_menu;
	@FindBy (xpath="//span[normalize-space()='Leave']") WebElement leave_menu;
	
	
	@FindBy (xpath="//span[normalize-space()='Dashboard']") WebElement dashboard_menu_click;
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void verifyDashboardPageText() {
		String actual_dashbord_text=dashboard_text_verify.getText().trim();
		Assert.assertEquals(actual_dashbord_text, "Dashboard", "expected is Dashboard but actually we got ==> "+actual_dashbord_text);
		//Assert means hard Assert , hard assert will top execution if assert/Verification failed
		System.out.println("verifyDashboardPageText() Assert Success");
	}
	
	public String getDashboardPageText() {
		return dashboard_text_verify.getText().trim();
		
	}
	public void logOutOrm() {
		userLogoutMenu_click.click();
		logout_click.click();
	}
	
	
	public AdminPage navigate_to_AdminPage() {
		admin_menu.click();
		return new AdminPage(driver);
	}
	
	public DashboardPage navigate_to_Dashboard_menu() {
		dashboard_menu_click.click();
		return new DashboardPage(driver);
	}
	
	public LeavePage navigate_to_LeavePage() {
		leave_menu.click();
		return new LeavePage(driver);
	}
	
	
	
	

}
