package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExExpliciWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Actions actions = new Actions(driver);//object creation
		actions.scrollByAmount(0, 200);
		actions.build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(100));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("newWindowBtn"))));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		driver.findElement(By.id("newWindowBtn")).click();
		//driver.close();
	}
}
