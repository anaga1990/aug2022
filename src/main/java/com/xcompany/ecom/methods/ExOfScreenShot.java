package com.xcompany.ecom.methods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOfScreenShot {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File srcfile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("C:/Testing-AUG-2022/Selenium_WS/landingPage.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		File srcfile1 = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile1, new File("C:\\Testing-AUG-2022\\Selenium_WS\\RadioButton1Click.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		File srcfile2 = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile2, new File("C:\\Testing-AUG-2022\\Selenium_WS\\RadioButton2Click.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		File srcfile3 = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile3, new File("C:\\Testing-AUG-2022\\Selenium_WS\\RadioButton3Click.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
		driver.quit();
	}
}














