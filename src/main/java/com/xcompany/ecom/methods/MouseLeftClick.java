package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseLeftClick {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//click() will to do MouseLeftCLick Action/task
		driver.findElement(By.cssSelector("input[value='radio3']")).click();
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
	}
}
