package com.xcompany.ecom.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ExRelativeNear {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(1000);
		By tomatoLocator = By.xpath("//h4[text()='Tomato - 1 Kg']");
		By locatorOFAddtoCart = By.cssSelector("div.product-action button");
		chromeDriver.findElement(RelativeLocator.with(locatorOFAddtoCart).near(tomatoLocator,200)).click();
	}
}
