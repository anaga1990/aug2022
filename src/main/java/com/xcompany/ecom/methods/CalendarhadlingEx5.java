package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalendarhadlingEx5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		Actions actions = new Actions(driver);
		// actions.scrollToElement(driver.findElement(By.cssSelector("#fromcity"))).perform();
		actions.scrollByAmount(0, 300).perform();
		driver.findElement(By.id("dob")).click();
		Select select = new Select(driver.findElement(By.cssSelector(".ui-datepicker-month")));
		select.selectByIndex(10);
		select = new Select(driver.findElement(By.cssSelector(".ui-datepicker-year")));
		select.selectByValue("1990");
		driver.findElement(By.xpath("//a[contains(text(),'27')]")).click();
		Thread.sleep(4000);
		
		driver.quit();
		
		
	}
}
