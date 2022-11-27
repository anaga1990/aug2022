package com.xcompany.ecom.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOfLocatosXpath {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//https://www.w3schools.com/xml/xpath_axes.asp
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2' or @value='option2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3' and @value='option3']")).click();
		System.out.println(driver.findElement(By.xpath("//td[text()='18']/preceding-sibling::td[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//td[text()='18']/parent::tr/preceding-sibling::tr[1]/td[4]")).getText());
		driver.quit();
	}
}