package com.xcompany.ecom;

import org.openqa.selenium.chrome.ChromeDriver;

public class CallChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//open the chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize you chrome window opened By driver
		driver.manage().window().maximize(); //maxmize you window
		
		// open Base URL https://rahulshettyacademy.com/AutomationPractice/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
}
