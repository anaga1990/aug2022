package com.xcompany.ecom.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement srcLocation = driver.findElement(By.xpath("//p[contains(.,'Drag me to my target')]"));
		WebElement destinationLocation = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);//object creation
		actions.dragAndDrop(srcLocation, destinationLocation);
		actions.dragAndDropBy(srcLocation, 100, 75);
		actions.contextClick();
		actions.build().perform();
		
		
	}
}
