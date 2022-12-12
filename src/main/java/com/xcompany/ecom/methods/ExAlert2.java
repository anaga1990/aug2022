package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExAlert2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Naga");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		//get alert data before click on ok or Cancel other wise org.openqa.selenium.NoAlertPresentException: no such alert
		if("Hello Naga, Are you sure you want to confirm?".equalsIgnoreCase(driver.switchTo().alert().getText())) {
			System.out.println("if -> Alert Data matched");
		}else {
			System.out.println("ELSE -> Alert Data mis matched");
		}
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println("Completed");
		Thread.sleep(2000);
		driver.quit();
	}
}
