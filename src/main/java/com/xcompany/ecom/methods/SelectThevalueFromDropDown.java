package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectThevalueFromDropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Thread.sleep(1000);
		// dropdown handling we have class called Select
		Select select = new Select(dropdown);
		select.selectByValue("option2");
		Thread.sleep(1000);
		select.selectByVisibleText("Select");
		Thread.sleep(1000);
		select.selectByIndex(1);
		System.out.println("is multi Select DropDown : "+select.isMultiple());
		driver.quit();
	}
}
