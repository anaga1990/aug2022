package com.xcompany.ecom.methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExWindowsPopUp {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		System.out.println("before Title Of page ==> "+driver.getTitle());
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(5000);
		String parentWindow = driver.getWindowHandle();
		System.out.println("default Window ==>"+parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		for (String currentWindow : allWindows) {
			if (!(parentWindow.equals(currentWindow))) {
				driver.switchTo().window(currentWindow);
			}
		}
		System.out.println("after Title Of page ==> "+driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Interview Guide']")).click();
		System.out.println("Completed");
		driver.quit();
	}
}
