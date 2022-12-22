package com.xcompany.ecom.methods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarhadlingEx4 {
	public static void main(String[] args) throws InterruptedException {
		userMonthAndYear(217);
		Thread.sleep(10000);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String futureDate=userDate(217);
		
		//calendar display
		driver.findElement(By.cssSelector("input#onward_cal")).click();
		while(!(driver.findElement(By.cssSelector("td.monthTitle")).getText().equalsIgnoreCase(userMonthAndYear(217)) || driver.findElement(By.cssSelector("td.monthTitle")).getText().equalsIgnoreCase(userMonthAndYearDF(217)))) {
			//Thread.sleep(1000);
			System.out.println(" ==<> "+driver.findElement(By.cssSelector("td.monthTitle")).getText());
			driver.findElement(By.cssSelector("td.next")).click();
		}
		
		driver.findElement(By.xpath("//td[text()='"+futureDate+"']")).click();
		
		Thread.sleep(15000);
		
		driver.quit();
		
		
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
		DateTimeFormatter formatterOfMonthAndYear = DateTimeFormatter.ofPattern("MMM YYYY");
		LocalDate myDate = date.plusDays(plusNumberOfDatesToAddToCurrentDate);
		String futureMonthAndYear=myDate.format(formatterOfMonthAndYear);
		System.out.println("futureMonthAndYear  => "+futureMonthAndYear);
		return futureMonthAndYear;
	}
	public static String userMonthAndYearDF(long plusNumberOfDatesToAddToCurrentDate) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatterOfMonthAndYear = DateTimeFormatter.ofPattern("MMMM YYYY");
		LocalDate myDate = date.plusDays(plusNumberOfDatesToAddToCurrentDate);
		String futureMonthAndYear=myDate.format(formatterOfMonthAndYear);
		System.out.println("futureMonthAndYear  => "+futureMonthAndYear);
		return futureMonthAndYear;
	}
}
