package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame("singleframe");//id
		//driver.switchTo().frame("SingleFrame");//NAME
		//driver.switchTo().frame(0);//INDEX
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Single']/iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("TestZHbasxJBax");
		
	}
}
