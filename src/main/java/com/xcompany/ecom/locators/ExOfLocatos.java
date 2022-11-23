package com.xcompany.ecom.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOfLocatos {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// 8 main locators
		//id-locator (if your action tag have attribute call "id" 
		driver.findElement(By.id("checkBoxOption3")).click();
		
		/*
		 * className- locator ( if your action tag have attribute as "class" for example Below
		 * <input value="radio1" name="radioButton" class="radioButton" type="radio">
		 */
		driver.findElement(By.className("radioButton")).click();
		
		/*
		 * linkText- locator ( if your action tag= "a" b/w starting and ending tag we must have data/text
		 * <a href="https://rahulshettyacademy.com/documents-request" class="blinkingText">Free Access to InterviewQues/ResumeAssistance/Material</a>
		 * <a href="https://www.rahulshettyacademy.com/"><button class="btn btn-primary">Home</button></a>
		 */
		driver.findElement(By.linkText("Home")).click();
	}
}
