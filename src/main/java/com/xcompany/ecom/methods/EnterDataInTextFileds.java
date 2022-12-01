package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInTextFileds {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//sendKeys() will to do Type the data in text filed
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("india");
		driver.findElement(By.cssSelector("#name")).sendKeys("NAGARJUNA");
		//driver.findElement(By.xpath("//button[normalize-space()='Home']")).submit();
		//Exception in thread "main" java.lang.UnsupportedOperationException: To submit an element, it must be nested inside a form element

	}
}
