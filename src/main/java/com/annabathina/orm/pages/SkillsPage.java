package com.annabathina.orm.pages;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	public  WebDriver driver;
	
	@FindBys(@FindBy(xpath = "//div[@class='oxd-table-body']/div")) List<WebElement> findAllSkills;
	
	@FindBy (xpath="//span[normalize-space()='Dashboard']") WebElement dashboard_menu_click;
	public SkillsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public int getCountOfResult() {
		System.out.println(findAllSkills.size());
		return findAllSkills.size();
	}
	
	public void getSkillsResultByRow() {
		int numberOfSkills=findAllSkills.size();
		for(int i= 1; i <=numberOfSkills;i++) {
			String SkillName=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[2]/div")).getText();
			String Description=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[3]/div")).getText();
			System.out.println(SkillName+" => "+Description);
		}
	}
	
	public Map<String, String> setSkillsResultByRow() {
		int numberOfSkills=findAllSkills.size();
		Map<String, String> skillsMap = new LinkedHashMap<>();
		for(int i= 1; i <=numberOfSkills;i++) {
			String SkillName=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[2]/div")).getText();
			String Description=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div[1]/div[3]/div")).getText();
			skillsMap.put(SkillName, Description);
		}
		return skillsMap;
	}
	
	public DashboardPage navigate_to_Dashboard_menu() {
		dashboard_menu_click.click();
		return new DashboardPage(driver);
	}

}
