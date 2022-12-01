package com.xcompany.ecom.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOfLocatosXpath2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@alt,'Beans')]/parent::div/following-sibling::div[@class='product-action']/button")).click();
	}
	
}