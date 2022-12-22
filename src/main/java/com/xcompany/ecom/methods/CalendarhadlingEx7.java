package com.xcompany.ecom.methods;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarhadlingEx7 {
	public static void main(String[] args) throws InterruptedException {
		long value = 215;
		String monthAndYear = userMonthAndYear(value);
		String dateToPick = userDate(value);

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Actions actions = new Actions(driver);
		actions.click(driver.findElement(By.xpath("//li[@data-cy='roundTrip']"))).perform();
		driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();
		driver.findElement(By.xpath("//label[contains(@for,'departure')]/span")).click();
		
		Boolean isSelected = false;
		while (true) {
			List<WebElement> lisOfElements = driver
					.findElements(By.xpath("//div[@class='DayPicker-Month']/div[1]/div[1]"));
			for (WebElement tag : lisOfElements) {
				if (tag.getText().equalsIgnoreCase(userMonthAndYear(value))) {
					String ele = "//div[contains(text(),'" + monthAndYear
							+ "')]/parent::div/following-sibling::div[2]/div/div/div/p[text()='" + dateToPick + "']";
					driver.findElement(By.xpath(ele)).click();
					isSelected = true;
					break;
				}
			}
			if(isSelected == false) {
				Thread.sleep(500);
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			} else {
				break;
			}
		}

		//driver.quit();

	}

	public static String userMonthAndYear(long plusNumberOfDatesToAddToCurrentDate) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatterOfMonthAndYear = DateTimeFormatter.ofPattern("MMMM YYYY");
		LocalDate myDate = date.plusDays(plusNumberOfDatesToAddToCurrentDate);
		String futureMonthAndYear = myDate.format(formatterOfMonthAndYear);
		System.out.println("futureMonthAndYear  => " + futureMonthAndYear);
		return futureMonthAndYear;
	}

	public static String userDate(long plusNumberOfDatesToAddToCurrentDate) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d");
		LocalDate myDate = date.plusDays(plusNumberOfDatesToAddToCurrentDate);
		String futureDate = myDate.format(dateTimeFormatter);
		System.out.println("futureDate  => " + futureDate);
		return futureDate;
	}
}
