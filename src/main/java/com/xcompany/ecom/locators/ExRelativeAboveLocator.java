package com.xcompany.ecom.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ExRelativeAboveLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		By beansLocator=By.xpath("//h4[text()='Beans - 1 Kg']");
		By addtoCart = By.xpath("//button[text()='ADD TO CART']");
		driver.findElement(RelativeLocator.with(addtoCart).above(beansLocator)).click();
		
	}
}
