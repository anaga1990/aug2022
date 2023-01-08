package com.annabathina.orm.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {
	public WebDriver driver;
	
	@FindBy (xpath = "//label[text()='Username']/parent::div/following-sibling::div[1]/input") WebElement username_Text;
	@FindBy (xpath = "(//div[contains(@class,'oxd-select-text--after')])[2]") WebElement status_click;
	@FindBy (xpath = "//span[text()='Enabled']") WebElement status_enabled_click;
	@FindBy (xpath="//button[normalize-space()='Search']") WebElement search_click;
	
	// get the Record Number
	@FindBy (xpath = "//span[normalize-space()='(1) Record Found']") WebElement verify_record_found_or_not;
	// get the result content
	@FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div[1]/div[2]/div[1]") WebElement get_username;
	@FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div[1]/div[3]/div") WebElement get_UserRole;
	@FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div[1]/div[4]/div") WebElement get_EmployeeName;
	@FindBy (xpath = "//div[@class='oxd-table-body']/div[1]/div[1]/div[5]/div") WebElement get_status;

	
	//logout
	@FindBy (xpath = "//span[contains(@class,'oxd-userdropdown-tab')]/i") WebElement userLogoutMenu_click;
	@FindBy (linkText = "Logout") WebElement logout_click;
	public UserManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void searchByUsernameAndStatus() {
		username_Text.sendKeys("admin");
		status_click.click();
		status_enabled_click.click();
		search_click.click();
	}
	
	
	public String getNumberOfRecords() {
		return verify_record_found_or_not.getText(); //(1) Record Found
	}
	
	public List<String> getUserDetails() {
		List<String> userData = new ArrayList<>();
		userData.add(get_username.getText());
		userData.add(get_UserRole.getText());
		userData.add(get_EmployeeName.getText());
		userData.add(get_status.getText());
		return userData;
	}
	
	public Map<String, String> getUserDetailsInMap() {
		Map<String, String> userdata = new HashMap<>();
		userdata.put("username", get_username.getText());
		userdata.put("userrole", get_UserRole.getText());
		userdata.put("employeename", get_EmployeeName.getText());
		userdata.put("status", get_status.getText());
		return userdata;
	}
	
	
	public void logOutOrm() {
		userLogoutMenu_click.click();
		logout_click.click();
	}
	
	
}
