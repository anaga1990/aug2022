package com.annabathina.orm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	public WebDriver driver;
	
	@FindBy(xpath = "//label[contains(text(),'From Date')]/parent::div[1]//following::input[1]") WebElement fromDate_text;
	
	
	@FindBy(xpath = "//li[@class='oxd-calendar-selector-year']//i") WebElement select_year_click;
	@FindBy(xpath = "//li[normalize-space()='2022']") WebElement select_year_from_list_click;
	@FindBy(xpath = "//li[@class='oxd-calendar-selector-month']//i") WebElement select_month_click;
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']/following-sibling::ul/li[8]") WebElement select_month_from_list_click;
	@FindBy(xpath = "//div[@class='oxd-calendar-date'][text()='27']") WebElement select_date_click;
	
	@FindBy(xpath = "//button[@type='submit']") WebElement search_click;
	
	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void setFromDate() throws InterruptedException {
		fromDate_text.sendKeys("2022-04-10");
		search_click.click();
		Thread.sleep(4000);
	}
	
	public void setFromDateDy() throws InterruptedException {
		fromDate_text.click();
		select_year_click.click();
		select_year_from_list_click.click();
		select_month_click.click();
		select_month_from_list_click.click();
		select_date_click.click();
		search_click.click();
	}

	
}
