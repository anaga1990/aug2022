package com.xcompany.ecom.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOfLocatosCss {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("file:///C:/Users/a589240/Downloads/Practice%20Page.html");
		
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='radioButton1'][value='radio2']")).click();
	}
}
