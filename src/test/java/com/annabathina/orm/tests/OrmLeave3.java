package com.annabathina.orm.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrmLeave3 {
	@Test
	public void testLoginOrm() throws InterruptedException {
		var timeOut = 1000;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Leave']")).click();
		if (driver.findElement(By.xpath("//h5[normalize-space()='Leave List']")).isDisplayed()) {
			driver.findElement(By.xpath("//label[contains(text(),'From Date')]/parent::div[1]//following::input[1]")).click();
			Thread.sleep(timeOut);
			//select Year
			driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-year']//i")).click();
			Thread.sleep(timeOut);
			driver.findElement(By.xpath("//li[normalize-space()='2022']")).click();
			Thread.sleep(timeOut);
			//select Month
			driver.findElement(By.xpath("//li[@class='oxd-calendar-selector-month']//i")).click();
			Thread.sleep(timeOut);
			driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/following-sibling::ul/li[8]")).click();
			Thread.sleep(timeOut);
			//select Date
			driver.findElement(By.xpath("//div[@class='oxd-calendar-date'][text()='10']")).click();
			Thread.sleep(timeOut);
			Actions  actions = new Actions(driver);
			actions.scrollToElement(driver.findElement(By.xpath("//h5[normalize-space()='Leave List']")));
			actions.perform();
			Thread.sleep(timeOut);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(timeOut);
			var get_number_of_records=driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/span")).getText();
			if ("No Records Found".contains(get_number_of_records)) {
				var text = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']")).getText();
				var data = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")).getText();
				System.out.println(text);
				System.out.println(data);
			}else {
				System.out.println("we found some Records");
			}
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/span")).getText());
		Thread.sleep(30000);
		driver.findElement(By.xpath("//span[contains(@class,'oxd-userdropdown-tab')]/i")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Test Is Completed");
		driver.quit();

	}


}
