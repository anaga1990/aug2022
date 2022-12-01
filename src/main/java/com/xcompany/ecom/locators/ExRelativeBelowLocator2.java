package com.xcompany.ecom.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ExRelativeBelowLocator2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		By basedOnLocator = By.xpath("//h4[text()='Cauliflower - 1 Kg']");
		By tobeClick=By.cssSelector("a.increment");
		By relativeLocate=RelativeLocator.with(tobeClick).below(basedOnLocator);
		chromeDriver.findElement(relativeLocate).click();
		
		By locatorOFAddtoCart = By.cssSelector("div.product-action button");
		chromeDriver.findElement(RelativeLocator.with(locatorOFAddtoCart).below(basedOnLocator)).click();
		//chromeDriver.findElement(RelativeLocator.with(tobeClick).below(basedOnLocator)).click();
		
	}
}
