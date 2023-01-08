package com.annabathina.orm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * JobTitlesPage implements in AdminPage -> JobMenu -> job Titles MenuList
 */
public class JobTitlesPage {

	
	public WebDriver driver;
	
	@FindBy (xpath="//button[normalize-space()='Add']") WebElement add_click;
	@FindBy (xpath="//h6[text()='Add Job Title']") WebElement verify_add_job_title_displayed_or_not;
	@FindBy (xpath="//label[text()='Job Title']/parent::div/following-sibling::div[1]/input") WebElement job_Title_text;
	@FindBy (xpath="//label[text()='Job Description']/parent::div/following-sibling::div[1]/textarea") WebElement job_Description_text;
	@FindBy (xpath="//button[@type='submit']") WebElement save_click;
	
	
	//@FindBy (xpath="//div[contains(text(),'Selenium')]/parent::div/following-sibling::div[2]/div/button/i[@class='oxd-icon bi-trash']") WebElement delete_job_click;
	@FindBy (xpath="//p[@class='oxd-text oxd-text--p oxd-text--card-title']") WebElement verify_areYouSure;
	@FindBy (xpath="//i[@class='oxd-icon bi-trash oxd-button-icon']") WebElement yes_Delete_click;
	@FindBy (xpath="//p[contains(.,'Successfully Deleted')]") WebElement verify_successfullyDeleted;
	
	
	@FindBy (xpath="//span[normalize-space()='Dashboard']") WebElement dashboard_menu_click;
	
	public JobTitlesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void add_new_job(String job_Title) throws InterruptedException {
		add_click.click();
		if (verify_add_job_title_displayed_or_not.isDisplayed()) {
			job_Title_text.sendKeys(job_Title);
			job_Description_text.sendKeys("to automate Web application");
			save_click.click();
		}else {
			System.out.println("Add Job Title not Displayed");
		}
	}
	
	
	public void detelet_job(String job_Title) throws InterruptedException {
		By job_to_delete = By.xpath("//div[contains(text(),'"+job_Title+"')]/parent::div/following-sibling::div[2]/div/button/i[@class='oxd-icon bi-trash']");
		Actions actions = new Actions(driver);
		actions.scrollToElement(driver.findElement(job_to_delete)).perform();
		driver.findElement(job_to_delete).click();
		verify_areYouSure.click();
		yes_Delete_click.click();
		if (verify_successfullyDeleted.isDisplayed()) {
			System.out.println(verify_successfullyDeleted.getText());
		}
	}
	
	public DashboardPage navigate_to_Dashboard_menu() {
		dashboard_menu_click.click();
		return new DashboardPage(driver);
	}

}
