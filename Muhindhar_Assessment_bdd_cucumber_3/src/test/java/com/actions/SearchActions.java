package com.actions;

import org.openqa.selenium.WebDriver;

import com.pages.SearchPage;
import com.utilities.HelperClass;

public class SearchActions {
	SearchPage s = new SearchPage();
	WebDriver driver = HelperClass.getdriver();
	public void product(String product) {
		driver.findElement(s.search).sendKeys(product);
		driver.findElement(s.btnclk).click();
	}
}
