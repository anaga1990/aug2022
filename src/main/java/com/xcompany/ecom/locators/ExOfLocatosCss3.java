package com.xcompany.ecom.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOfLocatosCss3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.findElement(By.cssSelector("img[class='img-responsive blur-up lazyautosizes lazyloaded']")).click();
		driver.findElement(By.cssSelector("img[src$='onion.jpg']")).click();
	}
}
