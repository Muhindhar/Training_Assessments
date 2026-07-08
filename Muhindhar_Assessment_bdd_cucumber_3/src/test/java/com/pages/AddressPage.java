package com.pages;

import org.openqa.selenium.By;

public class AddressPage {
	public By myacc = By.xpath("//a[@title='My Account']");
	public By login = By.xpath("//a[normalize-space()='Login']");
	public By email = By.xpath("//input[@name='email']");
	public By pass = By.xpath("//input[@name='password']");
	public By btn = By.xpath("//input[@value='Login']");
	public By myacc2 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']");
	public By addbook = By.xpath("//a[normalize-space()='Address Book']");
	public By newadd = By.xpath("//a[@class='btn btn-primary']");
	public By fname = By.xpath("//input[@name='firstname']");
	public By lname = By.xpath("//input[@name='lastname']");
	public By address = By.xpath("//input[@name='address_1']");
	public By city = By.xpath("//input[@name='city']");
	public By code = By.xpath("//input[@name='postcode']");
	public By country = By.xpath("//select[@name='country_id']");
	public By state = By.xpath("//select[@name='zone_id']");
	public By contbtn = By.xpath("//input[@value='Continue']");
	public By res = By.xpath("//h2[normalize-space()='Address Book Entries']");
}
