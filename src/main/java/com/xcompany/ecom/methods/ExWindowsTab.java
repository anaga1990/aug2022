package com.xcompany.ecom.methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ExWindowsTab {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		System.out.println("before Title Of page ==> "+driver.getTitle());
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(5000);
		String parentWindow = driver.getWindowHandle();
		System.out.println("default Window ==>"+parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		for (String currentWindow : allWindows) {
			if(!parentWindow.equals(currentWindow)) {
				driver.switchTo().window(currentWindow);
			}
		}
		System.out.println("after Title Of page ==> "+driver.getTitle());
		driver.findElement(By.xpath("//h3/span"));
		String verifyData = driver.findElement(RelativeLocator.with(By.xpath("//h3/span")).above(By.cssSelector(".btn.btn-theme.btn-sm.btn-min-block"))).getText();
		System.out.println("Verify Data ==> "+verifyData);
		System.out.println("Completed");
		driver.quit();
	}
}
