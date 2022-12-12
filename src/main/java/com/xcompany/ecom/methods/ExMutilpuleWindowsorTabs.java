package com.xcompany.ecom.methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExMutilpuleWindowsorTabs {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(5000);
		driver.findElement(By.id("newWindowsBtn")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String currentWindow : allWindows) {
			if (!(parentWindow.equals(currentWindow))) {
				driver.switchTo().window(currentWindow);
				driver.manage().window().maximize();
				System.out.println("Windows Swithing and get Title  => " + driver.getTitle());
				try {
					boolean isBoolen = driver.findElement(By.xpath("//h1[normalize-space()='Register']")).isDisplayed(); // tag
					System.out.println("isDisplayed method Not given Error ==> " + isBoolen);
					if (isBoolen == true) {
						driver.close();
					}
				} catch (NoSuchElementException e) {
				}
			}
		}
		driver.switchTo().window(parentWindow);
		Set<String> allCurrentWindows = driver.getWindowHandles();
		for (String string : allCurrentWindows) {
			if (parentWindow != string) {
				driver.switchTo().window(string);
				System.out.println("2nd getWindowHandles" + driver.getTitle());
			}
		}
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("welcome to windows");

	}
}
