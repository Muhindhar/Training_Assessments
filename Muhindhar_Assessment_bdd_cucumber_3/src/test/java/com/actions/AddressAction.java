package com.actions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.pages.AddressPage;
import com.utilities.HelperClass;

public class AddressAction {
	WebDriver driver = HelperClass.getdriver();
	AddressPage ap = new AddressPage();
	
	public void login() {
		driver.findElement(ap.myacc).click();
		driver.findElement(ap.login).click();
		driver.findElement(ap.email).sendKeys("muhindhar27@gmail.com");
		driver.findElement(ap.pass).sendKeys("12345678");
		driver.findElement(ap.btn).click();
	}
	public void Address() {
		driver.findElement(ap.addbook).click();
	}
	public void newadd() {
		driver.findElement(ap.newadd).click();
	}
	
	public void det(List<Map<String, String>> data) {
		driver.findElement(ap.fname).sendKeys(data.get(0).get("firstname"));
		driver.findElement(ap.lname).sendKeys(data.get(0).get("lastname"));
		driver.findElement(ap.address).sendKeys(data.get(0).get("address1"));
		driver.findElement(ap.city).sendKeys(data.get(0).get("city"));
		driver.findElement(ap.code).sendKeys(data.get(0).get("postcode"));
		Select s = new Select(driver.findElement(ap.country));
		s.selectByVisibleText(data.get(0).get("country"));
		Select s1 = new Select(driver.findElement(ap.state));
		s1.selectByVisibleText(data.get(0).get("region"));
	}
	public void clickbtn() {
		driver.findElement(ap.contbtn).click();
	}
	public void check() {
		driver.findElement(ap.res);
	}
}
