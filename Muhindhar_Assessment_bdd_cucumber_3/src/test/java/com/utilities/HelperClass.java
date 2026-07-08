package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
	public static WebDriver driver1;
	
	public static WebDriver getdriver() {
		return driver1;
	}
	public static void setdriver() {
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://tutorialsninja.com/demo/");
	}
	public static void teardown() {
		if(driver1!=null) {
			driver1.quit();
		}
	}
}
