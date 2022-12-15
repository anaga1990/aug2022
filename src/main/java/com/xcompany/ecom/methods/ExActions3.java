package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExActions3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions actions = new Actions(driver);//object creation
		actions.sendKeys(driver.findElement(By.id("autocomplete")), "sjocnjcnwdocjqweioj");
		actions.scrollByAmount(0, 830);
		actions.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']")));
		actions.click(driver.findElement(By.cssSelector("a[href='#top']")));
		actions.build().perform();
	}
}
