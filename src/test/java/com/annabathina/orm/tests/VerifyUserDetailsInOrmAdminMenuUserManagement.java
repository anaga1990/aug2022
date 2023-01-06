package com.annabathina.orm.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class VerifyUserDetailsInOrmAdminMenuUserManagement {
	@Test
	public void testLoginOrm() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//click the Admin menu
		driver.findElement(By.xpath("(//*[name()='svg'])[2]")).click();
		boolean isAdminMenuOpened = driver.findElement(By.xpath("//h6[text()='User Management']")).isDisplayed();
		System.out.println("Admin menu Displayed in DOM or GUI ==> "+isAdminMenuOpened);
		// search by userName
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//label[contains(text(),'Username')]"))).sendKeys("Admin");
		driver.findElement(RelativeLocator.with(By.tagName("i")).below(By.xpath("//label[contains(text(),'User Role')]"))).click();
		driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		String numberRecords = driver.findElement(By.xpath("//span[normalize-space()='(1) Record Found']")).getText();
		System.out.println("Number Of records after Search in Usermanagement"+numberRecords);
		driver.findElement(By.xpath("//span[contains(@class,'oxd-userdropdown-tab')]/i")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Test Is Completed");
		driver.quit();
	}

	

}
