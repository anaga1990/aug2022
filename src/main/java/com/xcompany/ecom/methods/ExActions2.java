package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExActions2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions actions = new Actions(driver);//object creation
		//actions.scrollToElement(driver.findElement(By.xpath("//legend[normalize-space()='Mouse Hover Example']")));
		//actions.scrollByAmount(1000, 15000);
		actions.keyDown(Keys.SHIFT);
		actions.sendKeys(driver.findElement(By.id("autocomplete")), "naga");
		actions.keyUp(Keys.SHIFT);
		actions.click(driver.findElement(By.xpath("//input[@id='name']")));
		actions.sendKeys(driver.findElement(By.id("autocomplete")), "sjocnjcnwdocjqweioj");
		actions.build().perform();
		
		
	}
}
