package com.xcompany.ecom.methods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExChromeOptions {
	public static void main(String[] args)  {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		chromeOptions.addArguments("window-size=1980,1000");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		screenShot(driver, "BeforeRadioClick");
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		screenShot(driver, "Radio1Click");
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		screenShot(driver, "Radio2Click");
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		screenShot(driver, "Radio3Click");
		driver.findElement(By.id("checkBoxOption1")).click();
		screenShot(driver, "option1Click");
		driver.quit();
		System.out.println("test completed");
	}
	
	public static void screenShot(WebDriver driver, String nameOfScreenShot) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcOfSnap=screenshot.getScreenshotAs(OutputType.FILE);
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("YYYY_MM_dd_HH_mm_ss_SSS");
		String filePattern = dateTime.format(dateFormater);
		
		try {
			FileUtils.copyFile(srcOfSnap, new File(System.getProperty("user.dir")+"/"+filePattern +"_"+nameOfScreenShot+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}














