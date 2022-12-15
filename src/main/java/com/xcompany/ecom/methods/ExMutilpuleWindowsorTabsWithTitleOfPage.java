package com.xcompany.ecom.methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExMutilpuleWindowsorTabsWithTitleOfPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		actions.scrollToElement(driver.findElement(By.xpath("//h2[normalize-space()='Connect With us']")));
		actions.build().perform();
		driver.findElement(By.id("newWindowsBtn")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String currentWindow : allWindows) {
			System.out.println("for loop window Id ==> "+currentWindow);
			if (!(parentWindow.equals(currentWindow))) {
				driver.switchTo().window(currentWindow);
				driver.manage().window().maximize();
				System.out.println("Windows Swithing and get Title  => " + driver.getTitle());
				String myTitle = "Basic Controls - H Y R Tutorials";
				if (!myTitle.equalsIgnoreCase(driver.getTitle())) {
					System.out.println("closing page name as ==> "+driver.getTitle());
					driver.close();
				}
			}
		}
		allWindows = driver.getWindowHandles();
		for (String currentWindow : allWindows) {
			System.out.println("for loop window Id ==> "+currentWindow);
			if (!(parentWindow.equals(currentWindow))) {
				driver.switchTo().window(currentWindow);
			}
		}
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("welcome to windows");

	}
}
