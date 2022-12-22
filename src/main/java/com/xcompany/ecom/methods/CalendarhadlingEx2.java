package com.xcompany.ecom.methods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarhadlingEx2 {
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
		String futureDate=userDate(30);
		String futureMonthAndYear=userMonthAndYear(30);
		
		if(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().equalsIgnoreCase(futureMonthAndYear)) {
			driver.findElement(By.xpath("//a[text()='"+futureDate+"']")).click();
		}else {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			if(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().equalsIgnoreCase(futureMonthAndYear)) {
				driver.findElement(By.xpath("//a[text()='"+futureDate+"']")).click();
			}
		}
		
		//driver.quit();
		
		
	}
	
	public static String userDate(long plusNumberOfDatesToAddToCurrentDate) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d");
		LocalDate myDate = date.plusDays(plusNumberOfDatesToAddToCurrentDate);
		String futureDate=myDate.format(dateTimeFormatter);
		System.out.println("futureDate  => "+futureDate);
		return futureDate;
	}
	
	public static String userMonthAndYear(long plusNumberOfDatesToAddToCurrentDate) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatterOfMonthAndYear = DateTimeFormatter.ofPattern("MMMM YYYY");
		LocalDate myDate = date.plusDays(plusNumberOfDatesToAddToCurrentDate);
		String futureMonthAndYear=myDate.format(formatterOfMonthAndYear);
		System.out.println("futureMonthAndYear  => "+futureMonthAndYear);
		return futureMonthAndYear;
	}
}
