package com.xcompany.ecom.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOfLocatosCss2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/a589240/Downloads/Practice%20Page.html");
		driver.findElement(By.cssSelector("input#r1")).click();
	}
}
