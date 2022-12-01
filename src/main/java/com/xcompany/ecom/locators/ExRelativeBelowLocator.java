package com.xcompany.ecom.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ExRelativeBelowLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		//RelativeLocator.with(which locator your trying to identify).below(By.Locator(from->based on this locator));
		chromeDriver.findElement(RelativeLocator.with(By.xpath("//button[text()='ADD TO CART']")).below(By.xpath("//h4[text()='Tomato - 1 Kg']"))).click();
		
		
	}
}
