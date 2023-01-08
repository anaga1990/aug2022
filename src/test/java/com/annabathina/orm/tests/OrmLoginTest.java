package com.annabathina.orm.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrmLoginTest {
	@Test
	public void testLoginOrm() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getShot(driver, "base_url");
		//Login page
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title is " + actualTitle + " and Verifyed SuccessFully");
		} else {
			System.out.println("Title is " + actualTitle + " and Verifyed Not-SuccessFully");
		}
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		getShot(driver, "after Login username and passowrd added");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		String actualHomePageText = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		String expectedHomePageText = "Dashboard";
		if (actualHomePageText.equalsIgnoreCase(expectedHomePageText)) {
			System.out.println(actualHomePageText + " and Verifyed SuccessFully");
		} else {
			System.out.println(actualHomePageText + " and Verifyed Not-SuccessFully");
		}
		Thread.sleep(2000);
		getShot(driver, "after Login in Clicked");
		driver.findElement(By.xpath("//span[contains(@class,'oxd-userdropdown-tab')]/i")).click();
		getShot(driver, "before Logout in Clicked");
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("Test Is Completed");
		driver.quit();

	}

	public static void getShot(WebDriver driver, String sanpName) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./orm_login_test"+sanpName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
