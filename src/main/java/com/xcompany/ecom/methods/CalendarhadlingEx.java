package com.xcompany.ecom.methods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarhadlingEx {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 250).perform();
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-current-day")).click(); // pick the Current date
		driver.quit();
		
		
	}
	
}
