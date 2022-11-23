package com.xcompany.ecom.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOfLocatos2 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//name-locator (if your action tag have attribute as "name" 
		driver.findElement(By.name("radioButton")).click();
		
		/*
		 * partialLinkText- locator ( if your action tag= "a" b/w starting and ending tag we must have data/text for there we can use small pot of data
		 * <a href="https://rahulshettyacademy.com/documents-request" class="blinkingText">Free Access to InterviewQues/ResumeAssistance/Material</a>
		 * <a href="https://www.rahulshettyacademy.com/"><button class="btn btn-primary">Home</button></a>
		 */
		driver.findElement(By.partialLinkText("ome")).click();
		
		
	}
}
