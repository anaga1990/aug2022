package com.xcompany.ecom.methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXMultiSelectDropDownList {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		WebElement multiDropdown = driver.findElement(By.cssSelector(".ui.fluid.dropdown.selection.multiple"));
		multiDropdown.click();
		List<WebElement> listOfDetails = driver.findElements(By.xpath("//div[@class='menu transition visible']/div"));
		System.out.println("Auto Suggest List ::" + listOfDetails.size());
		for(int i =0; i<listOfDetails.size(); i++) {
			System.out.println(listOfDetails.get(i).getText());
			listOfDetails.get(i).click();
		}
		System.out.println("_________________________________________________");
		/*
		 * for (WebElement webElement : listOfDetails) {
		 * System.out.println(webElement.getText()); }
		 */
		Thread.sleep(3000);
	}
}
