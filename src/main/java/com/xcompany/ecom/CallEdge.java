package com.xcompany.ecom;

import org.openqa.selenium.edge.EdgeDriver;

public class CallEdge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./webdrivers_binarys/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	}
}
